package typings.angularStrap.mgcrea.ngStrap.scrollspy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollspy extends js.Object {
  def activate(index: Double): Unit
  def checkOffsets(): Unit
  def trackElement(target: js.Any, source: js.Any): Unit
  def untrackElement(target: js.Any, source: js.Any): Unit
}

object IScrollspy {
  @scala.inline
  def apply(
    activate: Double => Unit,
    checkOffsets: () => Unit,
    trackElement: (js.Any, js.Any) => Unit,
    untrackElement: (js.Any, js.Any) => Unit
  ): IScrollspy = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), checkOffsets = js.Any.fromFunction0(checkOffsets), trackElement = js.Any.fromFunction2(trackElement), untrackElement = js.Any.fromFunction2(untrackElement))
  
    __obj.asInstanceOf[IScrollspy]
  }
}

