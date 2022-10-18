package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSendStatisticsResponse extends StObject {
  
  /**
    * A list of data points, each of which represents 15 minutes of activity.
    */
  var SendDataPoints: js.UndefOr[SendDataPointList] = js.undefined
}
object GetSendStatisticsResponse {
  
  inline def apply(): GetSendStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendStatisticsResponse]
  }
  
  extension [Self <: GetSendStatisticsResponse](x: Self) {
    
    inline def setSendDataPoints(value: SendDataPointList): Self = StObject.set(x, "SendDataPoints", value.asInstanceOf[js.Any])
    
    inline def setSendDataPointsUndefined: Self = StObject.set(x, "SendDataPoints", js.undefined)
    
    inline def setSendDataPointsVarargs(value: SendDataPoint*): Self = StObject.set(x, "SendDataPoints", js.Array(value*))
  }
}
