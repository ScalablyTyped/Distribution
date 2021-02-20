package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleQueriesOptions extends StObject {
  
  val strategy: js.UndefOr[StrategyType] = js.native
}
object MultipleQueriesOptions {
  
  @scala.inline
  def apply(): MultipleQueriesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleQueriesOptions]
  }
  
  @scala.inline
  implicit class MultipleQueriesOptionsMutableBuilder[Self <: MultipleQueriesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrategy(value: StrategyType): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
  }
}
