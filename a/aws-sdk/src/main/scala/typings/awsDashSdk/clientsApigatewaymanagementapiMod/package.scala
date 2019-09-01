package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsApigatewaymanagementapiMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Data = Buffer | Uint8Array | Blob | String
  type __string = String
  type __timestampIso8601 = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-29`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
