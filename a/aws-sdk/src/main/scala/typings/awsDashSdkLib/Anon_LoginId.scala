package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LoginId extends js.Object {
  var LoginId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LoginId {
  @scala.inline
  def apply(LoginId: java.lang.String = null): Anon_LoginId = {
    val __obj = js.Dynamic.literal()
    if (LoginId != null) __obj.updateDynamic("LoginId")(LoginId)
    __obj.asInstanceOf[Anon_LoginId]
  }
}

