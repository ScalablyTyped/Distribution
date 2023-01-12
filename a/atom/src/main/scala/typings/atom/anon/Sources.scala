package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sources extends StObject {
  
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  
  var scope: js.UndefOr[typings.atom.srcScopeDescriptorMod.ScopeDescriptor] = js.undefined
  
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object Sources {
  
  inline def apply(): Sources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sources]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sources] (val x: Self) extends AnyVal {
    
    inline def setExcludeSources(value: js.Array[String]): Self = StObject.set(x, "excludeSources", value.asInstanceOf[js.Any])
    
    inline def setExcludeSourcesUndefined: Self = StObject.set(x, "excludeSources", js.undefined)
    
    inline def setExcludeSourcesVarargs(value: String*): Self = StObject.set(x, "excludeSources", js.Array(value*))
    
    inline def setScope(value: typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
