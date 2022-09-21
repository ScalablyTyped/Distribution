package typings.auth0Lock

import org.scalablytyped.runtime.StringDictionary
import typings.auth0Js.mod.Auth0Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Auth0LockAdditionalSignUpFieldOptionsCallback = js.Function2[
/* error */ Auth0Error, 
/* options */ js.Array[Auth0LockAdditionalSignUpFieldOption], 
Unit]

type Auth0LockAdditionalSignUpFieldOptionsFunction = js.Function1[/* callback */ Auth0LockAdditionalSignUpFieldOptionsCallback, Unit]

type Auth0LockAdditionalSignUpFieldPrefillCallback = js.Function2[/* error */ Auth0Error, /* prefill */ String, Unit]

type Auth0LockAdditionalSignUpFieldPrefillFunction = js.Function1[/* callback */ Auth0LockAdditionalSignUpFieldPrefillCallback, Unit]

type Auth0LockAvatarDisplayNameCallback = js.Function2[/* error */ Auth0Error, /* displayName */ String, Unit]

type Auth0LockAvatarUrlCallback = js.Function2[/* error */ Auth0Error, /* url */ String, Unit]

type Auth0LockThemeButtonOptions = StringDictionary[Auth0LockThemeButton]
