package typings.activexInfopath.global.InfoPath

import typings.activexInfopath.InfoPath.XdMachineOnlineState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("InfoPath.XDNetworkState")
@js.native
/* private */ open class XDNetworkState ()
  extends StObject
     with typings.activexInfopath.InfoPath.XDNetworkState {
  
  /* private */ /* CompleteClass */
  @JSName("InfoPath.XDNetworkState_typekey")
  var InfoPathDotXDNetworkState_typekey: typings.activexInfopath.InfoPath.XDNetworkState = js.native
  
  /* CompleteClass */
  override def IsDestinationReachable(bstrDestination: String): Boolean = js.native
  
  /* CompleteClass */
  override val MachineOnlineState: XdMachineOnlineState = js.native
}
