package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`in-progress`
import typings.arcgisJsApi.arcgisJsApiStrings.completed
import typings.arcgisJsApi.arcgisJsApiStrings.pending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceJobInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Sends a request for the current state of this job.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html#checkJobStatus)
  		 */
  def checkJobStatus(): js.Promise[TraceJobInfo] = js.native
  def checkJobStatus(requestOptions: Any): js.Promise[TraceJobInfo] = js.native
  
  /**
  		 * The last date and time the service was updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html#lastUpdatedTime)
  		 */
  var lastUpdatedTime: js.Date = js.native
  
  /**
  		 * The job status.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html#status)
  		 */
  var status: pending | `in-progress` | completed = js.native
  
  /**
  		 * ArcGIS Server Rest API endpoint to the resource that receives the validate network topology request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html#statusUrl)
  		 */
  var statusUrl: String = js.native
  
  /**
  		 * The date and time in which [submitTopologyValidationJob()](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#submitTopologyValidationJob) is first called.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html#submissionTime)
  		 */
  var submissionTime: js.Date = js.native
  
  /**
  		 * Resolves when an asynchronous job has completed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html#waitForJobCompletion)
  		 */
  def waitForJobCompletion(): js.Promise[TraceJobInfo] = js.native
  def waitForJobCompletion(options: TraceJobInfoWaitForJobCompletionOptions): js.Promise[TraceJobInfo] = js.native
}
