package typings.aureliaDashTemplating.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentUnbind extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic after the component is detached and unbound.
    */
  def unbind(): Unit
}

object ComponentUnbind {
  @scala.inline
  def apply(unbind: () => Unit): ComponentUnbind = {
    val __obj = js.Dynamic.literal(unbind = js.Any.fromFunction0(unbind))
  
    __obj.asInstanceOf[ComponentUnbind]
  }
}

