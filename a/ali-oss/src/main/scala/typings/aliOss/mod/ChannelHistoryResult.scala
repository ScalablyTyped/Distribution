package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelHistoryResult extends StObject {
  
  var records: ChannelHistory = js.native
  
  var res: NormalSuccessResponse = js.native
}
object ChannelHistoryResult {
  
  @scala.inline
  def apply(records: ChannelHistory, res: NormalSuccessResponse): ChannelHistoryResult = {
    val __obj = js.Dynamic.literal(records = records.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHistoryResult]
  }
  
  @scala.inline
  implicit class ChannelHistoryResultMutableBuilder[Self <: ChannelHistoryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecords(value: ChannelHistory): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
