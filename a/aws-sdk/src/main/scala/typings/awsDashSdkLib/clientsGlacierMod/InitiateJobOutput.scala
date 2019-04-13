package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateJobOutput extends js.Object {
  /**
    * The ID of the job.
    */
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path to the location of where the select results are stored.
    */
  var jobOutputPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The relative URI path of the job.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object InitiateJobOutput {
  @scala.inline
  def apply(
    jobId: java.lang.String = null,
    jobOutputPath: java.lang.String = null,
    location: java.lang.String = null
  ): InitiateJobOutput = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (jobOutputPath != null) __obj.updateDynamic("jobOutputPath")(jobOutputPath)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[InitiateJobOutput]
  }
}

