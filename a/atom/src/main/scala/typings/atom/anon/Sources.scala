package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sources extends StObject {
  
  var excludeSources: js.UndefOr[js.Array[String]] = js.native
  
  var scope: js.UndefOr[typings.atom.mod.ScopeDescriptor] = js.native
  
  var sources: js.UndefOr[js.Array[String]] = js.native
}
object Sources {
  
  @scala.inline
  def apply(): Sources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sources]
  }
  
  @scala.inline
  implicit class SourcesMutableBuilder[Self <: Sources] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludeSources(value: js.Array[String]): Self = StObject.set(x, "excludeSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeSourcesUndefined: Self = StObject.set(x, "excludeSources", js.undefined)
    
    @scala.inline
    def setExcludeSourcesVarargs(value: String*): Self = StObject.set(x, "excludeSources", js.Array(value :_*))
    
    @scala.inline
    def setScope(value: typings.atom.mod.ScopeDescriptor): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
