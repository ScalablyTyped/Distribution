package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationQueryMetadata extends AnimationMetadata {
  
  /**
    * One or more animation step objects.
    */
  var animation: AnimationMetadata | js.Array[AnimationMetadata] = js.native
  
  /**
    * A query options object.
    */
  var options: AnimationQueryOptions | Null = js.native
  
  /**
    *  The CSS selector for this query.
    */
  var selector: String = js.native
}
object AnimationQueryMetadata {
  
  @scala.inline
  def apply(
    animation: AnimationMetadata | js.Array[AnimationMetadata],
    selector: String,
    `type`: AnimationMetadataType
  ): AnimationQueryMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationQueryMetadata]
  }
  
  @scala.inline
  implicit class AnimationQueryMetadataMutableBuilder[Self <: AnimationQueryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationMetadata | js.Array[AnimationMetadata]): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationVarargs(value: AnimationMetadata*): Self = StObject.set(x, "animation", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: AnimationQueryOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
