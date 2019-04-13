package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoT1ClickDevicesService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoT1ClickDevicesService: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds device(s) to your account (i.e., claim one or more devices) if and only if you
    received a claim code with the device(s).
    */
  def claimDevicesByClaimCode(): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def claimDevicesByClaimCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClaimDevicesByClaimCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds device(s) to your account (i.e., claim one or more devices) if and only if you
    received a claim code with the device(s).
    */
  def claimDevicesByClaimCode(params: ClaimDevicesByClaimCodeRequest): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def claimDevicesByClaimCode(
    params: ClaimDevicesByClaimCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ClaimDevicesByClaimCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, returns a DescribeDeviceResponse object describing the
    details of the device.
    */
  def describeDevice(): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, returns a DescribeDeviceResponse object describing the
    details of the device.
    */
  def describeDevice(params: DescribeDeviceRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, finalizes the claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def finalizeDeviceClaim(): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def finalizeDeviceClaim(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ FinalizeDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, finalizes the claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def finalizeDeviceClaim(params: FinalizeDeviceClaimRequest): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def finalizeDeviceClaim(
    params: FinalizeDeviceClaimRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ FinalizeDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, returns the invokable methods associated with the device.
    */
  def getDeviceMethods(): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceMethods(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceMethodsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, returns the invokable methods associated with the device.
    */
  def getDeviceMethods(params: GetDeviceMethodsRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceMethods(
    params: GetDeviceMethodsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceMethodsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, initiates a claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def initiateDeviceClaim(): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initiateDeviceClaim(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitiateDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, initiates a claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def initiateDeviceClaim(params: InitiateDeviceClaimRequest): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initiateDeviceClaim(
    params: InitiateDeviceClaimRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitiateDeviceClaimResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, issues a request to invoke a named device method (with possible
    parameters). See the "Example POST" code snippet below.
    */
  def invokeDeviceMethod(): awsDashSdkLib.libRequestMod.Request[InvokeDeviceMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def invokeDeviceMethod(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InvokeDeviceMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InvokeDeviceMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Given a device ID, issues a request to invoke a named device method (with possible
    parameters). See the "Example POST" code snippet below.
    */
  def invokeDeviceMethod(params: InvokeDeviceMethodRequest): awsDashSdkLib.libRequestMod.Request[InvokeDeviceMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def invokeDeviceMethod(
    params: InvokeDeviceMethodRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InvokeDeviceMethodResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InvokeDeviceMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Using a device ID, returns a DeviceEventsResponse object containing an
    array of events for the device.
    */
  def listDeviceEvents(): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Using a device ID, returns a DeviceEventsResponse object containing an
    array of events for the device.
    */
  def listDeviceEvents(params: ListDeviceEventsRequest): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceEvents(
    params: ListDeviceEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the 1-Click compatible devices associated with your AWS account.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the 1-Click compatible devices associated with your AWS account.
    */
  def listDevices(params: ListDevicesRequest): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags associated with the specified resource ARN.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags associated with the specified resource ARN.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or updates the tags associated with the resource ARN. See AWS IoT 1-Click Service Limits for the maximum number of tags allowed per
    resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds or updates the tags associated with the resource ARN. See AWS IoT 1-Click Service Limits for the maximum number of tags allowed per
    resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a device from your AWS account using its device ID.
    */
  def unclaimDevice(): awsDashSdkLib.libRequestMod.Request[UnclaimDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unclaimDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnclaimDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnclaimDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates a device from your AWS account using its device ID.
    */
  def unclaimDevice(params: UnclaimDeviceRequest): awsDashSdkLib.libRequestMod.Request[UnclaimDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def unclaimDevice(
    params: UnclaimDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UnclaimDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UnclaimDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Using tag keys, deletes the tags (key/value pairs) associated with the specified
    resource ARN.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Using tag keys, deletes the tags (key/value pairs) associated with the specified
    resource ARN.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Using a Boolean value (true or false), this operation
    enables or disables the device given a device ID.
    */
  def updateDeviceState(): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Using a Boolean value (true or false), this operation
    enables or disables the device given a device ID.
    */
  def updateDeviceState(params: UpdateDeviceStateRequest): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceState(
    params: UpdateDeviceStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

