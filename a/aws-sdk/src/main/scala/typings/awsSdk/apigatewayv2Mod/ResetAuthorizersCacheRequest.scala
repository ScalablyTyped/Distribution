package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetAuthorizersCacheRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The stage name. Stage names can contain only alphanumeric characters, hyphens, and underscores, or be $default. Maximum length is 128 characters.
    */
  var StageName: string
}
object ResetAuthorizersCacheRequest {
  
  inline def apply(ApiId: string, StageName: string): ResetAuthorizersCacheRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetAuthorizersCacheRequest]
  }
  
  extension [Self <: ResetAuthorizersCacheRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
