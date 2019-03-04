package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentUnbind extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic after the component is detached and unbound.
    */
  def unbind(): scala.Unit
}

object ComponentUnbind {
  @scala.inline
  def apply(unbind: js.Function0[scala.Unit]): ComponentUnbind = {
    val __obj = js.Dynamic.literal(unbind = unbind)
  
    __obj.asInstanceOf[ComponentUnbind]
  }
}

