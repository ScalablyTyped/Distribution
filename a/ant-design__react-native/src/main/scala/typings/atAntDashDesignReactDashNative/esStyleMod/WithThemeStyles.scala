package typings.atAntDashDesignReactDashNative.esStyleMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithThemeStyles[T] extends js.Object {
  var styles: js.UndefOr[Partial[T]] = js.undefined
}

object WithThemeStyles {
  @scala.inline
  def apply[T](styles: Partial[T] = null): WithThemeStyles[T] = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithThemeStyles[T]]
  }
}

