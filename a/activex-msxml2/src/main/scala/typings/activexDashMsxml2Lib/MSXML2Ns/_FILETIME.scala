package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FILETIME extends js.Object {
  val dwHighDateTime: scala.Double
  val dwLowDateTime: scala.Double
}

object _FILETIME {
  @scala.inline
  def apply(dwHighDateTime: scala.Double, dwLowDateTime: scala.Double): _FILETIME = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dwHighDateTime")(dwHighDateTime)
    __obj.updateDynamic("dwLowDateTime")(dwLowDateTime)
    __obj.asInstanceOf[_FILETIME]
  }
}

