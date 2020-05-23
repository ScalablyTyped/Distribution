package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pathname extends js.Object {
  var pathname: js.UndefOr[String] = js.undefined
}

object Pathname {
  @scala.inline
  def apply(pathname: String = null): Pathname = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pathname]
  }
}

