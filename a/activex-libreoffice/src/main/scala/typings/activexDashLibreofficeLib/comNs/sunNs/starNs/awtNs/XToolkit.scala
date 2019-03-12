package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a factory interface for the window toolkit.
  *
  * This is similar to the abstract window toolkit (AWT) in Java.
  */
trait XToolkit
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def createScreenCompatibleDevice(Width: scala.Double, Height: scala.Double): XDevice
  /** creates a new window using the given descriptor. */
  def createWindow(Descriptor: WindowDescriptor): XWindowPeer
  /** returns a sequence of windows which are newly created using the given descriptors. */
  def createWindows(Descriptors: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor]): stdLib.SafeArray[XWindowPeer]
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
    acquire: () => scala.Unit,
    createRegion: () => XRegion,
    createScreenCompatibleDevice: (scala.Double, scala.Double) => XDevice,
    createWindow: WindowDescriptor => XWindowPeer,
    createWindows: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor] => stdLib.SafeArray[XWindowPeer],
    getDesktopWindow: () => XWindowPeer,
    getWorkArea: () => Rectangle,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XToolkit = {
    val __obj = js.Dynamic.literal(DesktopWindow = DesktopWindow, WorkArea = WorkArea, acquire = js.Any.fromFunction0(acquire), createRegion = js.Any.fromFunction0(createRegion), createScreenCompatibleDevice = js.Any.fromFunction2(createScreenCompatibleDevice), createWindow = js.Any.fromFunction1(createWindow), createWindows = js.Any.fromFunction1(createWindows), getDesktopWindow = js.Any.fromFunction0(getDesktopWindow), getWorkArea = js.Any.fromFunction0(getWorkArea), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XToolkit]
  }
}

