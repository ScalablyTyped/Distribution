package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatus extends StObject {
  
  /**
    * The current state of the cluster.
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  
  /**
    * The reason for the cluster status change.
    */
  var StateChangeReason: js.UndefOr[ClusterStateChangeReason] = js.undefined
  
  /**
    * A timeline that represents the status of a cluster over the lifetime of the cluster.
    */
  var Timeline: js.UndefOr[ClusterTimeline] = js.undefined
}
object ClusterStatus {
  
  inline def apply(): ClusterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatus] (val x: Self) extends AnyVal {
    
    inline def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: ClusterStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTimeline(value: ClusterTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
