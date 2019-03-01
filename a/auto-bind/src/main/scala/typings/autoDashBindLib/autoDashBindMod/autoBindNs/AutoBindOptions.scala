package typings
package autoDashBindLib.autoDashBindMod.autoBindNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoBindOptions extends js.Object {
  var exclude: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
  var include: js.UndefOr[js.Array[java.lang.String | stdLib.RegExp]] = js.undefined
}

object AutoBindOptions {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String | stdLib.RegExp] = null,
    include: js.Array[java.lang.String | stdLib.RegExp] = null
  ): AutoBindOptions = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[AutoBindOptions]
  }
}

