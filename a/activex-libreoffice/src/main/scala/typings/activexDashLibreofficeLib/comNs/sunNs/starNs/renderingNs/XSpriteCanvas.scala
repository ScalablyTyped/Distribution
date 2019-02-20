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

