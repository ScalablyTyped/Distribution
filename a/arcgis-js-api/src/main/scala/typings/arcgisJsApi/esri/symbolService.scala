package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents [symbol service](https://developers.arcgis.com/rest/services-reference/enterprise/symbol-server.htm) resources exposed by the ArcGIS REST API.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-symbolService.html)
  */
@js.native
trait symbolService extends StObject {
  
  /**
    * Converts a [Scalable Vector Graphic](https://pro.arcgis.com/en/pro-app/latest/help/mapping/layer-properties/scalable-vector-graphics-support.htm) (SVG) to a [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-symbolService.html#generateSymbol)
    */
  def generateSymbol(url: String, params: GenerateSymbolParameters): js.Promise[GenerateSymbolResponse] = js.native
  def generateSymbol(url: String, params: GenerateSymbolParameters, requestOptions: RequestOptions): js.Promise[GenerateSymbolResponse] = js.native
}
