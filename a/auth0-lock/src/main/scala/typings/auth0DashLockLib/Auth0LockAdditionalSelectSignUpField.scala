package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalSelectSignUpField extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var options: js.UndefOr[
    js.Array[Auth0LockAdditionalSignUpFieldOption] | Auth0LockAdditionalSignUpFieldOptionsFunction
  ] = js.undefined
  var placeholder: java.lang.String
  var prefill: js.UndefOr[java.lang.String | Auth0LockAdditionalSignUpFieldPrefillFunction] = js.undefined
  var `type`: js.UndefOr[auth0DashLockLib.auth0DashLockLibStrings.select] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ java.lang.String, Anon_Valid]] = js.undefined
}

