package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDNetworkState extends StObject {
  
  @JSName("InfoPath.XDNetworkState_typekey")
  var InfoPathDotXDNetworkState_typekey: XDNetworkState
  
  def IsDestinationReachable(bstrDestination: String): Boolean
  
  val MachineOnlineState: XdMachineOnlineState
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
  implicit class XDNetworkStateMutableBuilder[Self <: XDNetworkState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotXDNetworkState_typekey(value: XDNetworkState): Self = StObject.set(x, "InfoPath.XDNetworkState_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDestinationReachable(value: String => Boolean): Self = StObject.set(x, "IsDestinationReachable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMachineOnlineState(value: XdMachineOnlineState): Self = StObject.set(x, "MachineOnlineState", value.asInstanceOf[js.Any])
  }
}
