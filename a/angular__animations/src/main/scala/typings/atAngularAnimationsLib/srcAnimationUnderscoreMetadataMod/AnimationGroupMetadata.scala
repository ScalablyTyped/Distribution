package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationGroupMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | scala.Null
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
    val __obj = js.Dynamic.literal(steps = steps)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationGroupMetadata]
  }
}

