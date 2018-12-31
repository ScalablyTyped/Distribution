package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PinpointSMSVoice
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_PinpointSMSVoice: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.ClientConfiguration = js.native
  /**
    * Create a new configuration set. After you create the configuration set, you can add one or more event destinations to it.
    */
  def createConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new configuration set. After you create the configuration set, you can add one or more event destinations to it.
    */
  def createConfigurationSet(params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSet(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new event destination in a configuration set.
    */
  def createConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new event destination in a configuration set.
    */
  def createConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.CreateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing configuration set.
    */
  def deleteConfigurationSet(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSet(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing configuration set.
    */
  def deleteConfigurationSet(params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSet(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an event destination in a configuration set.
    */
  def deleteConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an event destination in a configuration set.
    */
  def deleteConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.DeleteConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name (ARN) of the destination, and the name of the event destination.
    */
  def getConfigurationSetEventDestinations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConfigurationSetEventDestinations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Obtain information about an event destination, including the types of events it reports, the Amazon Resource Name (ARN) of the destination, and the name of the event destination.
    */
  def getConfigurationSetEventDestinations(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConfigurationSetEventDestinations(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.GetConfigurationSetEventDestinationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new voice message and send it to a recipient's phone number.
    */
  def sendVoiceMessage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendVoiceMessage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create a new voice message and send it to a recipient's phone number.
    */
  def sendVoiceMessage(params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def sendVoiceMessage(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.SendVoiceMessageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an event destination in a configuration set. An event destination is a location that you publish information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when a call fails.
    */
  def updateConfigurationSetEventDestination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationSetEventDestination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Update an event destination in a configuration set. An event destination is a location that you publish information about your voice calls to. For example, you can log an event to an Amazon CloudWatch destination when a call fails.
    */
  def updateConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConfigurationSetEventDestination(
    params: awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPinpointsmsvoiceMod.PinpointSMSVoiceNs.UpdateConfigurationSetEventDestinationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

