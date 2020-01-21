package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`job-cancelled`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-cancelling`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-deleted`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-deleting`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-executing`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-failed`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-new`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-submitted`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-succeeded`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-timed-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`job-waiting`
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
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: js.UndefOr[
    `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting`
  ] = js.undefined
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.UndefOr[js.Array[GPMessageProperties]] = js.undefined
}

object JobInfoProperties {
  @scala.inline
  def apply(
    jobId: String = null,
    jobStatus: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting` = null,
    messages: js.Array[GPMessageProperties] = null
  ): JobInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (jobStatus != null) __obj.updateDynamic("jobStatus")(jobStatus.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobInfoProperties]
  }
}

