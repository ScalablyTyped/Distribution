package typings.assertEqualJsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsssertOptions extends js.Object {
  var sanitize: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}

object AsssertOptions {
  @scala.inline
  def apply(sanitize: /* str */ String => String = null): AsssertOptions = {
    val __obj = js.Dynamic.literal()
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1(sanitize))
    __obj.asInstanceOf[AsssertOptions]
  }
}

