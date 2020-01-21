package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationSequenceMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
  /**
    *  An array of animation step objects.
    */
  var steps: js.Array[AnimationMetadata]
}

object AnimationSequenceMetadata {
  @scala.inline
  def apply(
    steps: js.Array[AnimationMetadata],
    `type`: AnimationMetadataType,
    options: AnimationOptions = null
  ): AnimationSequenceMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSequenceMetadata]
  }
}

