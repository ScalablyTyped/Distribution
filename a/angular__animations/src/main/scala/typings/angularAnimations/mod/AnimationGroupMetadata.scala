package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationGroupMetadata extends AnimationMetadata {
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
  /**
    * One or more animation or style steps that form this group.
    */
  var steps: js.Array[AnimationMetadata] = js.native
}

object AnimationGroupMetadata {
  @scala.inline
  def apply(steps: js.Array[AnimationMetadata], `type`: AnimationMetadataType): AnimationGroupMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationGroupMetadata]
  }
  @scala.inline
  implicit class AnimationGroupMetadataOps[Self <: AnimationGroupMetadata] (val x: Self) extends AnyVal {
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
    def setStepsVarargs(value: AnimationMetadata*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[AnimationMetadata]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: AnimationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
  }
  
}

