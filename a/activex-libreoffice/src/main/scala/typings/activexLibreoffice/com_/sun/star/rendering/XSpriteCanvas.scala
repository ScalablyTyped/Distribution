package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.geometry.Matrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typings.activexLibreoffice.com_.sun.star.geometry.XMapping2D
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specialization of a {@link XCanvas} , where moving, animated objects (called sprites) are supported. */
@js.native
trait XSpriteCanvas extends XCanvas {
  
  /**
    * Create a cloned version of an already existing sprite object.
    *
    * The cloned sprite always shows the same content as its original, but of course the sprite position, visibility, alpha etc. can be modified
    * independently.
    * @param original The original sprite to copy the content from. This sprite must have been created by the same {@link XSpriteCanvas} instance as this meth
    * @returns an interface to a sprite object.
    */
  def createClonedSprite(original: XSprite): XSprite = js.native
  
  /**
    * Create a custom, user-handles-it-all sprite object.
    *
    * A sprite is a back-buffered object with its own, independent animation.
    * @param spriteSize The required size of the sprite in device coordinates. Everything that is rendered outside this area might be clipped on output. Both
    * @returns an interface to a custom sprite object.
    */
  def createCustomSprite(spriteSize: RealSize2D): XCustomSprite = js.native
  
  /** Create a sprite object from the specified animation sequence. A sprite is a back-buffered object with its own, independent animation. */
  def createSpriteFromAnimation(animation: XAnimation): XAnimatedSprite = js.native
  
  /**
    * Create a sprite object from the specified animation sequence.
    *
    * A sprite is a back-buffered object with its own, independent animation.
    * @param animationBitmaps Sequence of bitmaps. The bitmaps don't need to have the same size, but they are all rendered with their left, top edges aligned.
    * @param interpolationMode Value of {@link InterpolationMode} , to determine whether and how to interpolate between the provided bitmaps, if animation run
    * @throws VolatileContentDestroyedException if at least one of the bitmap is volatile, and its content has been destroyed by the system.
    */
  def createSpriteFromBitmaps(animationBitmaps: SeqEquiv[XBitmap], interpolationMode: Double): XAnimatedSprite = js.native
  
  /**
    * Tells the sprite canvas to now update the screen representation.
    *
    * Required to display rendered changes to the canvas, and updates to stopped animations and XCustomSprites in general. This method will return only
    * after the screen update is done, or earlier if an error happened.
    *
    * If double buffering is enabled via {@link XBufferController} , no explicit call of {@link updateScreen()} is necessary, since the {@link
    * XBufferController} methods will automatically notify all associated {@link XSpriteCanvas} instances.
    * @param bUpdateAll When `TRUE` , update the whole screen. When `FALSE` , implementation is permitted to restrict update to areas the canvas itself change
    * @returns `TRUE` , if the screen update was successfully performed
    */
  def updateScreen(bUpdateAll: Boolean): Boolean = js.native
}
object XSpriteCanvas {
  
  @scala.inline
  def apply(
    Device: XGraphicDevice,
    acquire: () => Unit,
    clear: () => Unit,
    createClonedSprite: XSprite => XSprite,
    createCustomSprite: RealSize2D => XCustomSprite,
    createFont: (FontRequest, SeqEquiv[PropertyValue], Matrix2D) => XCanvasFont,
    createSpriteFromAnimation: XAnimation => XAnimatedSprite,
    createSpriteFromBitmaps: (SeqEquiv[XBitmap], Double) => XAnimatedSprite,
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
    queryInterface: `type` => js.Any,
    queryStrokeShapes: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XPolyPolygon2D,
    release: () => Unit,
    strokePolyPolygon: (XPolyPolygon2D, ViewState, RenderState, StrokeAttributes) => XCachedPrimitive,
    strokeTextureMappedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], XMapping2D, StrokeAttributes) => XCachedPrimitive,
    strokeTexturedPolyPolygon: (XPolyPolygon2D, ViewState, RenderState, SeqEquiv[Texture], StrokeAttributes) => XCachedPrimitive,
    updateScreen: Boolean => Boolean
  ): XSpriteCanvas = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clear = js.Any.fromFunction0(clear), createClonedSprite = js.Any.fromFunction1(createClonedSprite), createCustomSprite = js.Any.fromFunction1(createCustomSprite), createFont = js.Any.fromFunction3(createFont), createSpriteFromAnimation = js.Any.fromFunction1(createSpriteFromAnimation), createSpriteFromBitmaps = js.Any.fromFunction2(createSpriteFromBitmaps), drawBezier = js.Any.fromFunction4(drawBezier), drawBitmap = js.Any.fromFunction3(drawBitmap), drawBitmapModulated = js.Any.fromFunction3(drawBitmapModulated), drawLine = js.Any.fromFunction4(drawLine), drawPoint = js.Any.fromFunction3(drawPoint), drawPolyPolygon = js.Any.fromFunction3(drawPolyPolygon), drawText = js.Any.fromFunction5(drawText), drawTextLayout = js.Any.fromFunction3(drawTextLayout), fillPolyPolygon = js.Any.fromFunction3(fillPolyPolygon), fillTextureMappedPolyPolygon = js.Any.fromFunction5(fillTextureMappedPolyPolygon), fillTexturedPolyPolygon = js.Any.fromFunction4(fillTexturedPolyPolygon), getDevice = js.Any.fromFunction0(getDevice), queryAvailableFonts = js.Any.fromFunction2(queryAvailableFonts), queryInterface = js.Any.fromFunction1(queryInterface), queryStrokeShapes = js.Any.fromFunction4(queryStrokeShapes), release = js.Any.fromFunction0(release), strokePolyPolygon = js.Any.fromFunction4(strokePolyPolygon), strokeTextureMappedPolyPolygon = js.Any.fromFunction6(strokeTextureMappedPolyPolygon), strokeTexturedPolyPolygon = js.Any.fromFunction5(strokeTexturedPolyPolygon), updateScreen = js.Any.fromFunction1(updateScreen))
    __obj.asInstanceOf[XSpriteCanvas]
  }
  
  @scala.inline
  implicit class XSpriteCanvasMutableBuilder[Self <: XSpriteCanvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateClonedSprite(value: XSprite => XSprite): Self = StObject.set(x, "createClonedSprite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateCustomSprite(value: RealSize2D => XCustomSprite): Self = StObject.set(x, "createCustomSprite", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSpriteFromAnimation(value: XAnimation => XAnimatedSprite): Self = StObject.set(x, "createSpriteFromAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateSpriteFromBitmaps(value: (SeqEquiv[XBitmap], Double) => XAnimatedSprite): Self = StObject.set(x, "createSpriteFromBitmaps", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateScreen(value: Boolean => Boolean): Self = StObject.set(x, "updateScreen", js.Any.fromFunction1(value))
  }
}
