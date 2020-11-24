package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationAnimateMetadata extends AnimationMetadata {
  
  /**
    * A set of styles used in the step.
    */
  var styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata | Null = js.native
  
  /**
    * The timing data for the step.
    */
  var timings: String | Double | AnimateTimings = js.native
}
object AnimationAnimateMetadata {
  
  @scala.inline
  def apply(timings: String | Double | AnimateTimings, `type`: AnimationMetadataType): AnimationAnimateMetadata = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateMetadata]
  }
  
  @scala.inline
  implicit class AnimationAnimateMetadataOps[Self <: AnimationAnimateMetadata] (val x: Self) extends AnyVal {
    
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
    def setTimings(value: String | Double | AnimateTimings): Self = this.set("timings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesNull: Self = this.set("styles", null)
  }
}
