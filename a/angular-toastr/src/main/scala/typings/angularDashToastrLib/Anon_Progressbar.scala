package typings
package angularDashToastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Progressbar extends js.Object {
  var progressbar: js.UndefOr[java.lang.String] = js.undefined
  var toast: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Progressbar {
  @scala.inline
  def apply(progressbar: java.lang.String = null, toast: java.lang.String = null): Anon_Progressbar = {
    val __obj = js.Dynamic.literal()
    if (progressbar != null) __obj.updateDynamic("progressbar")(progressbar)
    if (toast != null) __obj.updateDynamic("toast")(toast)
    __obj.asInstanceOf[Anon_Progressbar]
  }
}

