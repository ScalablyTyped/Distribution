package typings.angularAnimations.mod

import typings.angularAnimations.anon.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationStateMetadata extends AnimationMetadata {
  
  /**
    * The state name, unique within the component.
    */
  var name: String = js.native
  
  /**
    * An options object containing
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation.
    */
  var options: js.UndefOr[Params] = js.native
  
  /**
    *  The CSS styles associated with this state.
    */
  var styles: AnimationStyleMetadata = js.native
}
object AnimationStateMetadata {
  
  @scala.inline
  def apply(name: String, styles: AnimationStyleMetadata, `type`: AnimationMetadataType): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateMetadata]
  }
  
  @scala.inline
  implicit class AnimationStateMetadataMutableBuilder[Self <: AnimationStateMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Params): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setStyles(value: AnimationStyleMetadata): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
