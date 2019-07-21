package typings
package atAntDashDesignReactDashNativeLib.libStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithThemeStyles[T] extends js.Object {
  var styles: js.UndefOr[stdLib.Partial[T]] = js.undefined
}

object WithThemeStyles {
  @scala.inline
  def apply[T](styles: stdLib.Partial[T] = null): WithThemeStyles[T] = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[WithThemeStyles[T]]
  }
}

