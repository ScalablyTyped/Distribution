package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to get an object that allows to encrypt/decrypt data using the specified algorithm.
  * @since OOo 3.4
  */
trait XCipherContextSupplier extends XInterface {
  /**
    * returns an object that allows to encrypt/decrypt data.
    * @param nCipherID the internal ID specifying the algorithm, should take value from {@link CipherID}
    * @param aKey the key that should be used for the encryption
    * @param aInitializationVector the initialization vector that should be used for the encryption
    * @param bEncryption whether an encryption or decryption cipher should be created `TRUE` - Encryption `FALSE` - Decryption
    * @param aParams optional parameters that could be used to initialize the cipher,
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    */
  def getCipherContext(
    nCipherID: Double,
    aKey: SeqEquiv[Double],
    aInitializationVector: SeqEquiv[Double],
    bEncryption: Boolean,
    aParams: SeqEquiv[NamedValue]
  ): XCipherContext
}

object XCipherContextSupplier {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getCipherContext: (Double, SeqEquiv[Double], SeqEquiv[Double], Boolean, SeqEquiv[NamedValue]) => XCipherContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCipherContextSupplier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCipherContext = js.Any.fromFunction5(getCipherContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCipherContextSupplier]
  }
}

