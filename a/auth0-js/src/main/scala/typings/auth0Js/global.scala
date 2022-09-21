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
    open class Authentication protected ()
      extends typings.auth0Js.mod.Authentication {
      def this(options: AuthOptions) = this()
    }
    
    @JSGlobal("auth0.CrossOriginAuthentication")
    @js.native
    open class CrossOriginAuthentication protected ()
      extends typings.auth0Js.mod.CrossOriginAuthentication {
      def this(webAuth: Any, options: Any) = this()
    }
    
    @JSGlobal("auth0.DBConnection")
    @js.native
    open class DBConnection protected ()
      extends typings.auth0Js.mod.DBConnection {
      def this(request: Any, option: Any) = this()
    }
    
    @JSGlobal("auth0.Management")
    @js.native
    open class Management protected ()
      extends typings.auth0Js.mod.Management {
      /**
        * Initialize your client class, by using a Non Interactive Client to fetch an access_token via the Client Credentials Grant.
        */
      def this(options: ManagementOptions) = this()
    }
    
    @JSGlobal("auth0.PasswordlessAuthentication")
    @js.native
    open class PasswordlessAuthentication protected ()
      extends typings.auth0Js.mod.PasswordlessAuthentication {
      def this(request: Any, option: Any) = this()
    }
    
    @JSGlobal("auth0.Popup")
    @js.native
    open class Popup protected ()
      extends typings.auth0Js.mod.Popup {
      def this(client: Any, options: Any) = this()
    }
    
    @JSGlobal("auth0.Redirect")
    @js.native
    open class Redirect protected ()
      extends typings.auth0Js.mod.Redirect {
      def this(client: Any, options: Any) = this()
    }
    
    @JSGlobal("auth0.WebAuth")
    @js.native
    open class WebAuth protected ()
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
