package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes a window. */
trait WindowDescriptor extends js.Object {
  /**
    * specifies the position and size of the window.
    *
    * This member is ignored if the window attribute is {@link com.sun.star.awt.WindowAttribute.FULLSIZE} .
    */
  var Bounds: Rectangle
  /**
    * specifies the parent of the component.
    *
    * If `Parent == 0 && ParentIndex == -1` , then the window is on the desktop.
    */
  var Parent: XWindowPeer
  /**
    * specifies the index of the parent window, if available.
    *
    * If `Parent == 0` and this struct is a member of an array, then this is the offset from the beginning of the array to the parent. A value of -1 means
    * desktop.
    */
  var ParentIndex: scala.Double
  /** specifies the type of window. */
  var Type: WindowClass
  /**
    * specifies the window attributes.
    *
    * Use one value out of the constant group {@link com.sun.star.awt.WindowAttribute} .
    */
  var WindowAttributes: scala.Double
  /**
    * specifies the name of the component service.
    *
    * A zero length name means that the VCL creates a blank top, a container, or a simple window. The following service names are defined: ;
    * spinbuttonspinfieldsplittersplitwindowstatusbarsystemchildwindowtabcontroltabdialogtabpagetimeboxtimefieldtoolboxtristateboxwarningboxwindowworkwindow
    */
  var WindowServiceName: java.lang.String
}

