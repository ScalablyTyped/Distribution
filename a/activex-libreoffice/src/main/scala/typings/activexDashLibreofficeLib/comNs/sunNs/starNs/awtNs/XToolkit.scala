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
  def createWindows(Descriptors: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor]): activexDashInteropLib.SafeArray[XWindowPeer]
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
    acquire: js.Function0[scala.Unit],
    createRegion: js.Function0[XRegion],
    createScreenCompatibleDevice: js.Function2[scala.Double, scala.Double, XDevice],
    createWindow: js.Function1[WindowDescriptor, XWindowPeer],
    createWindows: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[WindowDescriptor], 
      activexDashInteropLib.SafeArray[XWindowPeer]
    ],
    getDesktopWindow: js.Function0[XWindowPeer],
    getWorkArea: js.Function0[Rectangle],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XToolkit = {
    val __obj = js.Dynamic.literal(DesktopWindow = DesktopWindow, WorkArea = WorkArea, acquire = acquire, createRegion = createRegion, createScreenCompatibleDevice = createScreenCompatibleDevice, createWindow = createWindow, createWindows = createWindows, getDesktopWindow = getDesktopWindow, getWorkArea = getWorkArea, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XToolkit]
  }
}

