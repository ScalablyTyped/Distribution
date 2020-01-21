package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵDirectRenderer extends js.Object {
  def appendChild(node: js.Any, parent: js.Any): Unit
  def insertBefore(node: js.Any, refNode: js.Any): Unit
  def nextSibling(node: js.Any): js.Any
  def parentElement(node: js.Any): js.Any
  def remove(node: js.Any): Unit
}

object ɵDirectRenderer {
  @scala.inline
  def apply(
    appendChild: (js.Any, js.Any) => Unit,
    insertBefore: (js.Any, js.Any) => Unit,
    nextSibling: js.Any => js.Any,
    parentElement: js.Any => js.Any,
    remove: js.Any => Unit
  ): ɵDirectRenderer = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction2(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), nextSibling = js.Any.fromFunction1(nextSibling), parentElement = js.Any.fromFunction1(parentElement), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ɵDirectRenderer]
  }
}

