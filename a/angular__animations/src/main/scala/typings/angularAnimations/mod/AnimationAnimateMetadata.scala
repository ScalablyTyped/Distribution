package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationAnimateMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * A set of styles used in the step.
    */
  var styles: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata | Null
  
  /**
    * The timing data for the step.
    */
  var timings: String | Double | AnimateTimings
}
object AnimationAnimateMetadata {
  
  inline def apply(timings: String | Double | AnimateTimings, `type`: AnimationMetadataType): AnimationAnimateMetadata = {
    val __obj = js.Dynamic.literal(timings = timings.asInstanceOf[js.Any], styles = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateMetadata]
  }
  
  extension [Self <: AnimationAnimateMetadata](x: Self) {
    
    inline def setStyles(value: AnimationStyleMetadata | AnimationKeyframesSequenceMetadata): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesNull: Self = StObject.set(x, "styles", null)
    
    inline def setTimings(value: String | Double | AnimateTimings): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
  }
}
