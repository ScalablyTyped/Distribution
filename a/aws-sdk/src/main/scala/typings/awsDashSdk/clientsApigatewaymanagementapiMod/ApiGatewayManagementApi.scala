package typings.awsDashSdk.clientsApigatewaymanagementapiMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiGatewayManagementApi extends Service {
  @JSName("config")
  var config_ApiGatewayManagementApi: ConfigBase with ClientConfiguration = js.native
  /**
    * Sends the provided data to the specified connection.
    */
  def postToConnection(): Request[js.Object, AWSError] = js.native
  def postToConnection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Sends the provided data to the specified connection.
    */
  def postToConnection(params: PostToConnectionRequest): Request[js.Object, AWSError] = js.native
  def postToConnection(
    params: PostToConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
}

