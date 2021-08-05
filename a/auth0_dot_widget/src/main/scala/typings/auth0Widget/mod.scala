package typings.auth0Widget

import org.scalablytyped.runtime.Instantiable1
import typings.auth0Js.mod.Auth0DecodedHash
import typings.auth0Js.mod.Auth0Error
import typings.auth0Js.mod.Auth0UserProfile
import typings.auth0Js.mod.AuthOptions
import typings.auth0Js.mod.Authentication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auth0.widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("auth0.widget", "Auth0Widget")
  @js.native
  class Auth0Widget protected ()
    extends StObject
       with Auth0WidgetStatic {
    def this(params: Auth0Constructor) = this()
  }
  @JSImport("auth0.widget", "Auth0Widget")
  @js.native
  def Auth0Widget: Auth0WidgetStatic = js.native
  inline def Auth0Widget_=(x: Auth0WidgetStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auth0Widget")(x.asInstanceOf[js.Any])
  
  trait Auth0Constructor
    extends StObject
       with AuthOptions {
    
    var assetsUrl: js.UndefOr[String] = js.undefined
    
    var cdn: js.UndefOr[String] = js.undefined
    
    var dict: js.UndefOr[js.Any] = js.undefined
  }
  object Auth0Constructor {
    
    inline def apply(clientID: String, domain: String): Auth0Constructor = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth0Constructor]
    }
    
    extension [Self <: Auth0Constructor](x: Self) {
      
      inline def setAssetsUrl(value: String): Self = StObject.set(x, "assetsUrl", value.asInstanceOf[js.Any])
      
      inline def setAssetsUrlUndefined: Self = StObject.set(x, "assetsUrl", js.undefined)
      
      inline def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      inline def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      inline def setDict(value: js.Any): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
      
      inline def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
    }
  }
  
  trait Auth0Options extends StObject {
    
    var access_token: js.UndefOr[String] = js.undefined
    
    var connections: js.UndefOr[js.Array[String]] = js.undefined
    
    var container: js.UndefOr[String] = js.undefined
    
    var enableReturnUserExperience: js.UndefOr[Boolean] = js.undefined
    
    var extraParameters: js.UndefOr[js.Any] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var request_id: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var showForgot: js.UndefOr[Boolean] = js.undefined
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var showSignup: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[js.Any] = js.undefined
    
    var userPwdConnectionName: js.UndefOr[String] = js.undefined
    
    var username_style: js.UndefOr[String] = js.undefined
  }
  object Auth0Options {
    
    inline def apply(): Auth0Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auth0Options]
    }
    
    extension [Self <: Auth0Options](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      inline def setConnections(value: js.Array[String]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      inline def setConnectionsVarargs(value: String*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setEnableReturnUserExperience(value: Boolean): Self = StObject.set(x, "enableReturnUserExperience", value.asInstanceOf[js.Any])
      
      inline def setEnableReturnUserExperienceUndefined: Self = StObject.set(x, "enableReturnUserExperience", js.undefined)
      
      inline def setExtraParameters(value: js.Any): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
      
      inline def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setShowForgot(value: Boolean): Self = StObject.set(x, "showForgot", value.asInstanceOf[js.Any])
      
      inline def setShowForgotUndefined: Self = StObject.set(x, "showForgot", js.undefined)
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setShowSignup(value: Boolean): Self = StObject.set(x, "showSignup", value.asInstanceOf[js.Any])
      
      inline def setShowSignupUndefined: Self = StObject.set(x, "showSignup", js.undefined)
      
      inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setUserPwdConnectionName(value: String): Self = StObject.set(x, "userPwdConnectionName", value.asInstanceOf[js.Any])
      
      inline def setUserPwdConnectionNameUndefined: Self = StObject.set(x, "userPwdConnectionName", js.undefined)
      
      inline def setUsername_style(value: String): Self = StObject.set(x, "username_style", value.asInstanceOf[js.Any])
      
      inline def setUsername_styleUndefined: Self = StObject.set(x, "username_style", js.undefined)
    }
  }
  
  @js.native
  trait Auth0WidgetStatic
    extends StObject
       with Instantiable1[/* params */ Auth0Constructor, Auth0WidgetStatic] {
    
    def getClient(): Authentication = js.native
    
    def getProfile(token: String, callback: js.Function): Auth0UserProfile = js.native
    
    def parseHash(hash: String): Auth0DecodedHash = js.native
    
    def reset(options: Auth0Options): Auth0WidgetStatic = js.native
    def reset(options: Auth0Options, callback: js.Function): Auth0WidgetStatic = js.native
    
    def signin(options: Auth0Options): Auth0WidgetStatic = js.native
    def signin(options: Auth0Options, widgetLoadedCallback: js.Function): Auth0WidgetStatic = js.native
    def signin(options: Auth0Options, widgetLoadedCallback: js.Function, popupCallback: js.Function): Auth0WidgetStatic = js.native
    def signin(options: Auth0Options, widgetLoadedCallback: Unit, popupCallback: js.Function): Auth0WidgetStatic = js.native
    
    def signup(
      options: Auth0Options,
      callback: js.Function5[
          /* error */ js.UndefOr[Auth0Error], 
          /* profile */ js.UndefOr[Auth0UserProfile], 
          /* id_token */ js.UndefOr[String], 
          /* access_token */ js.UndefOr[String], 
          /* state */ js.UndefOr[String], 
          js.Any
        ]
    ): Auth0WidgetStatic = js.native
  }
  
  type ClientOptions = AuthOptions
}
