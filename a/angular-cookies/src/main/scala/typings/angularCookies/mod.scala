package typings.angularCookies

import org.scalablytyped.runtime.Shortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-cookies", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    /**
      * ngCookies module (angular-cookies.js)
      */
    object cookies {
      
      /**
        * Cookies options
        * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider#defaults
        */
      @js.native
      trait ICookiesOptions extends StObject {
        
        /**
          * The cookie will be available only for this domain and its sub-domains.
          * For obvious security reasons the user agent will not accept the cookie if the
          * current domain is not a sub domain or equals to the requested domain.
          */
        var domain: js.UndefOr[String] = js.native
        
        /**
          * String of the form "Wdy, DD Mon YYYY HH:MM:SS GMT" or a Date object
          * indicating the exact date/time this cookie will expire.
          */
        var expires: js.UndefOr[String | Date] = js.native
        
        /**
          * The cookie will be available only for this path and its sub-paths.
          * By default, this would be the URL that appears in your base tag.
          */
        var path: js.UndefOr[String] = js.native
        
        /**
          * Prevents the browser from sending the cookie along with cross-site requests.
          * Accepts the values "lax" and "strict".
          */
        var samesite: js.UndefOr[String] = js.native
        
        /**
          * The cookie will be available only in secured connection.
          */
        var secure: js.UndefOr[Boolean] = js.native
      }
      object ICookiesOptions {
        
        @scala.inline
        def apply(): ICookiesOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[ICookiesOptions]
        }
        
        @scala.inline
        implicit class ICookiesOptionsMutableBuilder[Self <: ICookiesOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
          
          @scala.inline
          def setExpires(value: String | Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
          
          @scala.inline
          def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
          
          @scala.inline
          def setSamesite(value: String): Self = StObject.set(x, "samesite", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSamesiteUndefined: Self = StObject.set(x, "samesite", js.undefined)
          
          @scala.inline
          def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
        }
      }
      
      /**
        * CookiesProvider
        * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider
        */
      @js.native
      trait ICookiesProvider extends StObject {
        
        /**
          * Object containing default options to pass when setting cookies.
          */
        var defaults: ICookiesOptions = js.native
      }
      object ICookiesProvider {
        
        @scala.inline
        def apply(defaults: ICookiesOptions): ICookiesProvider = {
          val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
          __obj.asInstanceOf[ICookiesProvider]
        }
        
        @scala.inline
        implicit class ICookiesProviderMutableBuilder[Self <: ICookiesProvider] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDefaults(value: ICookiesOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
        }
      }
      
      /**
        * CookiesService
        * see https://docs.angularjs.org/api/ngCookies/service/$cookies
        */
      @js.native
      trait ICookiesService extends StObject {
        
        def get(key: String): String = js.native
        
        def getAll(): js.Any = js.native
        
        def getObject(key: String): js.Any = js.native
        @JSName("getObject")
        def getObject_T_T[T](key: String): T = js.native
        
        def put(key: String, value: String): Unit = js.native
        def put(key: String, value: String, options: ICookiesOptions): Unit = js.native
        
        def putObject(key: String, value: js.Any): Unit = js.native
        def putObject(key: String, value: js.Any, options: ICookiesOptions): Unit = js.native
        
        def remove(key: String): Unit = js.native
        def remove(key: String, options: ICookiesOptions): Unit = js.native
      }
    }
  }
}
