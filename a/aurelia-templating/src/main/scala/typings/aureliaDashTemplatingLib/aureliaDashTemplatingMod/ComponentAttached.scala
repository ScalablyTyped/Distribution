package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentAttached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic when the component is attached to the DOM (in document).
    */
  def attached(): scala.Unit
}

object ComponentAttached {
  @scala.inline
  def apply(attached: js.Function0[scala.Unit]): ComponentAttached = {
    val __obj = js.Dynamic.literal(attached = attached)
  
    __obj.asInstanceOf[ComponentAttached]
  }
}

