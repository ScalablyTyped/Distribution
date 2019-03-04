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
    activate: js.Function1[scala.Double, scala.Unit],
    checkOffsets: js.Function0[scala.Unit],
    trackElement: js.Function2[js.Any, js.Any, scala.Unit],
    untrackElement: js.Function2[js.Any, js.Any, scala.Unit]
  ): IScrollspy = {
    val __obj = js.Dynamic.literal(activate = activate, checkOffsets = checkOffsets, trackElement = trackElement, untrackElement = untrackElement)
  
    __obj.asInstanceOf[IScrollspy]
  }
}

