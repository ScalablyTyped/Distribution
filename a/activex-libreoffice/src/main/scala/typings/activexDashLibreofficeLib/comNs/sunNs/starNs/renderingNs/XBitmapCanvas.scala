package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a specialization of the canvas interface for bitmapped canvases.
  *
  * This interface is a specialization of the canvas interface for bitmapped canvases, where additional methods for accessing and moving of bitmap content
  * are provided.
  * @since OOo 2.0
  */
trait XBitmapCanvas extends XCanvas {
  /**
    * This method copies a rectangular area from a place of one canvas to a place on another.
    *
    * This method copies a rectangular area from a place of one canvas to a place on another. Source and destination areas are permitted to overlap. If the
    * source view or render state has a clipping set, the regions clipped away from the source rectangle are regarded fully transparent for the copy
    * operation. The device color for both source and destination render state is ignored, the compositing mode only for the source render state.
    * @param sourceCanvas {@link Canvas} from which to copy the bitmap data. Can be identical to the canvas this method is called on, but must be valid.
    * @param sourceRect Rectangle from which to copy the bitmap data. This rectangle is subject to both view and render transformation, before being applied.
    * @param sourceViewState The view state to apply to the source of this copy operation. The view transformation must be non-singular.
    * @param sourceRenderState The render state to apply to the source of this copy operation. The render transformation must be non-singular, and the composi
    * @param destRect Rectangle into which to copy the bitmap data. This rectangle is subject to both view and render transformation, before being applied. Th
    * @param destViewState The view state to apply to the destination of this copy operation. The view transformation must be non-singular.
    * @param destRenderState The render state to apply to the destination of this copy operation. The render transformation must be non-singular, and the comp
    * @throws com::sun::star::lang::IllegalArgumentException if one of the parameters are not within the specified range.
    */
  def copyRect(
    sourceCanvas: XBitmapCanvas,
    sourceRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D,
    sourceViewState: ViewState,
    sourceRenderState: RenderState,
    destRect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealRectangle2D,
    destViewState: ViewState,
    destRenderState: RenderState
  ): scala.Unit
}

object XBitmapCanvas {
  @scala.inline
  def apply(
    Device: XGraphicDevice,
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
  ): XBitmapCanvas = {
    val __obj = js.Dynamic.literal(Device = Device, acquire = acquire, clear = clear, copyRect = copyRect, createFont = createFont, drawBezier = drawBezier, drawBitmap = drawBitmap, drawBitmapModulated = drawBitmapModulated, drawLine = drawLine, drawPoint = drawPoint, drawPolyPolygon = drawPolyPolygon, drawText = drawText, drawTextLayout = drawTextLayout, fillPolyPolygon = fillPolyPolygon, fillTextureMappedPolyPolygon = fillTextureMappedPolyPolygon, fillTexturedPolyPolygon = fillTexturedPolyPolygon, getDevice = getDevice, queryAvailableFonts = queryAvailableFonts, queryInterface = queryInterface, queryStrokeShapes = queryStrokeShapes, release = release, strokePolyPolygon = strokePolyPolygon, strokeTextureMappedPolyPolygon = strokeTextureMappedPolyPolygon, strokeTexturedPolyPolygon = strokeTexturedPolyPolygon)
  
    __obj.asInstanceOf[XBitmapCanvas]
  }
}

