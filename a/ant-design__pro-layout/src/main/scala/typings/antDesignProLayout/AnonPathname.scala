package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathname extends js.Object {
  var pathname: js.UndefOr[String] = js.undefined
}

object AnonPathname {
  @scala.inline
  def apply(pathname: String = null): AnonPathname = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPathname]
  }
}

