package typings
package activexDashAccessLib.AccWizObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WIZ_FILETIME extends js.Object {
  val dwHighDateTime: scala.Double
  val dwLowDateTime: scala.Double
}

object WIZ_FILETIME {
  @scala.inline
  def apply(dwHighDateTime: scala.Double, dwLowDateTime: scala.Double): WIZ_FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime, dwLowDateTime = dwLowDateTime)
  
    __obj.asInstanceOf[WIZ_FILETIME]
  }
}

