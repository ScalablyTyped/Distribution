package typings.awsSdk.clientsCloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializeClusterResponse extends StObject {
  
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsSdk.clientsCloudhsmv2Mod.StateMessage] = js.undefined
}
object InitializeClusterResponse {
  
  inline def apply(): InitializeClusterResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializeClusterResponse]
  }
  
  extension [Self <: InitializeClusterResponse](x: Self) {
    
    inline def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateMessage(value: StateMessage): Self = StObject.set(x, "StateMessage", value.asInstanceOf[js.Any])
    
    inline def setStateMessageUndefined: Self = StObject.set(x, "StateMessage", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
