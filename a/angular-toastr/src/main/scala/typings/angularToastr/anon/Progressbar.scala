package typings.angularToastr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progressbar extends js.Object {
  var progressbar: js.UndefOr[String] = js.undefined
  var toast: js.UndefOr[String] = js.undefined
}

object Progressbar {
  @scala.inline
  def apply(progressbar: String = null, toast: String = null): Progressbar = {
    val __obj = js.Dynamic.literal()
    if (progressbar != null) __obj.updateDynamic("progressbar")(progressbar.asInstanceOf[js.Any])
    if (toast != null) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progressbar]
  }
}

