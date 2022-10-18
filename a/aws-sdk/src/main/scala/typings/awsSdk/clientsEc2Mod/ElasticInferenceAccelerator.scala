package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticInferenceAccelerator extends StObject {
  
  /**
    *  The number of elastic inference accelerators to attach to the instance.  Default: 1
    */
  var Count: js.UndefOr[ElasticInferenceAcceleratorCount] = js.undefined
  
  /**
    *  The type of elastic inference accelerator. The possible values are eia1.medium, eia1.large, eia1.xlarge, eia2.medium, eia2.large, and eia2.xlarge. 
    */
  var Type: String
}
object ElasticInferenceAccelerator {
  
  inline def apply(Type: String): ElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticInferenceAccelerator]
  }
  
  extension [Self <: ElasticInferenceAccelerator](x: Self) {
    
    inline def setCount(value: ElasticInferenceAcceleratorCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
