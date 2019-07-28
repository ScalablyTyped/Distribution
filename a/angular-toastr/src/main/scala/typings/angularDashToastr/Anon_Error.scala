package typings.angularDashToastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var info: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[String] = js.undefined
  var warning: js.UndefOr[String] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: String = null, info: String = null, success: String = null, warning: String = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (success != null) __obj.updateDynamic("success")(success)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Error]
  }
}

