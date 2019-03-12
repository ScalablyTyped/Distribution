package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FXInstance extends js.Object {
  def addFX(fxName: java.lang.String, FxClass: athenajsLib.Anon_Display): scala.Unit
}

object FXInstance {
  @scala.inline
  def apply(addFX: (java.lang.String, athenajsLib.Anon_Display) => scala.Unit): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = js.Any.fromFunction2(addFX))
  
    __obj.asInstanceOf[FXInstance]
  }
}

