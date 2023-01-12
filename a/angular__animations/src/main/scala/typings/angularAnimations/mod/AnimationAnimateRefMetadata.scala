package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationAnimateRefMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * An animation reference object.
    */
  var animation: AnimationReferenceMetadata
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null
}
object AnimationAnimateRefMetadata {
  
  inline def apply(animation: AnimationReferenceMetadata, `type`: AnimationMetadataType): AnimationAnimateRefMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateRefMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationAnimateRefMetadata] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationReferenceMetadata): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
