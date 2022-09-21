package typings.angularCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTriggerNames extends StObject {
  
  var includesDynamicAnimations: Boolean
  
  var staticTriggerNames: js.Array[String]
}
object AnimationTriggerNames {
  
  inline def apply(includesDynamicAnimations: Boolean, staticTriggerNames: js.Array[String]): AnimationTriggerNames = {
    val __obj = js.Dynamic.literal(includesDynamicAnimations = includesDynamicAnimations.asInstanceOf[js.Any], staticTriggerNames = staticTriggerNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTriggerNames]
  }
  
  extension [Self <: AnimationTriggerNames](x: Self) {
    
    inline def setIncludesDynamicAnimations(value: Boolean): Self = StObject.set(x, "includesDynamicAnimations", value.asInstanceOf[js.Any])
    
    inline def setStaticTriggerNames(value: js.Array[String]): Self = StObject.set(x, "staticTriggerNames", value.asInstanceOf[js.Any])
    
    inline def setStaticTriggerNamesVarargs(value: String*): Self = StObject.set(x, "staticTriggerNames", js.Array(value*))
  }
}
