package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationAnimateMetadata extends AnimationMetadata {
  /**
    * A set of styles used in the step.
    */
  var styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata | scala.Null
  /**
    * The timing data for the step.
    */
  var timings: java.lang.String | scala.Double | AnimateTimings
}

object AnimationAnimateMetadata {
  @scala.inline
  def apply(
    timings: java.lang.String | scala.Double | AnimateTimings,
    `type`: AnimationMetadataType,
    styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata = null
  ): AnimationAnimateMetadata = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateMetadata]
  }
}

