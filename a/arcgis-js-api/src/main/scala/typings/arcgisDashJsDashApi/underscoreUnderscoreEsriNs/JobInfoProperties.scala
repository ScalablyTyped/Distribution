package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobInfoProperties extends js.Object {
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: js.UndefOr[String] = js.undefined
  /**
    * The job status.  **Possible Values:** job-cancelled | job-cancelling | job-deleted | job-deleting | job-timed-out | job-executing | job-failed | job-new | job-submitted | job-succeeded | job-waiting
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: js.UndefOr[String] = js.undefined
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.UndefOr[js.Array[GPMessageProperties]] = js.undefined
}

object JobInfoProperties {
  @scala.inline
  def apply(jobId: String = null, jobStatus: String = null, messages: js.Array[GPMessageProperties] = null): JobInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (jobStatus != null) __obj.updateDynamic("jobStatus")(jobStatus)
    if (messages != null) __obj.updateDynamic("messages")(messages)
    __obj.asInstanceOf[JobInfoProperties]
  }
}

