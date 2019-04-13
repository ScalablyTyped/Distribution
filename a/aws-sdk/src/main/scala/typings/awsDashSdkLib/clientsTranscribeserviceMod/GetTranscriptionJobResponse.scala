package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTranscriptionJobResponse extends js.Object {
  /**
    * An object that contains the results of the transcription job.
    */
  var TranscriptionJob: js.UndefOr[TranscriptionJob] = js.undefined
}

object GetTranscriptionJobResponse {
  @scala.inline
  def apply(TranscriptionJob: TranscriptionJob = null): GetTranscriptionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (TranscriptionJob != null) __obj.updateDynamic("TranscriptionJob")(TranscriptionJob)
    __obj.asInstanceOf[GetTranscriptionJobResponse]
  }
}

