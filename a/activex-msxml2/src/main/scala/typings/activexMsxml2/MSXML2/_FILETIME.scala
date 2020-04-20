package typings.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _FILETIME extends js.Object {
  val dwHighDateTime: Double
  val dwLowDateTime: Double
}

object _FILETIME {
  @scala.inline
  def apply(dwHighDateTime: Double, dwLowDateTime: Double): _FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[_FILETIME]
  }
}

