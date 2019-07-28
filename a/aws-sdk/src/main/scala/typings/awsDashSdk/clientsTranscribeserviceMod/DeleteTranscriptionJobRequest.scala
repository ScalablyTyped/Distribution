package typings.awsDashSdk.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTranscriptionJobRequest extends js.Object {
  /**
    * The name of the transcription job to be deleted.
    */
  var TranscriptionJobName: typings.awsDashSdk.clientsTranscribeserviceMod.TranscriptionJobName
}

object DeleteTranscriptionJobRequest {
  @scala.inline
  def apply(TranscriptionJobName: TranscriptionJobName): DeleteTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(TranscriptionJobName = TranscriptionJobName)
  
    __obj.asInstanceOf[DeleteTranscriptionJobRequest]
  }
}

