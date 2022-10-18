package typings.awsSdk.clientsElasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticInferenceAcceleratorHealth extends StObject {
  
  /**
    *  The health status of the Elastic Inference Accelerator. 
    */
  var status: js.UndefOr[AcceleratorHealthStatus] = js.undefined
}
object ElasticInferenceAcceleratorHealth {
  
  inline def apply(): ElasticInferenceAcceleratorHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticInferenceAcceleratorHealth]
  }
  
  extension [Self <: ElasticInferenceAcceleratorHealth](x: Self) {
    
    inline def setStatus(value: AcceleratorHealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
