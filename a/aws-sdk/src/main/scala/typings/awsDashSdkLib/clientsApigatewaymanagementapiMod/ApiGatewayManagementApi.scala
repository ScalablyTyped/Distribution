package typings
package awsDashSdkLib.clientsApigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGatewayManagementApi
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ApiGatewayManagementApi: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsApigatewaymanagementapiMod.ApiGatewayManagementApiNs.ClientConfiguration = js.native
  /**
    * Sends the provided data to the specified connection.
    */
  def postToConnection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def postToConnection(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends the provided data to the specified connection.
    */
  def postToConnection(
    params: awsDashSdkLib.clientsApigatewaymanagementapiMod.ApiGatewayManagementApiNs.PostToConnectionRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def postToConnection(
    params: awsDashSdkLib.clientsApigatewaymanagementapiMod.ApiGatewayManagementApiNs.PostToConnectionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

