package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStaggerMetadata extends AnimationMetadata {
  /**
    * One or more animation steps.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  /**
    * The timing data for the steps.
    */
  var timings: java.lang.String | scala.Double
}

object AnimationStaggerMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    timings: java.lang.String | scala.Double,
    `type`: AnimationMetadataType
  ): AnimationStaggerMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnimationStaggerMetadata]
  }
}

