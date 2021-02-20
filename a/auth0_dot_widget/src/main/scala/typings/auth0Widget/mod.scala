package typings.auth0Widget

import org.scalablytyped.runtime.Instantiable1
import typings.auth0Js.mod.Auth0DecodedHash
import typings.auth0Js.mod.Auth0Error
import typings.auth0Js.mod.Auth0UserProfile
import typings.auth0Js.mod.AuthOptions
import typings.auth0Js.mod.Authentication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("auth0.widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("auth0.widget", "Auth0Widget")
  @js.native
  class Auth0Widget protected () extends Auth0WidgetStatic {
    def this(params: Auth0Constructor) = this()
  }
  @JSImport("auth0.widget", "Auth0Widget")
  @js.native
  def Auth0Widget: Auth0WidgetStatic = js.native
  @scala.inline
  def Auth0Widget_=(x: Auth0WidgetStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Auth0Widget")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Auth0Constructor extends AuthOptions {
    
    var assetsUrl: js.UndefOr[String] = js.native
    
    var cdn: js.UndefOr[String] = js.native
    
    var dict: js.UndefOr[js.Any] = js.native
  }
  object Auth0Constructor {
    
    @scala.inline
    def apply(clientID: String, domain: String): Auth0Constructor = {
      val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth0Constructor]
    }
    
    @scala.inline
    implicit class Auth0ConstructorMutableBuilder[Self <: Auth0Constructor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssetsUrl(value: String): Self = StObject.set(x, "assetsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssetsUrlUndefined: Self = StObject.set(x, "assetsUrl", js.undefined)
      
      @scala.inline
      def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      @scala.inline
      def setDict(value: js.Any): Self = StObject.set(x, "dict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictUndefined: Self = StObject.set(x, "dict", js.undefined)
    }
  }
  
  @js.native
  trait Auth0Options extends StObject {
    
    var access_token: js.UndefOr[String] = js.native
    
    var connections: js.UndefOr[js.Array[String]] = js.native
    
    var container: js.UndefOr[String] = js.native
    
    var enableReturnUserExperience: js.UndefOr[Boolean] = js.native
    
    var extraParameters: js.UndefOr[js.Any] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var request_id: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var showForgot: js.UndefOr[Boolean] = js.native
    
    var showIcon: js.UndefOr[Boolean] = js.native
    
    var showSignup: js.UndefOr[Boolean] = js.native
    
    var state: js.UndefOr[js.Any] = js.native
    
    var userPwdConnectionName: js.UndefOr[String] = js.native
    
    var username_style: js.UndefOr[String] = js.native
  }
  object Auth0Options {
    
    @scala.inline
    def apply(): Auth0Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Auth0Options]
    }
    
    @scala.inline
    implicit class Auth0OptionsMutableBuilder[Self <: Auth0Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setConnections(value: js.Array[String]): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
      
      @scala.inline
      def setConnectionsVarargs(value: String*): Self = StObject.set(x, "connections", js.Array(value :_*))
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setEnableReturnUserExperience(value: Boolean): Self = StObject.set(x, "enableReturnUserExperience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableReturnUserExperienceUndefined: Self = StObject.set(x, "enableReturnUserExperience", js.undefined)
      
      @scala.inline
      def setExtraParameters(value: js.Any): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraParametersUndefined: Self = StObject.set(x, "extraParameters", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest_idUndefined: Self = StObject.set(x, "request_id", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setShowForgot(value: Boolean): Self = StObject.set(x, "showForgot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowForgotUndefined: Self = StObject.set(x, "showForgot", js.undefined)
      
      @scala.inline
      def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      @scala.inline
      def setShowSignup(value: Boolean): Self = StObject.set(x, "showSignup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSignupUndefined: Self = StObject.set(x, "showSignup", js.undefined)
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setUserPwdConnectionName(value: String): Self = StObject.set(x, "userPwdConnectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPwdConnectionNameUndefined: Self = StObject.set(x, "userPwdConnectionName", js.undefined)
      
      @scala.inline
      def setUsername_style(value: String): Self = StObject.set(x, "username_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername_styleUndefined: Self = StObject.set(x, "username_style", js.undefined)
    }
  }
  
  @js.native
  trait Auth0WidgetStatic extends Instantiable1[/* params */ Auth0Constructor, Auth0WidgetStatic] {
    
    def getClient(): Authentication = js.native
    
    def getProfile(token: String, callback: js.Function): Auth0UserProfile = js.native
    
    def parseHash(hash: String): Auth0DecodedHash = js.native
    
    def reset(options: Auth0Options): Auth0WidgetStatic = js.native
    def reset(options: Auth0Options, callback: js.Function): Auth0WidgetStatic = js.native
    
    def signin(options: Auth0Options): Auth0WidgetStatic = js.native
    def signin(options: Auth0Options, widgetLoadedCallback: js.UndefOr[scala.Nothing], popupCallback: js.Function): Auth0WidgetStatic = js.native
    def signin(options: Auth0Options, widgetLoadedCallback: js.Function): Auth0WidgetStatic = js.native
    def signin(options: Auth0Options, widgetLoadedCallback: js.Function, popupCallback: js.Function): Auth0WidgetStatic = js.native
    
    def signup(
      options: Auth0Options,
      callback: js.Function5[
          /* error */ js.UndefOr[Auth0Error], 
          /* profile */ js.UndefOr[Auth0UserProfile], 
          /* id_token */ js.UndefOr[String], 
          /* access_token */ js.UndefOr[String], 
          /* state */ js.UndefOr[String], 
          _
        ]
    ): Auth0WidgetStatic = js.native
  }
  
  type ClientOptions = AuthOptions
}
