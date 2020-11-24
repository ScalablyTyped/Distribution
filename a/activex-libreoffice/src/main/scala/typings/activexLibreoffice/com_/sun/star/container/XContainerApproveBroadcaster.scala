package typings.activexLibreoffice.com_.sun.star.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows containers to implement a vetoing mechanism for insertion, removal, and replacement of their elements. */
@js.native
trait XContainerApproveBroadcaster extends js.Object {
  
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
  implicit class XContainerApproveBroadcasterOps[Self <: XContainerApproveBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddContainerApproveListener(value: XContainerApproveListener => Unit): Self = this.set("addContainerApproveListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveContainerApproveListener(value: XContainerApproveListener => Unit): Self = this.set("removeContainerApproveListener", js.Any.fromFunction1(value))
  }
}
