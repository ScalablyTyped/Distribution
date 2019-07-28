package typings.atAngularAnimations.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationQueryMetadata extends AnimationMetadata {
  /**
    * One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  /**
    * A query options object.
    */
  var options: AnimationQueryOptions | Null
  /**
    *  The CSS selector for this query.
    */
  var selector: String
}

object AnimationQueryMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    selector: String,
    `type`: AnimationMetadataType,
    options: AnimationQueryOptions = null
  ): AnimationQueryMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], selector = selector)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AnimationQueryMetadata]
  }
}

