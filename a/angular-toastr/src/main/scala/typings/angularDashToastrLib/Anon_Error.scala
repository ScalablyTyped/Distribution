package typings
package angularDashToastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var info: js.UndefOr[java.lang.String] = js.undefined
  var success: js.UndefOr[java.lang.String] = js.undefined
  var warning: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    info: java.lang.String = null,
    success: java.lang.String = null,
    warning: java.lang.String = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (info != null) __obj.updateDynamic("info")(info)
    if (success != null) __obj.updateDynamic("success")(success)
    if (warning != null) __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[Anon_Error]
  }
}

