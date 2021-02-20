package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cors extends StObject {
  
  /**
    * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
    */
  var AllowCredentials: js.UndefOr[boolean] = js.native
  
  /**
    * Represents a collection of allowed headers. Supported only for HTTP APIs.
    */
  var AllowHeaders: js.UndefOr[CorsHeaderList] = js.native
  
  /**
    * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
    */
  var AllowMethods: js.UndefOr[CorsMethodList] = js.native
  
  /**
    * Represents a collection of allowed origins. Supported only for HTTP APIs.
    */
  var AllowOrigins: js.UndefOr[CorsOriginList] = js.native
  
  /**
    * Represents a collection of exposed headers. Supported only for HTTP APIs.
    */
  var ExposeHeaders: js.UndefOr[CorsHeaderList] = js.native
  
  /**
    * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
    */
  var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400] = js.native
}
object Cors {
  
  @scala.inline
  def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  
  @scala.inline
  implicit class CorsMutableBuilder[Self <: Cors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCredentials(value: boolean): Self = StObject.set(x, "AllowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCredentialsUndefined: Self = StObject.set(x, "AllowCredentials", js.undefined)
    
    @scala.inline
    def setAllowHeaders(value: CorsHeaderList): Self = StObject.set(x, "AllowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowHeadersUndefined: Self = StObject.set(x, "AllowHeaders", js.undefined)
    
    @scala.inline
    def setAllowHeadersVarargs(value: string*): Self = StObject.set(x, "AllowHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowMethods(value: CorsMethodList): Self = StObject.set(x, "AllowMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMethodsUndefined: Self = StObject.set(x, "AllowMethods", js.undefined)
    
    @scala.inline
    def setAllowMethodsVarargs(value: StringWithLengthBetween1And64*): Self = StObject.set(x, "AllowMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowOrigins(value: CorsOriginList): Self = StObject.set(x, "AllowOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowOriginsUndefined: Self = StObject.set(x, "AllowOrigins", js.undefined)
    
    @scala.inline
    def setAllowOriginsVarargs(value: string*): Self = StObject.set(x, "AllowOrigins", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: CorsHeaderList): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: string*): Self = StObject.set(x, "ExposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaxAge(value: IntegerWithLengthBetweenMinus1And86400): Self = StObject.set(x, "MaxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "MaxAge", js.undefined)
  }
}
