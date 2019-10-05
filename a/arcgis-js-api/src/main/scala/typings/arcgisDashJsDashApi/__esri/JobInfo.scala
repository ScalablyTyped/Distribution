package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobInfo
  extends Accessor
     with JSONSupport {
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: String = js.native
  /**
    * The job status.  **Possible Values:** job-cancelled | job-cancelling | job-deleted | job-deleting | job-timed-out | job-executing | job-failed | job-new | job-submitted | job-succeeded | job-waiting
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: String = js.native
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.Array[GPMessage] = js.native
}

@JSGlobal("__esri.JobInfo")
@js.native
object JobInfo extends TopLevel[JobInfoConstructor]

