package typings.activexLibreoffice.com_.sun.star.rendering

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.geometry.AffineMatrix2D
import typings.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface can be used to control an animated sprite object.
  *
  * This interface can be used to control an animated sprite object on an {@link XSpriteCanvas} . Sprites are moving, animated objects.
  * @since OOo 2.0
  */
@js.native
trait XAnimatedSprite extends XSprite {
  
  /**
    * Reset the animation sequence to start with the first frame.
    *
    * If the animation is currently running, the next frame that is drawn after this method has finished, will be the first one. Please note that if an
    * animation is not started, the associated {@link XSpriteCanvas} does not update changed sprites automatically.
    */
  def resetAnimation(): Unit = js.native
  
  /**
    * Changes all of the sprite's attributes at one atomic instance.
    *
    * This is useful at times where one does not want multiple redraws for every state change.
    *
    * Please note that if an animation is not started, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be
    * told to do so via {@link XSpriteCanvas.updateScreen()} .
    * @param aNewPos New left,top output position of the sprite. This position gets transformed by the view and render state.
    * @param aViewState New view state of the sprite, and part of the transformation that is applied to aNewPos. The view transformation matrix must not be si
    * @param aRenderState New render state of the sprite, and part of the transformation that is applied to aNewPos. The render transformation matrix must not
    * @param nAlpha New alpha value of the sprite. This value must be within the [0,1] range.
    * @param bUpdateAnimation Whether this method should implicitly call XSpriteCanvas::updateAnimation() or not.
    * @throws com::sun::star::lang::IllegalArgumentException if one of the passed parameters does not lie in the specified, permissible range.
    */
  def setAll(
    aNewPos: RealPoint2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    nAlpha: Double,
    bUpdateAnimation: Boolean
  ): Unit = js.native
  
  /**
    * Changes the view state in place for this sprite's animation.
    *
    * The state given here is used when calling the {@link XAnimation.render()} method, or when drawing the sprite's bitmaps, respectively. There's no need
    * to call XSpriteCanvas::updateAnimation() after this method, as it automatically rerenders, if necessary. Please note that if an animation is not
    * started, the associated {@link XSpriteCanvas} does not update changed sprites automatically, but has to be told to do so via {@link
    * XSpriteCanvas.updateScreen()} .
    * @param aViewState The state given here is used when calling the {@link XAnimation.render()} method, or when drawing the sprite's bitmaps, respectively.
    * @throws com::sun::star::lang::IllegalArgumentException if the view transformation matrix is singular.
    */
  def setViewState(aViewState: ViewState): Unit = js.native
  
  /**
    * Start animation sequence of this sprite.
    *
    * The speed of the animation is given in cycles per second (where a cycle is defined as one full animation run, i.e. the full [0,1] range of the {@link
    * XAnimation.render()} 's t parameter, or a full sequence of sprite bitmaps drawn). Once an animation is running, the associated {@link XSpriteCanvas}
    * handles screen updates automatically. That means, changes to position or alpha are reflected on screen automatically. Please note further that sprite
    * visibility and animation are unrelated, i.e. a hidden sprite can have a running animation, which then displays in the middle of the animation
    * sequence, when a {@link show()} is called later on.
    * @param nSpeed The speed of the animation in cycles per second (where a cycle is defined as one full animation run, i.e. the full [0,1] range of the {@li
    */
  def startAnimation(nSpeed: Double): Unit = js.native
  
  /**
    * Stop the animation sequence.
    *
    * A subsequent {@link XAnimatedSprite.startAnimation()} will commence the sequence at the point where it was stopped with here. Once an animation is
    * stopped, the associated {@link XSpriteCanvas} does not update changed sprites anymore.
    */
  def stopAnimation(): Unit = js.native
  
  /**
    * Issue an additional render call to this sprite's animation.
    *
    * This method has no effect when called for a bitmap-sequence sprite. Please note that if an animation is not started, the associated {@link
    * XSpriteCanvas} does not update changed sprites automatically, but has to be told to do so via {@link XSpriteCanvas.updateScreen()} .
    */
  def updateAnimation(): Unit = js.native
}
object XAnimatedSprite {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    clip: XPolyPolygon2D => Unit,
    hide: () => Unit,
    move: (RealPoint2D, ViewState, RenderState) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    resetAnimation: () => Unit,
    setAll: (RealPoint2D, ViewState, RenderState, Double, Boolean) => Unit,
    setAlpha: Double => Unit,
    setPriority: Double => Unit,
    setViewState: ViewState => Unit,
    show: () => Unit,
    startAnimation: Double => Unit,
    stopAnimation: () => Unit,
    transform: AffineMatrix2D => Unit,
    updateAnimation: () => Unit
  ): XAnimatedSprite = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), clip = js.Any.fromFunction1(clip), hide = js.Any.fromFunction0(hide), move = js.Any.fromFunction3(move), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resetAnimation = js.Any.fromFunction0(resetAnimation), setAll = js.Any.fromFunction5(setAll), setAlpha = js.Any.fromFunction1(setAlpha), setPriority = js.Any.fromFunction1(setPriority), setViewState = js.Any.fromFunction1(setViewState), show = js.Any.fromFunction0(show), startAnimation = js.Any.fromFunction1(startAnimation), stopAnimation = js.Any.fromFunction0(stopAnimation), transform = js.Any.fromFunction1(transform), updateAnimation = js.Any.fromFunction0(updateAnimation))
    __obj.asInstanceOf[XAnimatedSprite]
  }
  
  @scala.inline
  implicit class XAnimatedSpriteOps[Self <: XAnimatedSprite] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResetAnimation(value: () => Unit): Self = this.set("resetAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAll(value: (RealPoint2D, ViewState, RenderState, Double, Boolean) => Unit): Self = this.set("setAll", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetViewState(value: ViewState => Unit): Self = this.set("setViewState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartAnimation(value: Double => Unit): Self = this.set("startAnimation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStopAnimation(value: () => Unit): Self = this.set("stopAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdateAnimation(value: () => Unit): Self = this.set("updateAnimation", js.Any.fromFunction0(value))
  }
}
