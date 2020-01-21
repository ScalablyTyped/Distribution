package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationAnimateMetadata extends AnimationMetadata {
  /**
    * A set of styles used in the step.
    */
  var styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata | Null
  /**
    * The timing data for the step.
    */
  var timings: String | Double | AnimateTimings
}

object AnimationAnimateMetadata {
  @scala.inline
  def apply(
    timings: String | Double | AnimateTimings,
    `type`: AnimationMetadataType,
    styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata = null
  ): AnimationAnimateMetadata = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateMetadata]
  }
}

