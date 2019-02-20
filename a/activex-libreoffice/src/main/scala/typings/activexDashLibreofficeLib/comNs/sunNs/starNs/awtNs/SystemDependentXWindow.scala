package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a system dependent {@link XWindow} .
  *
  * This is the structure returned in the {@link XSystemDependentWindowPeer.getWindowHandle()} call, if the system type is
  * com::sun::star::lang::SystemDependent::XWINDOW.
  * @deprecated Deprecated
  */
trait SystemDependentXWindow extends js.Object {
  /** The display pointer. */
  var DisplayPointer: scala.Double
  /** The {@link XWindow} handle if possible, otherwise 0. */
  var WindowHandle: scala.Double
}

