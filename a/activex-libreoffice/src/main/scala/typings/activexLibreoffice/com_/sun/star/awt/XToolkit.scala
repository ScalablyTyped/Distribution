package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a factory interface for the window toolkit.
  *
  * This is similar to the abstract window toolkit (AWT) in Java.
  */
trait XToolkit extends XInterface {
  /** returns the desktop window. */
  val DesktopWindow: XWindowPeer
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  val WorkArea: Rectangle
  /** creates a region. */
  def createRegion(): XRegion
  /** creates a virtual device that is compatible with the screen. */
  def createScreenCompatibleDevice(Width: Double, Height: Double): XDevice
  /** creates a new window using the given descriptor. */
  def createWindow(Descriptor: WindowDescriptor): XWindowPeer
  /** returns a sequence of windows which are newly created using the given descriptors. */
  def createWindows(Descriptors: SeqEquiv[WindowDescriptor]): SafeArray[XWindowPeer]
  /** returns the desktop window. */
  def getDesktopWindow(): XWindowPeer
  /**
    * For LibreOffice versions < 4.1, this method just returned an empty rectangle. After that, it started returning a valid value.
    * @returns the size and position of the primary display
    */
  def getWorkArea(): Rectangle
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
}

