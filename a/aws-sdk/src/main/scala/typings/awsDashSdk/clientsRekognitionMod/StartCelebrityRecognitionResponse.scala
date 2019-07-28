package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartCelebrityRecognitionResponse extends js.Object {
  /**
    * The identifier for the celebrity recognition analysis job. Use JobId to identify the job in a subsequent call to GetCelebrityRecognition.
    */
  var JobId: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.JobId] = js.undefined
}

object StartCelebrityRecognitionResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartCelebrityRecognitionResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[StartCelebrityRecognitionResponse]
  }
}

