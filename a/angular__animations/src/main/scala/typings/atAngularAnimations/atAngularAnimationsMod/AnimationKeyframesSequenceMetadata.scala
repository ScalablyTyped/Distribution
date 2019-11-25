package typings.atAngularAnimations.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationKeyframesSequenceMetadata extends AnimationMetadata {
  /**
    * An array of animation styles.
    */
  var steps: js.Array[AnimationStyleMetadata]
}

object AnimationKeyframesSequenceMetadata {
  @scala.inline
  def apply(steps: js.Array[AnimationStyleMetadata], `type`: AnimationMetadataType): AnimationKeyframesSequenceMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationKeyframesSequenceMetadata]
  }
}

