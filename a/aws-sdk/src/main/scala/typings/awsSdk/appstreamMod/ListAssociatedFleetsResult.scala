package typings.awsSdk.appstreamMod

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
  
  @scala.inline
  def apply(): ListAssociatedFleetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedFleetsResult]
  }
  
  @scala.inline
  implicit class ListAssociatedFleetsResultMutableBuilder[Self <: ListAssociatedFleetsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNames(value: StringList): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "Names", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
