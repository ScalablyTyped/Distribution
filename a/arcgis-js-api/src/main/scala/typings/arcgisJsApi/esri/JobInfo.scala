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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobId)
    */
  var jobId: String = js.native
  
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#jobStatus)
    */
  var jobStatus: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting` = js.native
  
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html#messages)
    */
  var messages: js.Array[GPMessage] = js.native
}
