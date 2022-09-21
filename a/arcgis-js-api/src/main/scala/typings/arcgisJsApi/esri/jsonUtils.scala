package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides utility methods for working with ArcGIS JSON geometry objects.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html)
  */
trait jsonUtils extends StObject {
  
  /**
    * Creates a new instance of an appropriate [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) class and initializes it with values from a JSON object generated from an ArcGIS product.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html#fromJSON)
    */
  def fromJSON(json: Any): Geometry_
  
  /**
    * Returns the type for a given geometry in the JSON format used by ArcGIS.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-jsonUtils.html#getJsonType)
    */
  def getJsonType(geometry: Geometry_): String
}
object jsonUtils {
  
  inline def apply(fromJSON: Any => Geometry_, getJsonType: Geometry_ => String): jsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), getJsonType = js.Any.fromFunction1(getJsonType))
    __obj.asInstanceOf[jsonUtils]
  }
  
  extension [Self <: jsonUtils](x: Self) {
    
    inline def setFromJSON(value: Any => Geometry_): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
    
    inline def setGetJsonType(value: Geometry_ => String): Self = StObject.set(x, "getJsonType", js.Any.fromFunction1(value))
  }
}
