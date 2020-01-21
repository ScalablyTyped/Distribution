package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassed extends js.Object {
  	// 认证标识
  var passed: String
  	// 认证是否通过
  var reason: js.UndefOr[String] = js.undefined
  var token: String
}

object AnonPassed {
  @scala.inline
  def apply(passed: String, token: String, reason: String = null): AnonPassed = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassed]
  }
}

