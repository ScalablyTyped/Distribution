package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateJobOutput extends js.Object {
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[String] = js.undefined
  /**
    * The path to the location of where the select results are stored.
    */
  var jobOutputPath: js.UndefOr[String] = js.undefined
  /**
    * The relative URI path of the job.
    */
  var location: js.UndefOr[String] = js.undefined
}

object InitiateJobOutput {
  @scala.inline
  def apply(jobId: String = null, jobOutputPath: String = null, location: String = null): InitiateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (jobOutputPath != null) __obj.updateDynamic("jobOutputPath")(jobOutputPath)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[InitiateJobOutput]
  }
}

