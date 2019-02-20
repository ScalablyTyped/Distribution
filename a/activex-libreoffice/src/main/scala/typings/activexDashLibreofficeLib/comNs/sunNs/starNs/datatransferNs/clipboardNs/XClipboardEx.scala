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

