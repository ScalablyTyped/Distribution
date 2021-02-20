package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationSequenceMetadata extends AnimationMetadata {
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
  
  /**
    *  An array of animation step objects.
    */
  var steps: js.Array[AnimationMetadata] = js.native
}
object AnimationSequenceMetadata {
  
  @scala.inline
  def apply(steps: js.Array[AnimationMetadata], `type`: AnimationMetadataType): AnimationSequenceMetadata = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSequenceMetadata]
  }
  
  @scala.inline
  implicit class AnimationSequenceMetadataMutableBuilder[Self <: AnimationSequenceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setSteps(value: js.Array[AnimationMetadata]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: AnimationMetadata*): Self = StObject.set(x, "steps", js.Array(value :_*))
  }
}
