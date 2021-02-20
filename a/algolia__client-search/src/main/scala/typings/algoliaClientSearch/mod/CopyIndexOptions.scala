package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyIndexOptions extends StObject {
  
  val scope: js.UndefOr[js.Array[ScopeType]] = js.native
}
object CopyIndexOptions {
  
  @scala.inline
  def apply(): CopyIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyIndexOptions]
  }
  
  @scala.inline
  implicit class CopyIndexOptionsMutableBuilder[Self <: CopyIndexOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScope(value: js.Array[ScopeType]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setScopeVarargs(value: ScopeType*): Self = StObject.set(x, "scope", js.Array(value :_*))
  }
}
