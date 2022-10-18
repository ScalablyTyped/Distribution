package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPairsRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether to include the default key pair in the response of your request.
    */
  var includeDefaultKeyPair: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetKeyPairs request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetKeyPairsRequest {
  
  inline def apply(): GetKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairsRequest]
  }
  
  extension [Self <: GetKeyPairsRequest](x: Self) {
    
    inline def setIncludeDefaultKeyPair(value: Boolean): Self = StObject.set(x, "includeDefaultKeyPair", value.asInstanceOf[js.Any])
    
    inline def setIncludeDefaultKeyPairUndefined: Self = StObject.set(x, "includeDefaultKeyPair", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
