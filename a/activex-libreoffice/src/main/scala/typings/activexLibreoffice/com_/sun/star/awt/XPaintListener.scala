package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive paint events. */
trait XPaintListener extends XEventListener {
  /** is invoked when a region of the window became invalid, e.g. when another window has been moved away. */
  def windowPaint(e: PaintEvent): Unit
}

object XPaintListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowPaint: PaintEvent => Unit
  ): XPaintListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowPaint = js.Any.fromFunction1(windowPaint))
    __obj.asInstanceOf[XPaintListener]
  }
}

