package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelHistoryResult extends StObject {
  
  var records: ChannelHistory
  
  var res: NormalSuccessResponse
}
object ChannelHistoryResult {
  
  inline def apply(records: ChannelHistory, res: NormalSuccessResponse): ChannelHistoryResult = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHistoryResult]
  }
  
  extension [Self <: ChannelHistoryResult](x: Self) {
    
    inline def setRecords(value: ChannelHistory): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
