package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to get an object that allows to encrypt/decrypt data using the specified algorithm.
  * @since OOo 3.4
  */
@js.native
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
  ): XCipherContext = js.native
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
  
  @scala.inline
  implicit class XCipherContextSupplierMutableBuilder[Self <: XCipherContextSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCipherContext(
      value: (Double, SeqEquiv[Double], SeqEquiv[Double], Boolean, SeqEquiv[NamedValue]) => XCipherContext
    ): Self = StObject.set(x, "getCipherContext", js.Any.fromFunction5(value))
  }
}
