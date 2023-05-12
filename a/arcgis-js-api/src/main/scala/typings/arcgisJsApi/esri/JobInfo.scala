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
    * Cancels an asynchronous geoprocessing job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#cancelJob)
    */
  def cancelJob(jobId: String): js.Promise[JobInfo] = js.native
  def cancelJob(jobId: String, requestOptions: Any): js.Promise[JobInfo] = js.native
  
  /**
    * Sends a request for the current state of this job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#checkJobStatus)
    */
  def checkJobStatus(): js.Promise[JobInfo] = js.native
  def checkJobStatus(requestOptions: Any): js.Promise[JobInfo] = js.native
  
  /**
    * Sends a request to the GP Task to get the task result identified by `resultName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#fetchResultData)
    */
  def fetchResultData(resultName: String): js.Promise[ParameterValue] = js.native
  def fetchResultData(resultName: String, gpOptions: scala.Unit, requestOptions: Any): js.Promise[ParameterValue] = js.native
  def fetchResultData(resultName: String, gpOptions: GPOptions): js.Promise[ParameterValue] = js.native
  def fetchResultData(resultName: String, gpOptions: GPOptions, requestOptions: Any): js.Promise[ParameterValue] = js.native
  
  /**
    * Sends a request to the GP Task to get the task result identified by `jobId` and `resultName` as an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#fetchResultImage)
    */
  def fetchResultImage(jobId: String, resultName: String, imageParams: ImageParameters): js.Promise[ParameterValue] = js.native
  def fetchResultImage(jobId: String, resultName: String, imageParams: ImageParameters, requestOptions: Any): js.Promise[ParameterValue] = js.native
  
  /**
    * Get the task result identified by `jobId` as an [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#fetchResultMapImageLayer)
    */
  def fetchResultMapImageLayer(jobId: String): js.Promise[MapImageLayer] = js.native
  
  /**
    * The unique job ID assigned by ArcGIS Server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#jobId)
    */
  var jobId: String = js.native
  
  /**
    * The job status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#jobStatus)
    */
  var jobStatus: `job-cancelled` | `job-cancelling` | `job-deleted` | `job-deleting` | `job-timed-out` | `job-executing` | `job-failed` | `job-new` | `job-submitted` | `job-succeeded` | `job-waiting` = js.native
  
  /**
    * An array of messages that include the message type and a description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#messages)
    */
  var messages: js.Array[GPMessage] = js.native
  
  /**
    * Displays the progress of the geoprocessing job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#progress)
    */
  val progress: JobInfoProgress = js.native
  
  /**
    * The [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for data requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#requestOptions)
    */
  var requestOptions: Any = js.native
  
  /**
    * ArcGIS Server Rest API endpoint to the resource that receives the geoprocessing request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#sourceUrl)
    */
  var sourceUrl: String = js.native
  
  /**
    * Resolves when an asynchronous job has completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-JobInfo.html#waitForJobCompletion)
    */
  def waitForJobCompletion(): js.Promise[JobInfo] = js.native
  def waitForJobCompletion(options: JobInfoWaitForJobCompletionOptions): js.Promise[JobInfo] = js.native
}
