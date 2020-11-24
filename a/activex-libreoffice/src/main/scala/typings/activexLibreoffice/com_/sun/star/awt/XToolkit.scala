package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a factory interface for the window toolkit.
  *
  * This is similar to the abstract window toolkit (AWT) in Java.
  */
@js.native
trait XToolkit extends XInterface {
  
  /** returns the desktop window. */
  val DesktopWindow: XWindowPeer = js.native
  
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  val WorkArea: Rectangle = js.native
  
  /** creates a region. */
  def createRegion(): XRegion = js.native
  
  /** creates a virtual device that is compatible with the screen. */
  def createScreenCompatibleDevice(Width: Double, Height: Double): XDevice = js.native
  
  /** creates a new window using the given descriptor. */
  def createWindow(Descriptor: WindowDescriptor): XWindowPeer = js.native
  
  /** returns a sequence of windows which are newly created using the given descriptors. */
  def createWindows(Descriptors: SeqEquiv[WindowDescriptor]): SafeArray[XWindowPeer] = js.native
  
  /** returns the desktop window. */
  def getDesktopWindow(): XWindowPeer = js.native
  
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  def getWorkArea(): Rectangle = js.native
}
object XToolkit {
  
  @scala.inline
  def apply(
    DesktopWindow: XWindowPeer,
    WorkArea: Rectangle,
    acquire: () => Unit,
    createRegion: () => XRegion,
    createScreenCompatibleDevice: (Double, Double) => XDevice,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer],
    getDesktopWindow: () => XWindowPeer,
    getWorkArea: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XToolkit = {
    val __obj = js.Dynamic.literal(DesktopWindow = DesktopWindow.asInstanceOf[js.Any], WorkArea = WorkArea.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), createRegion = js.Any.fromFunction0(createRegion), createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), getDesktopWindow = js.Any.fromFunction0(getDesktopWindow), getWorkArea = js.Any.fromFunction0(getWorkArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XToolkit]
  }
  
  @scala.inline
  implicit class XToolkitOps[Self <: XToolkit] (val x: Self) extends AnyVal {
    
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
    def setDesktopWindow(value: XWindowPeer): Self = this.set("DesktopWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkArea(value: Rectangle): Self = this.set("WorkArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRegion(value: () => XRegion): Self = this.set("createRegion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateScreenCompatibleDevice(value: (Double, Double) => XDevice): Self = this.set("createScreenCompatibleDevice", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateWindow(value: WindowDescriptor => XWindowPeer): Self = this.set("createWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWindows(value: SeqEquiv[WindowDescriptor] => SafeArray[XWindowPeer]): Self = this.set("createWindows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDesktopWindow(value: () => XWindowPeer): Self = this.set("getDesktopWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWorkArea(value: () => Rectangle): Self = this.set("getWorkArea", js.Any.fromFunction0(value))
  }
}
