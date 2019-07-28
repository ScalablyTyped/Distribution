package typings.angularDashToastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Progressbar extends js.Object {
  var progressbar: js.UndefOr[String] = js.undefined
  var toast: js.UndefOr[String] = js.undefined
}

object Anon_Progressbar {
  @scala.inline
  def apply(progressbar: String = null, toast: String = null): Anon_Progressbar = {
    val __obj = js.Dynamic.literal()
    if (progressbar != null) __obj.updateDynamic("progressbar")(progressbar)
    if (toast != null) __obj.updateDynamic("toast")(toast)
    __obj.asInstanceOf[Anon_Progressbar]
  }
}

