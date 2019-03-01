package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDetached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
    */
  def detached(): scala.Unit
}

object ComponentDetached {
  @scala.inline
  def apply(detached: js.Function0[scala.Unit]): ComponentDetached = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detached")(detached)
    __obj.asInstanceOf[ComponentDetached]
  }
}

