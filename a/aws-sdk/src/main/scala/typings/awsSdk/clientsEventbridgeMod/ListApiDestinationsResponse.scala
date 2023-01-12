package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApiDestinationsResponse extends StObject {
  
  /**
    * An array of ApiDestination objects that include information about an API destination.
    */
  var ApiDestinations: js.UndefOr[ApiDestinationResponseList] = js.undefined
  
  /**
    * A token you can use in a subsequent request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEventbridgeMod.NextToken] = js.undefined
}
object ListApiDestinationsResponse {
  
  inline def apply(): ListApiDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiDestinationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApiDestinationsResponse] (val x: Self) extends AnyVal {
    
    inline def setApiDestinations(value: ApiDestinationResponseList): Self = StObject.set(x, "ApiDestinations", value.asInstanceOf[js.Any])
    
    inline def setApiDestinationsUndefined: Self = StObject.set(x, "ApiDestinations", js.undefined)
    
    inline def setApiDestinationsVarargs(value: ApiDestination*): Self = StObject.set(x, "ApiDestinations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
