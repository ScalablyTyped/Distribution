package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Auth0LockAdditionalCheckboxSignUpField extends js.Object {
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var placeholder: java.lang.String
  var prefill: auth0DashLockLib.auth0DashLockLibStrings.`true` | auth0DashLockLib.auth0DashLockLibStrings.`false`
  var `type`: js.UndefOr[auth0DashLockLib.auth0DashLockLibStrings.checkbox] = js.undefined
  var validator: js.UndefOr[js.Function1[/* input */ java.lang.String, Anon_Valid]] = js.undefined
}

