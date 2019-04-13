package typings
package awsDashSdkLib.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotData
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IotData: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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

