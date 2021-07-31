package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jsonUtils extends StObject {
  
  /**
    * Creates a new instance of an appropriate [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html#fromJSON)
    */
  def fromJSON(json: js.Any): Geometry_
  
  /**
    * Returns the type for a given geometry in the JSON format used by the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html#getJsonType)
    */
  def getJsonType(geometry: Geometry_): String
}
object jsonUtils {
  
  @scala.inline
  def apply(fromJSON: js.Any => Geometry_, getJsonType: Geometry_ => String): jsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), getJsonType = js.Any.fromFunction1(getJsonType))
    __obj.asInstanceOf[jsonUtils]
  }
  
  @scala.inline
  implicit class jsonUtilsMutableBuilder[Self <: jsonUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromJSON(value: js.Any => Geometry_): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetJsonType(value: Geometry_ => String): Self = StObject.set(x, "getJsonType", js.Any.fromFunction1(value))
  }
}
