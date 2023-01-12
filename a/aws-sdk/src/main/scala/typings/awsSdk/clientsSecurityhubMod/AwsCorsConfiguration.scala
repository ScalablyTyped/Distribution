package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCorsConfiguration extends StObject {
  
  /**
    * Indicates whether the CORS request includes credentials.
    */
  var AllowCredentials: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The allowed headers for CORS requests.
    */
  var AllowHeaders: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The allowed methods for CORS requests.
    */
  var AllowMethods: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The allowed origins for CORS requests.
    */
  var AllowOrigins: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The exposed headers for CORS requests.
    */
  var ExposeHeaders: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The number of seconds for which the browser caches preflight request results.
    */
  var MaxAge: js.UndefOr[Integer] = js.undefined
}
object AwsCorsConfiguration {
  
  inline def apply(): AwsCorsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCorsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCorsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "AllowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "AllowCredentials", js.undefined)
    
    inline def setAllowHeaders(value: NonEmptyStringList): Self = StObject.set(x, "AllowHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowHeadersUndefined: Self = StObject.set(x, "AllowHeaders", js.undefined)
    
    inline def setAllowHeadersVarargs(value: NonEmptyString*): Self = StObject.set(x, "AllowHeaders", js.Array(value*))
    
    inline def setAllowMethods(value: NonEmptyStringList): Self = StObject.set(x, "AllowMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowMethodsUndefined: Self = StObject.set(x, "AllowMethods", js.undefined)
    
    inline def setAllowMethodsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AllowMethods", js.Array(value*))
    
    inline def setAllowOrigins(value: NonEmptyStringList): Self = StObject.set(x, "AllowOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowOriginsUndefined: Self = StObject.set(x, "AllowOrigins", js.undefined)
    
    inline def setAllowOriginsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AllowOrigins", js.Array(value*))
    
    inline def setExposeHeaders(value: NonEmptyStringList): Self = StObject.set(x, "ExposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadersUndefined: Self = StObject.set(x, "ExposeHeaders", js.undefined)
    
    inline def setExposeHeadersVarargs(value: NonEmptyString*): Self = StObject.set(x, "ExposeHeaders", js.Array(value*))
    
    inline def setMaxAge(value: Integer): Self = StObject.set(x, "MaxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "MaxAge", js.undefined)
  }
}
