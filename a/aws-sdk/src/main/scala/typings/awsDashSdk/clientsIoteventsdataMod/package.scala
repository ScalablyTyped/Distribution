package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIoteventsdataMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type BatchUpdateDetectorErrorEntries = js.Array[BatchUpdateDetectorErrorEntry]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DetectorModelName = String
  type DetectorModelVersion = String
  type DetectorSummaries = js.Array[DetectorSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ResourceNotFoundException
    - typings.awsDashSdk.awsDashSdkStrings.InvalidRequestException
    - typings.awsDashSdk.awsDashSdkStrings.InternalFailureException
    - typings.awsDashSdk.awsDashSdkStrings.ServiceUnavailableException
    - typings.awsDashSdk.awsDashSdkStrings.ThrottlingException
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | String
  type ErrorMessage = String
  type InputName = String
  type KeyValue = String
  type MaxResults = Double
  type MessageId = String
  type Messages = js.Array[Message]
  type NextToken = String
  type Payload = Buffer | Uint8Array | Blob | String
  type Seconds = Double
  type StateName = String
  type TimerDefinitions = js.Array[TimerDefinition]
  type TimerName = String
  type Timers = js.Array[Timer]
  type Timestamp = Date
  type UpdateDetectorRequests = js.Array[UpdateDetectorRequest]
  type VariableDefinitions = js.Array[VariableDefinition]
  type VariableName = String
  type VariableValue = String
  type Variables = js.Array[Variable]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-23`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
