package typings.activexAccess.AccWizObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WIZ_FILETIME extends js.Object {
  val dwHighDateTime: Double
  val dwLowDateTime: Double
}

object WIZ_FILETIME {
  @scala.inline
  def apply(dwHighDateTime: Double, dwLowDateTime: Double): WIZ_FILETIME = {
    val __obj = js.Dynamic.literal(dwHighDateTime = dwHighDateTime.asInstanceOf[js.Any], dwLowDateTime = dwLowDateTime.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WIZ_FILETIME]
  }
}

