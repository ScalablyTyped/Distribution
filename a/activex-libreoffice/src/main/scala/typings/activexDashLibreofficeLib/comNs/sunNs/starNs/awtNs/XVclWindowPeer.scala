package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the VCL window implementation.
  * @deprecated Deprecated
  */
trait XVclWindowPeer extends XWindowPeer {
  /** enables clipping of sibling windows. */
  def enableClipSiblings(bClip: scala.Boolean): scala.Unit
  /** returns the value of the property with the specified name. */
  def getProperty(PropertyName: java.lang.String): js.Any
  /** returns the font, foreground and background color for the specified type. */
  def getStyles(
    nType: scala.Double,
    Font: js.Array[FontDescriptor],
    ForegroundColor: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    BackgroundColor: js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color]
  ): scala.Unit
  /** returns `TRUE` if the window peer is a child, `FALSE` otherwise. */
  def isChild(Peer: XWindowPeer): scala.Boolean
  /** returns `TRUE` if the window peer is in design mode, `FALSE` otherwise. */
  def isDesignMode(): scala.Boolean
  /** sets the control font. */
  def setControlFont(aFont: FontDescriptor): scala.Unit
  /** sets the design mode for use in a design editor. */
  def setDesignMode(bOn: scala.Boolean): scala.Unit
  /** sets the foreground color. */
  def setForeground(Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  /** sets the value of the property with the specified name. */
  def setProperty(PropertyName: java.lang.String, Value: js.Any): scala.Unit
}

