package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerRegisterTokenProperties
  extends StObject
     with Object {
  
  /**
    * Token expiration time specified as number of milliseconds since 1 January 1970 00:00:00 UTC.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    */
  var expires: js.UndefOr[Double] = js.undefined
  
  /**
    * For ArcGIS Online or Portal, this is https://www.arcgis.com/sharing/rest or similar to https://www.example.com/portal/sharing/rest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    */
  var server: String
  
  /**
    * Set this to `true` if the user has an ArcGIS Online organizational account and the organization is configured to allow access to resources only through SSL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    */
  var ssl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The access token.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    */
  var token: String
  
  /**
    * The id of the user who owns the access token.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#registerToken)
    */
  var userId: js.UndefOr[String] = js.undefined
}
object IdentityManagerRegisterTokenProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    server: String,
    token: String
  ): IdentityManagerRegisterTokenProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), server = server.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerRegisterTokenProperties]
  }
  
  @scala.inline
  implicit class IdentityManagerRegisterTokenPropertiesMutableBuilder[Self <: IdentityManagerRegisterTokenProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    @scala.inline
    def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
