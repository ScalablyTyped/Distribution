package typings.authmosphere

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bodyParametersMod {
  
  /* Inlined node.NodeJS.Dict<string | number | boolean | std.Array<string> | std.Array<number> | std.Array<boolean> | null> & {  grant_type :string,   username :string | undefined,   password :string | undefined,   code :string | undefined,   redirect_uri :string | undefined,   refresh_token :string | undefined} */
  @js.native
  trait BodyParameters
    extends /* key */ StringDictionary[
          js.UndefOr[String | Double | Boolean | (js.Array[Boolean | Double | String]) | Null]
        ] {
    
    var code: js.UndefOr[String] = js.native
    
    var grant_type: String = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var redirect_uri: js.UndefOr[String] = js.native
    
    var refresh_token: js.UndefOr[String] = js.native
    
    var username: js.UndefOr[String] = js.native
  }
  object BodyParameters {
    
    @scala.inline
    def apply(grant_type: String): BodyParameters = {
      val __obj = js.Dynamic.literal(grant_type = grant_type.asInstanceOf[js.Any])
      __obj.asInstanceOf[BodyParameters]
    }
    
    @scala.inline
    implicit class BodyParametersMutableBuilder[Self <: BodyParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setGrant_type(value: String): Self = StObject.set(x, "grant_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setRedirect_uri(value: String): Self = StObject.set(x, "redirect_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirect_uriUndefined: Self = StObject.set(x, "redirect_uri", js.undefined)
      
      @scala.inline
      def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
