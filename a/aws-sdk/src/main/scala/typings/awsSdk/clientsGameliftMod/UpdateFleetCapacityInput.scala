package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetCapacityInput extends StObject {
  
  /**
    * The number of Amazon EC2 instances you want to maintain in the specified fleet location. This value must fall between the minimum and maximum size limits.
    */
  var DesiredInstances: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * A unique identifier for the fleet to update capacity settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The name of a remote location to update fleet capacity settings for, in the form of an Amazon Web Services Region code such as us-west-2.
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
  
  /**
    * The maximum number of instances that are allowed in the specified fleet location. If this parameter is not set, the default is 1.
    */
  var MaxSize: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The minimum number of instances that are allowed in the specified fleet location. If this parameter is not set, the default is 0.
    */
  var MinSize: js.UndefOr[WholeNumber] = js.undefined
}
object UpdateFleetCapacityInput {
  
  inline def apply(FleetId: FleetIdOrArn): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
  
  extension [Self <: UpdateFleetCapacityInput](x: Self) {
    
    inline def setDesiredInstances(value: WholeNumber): Self = StObject.set(x, "DesiredInstances", value.asInstanceOf[js.Any])
    
    inline def setDesiredInstancesUndefined: Self = StObject.set(x, "DesiredInstances", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setMaxSize(value: WholeNumber): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setMinSize(value: WholeNumber): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
  }
}
