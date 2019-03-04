package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Optional interface of sidebar panels. */
trait XSidebarPanel extends js.Object {
  /** Minimal possible width of this panel. */
  val MinimalWidth: scala.Double
  /**
    * For a given width of the container the layouter asks every ui element for its optimal height.
    *
    * The height to which a ui element is set may differ from the returned value.
    *
    * The height is set via the XWindow interface.
    */
  def getHeightForWidth(nWidth: scala.Double): LayoutSize
  /** Minimal possible width of this panel. */
  def getMinimalWidth(): scala.Double
}

object XSidebarPanel {
  @scala.inline
  def apply(
    MinimalWidth: scala.Double,
    getHeightForWidth: js.Function1[scala.Double, LayoutSize],
    getMinimalWidth: js.Function0[scala.Double]
  ): XSidebarPanel = {
    val __obj = js.Dynamic.literal(MinimalWidth = MinimalWidth, getHeightForWidth = getHeightForWidth, getMinimalWidth = getMinimalWidth)
  
    __obj.asInstanceOf[XSidebarPanel]
  }
}

