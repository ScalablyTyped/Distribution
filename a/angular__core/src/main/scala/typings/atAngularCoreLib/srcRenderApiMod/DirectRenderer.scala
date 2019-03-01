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
    appendChild: js.Function2[js.Any, js.Any, scala.Unit],
    insertBefore: js.Function2[js.Any, js.Any, scala.Unit],
    nextSibling: js.Function1[js.Any, js.Any],
    parentElement: js.Function1[js.Any, js.Any],
    remove: js.Function1[js.Any, scala.Unit]
  ): DirectRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChild")(appendChild)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("nextSibling")(nextSibling)
    __obj.updateDynamic("parentElement")(parentElement)
    __obj.updateDynamic("remove")(remove)
    __obj.asInstanceOf[DirectRenderer]
  }
}

