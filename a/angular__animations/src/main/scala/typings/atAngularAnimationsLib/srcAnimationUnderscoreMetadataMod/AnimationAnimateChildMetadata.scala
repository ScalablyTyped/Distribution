package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationAnimateChildMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | scala.Null
}

object AnimationAnimateChildMetadata {
  @scala.inline
  def apply(`type`: AnimationMetadataType, options: AnimationOptions = null): AnimationAnimateChildMetadata = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationAnimateChildMetadata]
  }
}

