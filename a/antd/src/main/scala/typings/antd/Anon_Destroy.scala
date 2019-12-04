package typings.antd

import typings.antd.libModalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destroy extends js.Object {
  def destroy(): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Anon_Destroy {
  @scala.inline
  def apply(destroy: () => Unit, update: ModalFuncProps => Unit): Anon_Destroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_Destroy]
  }
}

