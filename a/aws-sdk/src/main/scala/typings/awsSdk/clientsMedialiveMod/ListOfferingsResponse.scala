package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * List of offerings
    */
  var Offerings: js.UndefOr[listOfOffering] = js.undefined
}
object ListOfferingsResponse {
  
  inline def apply(): ListOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListOfferingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOfferings(value: listOfOffering): Self = StObject.set(x, "Offerings", value.asInstanceOf[js.Any])
    
    inline def setOfferingsUndefined: Self = StObject.set(x, "Offerings", js.undefined)
    
    inline def setOfferingsVarargs(value: Offering*): Self = StObject.set(x, "Offerings", js.Array(value*))
  }
}
