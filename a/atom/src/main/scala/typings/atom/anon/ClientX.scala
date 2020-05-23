package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientX extends js.Object {
  var clientX: Double
  var clientY: Double
}

object ClientX {
  @scala.inline
  def apply(clientX: Double, clientY: Double): ClientX = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientX]
  }
}

