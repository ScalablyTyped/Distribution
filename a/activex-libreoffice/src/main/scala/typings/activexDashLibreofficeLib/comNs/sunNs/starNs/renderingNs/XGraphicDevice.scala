package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to a graphic device, such as a printer, or a screen device. Every canvas (
  * @see XCanvas) has exactly one associated graphic device, into which its output is rendered. For a typical windowing system, the graphic device is equi
  */
trait XGraphicDevice
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Query the controller for multi buffering functionality on this graphic device.
    *
    * If there is no such functionality available, the NULL reference is returned.
    */
  val BufferController: XBufferController
  /**
    * Query the color space interface for this graphic device.
    *
    * This is to be used when interpreting or setting device color values.
    */
  val DeviceColorSpace: XColorSpace
  /**
    * Get a reference to this device's parametric polygon factory.
    * @returns a reference to this device's parametric polygon factory. Although it is possible to use parametric polygons on all canvases, regardless of the as
    */
  val ParametricPolyPolygonFactory: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
  /**
    * Query the physical resolution of the device in pixel per millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    */
  val PhysicalResolution: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D
  /**
    * Query the physical dimensions of the device in millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    * @see XBitmap.getSize()
    */
  val PhysicalSize: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D
  /**
    * Create a bitmap with alpha channel whose memory layout and sample model is compatible to the graphic device.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createCompatibleAlphaBitmap(size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D): XBitmap
  /**
    * Create a Bezier poly-polygon which can internally use device-optimized representations already.
    * @param points The points of the poly-polygon, in a separate array for every polygon.
    */
  def createCompatibleBezierPolyPolygon(
    points: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D]
    ]
  ): XBezierPolyPolygon2D
  /**
    * Create a bitmap whose memory layout and sample model is compatible to the graphic device.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createCompatibleBitmap(size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D): XBitmap
  /**
    * Create a line poly-polygon which can internally use device-optimized representations already.
    * @param points The points of the poly-polygon, in a separate array for every polygon.
    */
  def createCompatibleLinePolyPolygon(
    points: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
    ]
  ): XLinePolyPolygon2D
  /**
    * Create a volatile bitmap with alpha channel that is usable with this graphic device.
    *
    * A volatile bitmap's difference in comparison to a plain bitmap (e.g. generated via {@link createCompatibleBitmap()} ) is the fact that its content
    * might vanish at any point in time (making any operation with them produce a {@link VolatileContentDestroyedException} ). The benefit, on the other
    * hand, is that they might be easy to hardware-accelerate on certain platforms, without the need to keep a safety copy of the content internally.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createVolatileAlphaBitmap(size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D): XVolatileBitmap
  /**
    * Create a volatile bitmap that is usable with this graphic device.
    *
    * A volatile bitmap's difference in comparison to a plain bitmap (e.g. generated via {@link createCompatibleBitmap()} ) is the fact that its content
    * might vanish at any point in time (making any operation with them produce a {@link VolatileContentDestroyedException} ). The benefit, on the other
    * hand, is that they might be easy to hardware-accelerate on certain platforms, without the need to keep a safety copy of the content internally.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createVolatileBitmap(size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D): XVolatileBitmap
  /** Enter or leave the fullscreen mode, if possible. The return value denotes the success of the operation. */
  def enterFullScreenMode(bEnter: scala.Boolean): scala.Boolean
  /**
    * Query the controller for multi buffering functionality on this graphic device.
    *
    * If there is no such functionality available, the NULL reference is returned.
    */
  def getBufferController(): XBufferController
  /**
    * Query the color space interface for this graphic device.
    *
    * This is to be used when interpreting or setting device color values.
    */
  def getDeviceColorSpace(): XColorSpace
  /**
    * Get a reference to this device's parametric polygon factory.
    * @returns a reference to this device's parametric polygon factory. Although it is possible to use parametric polygons on all canvases, regardless of the as
    */
  def getParametricPolyPolygonFactory(): activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
  /**
    * Query the physical resolution of the device in pixel per millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    */
  def getPhysicalResolution(): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D
  /**
    * Query the physical dimensions of the device in millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    * @see XBitmap.getSize()
    */
  def getPhysicalSize(): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D
  /** Tells whether this graphic device has a full screen mode, i.e. whether a window can cover the whole screen exclusively. */
  def hasFullScreenMode(): scala.Boolean
}

object XGraphicDevice {
  @scala.inline
  def apply(
    BufferController: XBufferController,
    DeviceColorSpace: XColorSpace,
    ParametricPolyPolygonFactory: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory,
    PhysicalResolution: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D,
    PhysicalSize: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D,
    acquire: js.Function0[scala.Unit],
    createCompatibleAlphaBitmap: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D, XBitmap],
    createCompatibleBezierPolyPolygon: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D]
      ], 
      XBezierPolyPolygon2D
    ],
    createCompatibleBitmap: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D, XBitmap],
    createCompatibleLinePolyPolygon: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
        activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
      ], 
      XLinePolyPolygon2D
    ],
    createVolatileAlphaBitmap: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D, 
      XVolatileBitmap
    ],
    createVolatileBitmap: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D, 
      XVolatileBitmap
    ],
    enterFullScreenMode: js.Function1[scala.Boolean, scala.Boolean],
    getBufferController: js.Function0[XBufferController],
    getDeviceColorSpace: js.Function0[XColorSpace],
    getParametricPolyPolygonFactory: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory],
    getPhysicalResolution: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D],
    getPhysicalSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D],
    hasFullScreenMode: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XGraphicDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BufferController")(BufferController)
    __obj.updateDynamic("DeviceColorSpace")(DeviceColorSpace)
    __obj.updateDynamic("ParametricPolyPolygonFactory")(ParametricPolyPolygonFactory)
    __obj.updateDynamic("PhysicalResolution")(PhysicalResolution)
    __obj.updateDynamic("PhysicalSize")(PhysicalSize)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createCompatibleAlphaBitmap")(createCompatibleAlphaBitmap)
    __obj.updateDynamic("createCompatibleBezierPolyPolygon")(createCompatibleBezierPolyPolygon)
    __obj.updateDynamic("createCompatibleBitmap")(createCompatibleBitmap)
    __obj.updateDynamic("createCompatibleLinePolyPolygon")(createCompatibleLinePolyPolygon)
    __obj.updateDynamic("createVolatileAlphaBitmap")(createVolatileAlphaBitmap)
    __obj.updateDynamic("createVolatileBitmap")(createVolatileBitmap)
    __obj.updateDynamic("enterFullScreenMode")(enterFullScreenMode)
    __obj.updateDynamic("getBufferController")(getBufferController)
    __obj.updateDynamic("getDeviceColorSpace")(getDeviceColorSpace)
    __obj.updateDynamic("getParametricPolyPolygonFactory")(getParametricPolyPolygonFactory)
    __obj.updateDynamic("getPhysicalResolution")(getPhysicalResolution)
    __obj.updateDynamic("getPhysicalSize")(getPhysicalSize)
    __obj.updateDynamic("hasFullScreenMode")(hasFullScreenMode)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XGraphicDevice]
  }
}

