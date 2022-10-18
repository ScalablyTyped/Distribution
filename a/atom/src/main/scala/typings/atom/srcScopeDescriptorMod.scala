package typings.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcScopeDescriptorMod {
  
  trait ScopeDescriptor extends StObject {
    
    /** Returns all scopes for this descriptor. */
    def getScopesArray(): js.Array[String]
  }
  object ScopeDescriptor {
    
    inline def apply(getScopesArray: () => js.Array[String]): ScopeDescriptor = {
      val __obj = js.Dynamic.literal(getScopesArray = js.Any.fromFunction0(getScopesArray))
      __obj.asInstanceOf[ScopeDescriptor]
    }
    
    extension [Self <: ScopeDescriptor](x: Self) {
      
      inline def setGetScopesArray(value: () => js.Array[String]): Self = StObject.set(x, "getScopesArray", js.Any.fromFunction0(value))
    }
  }
}
