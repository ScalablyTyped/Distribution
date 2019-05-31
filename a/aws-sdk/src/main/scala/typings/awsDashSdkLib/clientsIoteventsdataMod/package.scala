package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIoteventsdataMod {
  type BatchPutMessageErrorEntries = js.Array[BatchPutMessageErrorEntry]
  type BatchUpdateDetectorErrorEntries = js.Array[BatchUpdateDetectorErrorEntry]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type DetectorModelName = java.lang.String
  type DetectorModelVersion = java.lang.String
  type DetectorSummaries = js.Array[DetectorSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceNotFoundException
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidRequestException
    - awsDashSdkLib.awsDashSdkLibStrings.InternalFailureException
    - awsDashSdkLib.awsDashSdkLibStrings.ServiceUnavailableException
    - awsDashSdkLib.awsDashSdkLibStrings.ThrottlingException
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ErrorMessage = java.lang.String
  type InputName = java.lang.String
  type KeyValue = java.lang.String
  type MaxResults = scala.Double
  type MessageId = java.lang.String
  type Messages = js.Array[Message]
  type NextToken = java.lang.String
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type Seconds = scala.Double
  type StateName = java.lang.String
  type TimerDefinitions = js.Array[TimerDefinition]
  type TimerName = java.lang.String
  type Timers = js.Array[Timer]
  type Timestamp = stdLib.Date
  type UpdateDetectorRequests = js.Array[UpdateDetectorRequest]
  type VariableDefinitions = js.Array[VariableDefinition]
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  type Variables = js.Array[Variable]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-10-23`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
