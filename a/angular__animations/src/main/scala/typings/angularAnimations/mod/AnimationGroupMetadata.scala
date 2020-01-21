package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationGroupMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
  /**
    * One or more animation or style steps that form this group.
    */
  var steps: js.Array[AnimationMetadata]
}

object AnimationGroupMetadata {
  @scala.inline
  def apply(
    steps: js.Array[AnimationMetadata],
    `type`: AnimationMetadataType,
    options: AnimationOptions = null
  ): AnimationGroupMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationGroupMetadata]
  }
}

