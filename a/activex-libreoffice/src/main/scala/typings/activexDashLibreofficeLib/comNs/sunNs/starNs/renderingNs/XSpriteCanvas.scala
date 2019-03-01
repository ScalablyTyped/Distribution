package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specialization of a {@link XCanvas} , where moving, animated objects (called sprites) are supported. */
trait XSpriteCanvas extends XCanvas {
  /**
    * Create a cloned version of an already existing sprite object.
    *
    * The cloned sprite always shows the same content as its original, but of course the sprite position, visibility, alpha etc. can be modified
    * independently.
    * @param original The original sprite to copy the content from. This sprite must have been created by the same {@link XSpriteCanvas} instance as this meth
    * @returns an interface to a sprite object.
    */
  def createClonedSprite(original: XSprite): XSprite
  /**
    * Create a custom, user-handles-it-all sprite object.
    *
    * A sprite is a back-buffered object with its own, independent animation.
    * @param spriteSize The required size of the sprite in device coordinates. Everything that is rendered outside this area might be clipped on output. Both
    * @returns an interface to a custom sprite object.
    */
  def createCustomSprite(spriteSize: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D): XCustomSprite
  /** Create a sprite object from the specified animation sequence. A sprite is a back-buffered object with its own, independent animation. */
  def createSpriteFromAnimation(animation: XAnimation): XAnimatedSprite
  /**
    * Create a sprite object from the specified animation sequence.
    *
    * A sprite is a back-buffered object with its own, independent animation.
    * @param animationBitmaps Sequence of bitmaps. The bitmaps don't need to have the same size, but they are all rendered with their left, top edges aligned.
    * @param interpolationMode Value of {@link InterpolationMode} , to determine whether and how to interpolate between the provided bitmaps, if animation run
    * @throws VolatileContentDestroyedException if at least one of the bitmap is volatile, and its content has been destroyed by the system.
    */
  def createSpriteFromBitmaps(
    animationBitmaps: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XBitmap],
    interpolationMode: scala.Double
  ): XAnimatedSprite
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
  def updateScreen(bUpdateAll: scala.Boolean): scala.Boolean
}

object XSpriteCanvas {
  @scala.inline
  def apply(
    Device: XGraphicDevice,
    acquire: js.Function0[scala.Unit],
    clear: js.Function0[scala.Unit],
    createClonedSprite: js.Function1[XSprite, XSprite],
    createCustomSprite: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, XCustomSprite],
    createFont: js.Function3[
      FontRequest, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.Matrix2D, 
      XCanvasFont
    ],
    createSpriteFromAnimation: js.Function1[XAnimation, XAnimatedSprite],
    createSpriteFromBitmaps: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XBitmap], 
      scala.Double, 
      XAnimatedSprite
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
    ],
    updateScreen: js.Function1[scala.Boolean, scala.Boolean]
  ): XSpriteCanvas = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Device")(Device)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("clear")(clear)
    __obj.updateDynamic("createClonedSprite")(createClonedSprite)
    __obj.updateDynamic("createCustomSprite")(createCustomSprite)
    __obj.updateDynamic("createFont")(createFont)
    __obj.updateDynamic("createSpriteFromAnimation")(createSpriteFromAnimation)
    __obj.updateDynamic("createSpriteFromBitmaps")(createSpriteFromBitmaps)
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
    __obj.updateDynamic("queryAvailableFonts")(queryAvailableFonts)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("queryStrokeShapes")(queryStrokeShapes)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("strokePolyPolygon")(strokePolyPolygon)
    __obj.updateDynamic("strokeTextureMappedPolyPolygon")(strokeTextureMappedPolyPolygon)
    __obj.updateDynamic("strokeTexturedPolyPolygon")(strokeTexturedPolyPolygon)
    __obj.updateDynamic("updateScreen")(updateScreen)
    __obj.asInstanceOf[XSpriteCanvas]
  }
}

