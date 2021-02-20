package typings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object auth0Lock {
  
  type Auth0LockAdditionalSignUpFieldOptionsCallback = js.Function2[
    /* error */ typings.auth0Js.mod.Auth0Error, 
    /* options */ js.Array[typings.auth0Lock.Auth0LockAdditionalSignUpFieldOption], 
    scala.Unit
  ]
  
  type Auth0LockAdditionalSignUpFieldOptionsFunction = js.Function1[
    /* callback */ typings.auth0Lock.Auth0LockAdditionalSignUpFieldOptionsCallback, 
    scala.Unit
  ]
  
  type Auth0LockAdditionalSignUpFieldPrefillCallback = js.Function2[
    /* error */ typings.auth0Js.mod.Auth0Error, 
    /* prefill */ java.lang.String, 
    scala.Unit
  ]
  
  type Auth0LockAdditionalSignUpFieldPrefillFunction = js.Function1[
    /* callback */ typings.auth0Lock.Auth0LockAdditionalSignUpFieldPrefillCallback, 
    scala.Unit
  ]
  
  type Auth0LockAvatarDisplayNameCallback = js.Function2[
    /* error */ typings.auth0Js.mod.Auth0Error, 
    /* displayName */ java.lang.String, 
    scala.Unit
  ]
  
  type Auth0LockAvatarUrlCallback = js.Function2[/* error */ typings.auth0Js.mod.Auth0Error, /* url */ java.lang.String, scala.Unit]
  
  type Auth0LockThemeButtonOptions = org.scalablytyped.runtime.StringDictionary[typings.auth0Lock.Auth0LockThemeButton]
}
