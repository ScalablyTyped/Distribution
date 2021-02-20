package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
@js.native
trait XEncryptionProtectedSource2 extends XEncryptionProtectedSource {
  
  /**
    * determine if an encryption data is set for this object.
    * @returns true if some encryption data was set, false otherwise
    */
  def hasEncryptionData(): Boolean = js.native
  
  /**
    * sets an encryption data for the object.
    * @param aEncryptionData the new encryption data
    * @throws com::sun::star::io::IOException in case the data could not be set
    */
  def setEncryptionData(aEncryptionData: SeqEquiv[NamedValue]): Unit = js.native
}
object XEncryptionProtectedSource2 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasEncryptionData: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionData: SeqEquiv[NamedValue] => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedSource2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasEncryptionData = js.Any.fromFunction0(hasEncryptionData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionData = js.Any.fromFunction1(setEncryptionData), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
    __obj.asInstanceOf[XEncryptionProtectedSource2]
  }
  
  @scala.inline
  implicit class XEncryptionProtectedSource2MutableBuilder[Self <: XEncryptionProtectedSource2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasEncryptionData(value: () => Boolean): Self = StObject.set(x, "hasEncryptionData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEncryptionData(value: SeqEquiv[NamedValue] => Unit): Self = StObject.set(x, "setEncryptionData", js.Any.fromFunction1(value))
  }
}
