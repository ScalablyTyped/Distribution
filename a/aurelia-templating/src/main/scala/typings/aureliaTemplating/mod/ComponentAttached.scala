package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentAttached extends js.Object {
  /**
    * Implement this hook if you want to perform custom logic when the component is attached to the DOM (in document).
    */
  def attached(): Unit
}

object ComponentAttached {
  @scala.inline
  def apply(attached: () => Unit): ComponentAttached = {
    val __obj = js.Dynamic.literal(attached = js.Any.fromFunction0(attached))
    __obj.asInstanceOf[ComponentAttached]
  }
}

