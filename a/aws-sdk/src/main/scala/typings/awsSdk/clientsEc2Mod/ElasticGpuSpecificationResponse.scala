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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElasticGpuSpecificationResponse] (val x: Self) extends AnyVal {
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
