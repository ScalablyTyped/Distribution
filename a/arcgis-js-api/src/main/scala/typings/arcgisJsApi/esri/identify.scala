package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Performs an identify operation on the layers of a map service exposed by the ArcGIS Server REST API.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html)
  */
@js.native
trait identify extends StObject {
  
  /**
    * Sends a request to the ArcGIS REST map service resource to identify features based on the [IdentifyParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-IdentifyParameters.html) specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-identify.html#identify)
    */
  def identify(url: String, params: IdentifyParameters): js.Promise[Any] = js.native
  def identify(url: String, params: IdentifyParameters, requestOptions: Any): js.Promise[Any] = js.native
}
