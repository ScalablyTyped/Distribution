package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a channel.
    */
  var ChannelArn: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ChannelArn] = js.undefined
  
  /**
    *  The name of the CloudTrail channel. For service-linked channels, the name is aws-service-channel/service-name/custom-suffix where service-name represents the name of the Amazon Web Services service that created the channel and custom-suffix represents the suffix created by the Amazon Web Services service. 
    */
  var Name: js.UndefOr[ChannelName] = js.undefined
}
object Channel {
  
  inline def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
