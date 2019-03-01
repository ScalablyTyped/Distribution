package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.clipboardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extended clipboard interface.
  * @see com.sun.star.datatransfer.clipboard.XClipboard
  */
trait XClipboardEx extends XClipboard {
  /**
    * To determine the supported rendering capabilities of the clipboard instance.
    * @returns A set of flags describing the rendering capabilities of the clipboard instance.
    * @see RenderingCapabilities
    */
  val RenderingCapabilities: scala.Double
  /**
    * To determine the supported rendering capabilities of the clipboard instance.
    * @returns A set of flags describing the rendering capabilities of the clipboard instance.
    * @see RenderingCapabilities
    */
  def getRenderingCapabilities(): scala.Double
}

object XClipboardEx {
  @scala.inline
  def apply(
    Contents: activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable,
    Name: java.lang.String,
    RenderingCapabilities: scala.Double,
    acquire: js.Function0[scala.Unit],
    getContents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable],
    getName: js.Function0[java.lang.String],
    getRenderingCapabilities: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setContents: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.datatransferNs.XTransferable, 
      XClipboardOwner, 
      scala.Unit
    ]
  ): XClipboardEx = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Contents")(Contents)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("RenderingCapabilities")(RenderingCapabilities)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getContents")(getContents)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getRenderingCapabilities")(getRenderingCapabilities)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setContents")(setContents)
    __obj.asInstanceOf[XClipboardEx]
  }
}

