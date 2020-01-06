package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTelemetryMetadataRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that has the telemetry data that you want to obtain.
    */
  var assessmentRunArn: Arn = js.native
}

object GetTelemetryMetadataRequest {
  @scala.inline
  def apply(assessmentRunArn: Arn): GetTelemetryMetadataRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetTelemetryMetadataRequest]
  }
}

