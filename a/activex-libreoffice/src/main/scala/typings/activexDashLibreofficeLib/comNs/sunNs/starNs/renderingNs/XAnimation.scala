package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface defines an animation sequence.
  *
  * This interface must be implemented by every animation object. It is used by the {@link XCanvas} interface to render generic animations.
  * @since OOo 2.0
  */
trait XAnimation
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Request the attribute information for this animation.
    *
    * This method returns the {@link AnimationAttributes} structure, which defines more closely how to play this animation.
    * @returns the requested {@link AnimationAttributes} structure.
    */
  val AnimationAttributes: AnimationAttributes
  /**
    * Request the attribute information for this animation.
    *
    * This method returns the {@link AnimationAttributes} structure, which defines more closely how to play this animation.
    * @returns the requested {@link AnimationAttributes} structure.
    */
  def getAnimationAttributes(): AnimationAttributes
  /**
    * Render the animation content at time t into the specified canvas.
    *
    * Note that it is perfectly legal to e.g. map t in a nonlinear fashion to internal frames, for example to achieve acceleration or deceleration effects.
    * It is required that the render method has const semantics, i.e. when called with the same parameter set, identical output must be generated. This is
    * because e.g. a Sprite might decide arbitrarily to render an animation once and cache the result, or repaint it via {@link XAnimation.render} every
    * time.
    *
    * The rendered content, although, must be exactly the same for identical viewState, canvas and t values. Or, for that matters, must call the same canvas
    * methods in the same order with the same parameter sets, for identical viewState and t values. Furthermore, when viewState has the identity
    * transformation set, rendered output must be contained in a rectangle with upper left corner at (0,0) and width and height given by the {@link
    * AnimationAttributes} ' untransformedSize member. Any content exceeding this box might get clipped off.
    * @param canvas The target canvas to render this animation to.
    * @param viewState The view state to be used when rendering this animation to the target canvas. The view transformation matrix must not be singular.
    * @param t Time instant for which animation content is requested. The range must always be [0,1], where 0 denotes the very beginning, and 1 the end of the
    * @throws com::sun::star::lang::IllegalArgumentException if one of the passed parameters does not lie in the specified, permissible range.
    */
  def render(canvas: XCanvas, viewState: ViewState, t: scala.Double): scala.Unit
}

object XAnimation {
  @scala.inline
  def apply(
    AnimationAttributes: AnimationAttributes,
    acquire: js.Function0[scala.Unit],
    getAnimationAttributes: js.Function0[AnimationAttributes],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    render: js.Function3[XCanvas, ViewState, scala.Double, scala.Unit]
  ): XAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AnimationAttributes")(AnimationAttributes)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAnimationAttributes")(getAnimationAttributes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[XAnimation]
  }
}

