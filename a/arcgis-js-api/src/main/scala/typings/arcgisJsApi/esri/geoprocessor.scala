package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a GP resource exposed by the ArcGIS REST API.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html)
  */
@js.native
trait geoprocessor extends StObject {
  
  /**
    * Sends a request to the server to execute a synchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html#execute)
    */
  def execute(url: String): js.Promise[Any] = js.native
  def execute(url: String, params: Any): js.Promise[Any] = js.native
  def execute(url: String, params: Any, options: scala.Unit, requestOptions: Any): js.Promise[Any] = js.native
  def execute(url: String, params: Any, options: GPOptions): js.Promise[Any] = js.native
  def execute(url: String, params: Any, options: GPOptions, requestOptions: Any): js.Promise[Any] = js.native
  def execute(url: String, params: scala.Unit, options: scala.Unit, requestOptions: Any): js.Promise[Any] = js.native
  def execute(url: String, params: scala.Unit, options: GPOptions): js.Promise[Any] = js.native
  def execute(url: String, params: scala.Unit, options: GPOptions, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * Submits a job to the server for asynchronous processing by the GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html#submitJob)
    */
  def submitJob(url: String): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: Any): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: Any, options: scala.Unit, requestOptions: Any): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: Any, options: GPOptions): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: Any, options: GPOptions, requestOptions: Any): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: scala.Unit, options: scala.Unit, requestOptions: Any): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: scala.Unit, options: GPOptions): js.Promise[JobInfo] = js.native
  def submitJob(url: String, params: scala.Unit, options: GPOptions, requestOptions: Any): js.Promise[JobInfo] = js.native
}
