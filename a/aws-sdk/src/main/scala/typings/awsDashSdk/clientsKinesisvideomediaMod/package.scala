package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideomediaMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.node.streamMod.Readable
  import typings.std.Date
  import typings.std.Uint8Array

  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContentType = String
  type ContinuationToken = String
  type FragmentNumberString = String
  type Payload = Buffer | Uint8Array | Blob | String | Readable
  type ResourceARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FRAGMENT_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.SERVER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsDashSdk.awsDashSdkStrings.NOW
    - typings.awsDashSdk.awsDashSdkStrings.EARLIEST
    - typings.awsDashSdk.awsDashSdkStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = _StartSelectorType | String
  type StreamName = String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-09-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
