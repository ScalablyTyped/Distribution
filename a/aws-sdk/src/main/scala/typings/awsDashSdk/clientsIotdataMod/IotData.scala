package typings.awsDashSdk.clientsIotdataMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotData extends Service {
  @JSName("config")
  var config_IotData: ConfigBase with ClientConfiguration = js.native
  /**
    * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
    */
  def deleteThingShadow(): Request[DeleteThingShadowResponse, AWSError] = js.native
  def deleteThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]): Request[DeleteThingShadowResponse, AWSError] = js.native
  /**
    * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
    */
  def deleteThingShadow(params: DeleteThingShadowRequest): Request[DeleteThingShadowResponse, AWSError] = js.native
  def deleteThingShadow(
    params: DeleteThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThingShadowResponse, Unit]
  ): Request[DeleteThingShadowResponse, AWSError] = js.native
  /**
    * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
    */
  def getThingShadow(): Request[GetThingShadowResponse, AWSError] = js.native
  def getThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]): Request[GetThingShadowResponse, AWSError] = js.native
  /**
    * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
    */
  def getThingShadow(params: GetThingShadowRequest): Request[GetThingShadowResponse, AWSError] = js.native
  def getThingShadow(
    params: GetThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetThingShadowResponse, Unit]
  ): Request[GetThingShadowResponse, AWSError] = js.native
  /**
    * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
    */
  def publish(): Request[js.Object, AWSError] = js.native
  def publish(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
    */
  def publish(params: PublishRequest): Request[js.Object, AWSError] = js.native
  def publish(params: PublishRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
    */
  def updateThingShadow(): Request[UpdateThingShadowResponse, AWSError] = js.native
  def updateThingShadow(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]): Request[UpdateThingShadowResponse, AWSError] = js.native
  /**
    * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
    */
  def updateThingShadow(params: UpdateThingShadowRequest): Request[UpdateThingShadowResponse, AWSError] = js.native
  def updateThingShadow(
    params: UpdateThingShadowRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThingShadowResponse, Unit]
  ): Request[UpdateThingShadowResponse, AWSError] = js.native
}

