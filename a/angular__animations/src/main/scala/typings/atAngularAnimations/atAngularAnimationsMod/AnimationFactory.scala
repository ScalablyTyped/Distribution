package typings.atAngularAnimations.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations", "AnimationFactory")
@js.native
abstract class AnimationFactory () extends js.Object {
  /**
    * Creates an `AnimationPlayer` instance for the reusable animation defined by
    * the `AnimationBuilder`.`build()` method that created this factory.
    * Attaches the new player a DOM element.
    * @param element The DOM element to which to attach the animation.
    * @param options A set of options that can include a time delay and
    * additional developer-defined parameters.
    */
  def create(element: js.Any): AnimationPlayer = js.native
  def create(element: js.Any, options: AnimationOptions): AnimationPlayer = js.native
}

