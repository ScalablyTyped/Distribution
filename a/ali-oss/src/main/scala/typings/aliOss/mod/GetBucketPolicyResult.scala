package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketPolicyResult extends StObject {
  
  var policy: BucketPolicy | Null
  
  var res: NormalSuccessResponse
  
  var status: Double
}
object GetBucketPolicyResult {
  
  inline def apply(res: NormalSuccessResponse, status: Double): GetBucketPolicyResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], policy = null)
    __obj.asInstanceOf[GetBucketPolicyResult]
  }
  
  extension [Self <: GetBucketPolicyResult](x: Self) {
    
    inline def setPolicy(value: BucketPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyNull: Self = StObject.set(x, "policy", null)
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
