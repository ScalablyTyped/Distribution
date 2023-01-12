package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationQueryMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata]
  
  /**
    * A query options object.
    */
  var options: AnimationQueryOptions | Null
  
  /**
    *  The CSS selector for this query.
    */
  var selector: String
}
object AnimationQueryMetadata {
  
  inline def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    selector: String,
    `type`: AnimationMetadataType
  ): AnimationQueryMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationQueryMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationQueryMetadata] (val x: Self) extends AnyVal {
    
    inline def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value*))
    
    inline def setOptions(value: AnimationQueryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
