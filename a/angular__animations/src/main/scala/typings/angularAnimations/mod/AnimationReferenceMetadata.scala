package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
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
  implicit class AnimationReferenceMetadataMutableBuilder[Self <: AnimationReferenceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
