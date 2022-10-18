package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticInferenceAccelerator extends StObject {
  
  /**
    *  The health of the Elastic Inference Accelerator. 
    */
  var acceleratorHealth: js.UndefOr[ElasticInferenceAcceleratorHealth] = js.undefined
  
  /**
    *  The ID of the Elastic Inference Accelerator. 
    */
  var acceleratorId: js.UndefOr[AcceleratorId] = js.undefined
  
  /**
    *  The type of the Elastic Inference Accelerator. 
    */
  var acceleratorType: js.UndefOr[AcceleratorTypeName] = js.undefined
  
  /**
    *  The ARN of the resource that the Elastic Inference Accelerator is attached to. 
    */
  var attachedResource: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    *  The availability zone where the Elastic Inference Accelerator is present. 
    */
  var availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
}
object ElasticInferenceAccelerator {
  
  inline def apply(): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
  
  extension [Self <: ElasticInferenceAccelerator](x: Self) {
    
    inline def setAcceleratorHealth(value: ElasticInferenceAcceleratorHealth): Self = StObject.set(x, "acceleratorHealth", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorHealthUndefined: Self = StObject.set(x, "acceleratorHealth", js.undefined)
    
    inline def setAcceleratorId(value: AcceleratorId): Self = StObject.set(x, "acceleratorId", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorIdUndefined: Self = StObject.set(x, "acceleratorId", js.undefined)
    
    inline def setAcceleratorType(value: AcceleratorTypeName): Self = StObject.set(x, "acceleratorType", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorTypeUndefined: Self = StObject.set(x, "acceleratorType", js.undefined)
    
    inline def setAttachedResource(value: ResourceArn): Self = StObject.set(x, "attachedResource", value.asInstanceOf[js.Any])
    
    inline def setAttachedResourceUndefined: Self = StObject.set(x, "attachedResource", js.undefined)
    
    inline def setAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
  }
}
