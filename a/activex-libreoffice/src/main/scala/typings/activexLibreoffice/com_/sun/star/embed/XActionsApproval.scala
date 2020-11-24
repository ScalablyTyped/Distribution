package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to request an approval for an action.
  *
  * An implementation of this interface is usually provided to another object to allow this object to request an approval for actions. The list of
  * possible actions must be documented in documentation of the object.
  */
@js.native
trait XActionsApproval extends XInterface {
  
  /**
    * requests an approval for the specified action.
    * @param nAction a value specifying the action that should be approved. Could take values from {@link Actions} constants set. The explicit set of the acti
    * @returns returns `TRUE` in case the specified action is approved.
    */
  def approveAction(nAction: Double): Boolean = js.native
}
object XActionsApproval {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveAction: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XActionsApproval = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveAction = js.Any.fromFunction1(approveAction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XActionsApproval]
  }
  
  @scala.inline
  implicit class XActionsApprovalOps[Self <: XActionsApproval] (val x: Self) extends AnyVal {
    
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
    def setApproveAction(value: Double => Boolean): Self = this.set("approveAction", js.Any.fromFunction1(value))
  }
}
