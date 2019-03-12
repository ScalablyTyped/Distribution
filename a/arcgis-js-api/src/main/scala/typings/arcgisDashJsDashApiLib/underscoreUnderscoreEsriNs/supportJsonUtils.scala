package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait supportJsonUtils extends js.Object {
  /**
    * Creates a new instance of an appropriate [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform. The object passed into the input `json` parameter often comes from a response to a query operation in the REST API or a [toJSON()](http://pro.arcgis.com/en/pro-app/tool-reference/conversion/features-to-json.htm) method from another ArcGIS product. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for details and examples of when and how to use this function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-jsonUtils.html#fromJSON)
    *
    * @param json A JSON representation of the instance in the ArcGIS format. See the [ArcGIS REST API documentation](https://developers.arcgis.com/documentation/common-data-types/renderer-objects.htm) for examples of the structure of various input JSON objects.
    *
    */
  def fromJSON(json: js.Any): Renderer
}

object supportJsonUtils {
  @scala.inline
  def apply(fromJSON: js.Any => Renderer): supportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
  
    __obj.asInstanceOf[supportJsonUtils]
  }
}

