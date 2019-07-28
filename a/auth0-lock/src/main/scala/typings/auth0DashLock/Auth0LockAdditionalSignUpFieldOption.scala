package typings.auth0DashLock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0LockAdditionalSignUpFieldOption extends js.Object {
  var label: String
  var value: String
}

object Auth0LockAdditionalSignUpFieldOption {
  @scala.inline
  def apply(label: String, value: String): Auth0LockAdditionalSignUpFieldOption = {
    val __obj = js.Dynamic.literal(label = label, value = value)
  
    __obj.asInstanceOf[Auth0LockAdditionalSignUpFieldOption]
  }
}

