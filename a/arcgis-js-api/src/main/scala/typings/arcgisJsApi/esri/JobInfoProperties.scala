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

@js.native
trait JobInfoProperties extends js.Object {
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: js.UndefOr[
    `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting`
  ] = js.native
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.UndefOr[js.Array[GPMessageProperties]] = js.native
}

object JobInfoProperties {
  @scala.inline
  def apply(): JobInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobInfoProperties]
  }
  @scala.inline
  implicit class JobInfoPropertiesOps[Self <: JobInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setJobStatus(
      value: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting`
    ): Self = this.set("jobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("jobStatus", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: GPMessageProperties*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[GPMessageProperties]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
  }
  
}

