package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedFleetsResult extends StObject {
  
  /**
    * The name of the fleet.
    */
  var Names: js.UndefOr[StringList] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListAssociatedFleetsResult {
  
  inline def apply(): ListAssociatedFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedFleetsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociatedFleetsResult] (val x: Self) extends AnyVal {
    
    inline def setNames(value: StringList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
