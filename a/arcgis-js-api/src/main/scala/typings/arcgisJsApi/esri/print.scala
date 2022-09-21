package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The print module provides an `executePrint` method that generates a printer-ready version of the map using an [Export Web Map Task](https://developers.arcgis.com/rest/services-reference/export-web-map-task.htm) available with ArGIS Server 10.1 and later.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html)
  */
@js.native
trait print extends StObject {
  
  /**
    * Sends a request to the print service to create a printable static image of the map using the options specified in the [PrintParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintParameters.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html#execute)
    */
  def execute(url: String, params: PrintParameters): js.Promise[PrintResponse] = js.native
  def execute(url: String, params: PrintParameters, requestOptions: Any): js.Promise[PrintResponse] = js.native
  
  /**
    * Request the mode for the print request service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html#getMode)
    */
  def getMode(url: String): String = js.native
}
