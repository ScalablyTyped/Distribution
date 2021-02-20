package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
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
  implicit class AnimationAnimateMetadataMutableBuilder[Self <: AnimationAnimateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesNull: Self = StObject.set(x, "styles", null)
    
    @scala.inline
    def setTimings(value: String | Double | AnimateTimings): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
  }
}
