package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DestroyNewConfig extends js.Object {
  def destroy(): scala.Unit
  def update(newConfig: antdLib.libModalModalMod.ModalFuncProps): scala.Unit
}

object Anon_DestroyNewConfig {
  @scala.inline
  def apply(destroy: () => scala.Unit, update: antdLib.libModalModalMod.ModalFuncProps => scala.Unit): Anon_DestroyNewConfig = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_DestroyNewConfig]
  }
}

