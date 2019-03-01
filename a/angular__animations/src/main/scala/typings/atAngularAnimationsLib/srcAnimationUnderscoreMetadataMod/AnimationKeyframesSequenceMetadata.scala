package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("steps")(steps)
    __obj.asInstanceOf[AnimationKeyframesSequenceMetadata]
  }
}

