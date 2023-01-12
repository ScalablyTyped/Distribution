package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSuppressedDestinationsRequest extends StObject {
  
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list before a specific date.
    */
  var EndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A token returned from a previous call to ListSuppressedDestinations to indicate the position in the list of suppressed email addresses.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesv2Mod.NextToken] = js.undefined
  
  /**
    * The number of results to show in a single call to ListSuppressedDestinations. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
  
  /**
    * The factors that caused the email address to be added to .
    */
  var Reasons: js.UndefOr[SuppressionListReasons] = js.undefined
  
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list after a specific date.
    */
  var StartDate: js.UndefOr[js.Date] = js.undefined
}
object ListSuppressedDestinationsRequest {
  
  inline def apply(): ListSuppressedDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuppressedDestinationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSuppressedDestinationsRequest] (val x: Self) extends AnyVal {
    
    inline def setEndDate(value: js.Date): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "EndDate", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setReasons(value: SuppressionListReasons): Self = StObject.set(x, "Reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "Reasons", js.undefined)
    
    inline def setReasonsVarargs(value: SuppressionListReason*): Self = StObject.set(x, "Reasons", js.Array(value*))
    
    inline def setStartDate(value: js.Date): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "StartDate", js.undefined)
  }
}
