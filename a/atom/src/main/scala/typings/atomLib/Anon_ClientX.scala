package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientX extends js.Object {
  var clientX: scala.Double
  var clientY: scala.Double
}

object Anon_ClientX {
  @scala.inline
  def apply(clientX: scala.Double, clientY: scala.Double): Anon_ClientX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientX")(clientX)
    __obj.updateDynamic("clientY")(clientY)
    __obj.asInstanceOf[Anon_ClientX]
  }
}

