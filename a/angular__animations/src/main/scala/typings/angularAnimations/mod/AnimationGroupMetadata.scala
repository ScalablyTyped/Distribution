package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationGroupMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
  
  /**
    * One or more animation or style steps that form this group.
    */
  var steps: js.Array[AnimationMetadata]
}
object AnimationGroupMetadata {
  
  inline def apply(steps: js.Array[AnimationMetadata], `type`: AnimationMetadataType): AnimationGroupMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationGroupMetadata]
  }
  
  extension [Self <: AnimationGroupMetadata](x: Self) {
    
    inline def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setSteps(value: js.Array[AnimationMetadata]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: AnimationMetadata*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
