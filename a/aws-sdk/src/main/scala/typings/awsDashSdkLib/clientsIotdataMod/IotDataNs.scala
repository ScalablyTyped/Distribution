package typings
package awsDashSdkLib.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/iotdata", "IotData")
@js.native
object IotDataNs extends js.Object {
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait DeleteThingShadowRequest extends js.Object {
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait DeleteThingShadowResponse extends js.Object {
    /**
      * The state information, in JSON format.
      */
    var payload: JsonDocument
  }
  
  trait GetThingShadowRequest extends js.Object {
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait GetThingShadowResponse extends js.Object {
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[JsonDocument] = js.undefined
  }
  
  trait PublishRequest extends js.Object {
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[Payload] = js.undefined
    /**
      * The Quality of Service (QoS) level.
      */
    var qos: js.UndefOr[Qos] = js.undefined
    /**
      * The name of the MQTT topic.
      */
    var topic: Topic
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
      */
    def deleteThingShadow(): awsDashSdkLib.libRequestMod.Request[DeleteThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThingShadow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingShadowResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
      */
    def deleteThingShadow(params: DeleteThingShadowRequest): awsDashSdkLib.libRequestMod.Request[DeleteThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteThingShadow(
      params: DeleteThingShadowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteThingShadowResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
      */
    def getThingShadow(): awsDashSdkLib.libRequestMod.Request[GetThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getThingShadow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetThingShadowResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
      */
    def getThingShadow(params: GetThingShadowRequest): awsDashSdkLib.libRequestMod.Request[GetThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getThingShadow(
      params: GetThingShadowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetThingShadowResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
      */
    def publish(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def publish(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
      */
    def publish(params: PublishRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def publish(
      params: PublishRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
      */
    def updateThingShadow(): awsDashSdkLib.libRequestMod.Request[UpdateThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThingShadow(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingShadowResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
      */
    def updateThingShadow(params: UpdateThingShadowRequest): awsDashSdkLib.libRequestMod.Request[UpdateThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateThingShadow(
      params: UpdateThingShadowRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateThingShadowResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateThingShadowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UpdateThingShadowRequest extends js.Object {
    /**
      * The state information, in JSON format.
      */
    var payload: JsonDocument
    /**
      * The name of the thing.
      */
    var thingName: ThingName
  }
  
  trait UpdateThingShadowResponse extends js.Object {
    /**
      * The state information, in JSON format.
      */
    var payload: js.UndefOr[JsonDocument] = js.undefined
  }
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type JsonDocument = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsIotdataMod.Blob | java.lang.String
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsIotdataMod.Blob | java.lang.String
  type Qos = scala.Double
  type ThingName = java.lang.String
  type Topic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-05-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

