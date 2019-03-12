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
  def apply(remove: () => scala.Unit): IHandle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
  
    __obj.asInstanceOf[IHandle]
  }
}

