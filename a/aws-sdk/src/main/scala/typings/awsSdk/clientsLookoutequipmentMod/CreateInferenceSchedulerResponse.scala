package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInferenceSchedulerResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the inference scheduler being created. 
    */
  var InferenceSchedulerArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InferenceSchedulerArn] = js.undefined
  
  /**
    * The name of inference scheduler being created. 
    */
  var InferenceSchedulerName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.InferenceSchedulerName] = js.undefined
  
  /**
    * Indicates the status of the CreateInferenceScheduler operation. 
    */
  var Status: js.UndefOr[InferenceSchedulerStatus] = js.undefined
}
object CreateInferenceSchedulerResponse {
  
  inline def apply(): CreateInferenceSchedulerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInferenceSchedulerResponse]
  }
  
  extension [Self <: CreateInferenceSchedulerResponse](x: Self) {
    
    inline def setInferenceSchedulerArn(value: InferenceSchedulerArn): Self = StObject.set(x, "InferenceSchedulerArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerArnUndefined: Self = StObject.set(x, "InferenceSchedulerArn", js.undefined)
    
    inline def setInferenceSchedulerName(value: InferenceSchedulerName): Self = StObject.set(x, "InferenceSchedulerName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSchedulerNameUndefined: Self = StObject.set(x, "InferenceSchedulerName", js.undefined)
    
    inline def setStatus(value: InferenceSchedulerStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
