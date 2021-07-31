package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcludeSources extends StObject {
  
  var excludeSources: js.UndefOr[js.Array[String]] = js.undefined
  
  var scope: js.UndefOr[js.Array[String] | typings.atom.mod.ScopeDescriptor] = js.undefined
  
  var sources: js.UndefOr[js.Array[String]] = js.undefined
}
object ExcludeSources {
  
  @scala.inline
  def apply(): ExcludeSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeSources]
  }
  
  @scala.inline
  implicit class ExcludeSourcesMutableBuilder[Self <: ExcludeSources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeSources(value: js.Array[String]): Self = StObject.set(x, "excludeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeSourcesUndefined: Self = StObject.set(x, "excludeSources", js.undefined)
    
    @scala.inline
    def setExcludeSourcesVarargs(value: String*): Self = StObject.set(x, "excludeSources", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: js.Array[String] | typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
