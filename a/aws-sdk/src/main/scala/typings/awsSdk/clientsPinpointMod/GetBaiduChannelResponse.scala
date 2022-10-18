package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBaiduChannelResponse extends StObject {
  
  var BaiduChannelResponse: typings.awsSdk.clientsPinpointMod.BaiduChannelResponse
}
object GetBaiduChannelResponse {
  
  inline def apply(BaiduChannelResponse: BaiduChannelResponse): GetBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBaiduChannelResponse]
  }
  
  extension [Self <: GetBaiduChannelResponse](x: Self) {
    
    inline def setBaiduChannelResponse(value: BaiduChannelResponse): Self = StObject.set(x, "BaiduChannelResponse", value.asInstanceOf[js.Any])
  }
}
