package typings.aliOss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKeyId extends StObject {
  
  var accessKeyId: String
  
  var accessKeySecret: String
  
  var stsToken: String
}
object AccessKeyId {
  
  inline def apply(accessKeyId: String, accessKeySecret: String, stsToken: String): AccessKeyId = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any], stsToken = stsToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessKeyId] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeySecret(value: String): Self = StObject.set(x, "accessKeySecret", value.asInstanceOf[js.Any])
    
    inline def setStsToken(value: String): Self = StObject.set(x, "stsToken", value.asInstanceOf[js.Any])
  }
}
