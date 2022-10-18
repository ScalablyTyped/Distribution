package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnomaliesResponse extends StObject {
  
  /**
    * A list of cost anomalies. 
    */
  var Anomalies: typings.awsSdk.clientsCostexplorerMod.Anomalies
  
  /**
    * The token to retrieve the next set of results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size. 
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
}
object GetAnomaliesResponse {
  
  inline def apply(Anomalies: Anomalies): GetAnomaliesResponse = {
    val __obj = js.Dynamic.literal(Anomalies = Anomalies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnomaliesResponse]
  }
  
  extension [Self <: GetAnomaliesResponse](x: Self) {
    
    inline def setAnomalies(value: Anomalies): Self = StObject.set(x, "Anomalies", value.asInstanceOf[js.Any])
    
    inline def setAnomaliesVarargs(value: Anomaly*): Self = StObject.set(x, "Anomalies", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
  }
}
