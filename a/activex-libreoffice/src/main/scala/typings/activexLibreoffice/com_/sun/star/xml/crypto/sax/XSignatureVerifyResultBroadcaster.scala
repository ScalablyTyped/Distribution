package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Signature Verify Result Broadcaster.
  *
  * This interface is used to manipulate signature verify result listener.
  */
@js.native
trait XSignatureVerifyResultBroadcaster extends XInterface {
  
  /**
    * Adds a new signature verify result listener.
    *
    * When the signature is verified, the result information will be sent to this listener.
    * @param listener the listener to be added
    */
  def addSignatureVerifyResultListener(listener: XSignatureVerifyResultListener): Unit = js.native
  
  /**
    * Removes a signature verify result listener.
    *
    * After a listener is removed, no result information will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSignatureVerifyResultListener(listener: XSignatureVerifyResultListener): Unit = js.native
}
object XSignatureVerifyResultBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSignatureVerifyResultListener: XSignatureVerifyResultListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSignatureVerifyResultListener: XSignatureVerifyResultListener => Unit
  ): XSignatureVerifyResultBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSignatureVerifyResultListener = js.Any.fromFunction1(addSignatureVerifyResultListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSignatureVerifyResultListener = js.Any.fromFunction1(removeSignatureVerifyResultListener))
    __obj.asInstanceOf[XSignatureVerifyResultBroadcaster]
  }
  
  @scala.inline
  implicit class XSignatureVerifyResultBroadcasterMutableBuilder[Self <: XSignatureVerifyResultBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSignatureVerifyResultListener(value: XSignatureVerifyResultListener => Unit): Self = StObject.set(x, "addSignatureVerifyResultListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSignatureVerifyResultListener(value: XSignatureVerifyResultListener => Unit): Self = StObject.set(x, "removeSignatureVerifyResultListener", js.Any.fromFunction1(value))
  }
}
