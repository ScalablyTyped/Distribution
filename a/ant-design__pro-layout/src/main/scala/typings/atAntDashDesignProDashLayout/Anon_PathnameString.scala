package typings.atAntDashDesignProDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathnameString extends js.Object {
  var pathname: js.UndefOr[String] = js.undefined
}

object Anon_PathnameString {
  @scala.inline
  def apply(pathname: String = null): Anon_PathnameString = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[Anon_PathnameString]
  }
}

