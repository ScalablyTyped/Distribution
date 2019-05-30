package typings
package atAngularAnimationsLib.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations", "AnimationBuilder")
@js.native
abstract class AnimationBuilder () extends js.Object {
  /**
    * Builds a factory for producing a defined animation.
    * @param animation A reusable animation definition.
    * @returns A factory object that can create a player for the defined animation.
    * @see `animate()`
    */
  def build(animation: AnimationMetadata): AnimationFactory = js.native
  def build(animation: js.Array[AnimationMetadata]): AnimationFactory = js.native
}

