package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait jsonUtils extends js.Object {
  /**
    * Creates a new instance of an appropriate [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform. The object passed into the input `json` parameter often comes from a response to a query operation in the REST API or a [toJSON()](http://pro.arcgis.com/en/pro-app/tool-reference/conversion/features-to-json.htm) method from another ArcGIS product. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for details and examples of when and how to use this function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html#fromJSON)
    *
    * @param json A JSON representation of the instance in the ArcGIS format. See the [ArcGIS REST API documentation](https://developers.arcgis.com/documentation/common-data-types/overview-of-common-data-types.htm) for examples of the structure of various input JSON objects.
    *
    */
  def fromJSON(json: js.Any): Geometry_
  /**
    * Returns the type for a given geometry in the JSON format used by the ArcGIS platform. This only applies to geometries that can be processed by the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html#getJsonType)
    *
    * @param geometry The input geometry object.
    *
    */
  def getJsonType(geometry: Geometry_): String
}

object jsonUtils {
  @scala.inline
  def apply(fromJSON: js.Any => Geometry_, getJsonType: Geometry_ => String): jsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), getJsonType = js.Any.fromFunction1(getJsonType))
    __obj.asInstanceOf[jsonUtils]
  }
}

