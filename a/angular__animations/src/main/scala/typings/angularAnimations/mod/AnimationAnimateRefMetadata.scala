package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationAnimateRefMetadata extends AnimationMetadata {
  
  /**
    * An animation reference object.
    */
  var animation: AnimationReferenceMetadata = js.native
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: AnimationOptions | Null = js.native
}
object AnimationAnimateRefMetadata {
  
  @scala.inline
  def apply(animation: AnimationReferenceMetadata, `type`: AnimationMetadataType): AnimationAnimateRefMetadata = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationAnimateRefMetadata]
  }
  
  @scala.inline
  implicit class AnimationAnimateRefMetadataMutableBuilder[Self <: AnimationAnimateRefMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: AnimationReferenceMetadata): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: AnimationOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
