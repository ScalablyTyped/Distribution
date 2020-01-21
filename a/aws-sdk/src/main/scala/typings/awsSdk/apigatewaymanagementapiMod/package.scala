package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apigatewaymanagementapiMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.apigatewaymanagementapiMod.ClientApiVersions
  type Data = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.apigatewaymanagementapiMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.apigatewaymanagementapiMod._apiVersion | java.lang.String
  type string = java.lang.String
  type timestampIso8601 = typings.std.Date
}
