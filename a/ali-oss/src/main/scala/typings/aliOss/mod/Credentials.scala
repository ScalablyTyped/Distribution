package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * STS access key id.
    */
  var AccessKeyId: String
  
  /**
    * STS access key secret.
    */
  var AccessKeySecret: String
  
  /**
    * STS expiration UTC time in ISO format.
    */
  var Expiration: String
  
  /**
    * STS token.
    */
  var SecurityToken: String
}
object Credentials {
  
  inline def apply(AccessKeyId: String, AccessKeySecret: String, Expiration: String, SecurityToken: String): Credentials = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], AccessKeySecret = AccessKeySecret.asInstanceOf[js.Any], Expiration = Expiration.asInstanceOf[js.Any], SecurityToken = SecurityToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeySecret(value: String): Self = StObject.set(x, "AccessKeySecret", value.asInstanceOf[js.Any])
    
    inline def setExpiration(value: String): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setSecurityToken(value: String): Self = StObject.set(x, "SecurityToken", value.asInstanceOf[js.Any])
  }
}
