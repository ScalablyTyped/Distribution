package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersV2Response extends StObject {
  
  /**
    * Information about phone numbers that have been claimed to your Amazon Connect instances or traffic distribution groups.
    */
  var ListPhoneNumbersSummaryList: js.UndefOr[typings.awsSdk.clientsConnectMod.ListPhoneNumbersSummaryList] = js.undefined
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[LargeNextToken] = js.undefined
}
object ListPhoneNumbersV2Response {
  
  inline def apply(): ListPhoneNumbersV2Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersV2Response]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPhoneNumbersV2Response] (val x: Self) extends AnyVal {
    
    inline def setListPhoneNumbersSummaryList(value: ListPhoneNumbersSummaryList): Self = StObject.set(x, "ListPhoneNumbersSummaryList", value.asInstanceOf[js.Any])
    
    inline def setListPhoneNumbersSummaryListUndefined: Self = StObject.set(x, "ListPhoneNumbersSummaryList", js.undefined)
    
    inline def setListPhoneNumbersSummaryListVarargs(value: ListPhoneNumbersSummary*): Self = StObject.set(x, "ListPhoneNumbersSummaryList", js.Array(value*))
    
    inline def setNextToken(value: LargeNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
