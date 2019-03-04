package typings
package arcgisDashJsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHandle extends js.Object {
  def remove(): scala.Unit
}

object IHandle {
  @scala.inline
  def apply(remove: js.Function0[scala.Unit]): IHandle = {
    val __obj = js.Dynamic.literal(remove = remove)
  
    __obj.asInstanceOf[IHandle]
  }
}

