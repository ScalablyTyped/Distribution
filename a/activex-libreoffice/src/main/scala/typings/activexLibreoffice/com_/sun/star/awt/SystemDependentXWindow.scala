package typings.activexLibreoffice.com_.sun.star.awt

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
  var DisplayPointer: Double
  /** The {@link XWindow} handle if possible, otherwise 0. */
  var WindowHandle: Double
}

object SystemDependentXWindow {
  @scala.inline
  def apply(DisplayPointer: Double, WindowHandle: Double): SystemDependentXWindow = {
    val __obj = js.Dynamic.literal(DisplayPointer = DisplayPointer.asInstanceOf[js.Any], WindowHandle = WindowHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemDependentXWindow]
  }
}

