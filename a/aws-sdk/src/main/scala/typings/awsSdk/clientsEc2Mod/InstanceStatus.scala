package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceStatus extends StObject {
  
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Any scheduled events associated with the instance.
    */
  var Events: js.UndefOr[InstanceStatusEventList] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The intended state of the instance. DescribeInstanceStatus requires that an instance be in the running state.
    */
  var InstanceState: js.UndefOr[typings.awsSdk.clientsEc2Mod.InstanceState] = js.undefined
  
  /**
    * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
    */
  var InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * Reports impaired functionality that stems from issues related to the systems that support an instance, such as hardware failures and network connectivity problems.
    */
  var SystemStatus: js.UndefOr[InstanceStatusSummary] = js.undefined
}
object InstanceStatus {
  
  inline def apply(): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStatus]
  }
  
  extension [Self <: InstanceStatus](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setEvents(value: InstanceStatusEventList): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: InstanceStatusEvent*): Self = StObject.set(x, "Events", js.Array(value*))
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceState(value: InstanceState): Self = StObject.set(x, "InstanceState", value.asInstanceOf[js.Any])
    
    inline def setInstanceStateUndefined: Self = StObject.set(x, "InstanceState", js.undefined)
    
    inline def setInstanceStatus(value: InstanceStatusSummary): Self = StObject.set(x, "InstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatusUndefined: Self = StObject.set(x, "InstanceStatus", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setSystemStatus(value: InstanceStatusSummary): Self = StObject.set(x, "SystemStatus", value.asInstanceOf[js.Any])
    
    inline def setSystemStatusUndefined: Self = StObject.set(x, "SystemStatus", js.undefined)
  }
}
