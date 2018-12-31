package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoT1ClickDevicesService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoT1ClickDevicesService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClientConfiguration = js.native
  /**
    * Adds device(s) to your account (i.e., claim one or more devices) if and only if
    you received a claim code with the device(s).
    */
  def claimDevicesByClaimCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def claimDevicesByClaimCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds device(s) to your account (i.e., claim one or more devices) if and only if
    you received a claim code with the device(s).
    */
  def claimDevicesByClaimCode(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def claimDevicesByClaimCode(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ClaimDevicesByClaimCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, returns a DescribeDeviceResponse object describing
    the details of the device.
    */
  def describeDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, returns a DescribeDeviceResponse object describing
    the details of the device.
    */
  def describeDevice(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeDevice(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.DescribeDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, finalizes the claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device
    event, and finalizing the claim. For a device of type button, a
    device event can be published by simply clicking the device.
    
    */
  def finalizeDeviceClaim(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def finalizeDeviceClaim(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, finalizes the claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device
    event, and finalizing the claim. For a device of type button, a
    device event can be published by simply clicking the device.
    
    */
  def finalizeDeviceClaim(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def finalizeDeviceClaim(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.FinalizeDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, returns the invokable methods associated with the
    device.
    */
  def getDeviceMethods(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDeviceMethods(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, returns the invokable methods associated with the
    device.
    */
  def getDeviceMethods(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDeviceMethods(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.GetDeviceMethodsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, initiates a claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device
    event, and finalizing the claim. For a device of type button, a
    device event can be published by simply clicking the device.
    
    */
  def initiateDeviceClaim(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def initiateDeviceClaim(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, initiates a claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device
    event, and finalizing the claim. For a device of type button, a
    device event can be published by simply clicking the device.
    
    */
  def initiateDeviceClaim(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def initiateDeviceClaim(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InitiateDeviceClaimResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, issues a request to invoke a named device method (with possible
    parameters). See the "Example POST" code snippet below.
    */
  def invokeDeviceMethod(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invokeDeviceMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Given a device ID, issues a request to invoke a named device method (with possible
    parameters). See the "Example POST" code snippet below.
    */
  def invokeDeviceMethod(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def invokeDeviceMethod(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.InvokeDeviceMethodResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Using a device ID, returns a DeviceEventsResponse object containing
    an array of events for the device.
    */
  def listDeviceEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDeviceEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Using a device ID, returns a DeviceEventsResponse object containing
    an array of events for the device.
    */
  def listDeviceEvents(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDeviceEvents(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the 1-Click compatible devices associated with your AWS account.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the 1-Click compatible devices associated with your AWS account.
    */
  def listDevices(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevices(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a device from your AWS account using its device ID.
    */
  def unclaimDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unclaimDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates a device from your AWS account using its device ID.
    */
  def unclaimDevice(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def unclaimDevice(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UnclaimDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Using a Boolean value (true or false), this operation
    enables or disables the device given a device ID.
    */
  def updateDeviceState(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDeviceState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Using a Boolean value (true or false), this operation
    enables or disables the device given a device ID.
    */
  def updateDeviceState(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDeviceState(
    params: awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIot1clickdevicesserviceMod.IoT1ClickDevicesServiceNs.UpdateDeviceStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

