package typings
package awsDashSdkLib.clientsIotdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IotData
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IotData: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsIotdataMod.IotDataNs.ClientConfiguration = js.native
  /**
     * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
     */
  def deleteThingShadow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
     */
  def deleteThingShadow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
     */
  def deleteThingShadow(params: awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the thing shadow for the specified thing. For more information, see DeleteThingShadow in the AWS IoT Developer Guide.
     */
  def deleteThingShadow(
    params: awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.DeleteThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
     */
  def getThingShadow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
     */
  def getThingShadow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
     */
  def getThingShadow(params: awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the thing shadow for the specified thing. For more information, see GetThingShadow in the AWS IoT Developer Guide.
     */
  def getThingShadow(
    params: awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.GetThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
     */
  def publish(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
     */
  def publish(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
     */
  def publish(params: awsDashSdkLib.clientsIotdataMod.IotDataNs.PublishRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Publishes state information. For more information, see HTTP Protocol in the AWS IoT Developer Guide.
     */
  def publish(
    params: awsDashSdkLib.clientsIotdataMod.IotDataNs.PublishRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
     */
  def updateThingShadow(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
     */
  def updateThingShadow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
     */
  def updateThingShadow(params: awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the thing shadow for the specified thing. For more information, see UpdateThingShadow in the AWS IoT Developer Guide.
     */
  def updateThingShadow(
    params: awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsIotdataMod.IotDataNs.UpdateThingShadowResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

