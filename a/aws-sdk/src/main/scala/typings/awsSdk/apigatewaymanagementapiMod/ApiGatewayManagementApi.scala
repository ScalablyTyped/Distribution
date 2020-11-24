package typings.awsSdk.apigatewaymanagementapiMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiGatewayManagementApi extends Service {
  
  @JSName("config")
  var config_ApiGatewayManagementApi: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Delete the connection with the provided id.
    */
  def deleteConnection(): Request[js.Object, AWSError] = js.native
  def deleteConnection(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete the connection with the provided id.
    */
  def deleteConnection(params: DeleteConnectionRequest): Request[js.Object, AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Get information about the connection with the provided id.
    */
  def getConnection(): Request[GetConnectionResponse, AWSError] = js.native
  def getConnection(callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]): Request[GetConnectionResponse, AWSError] = js.native
  /**
    * Get information about the connection with the provided id.
    */
  def getConnection(params: GetConnectionRequest): Request[GetConnectionResponse, AWSError] = js.native
  def getConnection(
    params: GetConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConnectionResponse, Unit]
  ): Request[GetConnectionResponse, AWSError] = js.native
  
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
