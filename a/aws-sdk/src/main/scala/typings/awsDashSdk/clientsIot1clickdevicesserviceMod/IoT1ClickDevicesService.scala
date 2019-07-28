package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoT1ClickDevicesService extends Service {
  @JSName("config")
  var config_IoT1ClickDevicesService: ConfigBase with ClientConfiguration = js.native
  /**
    * Adds device(s) to your account (i.e., claim one or more devices) if and only if you
    received a claim code with the device(s).
    */
  def claimDevicesByClaimCode(): Request[ClaimDevicesByClaimCodeResponse, AWSError] = js.native
  def claimDevicesByClaimCode(callback: js.Function2[/* err */ AWSError, /* data */ ClaimDevicesByClaimCodeResponse, Unit]): Request[ClaimDevicesByClaimCodeResponse, AWSError] = js.native
  /**
    * Adds device(s) to your account (i.e., claim one or more devices) if and only if you
    received a claim code with the device(s).
    */
  def claimDevicesByClaimCode(params: ClaimDevicesByClaimCodeRequest): Request[ClaimDevicesByClaimCodeResponse, AWSError] = js.native
  def claimDevicesByClaimCode(
    params: ClaimDevicesByClaimCodeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ClaimDevicesByClaimCodeResponse, Unit]
  ): Request[ClaimDevicesByClaimCodeResponse, AWSError] = js.native
  /**
    * Given a device ID, returns a DescribeDeviceResponse object describing the
    details of the device.
    */
  def describeDevice(): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]): Request[DescribeDeviceResponse, AWSError] = js.native
  /**
    * Given a device ID, returns a DescribeDeviceResponse object describing the
    details of the device.
    */
  def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse, AWSError] = js.native
  def describeDevice(
    params: DescribeDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeviceResponse, Unit]
  ): Request[DescribeDeviceResponse, AWSError] = js.native
  /**
    * Given a device ID, finalizes the claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def finalizeDeviceClaim(): Request[FinalizeDeviceClaimResponse, AWSError] = js.native
  def finalizeDeviceClaim(callback: js.Function2[/* err */ AWSError, /* data */ FinalizeDeviceClaimResponse, Unit]): Request[FinalizeDeviceClaimResponse, AWSError] = js.native
  /**
    * Given a device ID, finalizes the claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def finalizeDeviceClaim(params: FinalizeDeviceClaimRequest): Request[FinalizeDeviceClaimResponse, AWSError] = js.native
  def finalizeDeviceClaim(
    params: FinalizeDeviceClaimRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ FinalizeDeviceClaimResponse, Unit]
  ): Request[FinalizeDeviceClaimResponse, AWSError] = js.native
  /**
    * Given a device ID, returns the invokable methods associated with the device.
    */
  def getDeviceMethods(): Request[GetDeviceMethodsResponse, AWSError] = js.native
  def getDeviceMethods(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceMethodsResponse, Unit]): Request[GetDeviceMethodsResponse, AWSError] = js.native
  /**
    * Given a device ID, returns the invokable methods associated with the device.
    */
  def getDeviceMethods(params: GetDeviceMethodsRequest): Request[GetDeviceMethodsResponse, AWSError] = js.native
  def getDeviceMethods(
    params: GetDeviceMethodsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceMethodsResponse, Unit]
  ): Request[GetDeviceMethodsResponse, AWSError] = js.native
  /**
    * Given a device ID, initiates a claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def initiateDeviceClaim(): Request[InitiateDeviceClaimResponse, AWSError] = js.native
  def initiateDeviceClaim(callback: js.Function2[/* err */ AWSError, /* data */ InitiateDeviceClaimResponse, Unit]): Request[InitiateDeviceClaimResponse, AWSError] = js.native
  /**
    * Given a device ID, initiates a claim request for the associated device.
    Claiming a device consists of initiating a claim, then publishing a device event,
    and finalizing the claim. For a device of type button, a device event can
    be published by simply clicking the device.
    
    */
  def initiateDeviceClaim(params: InitiateDeviceClaimRequest): Request[InitiateDeviceClaimResponse, AWSError] = js.native
  def initiateDeviceClaim(
    params: InitiateDeviceClaimRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InitiateDeviceClaimResponse, Unit]
  ): Request[InitiateDeviceClaimResponse, AWSError] = js.native
  /**
    * Given a device ID, issues a request to invoke a named device method (with possible
    parameters). See the "Example POST" code snippet below.
    */
  def invokeDeviceMethod(): Request[InvokeDeviceMethodResponse, AWSError] = js.native
  def invokeDeviceMethod(callback: js.Function2[/* err */ AWSError, /* data */ InvokeDeviceMethodResponse, Unit]): Request[InvokeDeviceMethodResponse, AWSError] = js.native
  /**
    * Given a device ID, issues a request to invoke a named device method (with possible
    parameters). See the "Example POST" code snippet below.
    */
  def invokeDeviceMethod(params: InvokeDeviceMethodRequest): Request[InvokeDeviceMethodResponse, AWSError] = js.native
  def invokeDeviceMethod(
    params: InvokeDeviceMethodRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InvokeDeviceMethodResponse, Unit]
  ): Request[InvokeDeviceMethodResponse, AWSError] = js.native
  /**
    * Using a device ID, returns a DeviceEventsResponse object containing an
    array of events for the device.
    */
  def listDeviceEvents(): Request[ListDeviceEventsResponse, AWSError] = js.native
  def listDeviceEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceEventsResponse, Unit]): Request[ListDeviceEventsResponse, AWSError] = js.native
  /**
    * Using a device ID, returns a DeviceEventsResponse object containing an
    array of events for the device.
    */
  def listDeviceEvents(params: ListDeviceEventsRequest): Request[ListDeviceEventsResponse, AWSError] = js.native
  def listDeviceEvents(
    params: ListDeviceEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceEventsResponse, Unit]
  ): Request[ListDeviceEventsResponse, AWSError] = js.native
  /**
    * Lists the 1-Click compatible devices associated with your AWS account.
    */
  def listDevices(): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Lists the 1-Click compatible devices associated with your AWS account.
    */
  def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse, AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDevicesResponse, Unit]
  ): Request[ListDevicesResponse, AWSError] = js.native
  /**
    * Lists the tags associated with the specified resource ARN.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags associated with the specified resource ARN.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Adds or updates the tags associated with the resource ARN. See AWS IoT 1-Click Service Limits for the maximum number of tags allowed per
    resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds or updates the tags associated with the resource ARN. See AWS IoT 1-Click Service Limits for the maximum number of tags allowed per
    resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates a device from your AWS account using its device ID.
    */
  def unclaimDevice(): Request[UnclaimDeviceResponse, AWSError] = js.native
  def unclaimDevice(callback: js.Function2[/* err */ AWSError, /* data */ UnclaimDeviceResponse, Unit]): Request[UnclaimDeviceResponse, AWSError] = js.native
  /**
    * Disassociates a device from your AWS account using its device ID.
    */
  def unclaimDevice(params: UnclaimDeviceRequest): Request[UnclaimDeviceResponse, AWSError] = js.native
  def unclaimDevice(
    params: UnclaimDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnclaimDeviceResponse, Unit]
  ): Request[UnclaimDeviceResponse, AWSError] = js.native
  /**
    * Using tag keys, deletes the tags (key/value pairs) associated with the specified
    resource ARN.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Using tag keys, deletes the tags (key/value pairs) associated with the specified
    resource ARN.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Using a Boolean value (true or false), this operation
    enables or disables the device given a device ID.
    */
  def updateDeviceState(): Request[UpdateDeviceStateResponse, AWSError] = js.native
  def updateDeviceState(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceStateResponse, Unit]): Request[UpdateDeviceStateResponse, AWSError] = js.native
  /**
    * Using a Boolean value (true or false), this operation
    enables or disables the device given a device ID.
    */
  def updateDeviceState(params: UpdateDeviceStateRequest): Request[UpdateDeviceStateResponse, AWSError] = js.native
  def updateDeviceState(
    params: UpdateDeviceStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceStateResponse, Unit]
  ): Request[UpdateDeviceStateResponse, AWSError] = js.native
}

