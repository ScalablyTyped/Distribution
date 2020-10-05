package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationReferenceMetadata extends AnimationMetadata {
  /**
    *  One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
}

object AnimationReferenceMetadata {
  @scala.inline
  def apply(animation: AnimationMetadata | js.Array[AnimationMetadata], `type`: AnimationMetadataType): AnimationReferenceMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationReferenceMetadata]
  }
  @scala.inline
  implicit class AnimationReferenceMetadataOps[Self <: AnimationReferenceMetadata] (val x: Self) extends AnyVal {
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
    def setOptions(value: AnimationOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsNull: Self = this.set("options", null)
  }
  
}

