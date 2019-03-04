package typings
package androiduixLib.androidNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogInterface extends js.Object {
  def cancel(): scala.Unit
  def dismiss(): scala.Unit
}

object DialogInterface {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit], dismiss: js.Function0[scala.Unit]): DialogInterface = {
    val __obj = js.Dynamic.literal(cancel = cancel, dismiss = dismiss)
  
    __obj.asInstanceOf[DialogInterface]
  }
}

