package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to encrypt/decrypt data using the cipher context.
  *
  * The algorithm as well as encryption data are specified on object creation.
  * @see XCipherContextSupplier
  * @since OOo 3.4
  */
trait XCipherContext extends XInterface {
  /**
    * encrypts/decrypts the data using the cipher.
    *
    * Please have in mind, the cipher object state might depend from the already encrypted/decrypted data ( it depends from the used algorithm ).
    *
    * Whether the object does encryption or decryption is specified by creation of the object.
    * @param aData data that should be encrypted/decrypted
    */
  def convertWithCipherContext(aData: SeqEquiv[Double]): SafeArray[Double]
  /** finalizes cipher and disposes context. */
  def finalizeCipherContextAndDispose(): SafeArray[Double]
}

object XCipherContext {
  @scala.inline
  def apply(
    acquire: () => Unit,
    convertWithCipherContext: SeqEquiv[Double] => SafeArray[Double],
    finalizeCipherContextAndDispose: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCipherContext = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), convertWithCipherContext = js.Any.fromFunction1(convertWithCipherContext), finalizeCipherContextAndDispose = js.Any.fromFunction0(finalizeCipherContextAndDispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCipherContext]
  }
}

