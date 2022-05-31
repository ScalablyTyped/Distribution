package typings.auth0Js

import typings.auth0Js.mod.AuthOptions
import typings.auth0Js.mod.ManagementOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object auth0 {
    
    @JSGlobal("auth0.Authentication")
    @js.native
    class Authentication protected ()
      extends typings.auth0Js.mod.Authentication {
      def this(options: AuthOptions) = this()
    }
    
    @JSGlobal("auth0.CrossOriginAuthentication")
    @js.native
    class CrossOriginAuthentication protected ()
      extends typings.auth0Js.mod.CrossOriginAuthentication {
      def this(webAuth: js.Any, options: js.Any) = this()
    }
    
    @JSGlobal("auth0.DBConnection")
    @js.native
    class DBConnection protected ()
      extends typings.auth0Js.mod.DBConnection {
      def this(request: js.Any, option: js.Any) = this()
    }
    
    @JSGlobal("auth0.Management")
    @js.native
    class Management protected ()
      extends typings.auth0Js.mod.Management {
      /**
        * Initialize your client class, by using a Non Interactive Client to fetch an access_token via the Client Credentials Grant.
        */
      def this(options: ManagementOptions) = this()
    }
    
    @JSGlobal("auth0.PasswordlessAuthentication")
    @js.native
    class PasswordlessAuthentication protected ()
      extends typings.auth0Js.mod.PasswordlessAuthentication {
      def this(request: js.Any, option: js.Any) = this()
    }
    
    @JSGlobal("auth0.Popup")
    @js.native
    class Popup protected ()
      extends typings.auth0Js.mod.Popup {
      def this(client: js.Any, options: js.Any) = this()
    }
    
    @JSGlobal("auth0.Redirect")
    @js.native
    class Redirect protected ()
      extends typings.auth0Js.mod.Redirect {
      def this(client: js.Any, options: js.Any) = this()
    }
    
    @JSGlobal("auth0.WebAuth")
    @js.native
    class WebAuth protected ()
      extends typings.auth0Js.mod.WebAuth {
      def this(options: AuthOptions) = this()
    }
    
    object version {
      
      @JSGlobal("auth0.version")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("auth0.version.raw")
      @js.native
      def raw: String = js.native
      inline def raw_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raw")(x.asInstanceOf[js.Any])
    }
  }
}
