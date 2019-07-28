package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientX extends js.Object {
  var clientX: Double
  var clientY: Double
}

object Anon_ClientX {
  @scala.inline
  def apply(clientX: Double, clientY: Double): Anon_ClientX = {
    val __obj = js.Dynamic.literal(clientX = clientX, clientY = clientY)
  
    __obj.asInstanceOf[Anon_ClientX]
  }
}

