package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStaggerMetadata extends AnimationMetadata {
  /**
    * One or more animation steps.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  /**
    * The timing data for the steps.
    */
  var timings: String | Double = js.native
}

object AnimationStaggerMetadata {
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    timings: String | Double,
    `type`: AnimationMetadataType
  ): AnimationStaggerMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStaggerMetadata]
  }
  @scala.inline
  implicit class AnimationStaggerMetadataOps[Self <: AnimationStaggerMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimationVarargs(value: AnimationMetadata*): Self = this.set("animation", js.Array(value :_*))
    @scala.inline
    def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimings(value: String | Double): Self = this.set("timings", value.asInstanceOf[js.Any])
  }
  
}

