package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a window. */
@js.native
trait WindowDescriptor extends js.Object {
  
  /**
    * specifies the position and size of the window.
    *
    * This member is ignored if the window attribute is {@link com.sun.star.awt.WindowAttribute.FULLSIZE} .
    */
  var Bounds: Rectangle = js.native
  
  /**
    * specifies the parent of the component.
    *
    * If `Parent == 0 && ParentIndex == -1` , then the window is on the desktop.
    */
  var Parent: XWindowPeer = js.native
  
  /**
    * specifies the index of the parent window, if available.
    *
    * If `Parent == 0` and this struct is a member of an array, then this is the offset from the beginning of the array to the parent. A value of -1 means
    * desktop.
    */
  var ParentIndex: Double = js.native
  
  /** specifies the type of window. */
  var Type: WindowClass = js.native
  
  /**
    * specifies the window attributes.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.WindowAttribute} .
    */
  var WindowAttributes: Double = js.native
  
  /**
    * specifies the name of the component service.
    *
    * A zero length name means that the VCL creates a blank top, a container, or a simple window. The following service names are defined: ;
    * spinbuttonspinfieldsplittersplitwindowstatusbarsystemchildwindowtabcontroltabdialogtabpagetimeboxtimefieldtoolboxtristateboxwarningboxwindowworkwindow
    */
  var WindowServiceName: String = js.native
}
object WindowDescriptor {
  
  @scala.inline
  def apply(
    Bounds: Rectangle,
    Parent: XWindowPeer,
    ParentIndex: Double,
    Type: WindowClass,
    WindowAttributes: Double,
    WindowServiceName: String
  ): WindowDescriptor = {
    val __obj = js.Dynamic.literal(Bounds = Bounds.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ParentIndex = ParentIndex.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], WindowAttributes = WindowAttributes.asInstanceOf[js.Any], WindowServiceName = WindowServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowDescriptor]
  }
  
  @scala.inline
  implicit class WindowDescriptorOps[Self <: WindowDescriptor] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Rectangle): Self = this.set("Bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: XWindowPeer): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIndex(value: Double): Self = this.set("ParentIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: WindowClass): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowAttributes(value: Double): Self = this.set("WindowAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowServiceName(value: String): Self = this.set("WindowServiceName", value.asInstanceOf[js.Any])
  }
}
