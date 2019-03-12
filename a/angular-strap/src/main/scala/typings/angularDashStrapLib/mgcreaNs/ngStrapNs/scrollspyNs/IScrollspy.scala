package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.scrollspyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollspy extends js.Object {
  def activate(index: scala.Double): scala.Unit
  def checkOffsets(): scala.Unit
  def trackElement(target: js.Any, source: js.Any): scala.Unit
  def untrackElement(target: js.Any, source: js.Any): scala.Unit
}

object IScrollspy {
  @scala.inline
  def apply(
    activate: scala.Double => scala.Unit,
    checkOffsets: () => scala.Unit,
    trackElement: (js.Any, js.Any) => scala.Unit,
    untrackElement: (js.Any, js.Any) => scala.Unit
  ): IScrollspy = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), checkOffsets = js.Any.fromFunction0(checkOffsets), trackElement = js.Any.fromFunction2(trackElement), untrackElement = js.Any.fromFunction2(untrackElement))
  
    __obj.asInstanceOf[IScrollspy]
  }
}

