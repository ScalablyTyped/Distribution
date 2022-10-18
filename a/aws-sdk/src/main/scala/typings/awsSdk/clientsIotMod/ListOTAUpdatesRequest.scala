package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOTAUpdatesRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * A token used to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The OTA update job status.
    */
  var otaUpdateStatus: js.UndefOr[OTAUpdateStatus] = js.undefined
}
object ListOTAUpdatesRequest {
  
  inline def apply(): ListOTAUpdatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOTAUpdatesRequest]
  }
  
  extension [Self <: ListOTAUpdatesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOtaUpdateStatus(value: OTAUpdateStatus): Self = StObject.set(x, "otaUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setOtaUpdateStatusUndefined: Self = StObject.set(x, "otaUpdateStatus", js.undefined)
  }
}
