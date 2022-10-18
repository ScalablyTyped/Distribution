package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSignalingChannelOutput extends StObject {
  
  /**
    * A structure that encapsulates the specified signaling channel's metadata and properties.
    */
  var ChannelInfo: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ChannelInfo] = js.undefined
}
object DescribeSignalingChannelOutput {
  
  inline def apply(): DescribeSignalingChannelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelOutput]
  }
  
  extension [Self <: DescribeSignalingChannelOutput](x: Self) {
    
    inline def setChannelInfo(value: ChannelInfo): Self = StObject.set(x, "ChannelInfo", value.asInstanceOf[js.Any])
    
    inline def setChannelInfoUndefined: Self = StObject.set(x, "ChannelInfo", js.undefined)
  }
}
