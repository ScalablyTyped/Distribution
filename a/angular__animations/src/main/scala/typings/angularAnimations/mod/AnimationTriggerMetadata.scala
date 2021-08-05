package typings.angularAnimations.mod

import typings.angularAnimations.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTriggerMetadata
  extends StObject
     with AnimationMetadata {
  
  /**
    * An animation definition object, containing an array of state and transition declarations.
    */
  var definitions: js.Array[AnimationMetadata]
  
  /**
    * The trigger name, used to associate it with an element. Unique within the component.
    */
  var name: String
  
  /**
    * An options object containing a delay and
    * developer-defined parameters that provide styling defaults and
    * can be overridden on invocation. Default delay is 0.
    */
  var options: `0` | Null
}
object AnimationTriggerMetadata {
  
  inline def apply(definitions: js.Array[AnimationMetadata], name: String, `type`: AnimationMetadataType): AnimationTriggerMetadata = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTriggerMetadata]
  }
  
  extension [Self <: AnimationTriggerMetadata](x: Self) {
    
    inline def setDefinitions(value: js.Array[AnimationMetadata]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsVarargs(value: AnimationMetadata*): Self = StObject.set(x, "definitions", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: `0`): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsNull: Self = StObject.set(x, "options", null)
  }
}
