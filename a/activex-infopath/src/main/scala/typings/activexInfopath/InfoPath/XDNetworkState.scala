package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDNetworkState extends js.Object {
  
  @JSName("InfoPath.XDNetworkState_typekey")
  var InfoPathDotXDNetworkState_typekey: XDNetworkState = js.native
  
  def IsDestinationReachable(bstrDestination: String): Boolean = js.native
  
  val MachineOnlineState: XdMachineOnlineState = js.native
}
object XDNetworkState {
  
  @scala.inline
  def apply(
    InfoPathDotXDNetworkState_typekey: XDNetworkState,
    IsDestinationReachable: String => Boolean,
    MachineOnlineState: XdMachineOnlineState
  ): XDNetworkState = {
    val __obj = js.Dynamic.literal(IsDestinationReachable = js.Any.fromFunction1(IsDestinationReachable), MachineOnlineState = MachineOnlineState.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.XDNetworkState_typekey")(InfoPathDotXDNetworkState_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDNetworkState]
  }
  
  @scala.inline
  implicit class XDNetworkStateOps[Self <: XDNetworkState] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotXDNetworkState_typekey(value: XDNetworkState): Self = this.set("InfoPath.XDNetworkState_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDestinationReachable(value: String => Boolean): Self = this.set("IsDestinationReachable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMachineOnlineState(value: XdMachineOnlineState): Self = this.set("MachineOnlineState", value.asInstanceOf[js.Any])
  }
}
