package typings
package auth0DashLockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalSignUpFieldOption extends js.Object {
  var label: java.lang.String
  var value: java.lang.String
}

object Auth0LockAdditionalSignUpFieldOption {
  @scala.inline
  def apply(label: java.lang.String, value: java.lang.String): Auth0LockAdditionalSignUpFieldOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Auth0LockAdditionalSignUpFieldOption]
  }
}

