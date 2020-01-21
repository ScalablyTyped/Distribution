package typings.athenajs.mod

import typings.athenajs.AnonDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FXInstance extends js.Object {
  def addFX(fxName: String, FxClass: AnonDisplay): Unit
}

object FXInstance {
  @scala.inline
  def apply(addFX: (String, AnonDisplay) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
  
    __obj.asInstanceOf[FXInstance]
  }
}

