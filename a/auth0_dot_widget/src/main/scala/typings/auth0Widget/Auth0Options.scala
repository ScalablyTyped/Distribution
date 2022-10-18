package typings.auth0Widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth0Options extends StObject {
  
  var access_token: js.UndefOr[String] = js.undefined
  
  var connections: js.UndefOr[js.Array[String]] = js.undefined
  
  var container: js.UndefOr[String] = js.undefined
  
  var enableReturnUserExperience: js.UndefOr[Boolean] = js.undefined
  
  var extraParameters: js.UndefOr[Any] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var request_id: js.UndefOr[String] = js.undefined
  
  var scope: js.UndefOr[String] = js.undefined
  
  var showForgot: js.UndefOr[Boolean] = js.undefined
  
  var showIcon: js.UndefOr[Boolean] = js.undefined
  
  var showSignup: js.UndefOr[Boolean] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
  
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
    
    inline def setConnectionsVarargs(value: String*): Self = StObject.set(x, "connections", js.Array(value*))
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEnableReturnUserExperience(value: Boolean): Self = StObject.set(x, "enableReturnUserExperience", value.asInstanceOf[js.Any])
    
    inline def setEnableReturnUserExperienceUndefined: Self = StObject.set(x, "enableReturnUserExperience", js.undefined)
    
    inline def setExtraParameters(value: Any): Self = StObject.set(x, "extraParameters", value.asInstanceOf[js.Any])
    
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
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUserPwdConnectionName(value: String): Self = StObject.set(x, "userPwdConnectionName", value.asInstanceOf[js.Any])
    
    inline def setUserPwdConnectionNameUndefined: Self = StObject.set(x, "userPwdConnectionName", js.undefined)
    
    inline def setUsername_style(value: String): Self = StObject.set(x, "username_style", value.asInstanceOf[js.Any])
    
    inline def setUsername_styleUndefined: Self = StObject.set(x, "username_style", js.undefined)
  }
}
