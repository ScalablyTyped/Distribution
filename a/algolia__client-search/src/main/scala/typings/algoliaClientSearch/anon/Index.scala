package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.RedirectRuleIndexMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Index extends StObject {
  
  var index: js.UndefOr[js.Array[RedirectRuleIndexMetadata]] = js.undefined
}
object Index {
  
  inline def apply(): Index = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Index]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: js.Array[RedirectRuleIndexMetadata]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexVarargs(value: RedirectRuleIndexMetadata*): Self = StObject.set(x, "index", js.Array(value*))
  }
}
