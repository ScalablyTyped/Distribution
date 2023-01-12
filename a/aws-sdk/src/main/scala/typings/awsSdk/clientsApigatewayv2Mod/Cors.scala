package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cors extends StObject {
  
  /**
    * Specifies whether credentials are included in the CORS request. Supported only for HTTP APIs.
    */
  var AllowCredentials: js.UndefOr[boolean] = js.undefined
  
  /**
    * Represents a collection of allowed headers. Supported only for HTTP APIs.
    */
  var AllowHeaders: js.UndefOr[CorsHeaderList] = js.undefined
  
  /**
    * Represents a collection of allowed HTTP methods. Supported only for HTTP APIs.
    */
  var AllowMethods: js.UndefOr[CorsMethodList] = js.undefined
  
  /**
    * Represents a collection of allowed origins. Supported only for HTTP APIs.
    */
  var AllowOrigins: js.UndefOr[CorsOriginList] = js.undefined
  
  /**
    * Represents a collection of exposed headers. Supported only for HTTP APIs.
    */
  var ExposeHeaders: js.UndefOr[CorsHeaderList] = js.undefined
  
  /**
    * The number of seconds that the browser should cache preflight request results. Supported only for HTTP APIs.
    */
  var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400] = js.undefined
}
object Cors {
  
  inline def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cors] (val x: Self) extends AnyVal {
    
    inline def setAllowCredentials(value: boolean): Self = StObject.set(x, "AllowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "AllowCredentials", js.undefined)
    
    inline def setAllowHeaders(value: CorsHeaderList): Self = StObject.set(x, "AllowHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowHeadersUndefined: Self = StObject.set(x, "AllowHeaders", js.undefined)
    
    inline def setAllowHeadersVarargs(value: string*): Self = StObject.set(x, "AllowHeaders", js.Array(value*))
    
    inline def setAllowMethods(value: CorsMethodList): Self = StObject.set(x, "AllowMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowMethodsUndefined: Self = StObject.set(x, "AllowMethods", js.undefined)
    
    inline def setAllowMethodsVarargs(value: StringWithLengthBetween1And64*): Self = StObject.set(x, "AllowMethods", js.Array(value*))
    
    inline def setAllowOrigins(value: CorsOriginList): Self = StObject.set(x, "AllowOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowOriginsUndefined: Self = StObject.set(x, "AllowOrigins", js.undefined)
    
    inline def setAllowOriginsVarargs(value: string*): Self = StObject.set(x, "AllowOrigins", js.Array(value*))
    
    inline def setExposeHeaders(value: CorsHeaderList): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    inline def setExposeHeadersVarargs(value: string*): Self = StObject.set(x, "ExposeHeaders", js.Array(value*))
    
    inline def setMaxAge(value: IntegerWithLengthBetweenMinus1And86400): Self = StObject.set(x, "MaxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "MaxAge", js.undefined)
  }
}
