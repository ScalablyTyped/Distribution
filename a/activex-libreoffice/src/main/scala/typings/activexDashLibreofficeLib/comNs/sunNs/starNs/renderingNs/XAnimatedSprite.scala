package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface can be used to control an animated sprite object.
  *
  * This interface can be used to control an animated sprite object on an {@link XSpriteCanvas} . Sprites are moving, animated objects.
  * @since OOo 2.0
  */
trait XAnimatedSprite extends XSprite {
  /**
    * Reset the animation sequence to start with the first frame.
    *
    * If the animation is currently running, the next frame that is drawn after this method has finished, will be the first one. Please note that if an
    * animation is not started, the associated {@link XSpriteCanvas} does not update changed sprites automatically.
    */
  def resetAnimation(): scala.Unit
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
    aNewPos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    aViewState: ViewState,
    aRenderState: RenderState,
    nAlpha: scala.Double,
    bUpdateAnimation: scala.Boolean
  ): scala.Unit
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
  def setViewState(aViewState: ViewState): scala.Unit
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
  def startAnimation(nSpeed: scala.Double): scala.Unit
  /**
    * Stop the animation sequence.
    *
    * A subsequent {@link XAnimatedSprite.startAnimation()} will commence the sequence at the point where it was stopped with here. Once an animation is
    * stopped, the associated {@link XSpriteCanvas} does not update changed sprites anymore.
    */
  def stopAnimation(): scala.Unit
  /**
    * Issue an additional render call to this sprite's animation.
    *
    * This method has no effect when called for a bitmap-sequence sprite. Please note that if an animation is not started, the associated {@link
    * XSpriteCanvas} does not update changed sprites automatically, but has to be told to do so via {@link XSpriteCanvas.updateScreen()} .
    */
  def updateAnimation(): scala.Unit
}

object XAnimatedSprite {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    clip: js.Function1[XPolyPolygon2D, scala.Unit],
    hide: js.Function0[scala.Unit],
    move: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resetAnimation: js.Function0[scala.Unit],
    setAll: js.Function5[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, 
      ViewState, 
      RenderState, 
      scala.Double, 
      scala.Boolean, 
      scala.Unit
    ],
    setAlpha: js.Function1[scala.Double, scala.Unit],
    setPriority: js.Function1[scala.Double, scala.Unit],
    setViewState: js.Function1[ViewState, scala.Unit],
    show: js.Function0[scala.Unit],
    startAnimation: js.Function1[scala.Double, scala.Unit],
    stopAnimation: js.Function0[scala.Unit],
    transform: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.AffineMatrix2D, scala.Unit],
    updateAnimation: js.Function0[scala.Unit]
  ): XAnimatedSprite = {
    val __obj = js.Dynamic.literal(acquire = acquire, clip = clip, hide = hide, move = move, queryInterface = queryInterface, release = release, resetAnimation = resetAnimation, setAll = setAll, setAlpha = setAlpha, setPriority = setPriority, setViewState = setViewState, show = show, startAnimation = startAnimation, stopAnimation = stopAnimation, transform = transform, updateAnimation = updateAnimation)
  
    __obj.asInstanceOf[XAnimatedSprite]
  }
}

