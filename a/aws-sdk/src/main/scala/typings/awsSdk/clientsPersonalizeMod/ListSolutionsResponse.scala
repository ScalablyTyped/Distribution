package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSolutionsResponse extends StObject {
  
  /**
    * A token for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of the current solutions.
    */
  var solutions: js.UndefOr[Solutions] = js.undefined
}
object ListSolutionsResponse {
  
  inline def apply(): ListSolutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSolutionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSolutions(value: Solutions): Self = StObject.set(x, "solutions", value.asInstanceOf[js.Any])
    
    inline def setSolutionsUndefined: Self = StObject.set(x, "solutions", js.undefined)
    
    inline def setSolutionsVarargs(value: SolutionSummary*): Self = StObject.set(x, "solutions", js.Array(value*))
  }
}
