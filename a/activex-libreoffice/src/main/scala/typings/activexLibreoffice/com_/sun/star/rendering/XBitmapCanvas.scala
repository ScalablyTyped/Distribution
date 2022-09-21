package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.geometry.Matrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typings.activexLibreoffice.com_.sun.star.geometry.XMapping2D
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a specialization of the canvas interface for bitmapped canvases.
  *
  * This interface is a specialization of the canvas interface for bitmapped canvases, where additional methods for accessing and moving of bitmap content
  * are provided.
  * @since OOo 2.0
  */
trait XBitmapCanvas
  extends StObject
     with XCanvas {
  
  /**
    * This method copies a rectangular area from a place of one canvas to a place on another.
    *
    * This method copies a rectangular area from a place of one canvas to a place on another. Source and destination areas are permitted to overlap. If the
    * source view or render state has a clipping set, the regions clipped away from the source rectangle are regarded fully transparent for the copy
    * operation. The device color for both source and destination render state is ignored, the compositing mode only for the source render state.
    * @param sourceCanvas from which to copy the bitmap data. Can be identical to the canvas this method is called on, but must be valid.
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
    sourceRect: RealRectangle2D,
    sourceViewState: ViewState,
    sourceRenderState: RenderState,
    destRect: RealRectangle2D,
    destViewState: ViewState,
    destRenderState: RenderState
  ): Unit
}
object XBitmapCanvas {
  
  inline def apply(
    Device: XGraphicDevice,
    acquire: () => Unit,
    clear: () => Unit,
    copyRect: (XBitmapCanvas, RealRectangle2D, ViewState, RenderState, RealRectangle2D, ViewState, RenderState) => Unit,
    createFont: (FontRequest, SeqEquiv[PropertyValue], Matrix2D) => XCanvasFont,
    drawBezier: (RealBezierSegment2D, RealPoint2D, ViewState, RenderState) => Unit,
    drawBitmap: (XBitmap, ViewState, RenderState) => XCachedPrimitive,
    drawBitmapModulated: (XBitmap, ViewState, RenderState) => XCachedPrimitive,
    drawLine: (RealPoint2D, RealPoint2D, ViewState, RenderState) => Unit,
    drawPoint: (RealPoint2D, ViewState, RenderState) => Unit,
    drawPolyPolygon: (XPolyPolygon2D, ViewState, RenderState) => XCachedPrimitive,
    drawText: (StringContext, XCanvasFont, ViewState, RenderState, Double) => XCachedPrimitive,
    drawTextLayout: (XTextLayout, ViewState, RenderState) => XCachedPrimitive,
    fillPolyPolygon: (XPolyPolygon2D, ViewState, RenderState) => XCachedPrimitive,
    fillTextureMappedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], XMapping2D) => XCachedPrimitive,
    fillTexturedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture]) => XCachedPrimitive,
    getDevice: () => XGraphicDevice,
    queryAvailableFonts: (FontInfo, SeqEquiv[PropertyValue]) => SafeArray[FontInfo],
    queryInterface: `type` => Any,
    queryStrokeShapes: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XPolyPolygon2D,
    release: () => Unit,
    strokePolyPolygon: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XCachedPrimitive,
    strokeTextureMappedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], XMapping2D, StrokeAttributes) => XCachedPrimitive,
    strokeTexturedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], StrokeAttributes) => XCachedPrimitive
  ): XBitmapCanvas = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), copyRect = js.Any.fromFunction7(copyRect), createFont = js.Any.fromFunction3(createFont), drawBezier = js.Any.fromFunction4(drawBezier), drawBitmap = js.Any.fromFunction3(drawBitmap), drawBitmapModulated = js.Any.fromFunction3(drawBitmapModulated), drawLine = js.Any.fromFunction4(drawLine), drawPoint = js.Any.fromFunction3(drawPoint), drawPolyPolygon = js.Any.fromFunction3(drawPolyPolygon), drawText = js.Any.fromFunction5(drawText), drawTextLayout = js.Any.fromFunction3(drawTextLayout), fillPolyPolygon = js.Any.fromFunction3(fillPolyPolygon), fillTextureMappedPolyPolygon = js.Any.fromFunction5(fillTextureMappedPolyPolygon), fillTexturedPolyPolygon = js.Any.fromFunction4(fillTexturedPolyPolygon), getDevice = js.Any.fromFunction0(getDevice), queryAvailableFonts = js.Any.fromFunction2(queryAvailableFonts), queryInterface = js.Any.fromFunction1(queryInterface), queryStrokeShapes = js.Any.fromFunction4(queryStrokeShapes), release = js.Any.fromFunction0(release), strokePolyPolygon = js.Any.fromFunction4(strokePolyPolygon), strokeTextureMappedPolyPolygon = js.Any.fromFunction6(strokeTextureMappedPolyPolygon), strokeTexturedPolyPolygon = js.Any.fromFunction5(strokeTexturedPolyPolygon))
    __obj.asInstanceOf[XBitmapCanvas]
  }
  
  extension [Self <: XBitmapCanvas](x: Self) {
    
    inline def setCopyRect(
      value: (XBitmapCanvas, RealRectangle2D, ViewState, RenderState, RealRectangle2D, ViewState, RenderState) => Unit
    ): Self = StObject.set(x, "copyRect", js.Any.fromFunction7(value))
  }
}
