package typings.authmosphere

import typings.node.NodeJS.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesBodyParametersMod {
  
  trait BodyParameters
    extends StObject
       with Dict[String | Double | Boolean | (js.Array[Boolean | Double | String]) | Null] {
    
    var code: js.UndefOr[String] = js.undefined
    
    var grant_type: String
    
    var password: js.UndefOr[String] = js.undefined
    
    var redirect_uri: js.UndefOr[String] = js.undefined
    
    var refresh_token: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object BodyParameters {
    
    inline def apply(grant_type: String): BodyParameters = {
      val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyParameters]
    }
    
    extension [Self <: BodyParameters](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      inline def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
