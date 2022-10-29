package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelRequest extends StObject {
  
  /**
    * The name of the channel.
    */
  var ChannelName: _String
}
object DescribeChannelRequest {
  
  inline def apply(ChannelName: _String): DescribeChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelRequest]
  }
  
  extension [Self <: DescribeChannelRequest](x: Self) {
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
  }
}
