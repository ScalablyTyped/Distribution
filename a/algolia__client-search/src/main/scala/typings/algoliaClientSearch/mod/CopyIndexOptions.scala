package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyIndexOptions extends StObject {
  
  val scope: js.UndefOr[js.Array[ScopeType]] = js.undefined
}
object CopyIndexOptions {
  
  inline def apply(): CopyIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyIndexOptions]
  }
  
  extension [Self <: CopyIndexOptions](x: Self) {
    
    inline def setScope(value: js.Array[ScopeType]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setScopeVarargs(value: ScopeType*): Self = StObject.set(x, "scope", js.Array(value*))
  }
}
