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
  
  extension [Self <: MultipleQueriesOptions](x: Self) {
    
    inline def setStrategy(value: StrategyType): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
