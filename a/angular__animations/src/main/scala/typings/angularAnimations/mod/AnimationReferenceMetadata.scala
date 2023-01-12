package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationReferenceMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    *  One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
}
object AnimationReferenceMetadata {
  
  inline def apply(animation: AnimationMetadata | js.Array[AnimationMetadata], `type`: AnimationMetadataType): AnimationReferenceMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationReferenceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationReferenceMetadata] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value*))
    
    inline def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
