package typings.angularDashAnimate.angularDashAnimateMod.angularMod.animate

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AnimateProvider
  * see http://docs.angularjs.org/api/ngAnimate/provider/$animateProvider
  */
@js.native
trait IAnimateProvider extends js.Object {
  /**
    * Gets and/or sets the CSS class expression that is checked when performing an animation.
    *
    * @param expression The className expression which will be checked against all animations.
    * @returns The current CSS className expression value. If null then there is no expression value.
    */
  def classNameFilter(): RegExp = js.native
  def classNameFilter(expression: RegExp): RegExp = js.native
  /**
    * Registers a new injectable animation factory function.
    *
    * @param name The name of the animation.
    * @param factory The factory function that will be executed to return the animation object.
    */
  def register(name: String, factory: IAnimateFactory): Unit = js.native
}

