package typings
package atAngularCoreLib.srcRenderApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectRenderer extends js.Object {
  def appendChild(node: js.Any, parent: js.Any): scala.Unit
  def insertBefore(node: js.Any, refNode: js.Any): scala.Unit
  def nextSibling(node: js.Any): js.Any
  def parentElement(node: js.Any): js.Any
  def remove(node: js.Any): scala.Unit
}

object DirectRenderer {
  @scala.inline
  def apply(
    appendChild: (js.Any, js.Any) => scala.Unit,
    insertBefore: (js.Any, js.Any) => scala.Unit,
    nextSibling: js.Any => js.Any,
    parentElement: js.Any => js.Any,
    remove: js.Any => scala.Unit
  ): DirectRenderer = {
    val __obj = js.Dynamic.literal(appendChild = js.Any.fromFunction2(appendChild), insertBefore = js.Any.fromFunction2(insertBefore), nextSibling = js.Any.fromFunction1(nextSibling), parentElement = js.Any.fromFunction1(parentElement), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[DirectRenderer]
  }
}

