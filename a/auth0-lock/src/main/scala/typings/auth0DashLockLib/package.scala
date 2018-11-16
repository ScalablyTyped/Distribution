package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object auth0DashLockLib {
  type Auth0LockAdditionalSignUpField = Auth0LockAdditionalSelectSignUpField | Auth0LockAdditionalTextSignUpField | Auth0LockAdditionalCheckboxSignUpField
  type Auth0LockAdditionalSignUpFieldOptionsCallback = js.Function2[
    /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
    /* options */ js.Array[Auth0LockAdditionalSignUpFieldOption], 
    scala.Unit
  ]
  type Auth0LockAdditionalSignUpFieldOptionsFunction = js.Function1[/* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback, scala.Unit]
  type Auth0LockAdditionalSignUpFieldPrefillCallback = js.Function2[
    /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
    /* prefill */ java.lang.String, 
    scala.Unit
  ]
  type Auth0LockAdditionalSignUpFieldPrefillFunction = js.Function1[/* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback, scala.Unit]
  type Auth0LockAvatarDisplayNameCallback = js.Function2[
    /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
    /* displayName */ java.lang.String, 
    scala.Unit
  ]
  type Auth0LockAvatarUrlCallback = js.Function2[
    /* error */ auth0DashJsLib.auth0DashJsMod.Auth0Error, 
    /* url */ java.lang.String, 
    scala.Unit
  ]
}
