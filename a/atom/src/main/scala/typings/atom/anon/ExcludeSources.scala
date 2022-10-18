package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeSources extends StObject {
  
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  
  var scope: js.UndefOr[js.Array[String] | typings.atom.srcScopeDescriptorMod.ScopeDescriptor] = js.undefined
  
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object ExcludeSources {
  
  inline def apply(): ExcludeSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeSources]
  }
  
  extension [Self <: ExcludeSources](x: Self) {
    
    inline def setExcludeSources(value: js.Array[String]): Self = StObject.set(x, "excludeSources", value.asInstanceOf[js.Any])
    
    inline def setExcludeSourcesUndefined: Self = StObject.set(x, "excludeSources", js.undefined)
    
    inline def setExcludeSourcesVarargs(value: String*): Self = StObject.set(x, "excludeSources", js.Array(value*))
    
    inline def setScope(value: js.Array[String] | typings.atom.srcScopeDescriptorMod.ScopeDescriptor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
    
    inline def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value*))
  }
}
