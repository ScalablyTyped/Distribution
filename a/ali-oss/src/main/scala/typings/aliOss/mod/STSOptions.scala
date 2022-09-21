package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait STSOptions extends StObject {
  
  /**
    * Access key id.
    */
  var accessKeyId: String
  
  /**
    * Access key secret.
    */
  var accessKeySecret: String
}
object STSOptions {
  
  inline def apply(accessKeyId: String, accessKeySecret: String): STSOptions = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], accessKeySecret = accessKeySecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[STSOptions]
  }
  
  extension [Self <: STSOptions](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeySecret(value: String): Self = StObject.set(x, "accessKeySecret", value.asInstanceOf[js.Any])
  }
}
