package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a system dependent {@link XWindow} .
  *
  * This is the structure returned in the {@link XSystemDependentWindowPeer.getWindowHandle()} call, if the system type is
  * com::sun::star::lang::SystemDependent::XWINDOW.
  * @deprecated Deprecated
  */
@js.native
trait SystemDependentXWindow extends js.Object {
  
  /** The display pointer. */
  var DisplayPointer: Double = js.native
  
  /** The {@link XWindow} handle if possible, otherwise 0. */
  var WindowHandle: Double = js.native
}
object SystemDependentXWindow {
  
  @scala.inline
  def apply(DisplayPointer: Double, WindowHandle: Double): SystemDependentXWindow = {
    val __obj = js.Dynamic.literal(DisplayPointer = DisplayPointer.asInstanceOf[js.Any], WindowHandle = WindowHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemDependentXWindow]
  }
  
  @scala.inline
  implicit class SystemDependentXWindowOps[Self <: SystemDependentXWindow] (val x: Self) extends AnyVal {
    
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
    def setDisplayPointer(value: Double): Self = this.set("DisplayPointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowHandle(value: Double): Self = this.set("WindowHandle", value.asInstanceOf[js.Any])
  }
}
