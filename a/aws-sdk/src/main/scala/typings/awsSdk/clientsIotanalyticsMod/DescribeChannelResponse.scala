package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelResponse extends StObject {
  
  /**
    * An object that contains information about the channel.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  
  /**
    * Statistics about the channel. Included if the includeStatistics parameter is set to true in the request.
    */
  var statistics: js.UndefOr[ChannelStatistics] = js.undefined
}
object DescribeChannelResponse {
  
  inline def apply(): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setStatistics(value: ChannelStatistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
