package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSagemakerruntimeMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type BodyBlob = Buffer | Uint8Array | Blob | String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CustomAttributesHeader = String
  type EndpointName = String
  type Header = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-05-13`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
