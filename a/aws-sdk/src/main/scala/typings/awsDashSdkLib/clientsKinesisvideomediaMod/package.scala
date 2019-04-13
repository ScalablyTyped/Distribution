package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsKinesisvideomediaMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContentType = java.lang.String
  type ContinuationToken = java.lang.String
  type FragmentNumberString = java.lang.String
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String | nodeLib.streamMod.Readable
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FRAGMENT_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.SERVER_TIMESTAMP
    - awsDashSdkLib.awsDashSdkLibStrings.PRODUCER_TIMESTAMP
    - awsDashSdkLib.awsDashSdkLibStrings.NOW
    - awsDashSdkLib.awsDashSdkLibStrings.EARLIEST
    - awsDashSdkLib.awsDashSdkLibStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = _StartSelectorType | java.lang.String
  type StreamName = java.lang.String
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-09-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
