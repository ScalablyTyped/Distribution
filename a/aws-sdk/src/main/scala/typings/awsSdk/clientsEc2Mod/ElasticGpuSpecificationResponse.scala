package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElasticGpuSpecificationResponse extends StObject {
  
  /**
    * The elastic GPU type.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object ElasticGpuSpecificationResponse {
  
  inline def apply(): ElasticGpuSpecificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticGpuSpecificationResponse]
  }
  
  extension [Self <: ElasticGpuSpecificationResponse](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
