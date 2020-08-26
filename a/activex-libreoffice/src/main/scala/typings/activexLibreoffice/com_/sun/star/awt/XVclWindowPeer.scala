package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to the VCL window implementation.
  * @deprecated Deprecated
  */
@js.native
trait XVclWindowPeer extends XWindowPeer {
  /** enables clipping of sibling windows. */
  def enableClipSiblings(bClip: Boolean): Unit = js.native
  /** returns the value of the property with the specified name. */
  def getProperty(PropertyName: String): js.Any = js.native
  /** returns the font, foreground and background color for the specified type. */
  def getStyles(
    nType: Double,
    Font: js.Array[FontDescriptor],
    ForegroundColor: js.Array[Color],
    BackgroundColor: js.Array[Color]
  ): Unit = js.native
  /** returns `TRUE` if the window peer is a child, `FALSE` otherwise. */
  def isChild(Peer: XWindowPeer): Boolean = js.native
  /** returns `TRUE` if the window peer is in design mode, `FALSE` otherwise. */
  def isDesignMode(): Boolean = js.native
  /** sets the control font. */
  def setControlFont(aFont: FontDescriptor): Unit = js.native
  /** sets the design mode for use in a design editor. */
  def setDesignMode(bOn: Boolean): Unit = js.native
  /** sets the foreground color. */
  def setForeground(Color: Color): Unit = js.native
  /** sets the value of the property with the specified name. */
  def setProperty(PropertyName: String, Value: js.Any): Unit = js.native
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
    val __obj = js.Dynamic.literal(Toolkit = Toolkit.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), enableClipSiblings = js.Any.fromFunction1(enableClipSiblings), getProperty = js.Any.fromFunction1(getProperty), getStyles = js.Any.fromFunction4(getStyles), getToolkit = js.Any.fromFunction0(getToolkit), invalidate = js.Any.fromFunction1(invalidate), invalidateRect = js.Any.fromFunction2(invalidateRect), isChild = js.Any.fromFunction1(isChild), isDesignMode = js.Any.fromFunction0(isDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setBackground = js.Any.fromFunction1(setBackground), setControlFont = js.Any.fromFunction1(setControlFont), setDesignMode = js.Any.fromFunction1(setDesignMode), setForeground = js.Any.fromFunction1(setForeground), setPointer = js.Any.fromFunction1(setPointer), setProperty = js.Any.fromFunction2(setProperty))
    __obj.asInstanceOf[XVclWindowPeer]
  }
  @scala.inline
  implicit class XVclWindowPeerOps[Self <: XVclWindowPeer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnableClipSiblings(value: Boolean => Unit): Self = this.set("enableClipSiblings", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProperty(value: String => js.Any): Self = this.set("getProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStyles(value: (Double, js.Array[FontDescriptor], js.Array[Color], js.Array[Color]) => Unit): Self = this.set("getStyles", js.Any.fromFunction4(value))
    @scala.inline
    def setIsChild(value: XWindowPeer => Boolean): Self = this.set("isChild", js.Any.fromFunction1(value))
    @scala.inline
    def setIsDesignMode(value: () => Boolean): Self = this.set("isDesignMode", js.Any.fromFunction0(value))
    @scala.inline
    def setSetControlFont(value: FontDescriptor => Unit): Self = this.set("setControlFont", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDesignMode(value: Boolean => Unit): Self = this.set("setDesignMode", js.Any.fromFunction1(value))
    @scala.inline
    def setSetForeground(value: Color => Unit): Self = this.set("setForeground", js.Any.fromFunction1(value))
    @scala.inline
    def setSetProperty(value: (String, js.Any) => Unit): Self = this.set("setProperty", js.Any.fromFunction2(value))
  }
  
}

