package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationReferenceMetadata extends AnimationMetadata {
  /**
    *  One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | scala.Null
}

object AnimationReferenceMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    `type`: AnimationMetadataType,
    options: AnimationOptions = null
  ): AnimationReferenceMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationReferenceMetadata]
  }
}

