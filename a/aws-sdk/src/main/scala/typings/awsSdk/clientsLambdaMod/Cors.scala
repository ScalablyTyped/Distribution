package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cors extends StObject {
  
  /**
    * Whether to allow cookies or other credentials in requests to your function URL. The default is false.
    */
  var AllowCredentials: js.UndefOr[typings.awsSdk.clientsLambdaMod.AllowCredentials] = js.undefined
  
  /**
    * The HTTP headers that origins can include in requests to your function URL. For example: Date, Keep-Alive, X-Custom-Header.
    */
  var AllowHeaders: js.UndefOr[HeadersList] = js.undefined
  
  /**
    * The HTTP methods that are allowed when calling your function URL. For example: GET, POST, DELETE, or the wildcard character (*).
    */
  var AllowMethods: js.UndefOr[AllowMethodsList] = js.undefined
  
  /**
    * The origins that can access your function URL. You can list any number of specific origins, separated by a comma. For example: https://www.example.com, http://localhost:60905. Alternatively, you can grant access to all origins using the wildcard character (*).
    */
  var AllowOrigins: js.UndefOr[AllowOriginsList] = js.undefined
  
  /**
    * The HTTP headers in your function response that you want to expose to origins that call your function URL. For example: Date, Keep-Alive, X-Custom-Header.
    */
  var ExposeHeaders: js.UndefOr[HeadersList] = js.undefined
  
  /**
    * The maximum amount of time, in seconds, that web browsers can cache results of a preflight request. By default, this is set to 0, which means that the browser doesn't cache results.
    */
  var MaxAge: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaxAge] = js.undefined
}
object Cors {
  
  inline def apply(): Cors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cors] (val x: Self) extends AnyVal {
    
    inline def setAllowCredentials(value: AllowCredentials): Self = StObject.set(x, "AllowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "AllowCredentials", js.undefined)
    
    inline def setAllowHeaders(value: HeadersList): Self = StObject.set(x, "AllowHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowHeadersUndefined: Self = StObject.set(x, "AllowHeaders", js.undefined)
    
    inline def setAllowHeadersVarargs(value: Header*): Self = StObject.set(x, "AllowHeaders", js.Array(value*))
    
    inline def setAllowMethods(value: AllowMethodsList): Self = StObject.set(x, "AllowMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowMethodsUndefined: Self = StObject.set(x, "AllowMethods", js.undefined)
    
    inline def setAllowMethodsVarargs(value: Method*): Self = StObject.set(x, "AllowMethods", js.Array(value*))
    
    inline def setAllowOrigins(value: AllowOriginsList): Self = StObject.set(x, "AllowOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowOriginsUndefined: Self = StObject.set(x, "AllowOrigins", js.undefined)
    
    inline def setAllowOriginsVarargs(value: Origin*): Self = StObject.set(x, "AllowOrigins", js.Array(value*))
    
    inline def setExposeHeaders(value: HeadersList): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    inline def setExposeHeadersVarargs(value: Header*): Self = StObject.set(x, "ExposeHeaders", js.Array(value*))
    
    inline def setMaxAge(value: MaxAge): Self = StObject.set(x, "MaxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "MaxAge", js.undefined)
  }
}
