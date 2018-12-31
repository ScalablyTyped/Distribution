package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-templating", "Animator")
@js.native
class Animator () extends js.Object {
  /**
    * Add a class to an element to trigger an animation.
    * @param element Element to animate
    * @param className Properties to animate or name of the effect to use
    * @returns Resolved when the animation is done
    */
  def addClass(element: stdLib.HTMLElement, className: java.lang.String): js.Promise[scala.Boolean] = js.native
  def animate(element: js.Array[stdLib.HTMLElement], className: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Execute a single animation.
    * @param element Element to animate
    * @param className Properties to animate or name of the effect to use. For css animators this represents the className to be added and removed right after the animation is done.
    * @param options options for the animation (duration, easing, ...)
    * @returns Resolved when the animation is done
    */
  def animate(element: stdLib.HTMLElement, className: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Execute an 'enter' animation on an element
    * @param element Element to animate
    * @returns Resolved when the animation is done
    */
  def enter(element: stdLib.HTMLElement): js.Promise[scala.Boolean] = js.native
  /**
    * Execute a 'leave' animation on an element
    * @param element Element to animate
    * @returns Resolved when the animation is done
    */
  def leave(element: stdLib.HTMLElement): js.Promise[scala.Boolean] = js.native
  /**
    * Register an effect (for JS based animators)
    * @param effectName identifier of the effect
    * @param properties Object with properties for the effect
    */
  def registerEffect(effectName: java.lang.String, properties: js.Object): scala.Unit = js.native
  /**
    * Add a class to an element to trigger an animation.
    * @param element Element to animate
    * @param className Properties to animate or name of the effect to use
    * @returns Resolved when the animation is done
    */
  def removeClass(element: stdLib.HTMLElement, className: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Run a sequence of animations one after the other.
    * for example: animator.runSequence("fadeIn","callout")
    * @param sequence An array of effectNames or classNames
    * @returns Resolved when all animations are done
    */
  def runSequence(animations: js.Array[_]): js.Promise[scala.Boolean] = js.native
  /**
    * Unregister an effect (for JS based animators)
    * @param effectName identifier of the effect
    */
  def unregisterEffect(effectName: java.lang.String): scala.Unit = js.native
}

