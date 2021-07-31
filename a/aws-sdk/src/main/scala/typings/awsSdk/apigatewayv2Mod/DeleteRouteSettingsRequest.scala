package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRouteSettingsRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The route key.
    */
  var RouteKey: string
  
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string
}
object DeleteRouteSettingsRequest {
  
  @scala.inline
  def apply(ApiId: string, RouteKey: string, StageName: string): DeleteRouteSettingsRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], RouteKey = RouteKey.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRouteSettingsRequest]
  }
  
  @scala.inline
  implicit class DeleteRouteSettingsRequestMutableBuilder[Self <: DeleteRouteSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKey(value: string): Self = StObject.set(x, "RouteKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: string): Self = StObject.set(x, "StageName", value.asInstanceOf[js.Any])
  }
}
