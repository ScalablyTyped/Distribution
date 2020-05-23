package typings.angularAnimations.mod

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
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationQueryMetadata]
  }
}

