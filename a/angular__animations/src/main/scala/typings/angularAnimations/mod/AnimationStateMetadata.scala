package typings.angularAnimations.mod

import typings.angularAnimations.anon.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStateMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * The state name, unique within the component.
    */
  var name: String
  
  /**
    * An options object containing
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation.
    */
  var options: js.UndefOr[Params] = js.undefined
  
  /**
    *  The CSS styles associated with this state.
    */
  var styles: AnimationStyleMetadata
}
object AnimationStateMetadata {
  
  inline def apply(name: String, styles: AnimationStyleMetadata, `type`: AnimationMetadataType): AnimationStateMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStateMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationStateMetadata] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Params): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setStyles(value: AnimationStyleMetadata): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
