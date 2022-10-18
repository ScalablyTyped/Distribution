package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSignalingChannelEndpointInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signalling channel for which you want to get an endpoint.
    */
  var ChannelARN: ResourceARN
  
  /**
    * A structure containing the endpoint configuration for the SINGLE_MASTER channel type.
    */
  var SingleMasterChannelEndpointConfiguration: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.SingleMasterChannelEndpointConfiguration] = js.undefined
}
object GetSignalingChannelEndpointInput {
  
  inline def apply(ChannelARN: ResourceARN): GetSignalingChannelEndpointInput = {
    val __obj = js.Dynamic.literal(ChannelARN = ChannelARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSignalingChannelEndpointInput]
  }
  
  extension [Self <: GetSignalingChannelEndpointInput](x: Self) {
    
    inline def setChannelARN(value: ResourceARN): Self = StObject.set(x, "ChannelARN", value.asInstanceOf[js.Any])
    
    inline def setSingleMasterChannelEndpointConfiguration(value: SingleMasterChannelEndpointConfiguration): Self = StObject.set(x, "SingleMasterChannelEndpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSingleMasterChannelEndpointConfigurationUndefined: Self = StObject.set(x, "SingleMasterChannelEndpointConfiguration", js.undefined)
  }
}
