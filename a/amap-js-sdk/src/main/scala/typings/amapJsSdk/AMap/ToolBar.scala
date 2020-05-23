package typings.amapJsSdk.AMap

import typings.amapJsSdk.anon.Lat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBar
  extends EventBindable
     with MapControl {
  def doLocation(): Unit
  def getLocation(): Lat
  def getOffset(): Pixel
  def hideDirection(): Unit
  def hideLocation(): Unit
  def hideRuler(): Unit
  def setOffset(offset: Pixel): Unit
  def showDirection(): Unit
  def showLocation(): Unit
  def showRuler(): Unit
}

object ToolBar {
  @scala.inline
  def apply(
    doLocation: () => Unit,
    getLocation: () => Lat,
    getOffset: () => Pixel,
    hide: () => Unit,
    hideDirection: () => Unit,
    hideLocation: () => Unit,
    hideRuler: () => Unit,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    setOffset: Pixel => Unit,
    show: () => Unit,
    showDirection: () => Unit,
    showLocation: () => Unit,
    showRuler: () => Unit
  ): ToolBar = {
    val __obj = js.Dynamic.literal(doLocation = js.Any.fromFunction0(doLocation), getLocation = js.Any.fromFunction0(getLocation), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), hideDirection = js.Any.fromFunction0(hideDirection), hideLocation = js.Any.fromFunction0(hideLocation), hideRuler = js.Any.fromFunction0(hideRuler), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show), showDirection = js.Any.fromFunction0(showDirection), showLocation = js.Any.fromFunction0(showLocation), showRuler = js.Any.fromFunction0(showRuler))
    __obj.asInstanceOf[ToolBar]
  }
}

