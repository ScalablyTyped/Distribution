package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search a map service exposed by the ArcGIS Server REST API based on a string value.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-find.html)
  */
@js.native
trait find extends StObject {
  
  /**
    * Sends a request to the ArcGIS REST map service resource to perform a search based on the input [params](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FindParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-find.html#find)
    */
  def find(url: String, params: FindParameters): js.Promise[Any] = js.native
  def find(url: String, params: FindParametersProperties): js.Promise[Any] = js.native
  def find(url: String, params: FindParametersProperties, requestOptions: Any): js.Promise[Any] = js.native
  def find(url: String, params: FindParameters, requestOptions: Any): js.Promise[Any] = js.native
}
