package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): scala.Unit
  def update(newConfig: antdLib.esModalModalMod.ModalFuncProps): scala.Unit
}

object Anon_Destroy {
  @scala.inline
  def apply(destroy: () => scala.Unit, update: antdLib.esModalModalMod.ModalFuncProps => scala.Unit): Anon_Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_Destroy]
  }
}

