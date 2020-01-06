package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfirmPrivateVirtualInterfaceResponse extends js.Object {
  /**
    * The state of the virtual interface. The following are the possible values:    confirming: The creation of the virtual interface is pending confirmation from the virtual interface owner. If the owner of the virtual interface is different from the owner of the connection on which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface owner.    verifying: This state only applies to public virtual interfaces. Each public virtual interface needs validation before the virtual interface can be created.    pending: A virtual interface is in this state from the time that it is created until the virtual interface is ready to forward traffic.    available: A virtual interface that is able to forward traffic.    down: A virtual interface that is BGP down.    deleting: A virtual interface is in this state immediately after calling DeleteVirtualInterface until it can no longer forward traffic.    deleted: A virtual interface that cannot forward traffic.    rejected: The virtual interface owner has declined creation of the virtual interface. If a virtual interface in the Confirming state is deleted by the virtual interface owner, the virtual interface enters the Rejected state.    unknown: The state of the virtual interface is not available.  
    */
  var virtualInterfaceState: js.UndefOr[VirtualInterfaceState] = js.native
}

object ConfirmPrivateVirtualInterfaceResponse {
  @scala.inline
  def apply(virtualInterfaceState: VirtualInterfaceState = null): ConfirmPrivateVirtualInterfaceResponse = {
    val __obj = js.Dynamic.literal()
    if (virtualInterfaceState != null) __obj.updateDynamic("virtualInterfaceState")(virtualInterfaceState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmPrivateVirtualInterfaceResponse]
  }
}

