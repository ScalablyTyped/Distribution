package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostObjectParams extends StObject {
  
  var OSSAccessKeyId: String
  
  var Signature: String
  
  var policy: String
}
object PostObjectParams {
  
  inline def apply(OSSAccessKeyId: String, Signature: String, policy: String): PostObjectParams = {
    val __obj = js.Dynamic.literal(OSSAccessKeyId = OSSAccessKeyId.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostObjectParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostObjectParams] (val x: Self) extends AnyVal {
    
    inline def setOSSAccessKeyId(value: String): Self = StObject.set(x, "OSSAccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
  }
}
