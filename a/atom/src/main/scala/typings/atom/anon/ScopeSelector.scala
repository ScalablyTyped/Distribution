package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScopeSelector extends StObject {
  
  var scopeSelector: js.UndefOr[String] = js.undefined
  
  var source: js.UndefOr[String] = js.undefined
}
object ScopeSelector {
  
  @scala.inline
  def apply(): ScopeSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeSelector]
  }
  
  @scala.inline
  implicit class ScopeSelectorMutableBuilder[Self <: ScopeSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScopeSelector(value: String): Self = StObject.set(x, "scopeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeSelectorUndefined: Self = StObject.set(x, "scopeSelector", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
