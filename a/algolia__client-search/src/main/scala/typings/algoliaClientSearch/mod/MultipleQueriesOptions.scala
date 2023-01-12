package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleQueriesOptions extends StObject {
  
  val strategy: js.UndefOr[StrategyType] = js.undefined
}
object MultipleQueriesOptions {
  
  inline def apply(): MultipleQueriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleQueriesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultipleQueriesOptions] (val x: Self) extends AnyVal {
    
    inline def setStrategy(value: StrategyType): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
