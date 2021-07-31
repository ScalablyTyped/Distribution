package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindTask
  extends StObject
     with Task {
  
  /**
    * Sends a request to the ArcGIS REST map service resource to perform a search based on the input [params](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FindParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html#execute)
    */
  def execute(params: FindParameters): js.Promise[js.Any] = js.native
  def execute(params: FindParametersProperties): js.Promise[js.Any] = js.native
  def execute(params: FindParametersProperties, requestOptions: js.Any): js.Promise[js.Any] = js.native
  def execute(params: FindParameters, requestOptions: js.Any): js.Promise[js.Any] = js.native
  
  /**
    * Specify the geodatabase version to search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-FindTask.html#gdbVersion)
    */
  var gdbVersion: String = js.native
}
