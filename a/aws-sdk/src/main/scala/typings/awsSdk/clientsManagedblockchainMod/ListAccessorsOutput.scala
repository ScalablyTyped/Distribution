package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessorsOutput extends StObject {
  
  /**
    * An array of AccessorSummary objects that contain configuration properties for each accessor.
    */
  var Accessors: js.UndefOr[AccessorSummaryList] = js.undefined
  
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListAccessorsOutput {
  
  inline def apply(): ListAccessorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccessorsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessorsOutput] (val x: Self) extends AnyVal {
    
    inline def setAccessors(value: AccessorSummaryList): Self = StObject.set(x, "Accessors", value.asInstanceOf[js.Any])
    
    inline def setAccessorsUndefined: Self = StObject.set(x, "Accessors", js.undefined)
    
    inline def setAccessorsVarargs(value: AccessorSummary*): Self = StObject.set(x, "Accessors", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
