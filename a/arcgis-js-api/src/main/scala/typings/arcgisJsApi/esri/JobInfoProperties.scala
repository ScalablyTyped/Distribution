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

trait JobInfoProperties extends StObject {
  
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
  
  inline def apply(): JobInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobInfoProperties]
  }
  
  extension [Self <: JobInfoProperties](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobStatus(
      value: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting`
    ): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "jobStatus", js.undefined)
    
    inline def setMessages(value: js.Array[GPMessageProperties]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: GPMessageProperties*): Self = StObject.set(x, "messages", js.Array(value :_*))
  }
}
