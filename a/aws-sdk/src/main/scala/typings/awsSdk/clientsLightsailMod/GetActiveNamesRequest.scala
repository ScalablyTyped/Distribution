package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetActiveNamesRequest extends StObject {
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetActiveNames request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object GetActiveNamesRequest {
  
  inline def apply(): GetActiveNamesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetActiveNamesRequest]
  }
  
  extension [Self <: GetActiveNamesRequest](x: Self) {
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
