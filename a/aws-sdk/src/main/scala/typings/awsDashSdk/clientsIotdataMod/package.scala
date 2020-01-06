package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotdataMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type JsonDocument = Buffer | Uint8Array | Blob | String
  type Payload = Buffer | Uint8Array | Blob | String
  type Qos = Double
  type ThingName = String
  type Topic = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2015-05-28`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
