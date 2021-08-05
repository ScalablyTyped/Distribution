package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStaggerMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * One or more animation steps.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  
  /**
    * The timing data for the steps.
    */
  var timings: String | Double
}
object AnimationStaggerMetadata {
  
  inline def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    timings: String | Double,
    `type`: AnimationMetadataType
  ): AnimationStaggerMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStaggerMetadata]
  }
  
  extension [Self <: AnimationStaggerMetadata](x: Self) {
    
    inline def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value :_*))
    
    inline def setTimings(value: String | Double): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
  }
}
