package typings.amazonCognitoAuthJs

import typings.amazonCognitoAuthJs.mod.CognitoAuthOptions
import typings.amazonCognitoAuthJs.mod.CognitoSessionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AmazonCognitoIdentity {
    
    @JSGlobal("AmazonCognitoIdentity.CognitoAccessToken")
    @js.native
    class CognitoAccessToken protected ()
      extends typings.amazonCognitoAuthJs.mod.CognitoAccessToken {
      /**
        * Constructs a new CognitoAccessToken object
        * @param AccessToken The JWT access token.
        */
      def this(AccessToken: String) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoAuth")
    @js.native
    class CognitoAuth protected ()
      extends typings.amazonCognitoAuthJs.mod.CognitoAuth {
      /**
        * Constructs a new CognitoAuth object
        * @param options Creation options
        */
      def this(options: CognitoAuthOptions) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoAuthSession")
    @js.native
    class CognitoAuthSession protected ()
      extends typings.amazonCognitoAuthJs.mod.CognitoAuthSession {
      /**
        * Constructs a new CognitoUserSession object
        * @param sessionData The session's tokens, scopes, and state.
        */
      def this(sessionData: CognitoSessionData) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoIdToken")
    @js.native
    class CognitoIdToken protected ()
      extends typings.amazonCognitoAuthJs.mod.CognitoIdToken {
      /**
        * Constructs a new CognitoIdToken object
        * @param IdToken The JWT Id token
        */
      def this(IdToken: String) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoRefreshToken")
    @js.native
    class CognitoRefreshToken protected ()
      extends typings.amazonCognitoAuthJs.mod.CognitoRefreshToken {
      /**
        * Constructs a new CognitoRefreshToken object
        * @param RefreshToken The JWT refresh token.
        */
      def this(RefreshToken: String) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.CognitoTokenScopes")
    @js.native
    class CognitoTokenScopes protected ()
      extends typings.amazonCognitoAuthJs.mod.CognitoTokenScopes {
      /**
        * Constructs a new CognitoTokenScopes object
        * @param TokenScopesArray The token scopes
        */
      def this(TokenScopesArray: js.Array[String]) = this()
    }
    
    @JSGlobal("AmazonCognitoIdentity.DateHelper")
    @js.native
    class DateHelper ()
      extends typings.amazonCognitoAuthJs.mod.DateHelper
    
    @JSGlobal("AmazonCognitoIdentity.StorageHelper")
    @js.native
    /**
      * This is used to get a storage object
      * @returns the storage
      */
    class StorageHelper ()
      extends typings.amazonCognitoAuthJs.mod.StorageHelper
  }
}
