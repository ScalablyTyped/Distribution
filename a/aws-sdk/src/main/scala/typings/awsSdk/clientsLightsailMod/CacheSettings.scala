package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSettings extends StObject {
  
  /**
    * The HTTP methods that are processed and forwarded to the distribution's origin. You can specify the following options:    GET,HEAD - The distribution forwards the GET and HEAD methods.    GET,HEAD,OPTIONS - The distribution forwards the GET, HEAD, and OPTIONS methods.    GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE - The distribution forwards the GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE methods.   If you specify the third option, you might need to restrict access to your distribution's origin so users can't perform operations that you don't want them to. For example, you might not want users to have permission to delete objects from your origin.
    */
  var allowedHTTPMethods: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The HTTP method responses that are cached by your distribution. You can specify the following options:    GET,HEAD - The distribution caches responses to the GET and HEAD methods.    GET,HEAD,OPTIONS - The distribution caches responses to the GET, HEAD, and OPTIONS methods.  
    */
  var cachedHTTPMethods: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The default amount of time that objects stay in the distribution's cache before the distribution forwards another request to the origin to determine whether the content has been updated.  The value specified applies only when the origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. 
    */
  var defaultTTL: js.UndefOr[long] = js.undefined
  
  /**
    * An object that describes the cookies that are forwarded to the origin. Your content is cached based on the cookies that are forwarded.
    */
  var forwardedCookies: js.UndefOr[CookieObject] = js.undefined
  
  /**
    * An object that describes the headers that are forwarded to the origin. Your content is cached based on the headers that are forwarded.
    */
  var forwardedHeaders: js.UndefOr[HeaderObject] = js.undefined
  
  /**
    * An object that describes the query strings that are forwarded to the origin. Your content is cached based on the query strings that are forwarded.
    */
  var forwardedQueryStrings: js.UndefOr[QueryStringObject] = js.undefined
  
  /**
    * The maximum amount of time that objects stay in the distribution's cache before the distribution forwards another request to the origin to determine whether the object has been updated. The value specified applies only when the origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects.
    */
  var maximumTTL: js.UndefOr[long] = js.undefined
  
  /**
    * The minimum amount of time that objects stay in the distribution's cache before the distribution forwards another request to the origin to determine whether the object has been updated. A value of 0 must be specified for minimumTTL if the distribution is configured to forward all headers to the origin.
    */
  var minimumTTL: js.UndefOr[long] = js.undefined
}
object CacheSettings {
  
  inline def apply(): CacheSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheSettings] (val x: Self) extends AnyVal {
    
    inline def setAllowedHTTPMethods(value: NonEmptyString): Self = StObject.set(x, "allowedHTTPMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedHTTPMethodsUndefined: Self = StObject.set(x, "allowedHTTPMethods", js.undefined)
    
    inline def setCachedHTTPMethods(value: NonEmptyString): Self = StObject.set(x, "cachedHTTPMethods", value.asInstanceOf[js.Any])
    
    inline def setCachedHTTPMethodsUndefined: Self = StObject.set(x, "cachedHTTPMethods", js.undefined)
    
    inline def setDefaultTTL(value: long): Self = StObject.set(x, "defaultTTL", value.asInstanceOf[js.Any])
    
    inline def setDefaultTTLUndefined: Self = StObject.set(x, "defaultTTL", js.undefined)
    
    inline def setForwardedCookies(value: CookieObject): Self = StObject.set(x, "forwardedCookies", value.asInstanceOf[js.Any])
    
    inline def setForwardedCookiesUndefined: Self = StObject.set(x, "forwardedCookies", js.undefined)
    
    inline def setForwardedHeaders(value: HeaderObject): Self = StObject.set(x, "forwardedHeaders", value.asInstanceOf[js.Any])
    
    inline def setForwardedHeadersUndefined: Self = StObject.set(x, "forwardedHeaders", js.undefined)
    
    inline def setForwardedQueryStrings(value: QueryStringObject): Self = StObject.set(x, "forwardedQueryStrings", value.asInstanceOf[js.Any])
    
    inline def setForwardedQueryStringsUndefined: Self = StObject.set(x, "forwardedQueryStrings", js.undefined)
    
    inline def setMaximumTTL(value: long): Self = StObject.set(x, "maximumTTL", value.asInstanceOf[js.Any])
    
    inline def setMaximumTTLUndefined: Self = StObject.set(x, "maximumTTL", js.undefined)
    
    inline def setMinimumTTL(value: long): Self = StObject.set(x, "minimumTTL", value.asInstanceOf[js.Any])
    
    inline def setMinimumTTLUndefined: Self = StObject.set(x, "minimumTTL", js.undefined)
  }
}
