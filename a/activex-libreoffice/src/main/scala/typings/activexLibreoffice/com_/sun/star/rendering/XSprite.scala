package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to control a sprite object.
  *
  * This is the basic interface to control a sprite object on a {@link XSpriteCanvas} . Sprites are moving, back-buffered objects.
  */
@js.native
trait XSprite extends XInterface {
  
  /**
    * Apply a clipping to the shape output.
    *
    * The given clip poly-polygon is always interpreted in device coordinate space. As the sprite has its own local coordinate system, with its origin on
    * screen being equal to its current position, the clip poly-polygon's origin will always coincide with the sprite's origin. Furthermore, if any sprite
    * transformation is set via {@link transform()} , the clip is subject to this transformation, too. The implementation is free, if it has a cached
    * representation of the sprite at hand, to clip-output only this cached representation (e.g. a bitmap), instead of re-rendering the sprite from first
    * principles. This is usually the case for an implementation of a {@link XCustomSprite} interface, since it typically has no other cached pictorial
    * information at hand.
    *
    * Please note that if this sprite is not animated, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    *
    * Specifying an empty interface denotes no clipping, i.e. everything contained in the sprite will be visible (subject to device-dependent constraints,
    * of course). Specifying an empty {@link XPolyPolygon2D} , i.e. a poly-polygon containing zero polygons, or an {@link XPolyPolygon2D} with any number of
    * empty sub-polygons, denotes the NULL clip. That means, nothing from the sprite will be visible.
    * @param aClip The clip poly-polygon to apply.
    */
  def clip(aClip: XPolyPolygon2D): Unit = js.native
  
  /**
    * Make the sprite invisible.
    *
    * This method makes the sprite invisible.
    */
  def hide(): Unit = js.native
  
  /**
    * Move sprite to the specified position.
    *
    * The position specified here is first transformed by the combined view and render transformation. The resulting position is then used as the output
    * position (also in device coordinates) of the rendered sprite content.
    *
    * Please note that if this sprite is not animated, the associated XSpriteCanva does not update changed sprites automatically, but has to be told to do
    * so via {@link XSpriteCanvas.updateScreen()} .
    * @param aNewPos The new position, in user coordinate space, to move the sprite to.
    * @param aViewState The view state to be used when interpreting aNewPos.
    * @param aRenderState The render state to be used when interpreting aNewPos.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the view and render state parameters are outside the specified range.
    */
  def move(aNewPos: RealPoint2D, aViewState: ViewState, aRenderState: RenderState): Unit = js.native
  
  /**
    * Set overall transparency of the sprite.
    *
    * This method is useful for e.g. fading in/out of animations.
    *
    * Please note that if this sprite is not animated, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    * @param nAlpha New global alpha value to composite this sprite with the background. Valid range is [0,1].
    * @throws com::sun::star::lang::IllegalArgumentException if nAlpha is not within the permissible range.
    */
  def setAlpha(nAlpha: Double): Unit = js.native
  
  /**
    * Set sprite priority.
    *
    * The sprite priority determines the order of rendering relative to all other sprites of the associated canvas. The higher the priority, the later will
    * the sprite be rendered, or, in other words, the closer to the screen surface the sprite is shown.
    * @param nPriority New sprite priority value to serve as the sort key when determining sprite rendering order. Avoid NaNs and other irregular floating poi
    */
  def setPriority(nPriority: Double): Unit = js.native
  
  /**
    * Make the sprite visible.
    *
    * This method makes the sprite visible on the canvas it was created on.
    */
  def show(): Unit = js.native
  
  /**
    * Apply a local transformation to the sprite.
    *
    * The given transformation matrix locally transforms the sprite shape. If this transformation contains translational components, be aware that sprite
    * content moved beyond the sprite area (a box from (0,0) to (spriteWidth,spriteHeight)) might (but need not) be clipped. Use {@link XSprite.move()} to
    * change the sprite location on screen. The canvas implementations are free, if they have a cached representation of the sprite at hand, to transform
    * only this cached representation (e.g. a bitmap), instead of re-rendering the sprite from first principles. This is usually the case for an
    * implementation of a {@link XCustomSprite} interface, since it typically has no other cached pictorial information at hand.
    *
    * Please note that if this sprite is not animated, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    * @param aTransformation The transformation to apply to the sprite shape.
    * @throws com::sun::star::lang::IllegalArgumentException if the given transformation matrix is singular.
    */
  def transform(aTransformation: AffineMatrix2D): Unit = js.native
}
object XSprite {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    clip: XPolyPolygon2D => Unit,
    hide: () => Unit,
    move: (RealPoint2D, ViewState, RenderState) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAlpha: Double => Unit,
    setPriority: Double => Unit,
    show: () => Unit,
    transform: AffineMatrix2D => Unit
  ): XSprite = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clip = js.Any.fromFunction1(clip), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction3(move), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAlpha = js.Any.fromFunction1(setAlpha), setPriority = js.Any.fromFunction1(setPriority), show = js.Any.fromFunction0(show), transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[XSprite]
  }
  
  @scala.inline
  implicit class XSpriteMutableBuilder[Self <: XSprite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: XPolyPolygon2D => Unit): Self = StObject.set(x, "clip", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMove(value: (RealPoint2D, ViewState, RenderState) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetAlpha(value: Double => Unit): Self = StObject.set(x, "setAlpha", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPriority(value: Double => Unit): Self = StObject.set(x, "setPriority", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTransform(value: AffineMatrix2D => Unit): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
