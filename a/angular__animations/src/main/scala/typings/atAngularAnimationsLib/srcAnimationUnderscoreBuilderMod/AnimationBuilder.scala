package typings
package atAngularAnimationsLib.srcAnimationUnderscoreBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/src/animation_builder", "AnimationBuilder")
@js.native
abstract class AnimationBuilder () extends js.Object {
  /**
       * Builds a factory for producing a defined animation.
       * @param animation A reusable animation definition.
       * @returns A factory object that can create a player for the defined animation.
       * @see `animate()`
       */
  def build(animation: atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadata): AnimationFactory = js.native
  /**
       * Builds a factory for producing a defined animation.
       * @param animation A reusable animation definition.
       * @returns A factory object that can create a player for the defined animation.
       * @see `animate()`
       */
  def build(animation: js.Array[atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod.AnimationMetadata]): AnimationFactory = js.native
}

