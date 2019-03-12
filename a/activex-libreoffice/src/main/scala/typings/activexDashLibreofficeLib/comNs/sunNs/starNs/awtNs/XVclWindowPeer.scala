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

object XVclWindowPeer {
  @scala.inline
  def apply(
    Toolkit: XToolkit,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    enableClipSiblings: scala.Boolean => scala.Unit,
    getProperty: java.lang.String => js.Any,
    getStyles: (scala.Double, js.Array[FontDescriptor], js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color], js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color]) => scala.Unit,
    getToolkit: () => XToolkit,
    invalidate: scala.Double => scala.Unit,
    invalidateRect: (Rectangle, scala.Double) => scala.Unit,
    isChild: XWindowPeer => scala.Boolean,
    isDesignMode: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setBackground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setControlFont: FontDescriptor => scala.Unit,
    setDesignMode: scala.Boolean => scala.Unit,
    setForeground: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setPointer: XPointer => scala.Unit,
    setProperty: (java.lang.String, js.Any) => scala.Unit
  ): XVclWindowPeer = {
    val __obj = js.Dynamic.literal(Toolkit = Toolkit, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), enableClipSiblings = js.Any.fromFunction1(enableClipSiblings), getProperty = js.Any.fromFunction1(getProperty), getStyles = js.Any.fromFunction4(getStyles), getToolkit = js.Any.fromFunction0(getToolkit), invalidate = js.Any.fromFunction1(invalidate), invalidateRect = js.Any.fromFunction2(invalidateRect), isChild = js.Any.fromFunction1(isChild), isDesignMode = js.Any.fromFunction0(isDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setBackground = js.Any.fromFunction1(setBackground), setControlFont = js.Any.fromFunction1(setControlFont), setDesignMode = js.Any.fromFunction1(setDesignMode), setForeground = js.Any.fromFunction1(setForeground), setPointer = js.Any.fromFunction1(setPointer), setProperty = js.Any.fromFunction2(setProperty))
  
    __obj.asInstanceOf[XVclWindowPeer]
  }
}

