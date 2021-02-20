package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typings.activexLibreoffice.com_.sun.star.geometry.Matrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealRectangle2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typings.activexLibreoffice.com_.sun.star.geometry.XMapping2D
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service provides the interfaces for a {@link XBitmapCanvas} */
@js.native
trait BitmapCanvas
  extends XBitmapCanvas
     with XBitmap
object BitmapCanvas {
  
  @scala.inline
  def apply(
    Device: XGraphicDevice,
    Size: IntegerSize2D,
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
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: () => IntegerSize2D,
    hasAlpha: () => Boolean,
    queryAvailableFonts: (FontInfo, SeqEquiv[PropertyValue]) => SafeArray[FontInfo],
    queryInterface: `type` => js.Any,
    queryStrokeShapes: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XPolyPolygon2D,
    release: () => Unit,
    strokePolyPolygon: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XCachedPrimitive,
    strokeTextureMappedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], XMapping2D, StrokeAttributes) => XCachedPrimitive,
    strokeTexturedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], StrokeAttributes) => XCachedPrimitive
  ): BitmapCanvas = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), copyRect = js.Any.fromFunction7(copyRect), createFont = js.Any.fromFunction3(createFont), drawBezier = js.Any.fromFunction4(drawBezier), drawBitmap = js.Any.fromFunction3(drawBitmap), drawBitmapModulated = js.Any.fromFunction3(drawBitmapModulated), drawLine = js.Any.fromFunction4(drawLine), drawPoint = js.Any.fromFunction3(drawPoint), drawPolyPolygon = js.Any.fromFunction3(drawPolyPolygon), drawText = js.Any.fromFunction5(drawText), drawTextLayout = js.Any.fromFunction3(drawTextLayout), fillPolyPolygon = js.Any.fromFunction3(fillPolyPolygon), fillTextureMappedPolyPolygon = js.Any.fromFunction5(fillTextureMappedPolyPolygon), fillTexturedPolyPolygon = js.Any.fromFunction4(fillTexturedPolyPolygon), getDevice = js.Any.fromFunction0(getDevice), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryAvailableFonts = js.Any.fromFunction2(queryAvailableFonts), queryInterface = js.Any.fromFunction1(queryInterface), queryStrokeShapes = js.Any.fromFunction4(queryStrokeShapes), release = js.Any.fromFunction0(release), strokePolyPolygon = js.Any.fromFunction4(strokePolyPolygon), strokeTextureMappedPolyPolygon = js.Any.fromFunction6(strokeTextureMappedPolyPolygon), strokeTexturedPolyPolygon = js.Any.fromFunction5(strokeTexturedPolyPolygon))
    __obj.asInstanceOf[BitmapCanvas]
  }
}
