package typings.atAngularAnimations.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationAnimateRefMetadata extends AnimationMetadata {
  /**
    * An animation reference object.
    */
  var animation: AnimationReferenceMetadata
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
}

object AnimationAnimateRefMetadata {
  @scala.inline
  def apply(
    animation: AnimationReferenceMetadata,
    `type`: AnimationMetadataType,
    options: AnimationOptions = null
  ): AnimationAnimateRefMetadata = {
    val __obj = js.Dynamic.literal(animation = animation)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationAnimateRefMetadata]
  }
}

