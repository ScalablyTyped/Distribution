package typings
package awsDashSdkLib.clientsApigatewaymanagementapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/apigatewaymanagementapi", "ApiGatewayManagementApi")
@js.native
object ApiGatewayManagementApiNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait PostToConnectionRequest extends js.Object {
    /**
         * The identifier of the connection that a specific client is using.
         */
    var ConnectionId: __string
    /**
         * The data to be sent to the client specified by its connection id.
         */
    var Data: Data
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Sends the provided data to the specified connection.
       */
    def postToConnection(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends the provided data to the specified connection.
       */
    def postToConnection(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends the provided data to the specified connection.
       */
    def postToConnection(params: PostToConnectionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Sends the provided data to the specified connection.
       */
    def postToConnection(
      params: PostToConnectionRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Data = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsApigatewaymanagementapiMod.Blob | java.lang.String
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-11-29` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

