package typings
package atAntDashDesignProDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Pathname extends js.Object {
  var pathname: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Pathname {
  @scala.inline
  def apply(pathname: java.lang.String = null): Anon_Pathname = {
    val __obj = js.Dynamic.literal()
    if (pathname != null) __obj.updateDynamic("pathname")(pathname)
    __obj.asInstanceOf[Anon_Pathname]
  }
}

