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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    enableClipSiblings: js.Function1[scala.Boolean, scala.Unit],
    getProperty: js.Function1[java.lang.String, js.Any],
    getStyles: js.Function4[
      scala.Double, 
      js.Array[FontDescriptor], 
      js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color], 
      js.Array[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color], 
      scala.Unit
    ],
    getToolkit: js.Function0[XToolkit],
    invalidate: js.Function1[scala.Double, scala.Unit],
    invalidateRect: js.Function2[Rectangle, scala.Double, scala.Unit],
    isChild: js.Function1[XWindowPeer, scala.Boolean],
    isDesignMode: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setBackground: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setControlFont: js.Function1[FontDescriptor, scala.Unit],
    setDesignMode: js.Function1[scala.Boolean, scala.Unit],
    setForeground: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setPointer: js.Function1[XPointer, scala.Unit],
    setProperty: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XVclWindowPeer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Toolkit")(Toolkit)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("enableClipSiblings")(enableClipSiblings)
    __obj.updateDynamic("getProperty")(getProperty)
    __obj.updateDynamic("getStyles")(getStyles)
    __obj.updateDynamic("getToolkit")(getToolkit)
    __obj.updateDynamic("invalidate")(invalidate)
    __obj.updateDynamic("invalidateRect")(invalidateRect)
    __obj.updateDynamic("isChild")(isChild)
    __obj.updateDynamic("isDesignMode")(isDesignMode)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("setBackground")(setBackground)
    __obj.updateDynamic("setControlFont")(setControlFont)
    __obj.updateDynamic("setDesignMode")(setDesignMode)
    __obj.updateDynamic("setForeground")(setForeground)
    __obj.updateDynamic("setPointer")(setPointer)
    __obj.updateDynamic("setProperty")(setProperty)
    __obj.asInstanceOf[XVclWindowPeer]
  }
}

