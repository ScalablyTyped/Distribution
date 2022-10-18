package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBaiduChannelResponse extends StObject {
  
  var BaiduChannelResponse: typings.awsSdk.clientsPinpointMod.BaiduChannelResponse
}
object DeleteBaiduChannelResponse {
  
  inline def apply(BaiduChannelResponse: BaiduChannelResponse): DeleteBaiduChannelResponse = {
    val __obj = js.Dynamic.literal(BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBaiduChannelResponse]
  }
  
  extension [Self <: DeleteBaiduChannelResponse](x: Self) {
    
    inline def setBaiduChannelResponse(value: BaiduChannelResponse): Self = StObject.set(x, "BaiduChannelResponse", value.asInstanceOf[js.Any])
  }
}
