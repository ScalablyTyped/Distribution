package typings.antd

import typings.antd.libModalModalMod.ModalFuncProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgsDestroy extends js.Object {
  def destroy(args: js.Any*): Unit
  def update(newConfig: ModalFuncProps): Unit
}

object Anon_ArgsDestroy {
  @scala.inline
  def apply(destroy: /* repeated */ js.Any => Unit, update: ModalFuncProps => Unit): Anon_ArgsDestroy = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1(destroy), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[Anon_ArgsDestroy]
  }
}

