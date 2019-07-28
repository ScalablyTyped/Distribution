package typings.athenajs.athenajsMod

import typings.athenajs.Anon_Display
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FXInstance extends js.Object {
  def addFX(fxName: String, FxClass: Anon_Display): Unit
}

object FXInstance {
  @scala.inline
  def apply(addFX: (String, Anon_Display) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
  
    __obj.asInstanceOf[FXInstance]
  }
}

