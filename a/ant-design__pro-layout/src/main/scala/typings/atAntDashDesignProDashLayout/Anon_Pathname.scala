package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pathname extends js.Object {
  var pathname: js.UndefOr[String] = js.undefined
}

object Anon_Pathname {
  @scala.inline
  def apply(pathname: String = null): Anon_Pathname = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Pathname]
  }
}

