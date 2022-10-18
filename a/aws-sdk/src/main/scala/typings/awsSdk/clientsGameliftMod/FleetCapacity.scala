package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetCapacity extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912.
    */
  var FleetArn: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * A unique identifier for the fleet associated with the location.
    */
  var FleetId: js.UndefOr[typings.awsSdk.clientsGameliftMod.FleetId] = js.undefined
  
  /**
    * The current instance count and capacity settings for the fleet location. 
    */
  var InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.undefined
  
  /**
    * The Amazon EC2 instance type that is used for all instances in a fleet. The instance type determines the computing resources in use, including CPU, memory, storage, and networking capacity. See Amazon Elastic Compute Cloud Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
  
  /**
    * The fleet location for the instance count information, expressed as an Amazon Web Services Region code, such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object FleetCapacity {
  
  inline def apply(): FleetCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetCapacity]
  }
  
  extension [Self <: FleetCapacity](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setInstanceCounts(value: EC2InstanceCounts): Self = StObject.set(x, "InstanceCounts", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountsUndefined: Self = StObject.set(x, "InstanceCounts", js.undefined)
    
    inline def setInstanceType(value: EC2InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
