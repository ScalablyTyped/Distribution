package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTranscriptionJobRequest extends js.Object {
  /**
    * The name of the job.
    */
  var TranscriptionJobName: typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobName
}

object GetTranscriptionJobRequest {
  @scala.inline
  def apply(TranscriptionJobName: TranscriptionJobName): GetTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName)
  
    __obj.asInstanceOf[GetTranscriptionJobRequest]
  }
}

