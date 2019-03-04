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
  def apply(addFX: js.Function2[java.lang.String, athenajsLib.Anon_Display, scala.Unit]): FXInstance = {
    val __obj = js.Dynamic.literal(addFX = addFX)
  
    __obj.asInstanceOf[FXInstance]
  }
}

