package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessLogSettingsRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string
}
object DeleteAccessLogSettingsRequest {
  
  inline def apply(ApiId: string, StageName: string): DeleteAccessLogSettingsRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessLogSettingsRequest]
  }
  
  extension [Self <: DeleteAccessLogSettingsRequest](x: Self) {
    
    inline def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
