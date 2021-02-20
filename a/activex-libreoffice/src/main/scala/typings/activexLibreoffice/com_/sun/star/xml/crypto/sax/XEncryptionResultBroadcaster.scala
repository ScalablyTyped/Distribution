package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Encryption Result Broadcaster.
  *
  * This interface is used to manipulate encryption result listener.
  */
@js.native
trait XEncryptionResultBroadcaster extends XInterface {
  
  /**
    * Adds a new encryption result listener.
    *
    * When the encryption is finished, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addEncryptionResultListener(listener: XEncryptionResultListener): Unit = js.native
  
  /**
    * Removes an encryption result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeEncryptionResultListener(listener: XEncryptionResultListener): Unit = js.native
}
object XEncryptionResultBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEncryptionResultListener: XEncryptionResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryptionResultListener: XEncryptionResultListener => Unit
  ): XEncryptionResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEncryptionResultListener = js.Any.fromFunction1(addEncryptionResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryptionResultListener = js.Any.fromFunction1(removeEncryptionResultListener))
    __obj.asInstanceOf[XEncryptionResultBroadcaster]
  }
  
  @scala.inline
  implicit class XEncryptionResultBroadcasterMutableBuilder[Self <: XEncryptionResultBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEncryptionResultListener(value: XEncryptionResultListener => Unit): Self = StObject.set(x, "addEncryptionResultListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEncryptionResultListener(value: XEncryptionResultListener => Unit): Self = StObject.set(x, "removeEncryptionResultListener", js.Any.fromFunction1(value))
  }
}
