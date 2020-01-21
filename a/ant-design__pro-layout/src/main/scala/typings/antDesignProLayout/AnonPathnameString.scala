package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPathnameString extends js.Object {
  var pathname: js.UndefOr[String] = js.undefined
}

object AnonPathnameString {
  @scala.inline
  def apply(pathname: String = null): AnonPathnameString = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPathnameString]
  }
}

