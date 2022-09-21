package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface allows to set a password for an object. */
trait XEncryptionProtectedSource
  extends StObject
     with XInterface {
  
  /**
    * removes encryption from the object.
    * @throws com::sun::star::io::IOException in case encryption could not be removed
    */
  def removeEncryption(): Unit
  
  /**
    * sets a password for the object.
    * @param sPassword the new password
    * @throws com::sun::star::io::IOException in case password could not be set
    */
  def setEncryptionPassword(sPassword: String): Unit
}
object XEncryptionProtectedSource {
  
  inline def apply(
    acquire: () => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
    __obj.asInstanceOf[XEncryptionProtectedSource]
  }
  
  extension [Self <: XEncryptionProtectedSource](x: Self) {
    
    inline def setRemoveEncryption(value: () => Unit): Self = StObject.set(x, "removeEncryption", js.Any.fromFunction0(value))
    
    inline def setSetEncryptionPassword(value: String => Unit): Self = StObject.set(x, "setEncryptionPassword", js.Any.fromFunction1(value))
  }
}
