package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive paint events. */
trait XPaintListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a region of the window became invalid, e.g. when another window has been moved away. */
  def windowPaint(e: PaintEvent): scala.Unit
}

