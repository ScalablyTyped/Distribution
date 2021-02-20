package typings.activexLibreoffice.com_.sun.star.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows containers to implement a vetoing mechanism for insertion, removal, and replacement of their elements. */
@js.native
trait XContainerApproveBroadcaster extends StObject {
  
  /** adds a listener which can veto changes in the container's content */
  def addContainerApproveListener(Listener: XContainerApproveListener): Unit = js.native
  
  /** removes a previously added listener */
  def removeContainerApproveListener(Listener: XContainerApproveListener): Unit = js.native
}
object XContainerApproveBroadcaster {
  
  @scala.inline
  def apply(
    addContainerApproveListener: XContainerApproveListener => Unit,
    removeContainerApproveListener: XContainerApproveListener => Unit
  ): XContainerApproveBroadcaster = {
    val __obj = js.Dynamic.literal(addContainerApproveListener = js.Any.fromFunction1(addContainerApproveListener), removeContainerApproveListener = js.Any.fromFunction1(removeContainerApproveListener))
    __obj.asInstanceOf[XContainerApproveBroadcaster]
  }
  
  @scala.inline
  implicit class XContainerApproveBroadcasterMutableBuilder[Self <: XContainerApproveBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddContainerApproveListener(value: XContainerApproveListener => Unit): Self = StObject.set(x, "addContainerApproveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveContainerApproveListener(value: XContainerApproveListener => Unit): Self = StObject.set(x, "removeContainerApproveListener", js.Any.fromFunction1(value))
  }
}
