package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait symbolsSupportJsonUtils extends js.Object {
  /**
    * Creates a new instance of an appropriate [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform. The object passed into the input `json` parameter often comes from a response to a query operation in the REST API or a [toJSON()](http://pro.arcgis.com/en/pro-app/tool-reference/conversion/features-to-json.htm) method from another ArcGIS product. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for details and examples of when and how to use this function.  When you create a [MarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html), [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PictureMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html) from a JSON object, you may specify a property angle to rotate the symbol. Be aware that the angle in the JSON is different from [MarkerSymbol.angle](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle). The angle in the JSON follows the traditional ArcGIS specification and is rotated counter-clockwise, whereas the angle in the symbol is rotated clockwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-jsonUtils.html#fromJSON)
    *
    * @param json A JSON representation of the instance in the ArcGIS format. See the [ArcGIS REST API documentation](https://developers.arcgis.com/documentation/common-data-types/symbol-objects.htm) for examples of the structure of various input JSON objects.
    *
    */
  def fromJSON(json: js.Any): Symbol
}

@JSGlobal("__esri.symbolsSupportJsonUtils")
@js.native
object symbolsSupportJsonUtils extends TopLevel[symbolsSupportJsonUtils]

