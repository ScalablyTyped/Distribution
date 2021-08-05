package typings.angularCookie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object cookie {
    
    trait CookieOptions extends StObject {
      
      /**
        * The method that will be used to decode extracted cookie values (should be passed when using Get).
        */
      var decode: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
      
      /**
        * The domain tells the browser to which domain the cookie should be sent. If you don't specify it, it becomes the domain of the page that sets the cookie.
        */
      var domain: js.UndefOr[String] = js.undefined
      
      /**
        * The method that will be used to encode the cookie value (should be passed when using Set).
        */
      var encode: js.UndefOr[js.Function1[/* value */ js.Any, js.Any]] = js.undefined
      
      /**
        * Allows you to set the expiration time in hours, minutes, seconds, or `milliseconds. If this is not specified, any expiration time specified will default to days.
        */
      var expirationUnit: js.UndefOr[String] = js.undefined
      
      /**
        * Each cookie has an expiry date after which it is trashed. If you don't specify the expiry date the cookie is trashed when you close the browser.
        */
      var expires: js.UndefOr[Double] = js.undefined
      
      /**
        * The path gives you the chance to specify a directory where the cookie is active.
        */
      var path: js.UndefOr[String] = js.undefined
      
      /**
        * The Secure attribute is meant to keep cookie communication limited to encrypted transmission, directing browsers to use cookies only via secure/encrypted connections.
        */
      var secure: js.UndefOr[Boolean] = js.undefined
    }
    object CookieOptions {
      
      inline def apply(): CookieOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieOptions]
      }
      
      extension [Self <: CookieOptions](x: Self) {
        
        inline def setDecode(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
        
        inline def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
        
        inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        inline def setEncode(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
        
        inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
        
        inline def setExpirationUnit(value: String): Self = StObject.set(x, "expirationUnit", value.asInstanceOf[js.Any])
        
        inline def setExpirationUnitUndefined: Self = StObject.set(x, "expirationUnit", js.undefined)
        
        inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
        
        inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      }
    }
    
    @js.native
    trait CookieService extends StObject {
      
      /**
        * Get all cookies
        */
      def apply(): js.Any = js.native
      /**
        * Get a cookie with a specific key
        */
      def apply(key: String): js.Any = js.native
      /**
        * Create a cookie
        */
      def apply(key: String, value: js.Any): js.Any = js.native
      def apply(key: String, value: js.Any, options: CookieOptions): js.Any = js.native
      
      /**
        * Remove a cookie
        */
      def remove(key: String): Unit = js.native
      def remove(key: String, options: CookieOptions): Unit = js.native
    }
  }
}
