package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartFaceSearchResponse extends js.Object {
  /**
    * The identifier for the search job. Use JobId to identify the job in a subsequent call to GetFaceSearch. 
    */
  var JobId: js.UndefOr[JobId] = js.undefined
}

object StartFaceSearchResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartFaceSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    __obj.asInstanceOf[StartFaceSearchResponse]
  }
}

