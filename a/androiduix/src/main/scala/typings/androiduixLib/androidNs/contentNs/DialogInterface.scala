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
  def apply(cancel: () => scala.Unit, dismiss: () => scala.Unit): DialogInterface = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), dismiss = js.Any.fromFunction0(dismiss))
  
    __obj.asInstanceOf[DialogInterface]
  }
}

