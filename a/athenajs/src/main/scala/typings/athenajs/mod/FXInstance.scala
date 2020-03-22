package typings.athenajs.mod

import typings.athenajs.AnonInstantiableEffect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FXInstance extends js.Object {
  def addFX(fxName: String, FxClass: AnonInstantiableEffect): Unit
}

object FXInstance {
  @scala.inline
  def apply(addFX: (String, AnonInstantiableEffect) => Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
  
    __obj.asInstanceOf[FXInstance]
  }
}

