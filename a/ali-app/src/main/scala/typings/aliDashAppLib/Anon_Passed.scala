package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Passed extends js.Object {
  	// 认证标识
  var passed: java.lang.String
  	// 认证是否通过
  var reason: js.UndefOr[java.lang.String] = js.undefined
  var token: java.lang.String
}

object Anon_Passed {
  @scala.inline
  def apply(passed: java.lang.String, token: java.lang.String, reason: java.lang.String = null): Anon_Passed = {
    val __obj = js.Dynamic.literal(passed = passed, token = token)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[Anon_Passed]
  }
}

