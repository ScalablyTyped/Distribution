package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geoprocessor extends Task {
  
  /**
    * Cancels an asynchronous geoprocessing job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#cancelJob)
    */
  def cancelJob(jobId: String): js.Promise[JobInfo] = js.native
  def cancelJob(jobId: String, requestOptions: js.Any): js.Promise[JobInfo] = js.native
  
  /**
    * Sends a request to the GP Task for the current state of the job identified by `jobId`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#checkJobStatus)
    */
  def checkJobStatus(jobId: String): js.Promise[JobInfo] = js.native
  def checkJobStatus(jobId: String, requestOptions: js.Any): js.Promise[JobInfo] = js.native
  
  /**
    * Sends a request to the server to execute a synchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#execute)
    */
  def execute(params: js.Any): js.Promise[_] = js.native
  def execute(params: js.Any, requestOptions: js.Any): js.Promise[_] = js.native
  
  /**
    * Sends a request to the GP Task to get the task result identified by `jobId` and `resultName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultData)
    */
  def getResultData(jobId: String, resultName: String): js.Promise[ParameterValue] = js.native
  def getResultData(jobId: String, resultName: String, requestOptions: js.Any): js.Promise[ParameterValue] = js.native
  
  /**
    * Sends a request to the GP Task to get the task result identified by `jobId` and `resultName` as an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultImage)
    */
  def getResultImage(jobId: String, resultName: String, imageParams: ImageParameters): js.Promise[ParameterValue] = js.native
  def getResultImage(jobId: String, resultName: String, imageParams: ImageParameters, requestOptions: js.Any): js.Promise[ParameterValue] = js.native
  
  /**
    * Get the task result identified by `jobId` as an [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultMapImageLayer)
    */
  def getResultMapImageLayer(jobId: String): js.Promise[MapImageLayer] = js.native
  
  /**
    * The spatial reference of the output geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  /**
    * ProcessExtent, if specified, will only process features that overlap this extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processExtent)
    */
  var processExtent: Extent = js.native
  
  /**
    * The spatial reference that the model will use to perform geometry operations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference)
    */
  var processSpatialReference: SpatialReference = js.native
  
  /**
    * If `true`, m-values will be included in the results if the features have m-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnM)
    */
  var returnM: Boolean = js.native
  
  /**
    * If `true`, z-values will be included in the results if the features have z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnZ)
    */
  var returnZ: Boolean = js.native
  
  /**
    * Submits a job to the server for asynchronous processing by the GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#submitJob)
    */
  def submitJob(params: js.Any): js.Promise[JobInfo] = js.native
  def submitJob(params: js.Any, requestOptions: js.Any): js.Promise[JobInfo] = js.native
  
  /**
    * Resolves when an asynchronous job has completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    */
  def waitForJobCompletion(jobId: String): js.Promise[JobInfo] = js.native
  def waitForJobCompletion(jobId: String, options: GeoprocessorWaitForJobCompletionOptions): js.Promise[JobInfo] = js.native
}
