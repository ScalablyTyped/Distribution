package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingsResponse extends StObject {
  
  /**
    * The token that identifies which batch of results that you want to see. For example, you submit a ListOfferings request with MaxResults set at 5. The service returns the first batch of results (up to 5) and a NextToken value. To see the next batch of results, you can submit the ListOfferings request a second time and specify the NextToken value.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * A list of offerings that are available to this account in the current AWS Region.
    */
  var Offerings: js.UndefOr[listOfOffering] = js.undefined
}
object ListOfferingsResponse {
  
  inline def apply(): ListOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsResponse]
  }
  
  extension [Self <: ListOfferingsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOfferings(value: listOfOffering): Self = StObject.set(x, "Offerings", value.asInstanceOf[js.Any])
    
    inline def setOfferingsUndefined: Self = StObject.set(x, "Offerings", js.undefined)
    
    inline def setOfferingsVarargs(value: Offering*): Self = StObject.set(x, "Offerings", js.Array(value*))
  }
}
