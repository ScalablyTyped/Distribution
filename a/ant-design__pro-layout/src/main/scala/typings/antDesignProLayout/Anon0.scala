package typings.antDesignProLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var pathname: js.UndefOr[String] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply(pathname: String = null): Anon0 = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

