package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateElasticInferenceAcceleratorResponse extends StObject {
  
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, and eia1.xlarge. 
    */
  var Type: js.UndefOr[String] = js.undefined
}
object LaunchTemplateElasticInferenceAcceleratorResponse {
  
  inline def apply(): LaunchTemplateElasticInferenceAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAcceleratorResponse]
  }
  
  extension [Self <: LaunchTemplateElasticInferenceAcceleratorResponse](x: Self) {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
