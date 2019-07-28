package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the VCL window implementation.
  * @deprecated Deprecated
  */
trait XVclWindowPeer extends XWindowPeer {
  /** enables clipping of sibling windows. */
  def enableClipSiblings(bClip: Boolean): Unit
  /** returns the value of the property with the specified name. */
  def getProperty(PropertyName: String): js.Any
  /** returns the font, foreground and background color for the specified type. */
  def getStyles(
    nType: Double,
    Font: js.Array[FontDescriptor],
    ForegroundColor: js.Array[Color],
    BackgroundColor: js.Array[Color]
  ): Unit
  /** returns `TRUE` if the window peer is a child, `FALSE` otherwise. */
  def isChild(Peer: XWindowPeer): Boolean
  /** returns `TRUE` if the window peer is in design mode, `FALSE` otherwise. */
  def isDesignMode(): Boolean
  /** sets the control font. */
  def setControlFont(aFont: FontDescriptor): Unit
  /** sets the design mode for use in a design editor. */
  def setDesignMode(bOn: Boolean): Unit
  /** sets the foreground color. */
  def setForeground(Color: Color): Unit
  /** sets the value of the property with the specified name. */
  def setProperty(PropertyName: String, Value: js.Any): Unit
}

object XVclWindowPeer {
  @scala.inline
  def apply(
    Toolkit: XToolkit,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    enableClipSiblings: Boolean => Unit,
    getProperty: String => js.Any,
    getStyles: (Double, js.Array[FontDescriptor], js.Array[Color], js.Array[Color]) => Unit,
    getToolkit: () => XToolkit,
    invalidate: Double => Unit,
    invalidateRect: (Rectangle, Double) => Unit,
    isChild: XWindowPeer => Boolean,
    isDesignMode: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setBackground: Color => Unit,
    setControlFont: FontDescriptor => Unit,
    setDesignMode: Boolean => Unit,
    setForeground: Color => Unit,
    setPointer: XPointer => Unit,
    setProperty: (String, js.Any) => Unit
  ): XVclWindowPeer = {
    val __obj = js.Dynamic.literal(Toolkit = Toolkit, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), enableClipSiblings = js.Any.fromFunction1(enableClipSiblings), getProperty = js.Any.fromFunction1(getProperty), getStyles = js.Any.fromFunction4(getStyles), getToolkit = js.Any.fromFunction0(getToolkit), invalidate = js.Any.fromFunction1(invalidate), invalidateRect = js.Any.fromFunction2(invalidateRect), isChild = js.Any.fromFunction1(isChild), isDesignMode = js.Any.fromFunction0(isDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setBackground = js.Any.fromFunction1(setBackground), setControlFont = js.Any.fromFunction1(setControlFont), setDesignMode = js.Any.fromFunction1(setDesignMode), setForeground = js.Any.fromFunction1(setForeground), setPointer = js.Any.fromFunction1(setPointer), setProperty = js.Any.fromFunction2(setProperty))
  
    __obj.asInstanceOf[XVclWindowPeer]
  }
}

