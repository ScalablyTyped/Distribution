package typings.atAngularAnimations.atAngularAnimationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationMetadata extends js.Object {
  var `type`: AnimationMetadataType
}

object AnimationMetadata {
  @scala.inline
  def apply(`type`: AnimationMetadataType): AnimationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AnimationMetadata]
  }
}

