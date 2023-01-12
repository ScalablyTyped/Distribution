package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSignalingChannelInput extends StObject {
  
  /**
    * The ARN of the signaling channel that you want to describe.
    */
  var ChannelARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the signaling channel that you want to describe.
    */
  var ChannelName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ChannelName] = js.undefined
}
object DescribeSignalingChannelInput {
  
  inline def apply(): DescribeSignalingChannelInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSignalingChannelInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSignalingChannelInput] (val x: Self) extends AnyVal {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setChannelARNUndefined: Self = StObject.set(x, "ChannelARN", js.undefined)
    
    inline def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
  }
}
