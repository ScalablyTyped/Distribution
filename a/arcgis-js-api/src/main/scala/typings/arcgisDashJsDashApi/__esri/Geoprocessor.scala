package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geoprocessor extends Task {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries will be in the spatial reference of the input geometries. If [processSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference) is specified and `outSpatialReference` is not specified, the output geometries will be in the spatial reference of the process spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outSpatialReference)
    *
    * @default null
    */
  var outSpatialReference: SpatialReference = js.native
  /**
    * ProcessExtent, if specified, will only process features that overlap this extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processExtent)
    *
    * @default null
    */
  var processExtent: Extent = js.native
  /**
    * The spatial reference that the model will use to perform geometry operations. If `processSpatialReference` is specified and [outputSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#outputSpatialReference) is not specified, the output geometries will be in the spatial reference of the process spatial reference.  A possible common scenario for using `processSpatialReference` and `outputSpatialReference` is that you would like to perform spatial operations like buffer or clip on a projected coordinate system such as web mercator. And you would like to recieve the output based on a geographic coordinates such as WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#processSpatialReference)
    *
    * @default null
    */
  var processSpatialReference: SpatialReference = js.native
  /**
    * If `true`, m-values will be included in the results if the features have m-values. Otherwise, m-values are not returned. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnM)
    *
    * @default false
    */
  var returnM: Boolean = js.native
  /**
    * If `true`, z-values will be included in the results if the features have z-values. Otherwise, z-values are not returned. The default is false.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#returnZ)
    *
    * @default false
    */
  var returnZ: Boolean = js.native
  /**
    * Cancels an asynchronous geoprocessing job. Requires an ArcGIS Server 10.1 service or greater.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#cancelJob)
    *
    * @param jobId A string that uniquely identifies a job on the server. It is created when a job is submitted for execution and later used to check its status and retrieve the results.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def cancelJob(jobId: String): IPromise[JobInfo] = js.native
  def cancelJob(jobId: String, requestOptions: js.Any): IPromise[JobInfo] = js.native
  /**
    * Sends a request to the GP Task for the current state of the job identified by `jobId`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#checkJobStatus)
    *
    * @param jobId The jobId returned from [JobInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html).
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def checkJobStatus(jobId: String): IPromise[JobInfo] = js.native
  def checkJobStatus(jobId: String, requestOptions: js.Any): IPromise[JobInfo] = js.native
  /**
    * Sends a request to the server to execute a synchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#execute)
    *
    * @param params ```
    * Specifies the input parameters accepted by the task and their corresponding values. These input parameters are listed in the parameters field of the associated GP Task resource. For example, assume that a GP Task resource has the following input parameters:
    *   * `<GPFeatureRecordSetLayer>` Input_Points
    *   * `<GPDouble>` Distance
    *
    *
    * The `params` argument would then be an Object of the form:
    * ```
    * {
    *  Input_Points: <FeatureSet>,
    *  Distance: <Number>
    * }
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def execute(params: js.Any): IPromise[_] = js.native
  def execute(params: js.Any, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * Sends a request to the GP Task to get the task result identified by `jobId` and `resultName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultData)
    *
    * @param jobId The jobId returned from [JobInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html).
    * @param resultName The name of the result parameter as defined in Services Directory.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getResultData(jobId: String, resultName: String): IPromise[ParameterValue] = js.native
  def getResultData(jobId: String, resultName: String, requestOptions: js.Any): IPromise[ParameterValue] = js.native
  /**
    * Sends a request to the GP Task to get the task result identified by `jobId` and `resultName` as an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultImage)
    *
    * @param jobId The jobId returned from [JobInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html).
    * @param resultName The name of the result parameter as defined in the Services Directory.
    * @param imageParams Specifies the properties of the result image.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def getResultImage(jobId: String, resultName: String, imageParams: ImageParameters): IPromise[ParameterValue] = js.native
  def getResultImage(jobId: String, resultName: String, imageParams: ImageParameters, requestOptions: js.Any): IPromise[ParameterValue] = js.native
  /**
    * Get the task result identified by `jobId` as an [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultMapImageLayer)
    *
    * @param jobId The jobId returned from [JobInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html).
    *
    */
  def getResultMapImageLayer(jobId: String): IPromise[MapImageLayer] = js.native
  /**
    * Submits a job to the server for asynchronous processing by the GP task. The method will resolve immediately after the job has been submitted to the server. Use [waitForJobCompletion()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion) to be notified when the job has completed and optionally periodic job status.  The task execution results can be retrieved using the [getResultData()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultData), [getResultImage()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultImage), or [getResultMapImageLayer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#getResultMapImageLayer) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#submitJob)
    *
    * @param params ```
    * specifies the input parameters accepted by the task and their corresponding values. These input parameters are listed in the parameters field of the associated GP Task resource. For example, assume that a GP Task resource has the following input parameters:
    *   * `<GPFeatureRecordSetLayer>` Input_Points
    *   * `<GPDouble>` Distance
    *
    *
    * The `params` argument would then be an Object of the form:
    * ```
    * {
    *   Input_Points: <FeatureSet>,
    *   Distance: <Number>
    * }
    *
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def submitJob(params: js.Any): IPromise[JobInfo] = js.native
  def submitJob(params: js.Any, requestOptions: js.Any): IPromise[JobInfo] = js.native
  /**
    * Resolves when an asynchronous job has completed. Optionally job progress can be monitored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Geoprocessor.html#waitForJobCompletion)
    *
    * @param jobId The jobId returned from [JobInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-JobInfo.html).
    * @param options Options. See properties below for object specifications.
    * @param options.interval The time in millisecond between remote job status requests.
    * @param options.signal [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job. If canceled, the promise will be rejected with an error named `AbortError`.
    * @param options.statusCallback Callback function that is called at the specified interval. Use this method to monitor job status and messages.
    *
    */
  def waitForJobCompletion(jobId: String): IPromise[JobInfo] = js.native
  def waitForJobCompletion(jobId: String, options: GeoprocessorWaitForJobCompletionOptions): IPromise[JobInfo] = js.native
}

@JSGlobal("__esri.Geoprocessor")
@js.native
object Geoprocessor extends TopLevel[GeoprocessorConstructor]

