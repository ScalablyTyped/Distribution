package typings
package awsDashSdkLib.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iot1clickdevicesservice", "IoT1ClickDevicesService")
@js.native
object IoT1ClickDevicesServiceNs extends js.Object {
  
  trait Attributes extends js.Object
  
  
  trait ClaimDevicesByClaimCodeRequest extends js.Object {
    /**
         * The claim code, starting with "C-", as provided by the device manufacturer.
         */
    var ClaimCode: __string
  }
  
  
  trait ClaimDevicesByClaimCodeResponse extends js.Object {
    /**
         * The claim code provided by the device manufacturer.
         */
    var ClaimCode: js.UndefOr[__stringMin12Max40] = js.undefined
    /**
         * The total number of devices associated with the claim code that has been processed
     in the claim request.
         */
    var Total: js.UndefOr[__integer] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DescribeDeviceRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
  }
  
  
  trait DescribeDeviceResponse extends js.Object {
    /**
         * Device details.
         */
    var DeviceDescription: js.UndefOr[DeviceDescription] = js.undefined
  }
  
  
  trait Device extends js.Object {
    /**
         * The user specified attributes associated with the device for an event.
         */
    var Attributes: js.UndefOr[Attributes] = js.undefined
    /**
         * The unique identifier of the device.
         */
    var DeviceId: js.UndefOr[__string] = js.undefined
    /**
         * The device type, such as "button".
         */
    var Type: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DeviceAttributes
    extends /* key */ ScalablyTyped.runtime.StringDictionary[__string]
  
  
  trait DeviceDescription extends js.Object {
    /**
         * An array of zero or more elements of DeviceAttribute objects
     providing user specified device attributes.
         */
    var Attributes: js.UndefOr[DeviceAttributes] = js.undefined
    /**
         * The unique identifier of the device.
         */
    var DeviceId: js.UndefOr[__string] = js.undefined
    /**
         * A Boolean value indicating whether or not the device is enabled.
         */
    var Enabled: js.UndefOr[__boolean] = js.undefined
    /**
         * A value between 0 and 1 inclusive, representing the fraction of life remaining for
     the device.
         */
    var RemainingLife: js.UndefOr[__doubleMin0Max100] = js.undefined
    /**
         * The type of the device, such as "button".
         */
    var Type: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DeviceEvent extends js.Object {
    /**
         * An object representing the device associated with the event.
         */
    var Device: js.UndefOr[Device] = js.undefined
    /**
         * A serialized JSON object representing the device-type specific event.
         */
    var StdEvent: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DeviceMethod extends js.Object {
    /**
         * The type of the device, such as "button".
         */
    var DeviceType: js.UndefOr[__string] = js.undefined
    /**
         * The name of the method applicable to the deviceType.
         */
    var MethodName: js.UndefOr[__string] = js.undefined
  }
  
  
  trait FinalizeDeviceClaimRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
  }
  
  
  trait FinalizeDeviceClaimResponse extends js.Object {
    /**
         * The device's final claim state.
         */
    var State: js.UndefOr[__string] = js.undefined
  }
  
  
  trait GetDeviceMethodsRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
  }
  
  
  trait GetDeviceMethodsResponse extends js.Object {
    /**
         * List of available device APIs.
         */
    var DeviceMethods: js.UndefOr[__listOfDeviceMethod] = js.undefined
  }
  
  
  trait InitiateDeviceClaimRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
  }
  
  
  trait InitiateDeviceClaimResponse extends js.Object {
    /**
         * The device's final claim state.
         */
    var State: js.UndefOr[__string] = js.undefined
  }
  
  
  trait InvokeDeviceMethodRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
    /**
         * The device method to invoke.
         */
    var DeviceMethod: js.UndefOr[DeviceMethod] = js.undefined
    /**
         * A JSON encoded string containing the device method request parameters.
         */
    var DeviceMethodParameters: js.UndefOr[__string] = js.undefined
  }
  
  
  trait InvokeDeviceMethodResponse extends js.Object {
    /**
         * A JSON encoded string containing the device method response.
         */
    var DeviceMethodResponse: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListDeviceEventsRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
    /**
         * The start date for the device event query, in ISO8061 format. For example,
     2018-03-28T15:45:12.880Z
     
         */
    var FromTimeStamp: __timestampIso8601
    /**
         * The maximum number of results to return per request. If not set, a default value
     of 100 is used.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * The end date for the device event query, in ISO8061 format. For example,
     2018-03-28T15:45:12.880Z
     
         */
    var ToTimeStamp: __timestampIso8601
  }
  
  
  trait ListDeviceEventsResponse extends js.Object {
    /**
         * An array of zero or more elements describing the event(s) associated with the
     device.
         */
    var Events: js.UndefOr[__listOfDeviceEvent] = js.undefined
    /**
         * The token to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListDevicesRequest extends js.Object {
    /**
         * The type of the device, such as "button".
         */
    var DeviceType: js.UndefOr[__string] = js.undefined
    /**
         * The maximum number of results to return per request. If not set, a default value
     of 100 is used.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The token to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListDevicesResponse extends js.Object {
    /**
         * A list of devices.
         */
    var Devices: js.UndefOr[__listOfDeviceDescription] = js.undefined
    /**
         * The token to retrieve the next set of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Adds device(s) to your account (i.e., claim one or more devices) if and only if
     you received a claim code with the device(s).
       */
    def claimDevicesByClaimCode(): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds device(s) to your account (i.e., claim one or more devices) if and only if
     you received a claim code with the device(s).
       */
    def claimDevicesByClaimCode(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClaimDevicesByClaimCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds device(s) to your account (i.e., claim one or more devices) if and only if
     you received a claim code with the device(s).
       */
    def claimDevicesByClaimCode(params: ClaimDevicesByClaimCodeRequest): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds device(s) to your account (i.e., claim one or more devices) if and only if
     you received a claim code with the device(s).
       */
    def claimDevicesByClaimCode(
      params: ClaimDevicesByClaimCodeRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ClaimDevicesByClaimCodeResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ClaimDevicesByClaimCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns a DescribeDeviceResponse object describing
     the details of the device.
       */
    def describeDevice(): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns a DescribeDeviceResponse object describing
     the details of the device.
       */
    def describeDevice(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns a DescribeDeviceResponse object describing
     the details of the device.
       */
    def describeDevice(params: DescribeDeviceRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns a DescribeDeviceResponse object describing
     the details of the device.
       */
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
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def finalizeDeviceClaim(): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, finalizes the claim request for the associated device.
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def finalizeDeviceClaim(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FinalizeDeviceClaimResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, finalizes the claim request for the associated device.
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def finalizeDeviceClaim(params: FinalizeDeviceClaimRequest): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, finalizes the claim request for the associated device.
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def finalizeDeviceClaim(
      params: FinalizeDeviceClaimRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ FinalizeDeviceClaimResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[FinalizeDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns the invokable methods associated with the
     device.
       */
    def getDeviceMethods(): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns the invokable methods associated with the
     device.
       */
    def getDeviceMethods(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeviceMethodsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns the invokable methods associated with the
     device.
       */
    def getDeviceMethods(params: GetDeviceMethodsRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceMethodsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, returns the invokable methods associated with the
     device.
       */
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
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def initiateDeviceClaim(): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, initiates a claim request for the associated device.
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def initiateDeviceClaim(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InitiateDeviceClaimResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, initiates a claim request for the associated device.
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
    def initiateDeviceClaim(params: InitiateDeviceClaimRequest): awsDashSdkLib.libRequestMod.Request[InitiateDeviceClaimResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Given a device ID, initiates a claim request for the associated device.
     Claiming a device consists of initiating a claim, then publishing a device
     event, and finalizing the claim. For a device of type button, a
     device event can be published by simply clicking the device.
     
       */
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
    /**
       * Given a device ID, issues a request to invoke a named device method (with possible
     parameters). See the "Example POST" code snippet below.
       */
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
    /**
       * Given a device ID, issues a request to invoke a named device method (with possible
     parameters). See the "Example POST" code snippet below.
       */
    def invokeDeviceMethod(
      params: InvokeDeviceMethodRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvokeDeviceMethodResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvokeDeviceMethodResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using a device ID, returns a DeviceEventsResponse object containing
     an array of events for the device.
       */
    def listDeviceEvents(): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using a device ID, returns a DeviceEventsResponse object containing
     an array of events for the device.
       */
    def listDeviceEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeviceEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using a device ID, returns a DeviceEventsResponse object containing
     an array of events for the device.
       */
    def listDeviceEvents(params: ListDeviceEventsRequest): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using a device ID, returns a DeviceEventsResponse object containing
     an array of events for the device.
       */
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
    /**
       * Lists the 1-Click compatible devices associated with your AWS account.
       */
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
    /**
       * Lists the 1-Click compatible devices associated with your AWS account.
       */
    def listDevices(
      params: ListDevicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a device from your AWS account using its device ID.
       */
    def unclaimDevice(): awsDashSdkLib.libRequestMod.Request[UnclaimDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a device from your AWS account using its device ID.
       */
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
    /**
       * Disassociates a device from your AWS account using its device ID.
       */
    def unclaimDevice(
      params: UnclaimDeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UnclaimDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UnclaimDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using a Boolean value (true or false), this operation
     enables or disables the device given a device ID.
       */
    def updateDeviceState(): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Using a Boolean value (true or false), this operation
     enables or disables the device given a device ID.
       */
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
    /**
       * Using a Boolean value (true or false), this operation
     enables or disables the device given a device ID.
       */
    def updateDeviceState(
      params: UpdateDeviceStateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDeviceStateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnclaimDeviceRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
  }
  
  
  trait UnclaimDeviceResponse extends js.Object {
    /**
         * The device's final claim state.
         */
    var State: js.UndefOr[__string] = js.undefined
  }
  
  
  trait UpdateDeviceStateRequest extends js.Object {
    /**
         * The unique identifier of the device.
         */
    var DeviceId: __string
    /**
         * If true, the device is enabled. If false, the device is
     disabled.
         */
    var Enabled: js.UndefOr[__boolean] = js.undefined
  }
  
  
  trait UpdateDeviceStateResponse extends js.Object
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type MaxResults = scala.Double
  type __boolean = scala.Boolean
  type __doubleMin0Max100 = scala.Double
  type __integer = scala.Double
  type __listOfDeviceDescription = js.Array[DeviceDescription]
  type __listOfDeviceEvent = js.Array[DeviceEvent]
  type __listOfDeviceMethod = js.Array[DeviceMethod]
  type __string = java.lang.String
  type __stringMin12Max40 = java.lang.String
  type __timestampIso8601 = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-05-14` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

