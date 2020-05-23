package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationAnimateChildMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
}

object AnimationAnimateChildMetadata {
  @scala.inline
  def apply(`type`: AnimationMetadataType, options: AnimationOptions = null): AnimationAnimateChildMetadata = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateChildMetadata]
  }
}

