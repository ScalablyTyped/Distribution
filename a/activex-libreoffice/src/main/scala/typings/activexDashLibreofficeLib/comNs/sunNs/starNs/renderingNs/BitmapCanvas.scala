package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service provides the interfaces for a {@link XBitmapCanvas} */
trait BitmapCanvas
  extends XBitmapCanvas
     with XBitmap

object BitmapCanvas {
  @scala.inline
  def apply(
    Device: XGraphicDevice,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: js.Function0[scala.Unit],
    clear: js.Function0[scala.Unit],
    copyRect: js.Function7[
      XBitmapCanvas, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    createFont: js.Function3[
      FontRequest, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.Matrix2D, 
      XCanvasFont
    ],
    drawBezier: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealBezierSegment2D, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    drawBitmap: js.Function3[XBitmap, ViewState, RenderState, XCachedPrimitive],
    drawBitmapModulated: js.Function3[XBitmap, ViewState, RenderState, XCachedPrimitive],
    drawLine: js.Function4[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    drawPoint: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    drawPolyPolygon: js.Function3[XPolyPolygon2D, ViewState, RenderState, XCachedPrimitive],
    drawText: js.Function5[StringContext, XCanvasFont, ViewState, RenderState, scala.Double, XCachedPrimitive],
    drawTextLayout: js.Function3[XTextLayout, ViewState, RenderState, XCachedPrimitive],
    fillPolyPolygon: js.Function3[XPolyPolygon2D, ViewState, RenderState, XCachedPrimitive],
    fillTextureMappedPolyPolygon: js.Function5[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.XMapping2D, 
      XCachedPrimitive
    ],
    fillTexturedPolyPolygon: js.Function4[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      XCachedPrimitive
    ],
    getDevice: js.Function0[XGraphicDevice],
    getScaledBitmap: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, 
      scala.Boolean, 
      XBitmap
    ],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D],
    hasAlpha: js.Function0[scala.Boolean],
    queryAvailableFonts: js.Function2[
      FontInfo, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashInteropLib.SafeArray[FontInfo]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryStrokeShapes: js.Function4[XPolyPolygon2D, ViewState, RenderState, StrokeAttributes, XPolyPolygon2D],
    release: js.Function0[scala.Unit],
    strokePolyPolygon: js.Function4[XPolyPolygon2D, ViewState, RenderState, StrokeAttributes, XCachedPrimitive],
    strokeTextureMappedPolyPolygon: js.Function6[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.XMapping2D, 
      StrokeAttributes, 
      XCachedPrimitive
    ],
    strokeTexturedPolyPolygon: js.Function5[
      XPolyPolygon2D, 
      ViewState, 
      RenderState, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[Texture], 
      StrokeAttributes, 
      XCachedPrimitive
    ]
  ): BitmapCanvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Device")(Device)
    __obj.updateDynamic("Size")(Size)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("copyRect")(copyRect)
    __obj.updateDynamic("createFont")(createFont)
    __obj.updateDynamic("drawBezier")(drawBezier)
    __obj.updateDynamic("drawBitmap")(drawBitmap)
    __obj.updateDynamic("drawBitmapModulated")(drawBitmapModulated)
    __obj.updateDynamic("drawLine")(drawLine)
    __obj.updateDynamic("drawPoint")(drawPoint)
    __obj.updateDynamic("drawPolyPolygon")(drawPolyPolygon)
    __obj.updateDynamic("drawText")(drawText)
    __obj.updateDynamic("drawTextLayout")(drawTextLayout)
    __obj.updateDynamic("fillPolyPolygon")(fillPolyPolygon)
    __obj.updateDynamic("fillTextureMappedPolyPolygon")(fillTextureMappedPolyPolygon)
    __obj.updateDynamic("fillTexturedPolyPolygon")(fillTexturedPolyPolygon)
    __obj.updateDynamic("getDevice")(getDevice)
    __obj.updateDynamic("getScaledBitmap")(getScaledBitmap)
    __obj.updateDynamic("getSize")(getSize)
    __obj.updateDynamic("hasAlpha")(hasAlpha)
    __obj.updateDynamic("queryAvailableFonts")(queryAvailableFonts)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryStrokeShapes")(queryStrokeShapes)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("strokePolyPolygon")(strokePolyPolygon)
    __obj.updateDynamic("strokeTextureMappedPolyPolygon")(strokeTextureMappedPolyPolygon)
    __obj.updateDynamic("strokeTexturedPolyPolygon")(strokeTexturedPolyPolygon)
    __obj.asInstanceOf[BitmapCanvas]
  }
}

