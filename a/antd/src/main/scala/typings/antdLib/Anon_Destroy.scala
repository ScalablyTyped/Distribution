package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): scala.Unit
  def update(newConfig: antdLib.libModalModalMod.ModalFuncProps): scala.Unit
}

object Anon_Destroy {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    update: js.Function1[antdLib.libModalModalMod.ModalFuncProps, scala.Unit]
  ): Anon_Destroy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_Destroy]
  }
}

