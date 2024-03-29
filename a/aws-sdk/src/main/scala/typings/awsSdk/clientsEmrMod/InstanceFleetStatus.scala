package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetStatus extends StObject {
  
  /**
    * A code representing the instance fleet status.    PROVISIONING—The instance fleet is provisioning Amazon EC2 resources and is not yet ready to run jobs.    BOOTSTRAPPING—Amazon EC2 instances and other resources have been provisioned and the bootstrap actions specified for the instances are underway.    RUNNING—Amazon EC2 instances and other resources are running. They are either executing jobs or waiting to execute jobs.    RESIZING—A resize operation is underway. Amazon EC2 instances are either being added or removed.    SUSPENDED—A resize operation could not complete. Existing Amazon EC2 instances are running, but instances can't be added or removed.    TERMINATING—The instance fleet is terminating Amazon EC2 instances.    TERMINATED—The instance fleet is no longer active, and all Amazon EC2 instances have been terminated.  
    */
  var State: js.UndefOr[InstanceFleetState] = js.undefined
  
  /**
    * Provides status change reason details for the instance fleet.
    */
  var StateChangeReason: js.UndefOr[InstanceFleetStateChangeReason] = js.undefined
  
  /**
    * Provides historical timestamps for the instance fleet, including the time of creation, the time it became ready to run jobs, and the time of termination.
    */
  var Timeline: js.UndefOr[InstanceFleetTimeline] = js.undefined
}
object InstanceFleetStatus {
  
  inline def apply(): InstanceFleetStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceFleetStatus] (val x: Self) extends AnyVal {
    
    inline def setState(value: InstanceFleetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReason(value: InstanceFleetStateChangeReason): Self = StObject.set(x, "StateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setStateChangeReasonUndefined: Self = StObject.set(x, "StateChangeReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTimeline(value: InstanceFleetTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
  }
}
