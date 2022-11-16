package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipSchemeForPolylineColorsForClassBreaks extends StObject {
  
  /**
    * The colors of the line symbols used for each bin in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var colors: js.Array[js.Array[Color_]]
  
  /**
    * The number of breaks (rows/columns) for each variable in the relationship visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-relationship.html#RelationshipSchemeForPolyline)
    */
  var numClasses: Double
}
object RelationshipSchemeForPolylineColorsForClassBreaks {
  
  inline def apply(colors: js.Array[js.Array[Color_]], numClasses: Double): RelationshipSchemeForPolylineColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipSchemeForPolylineColorsForClassBreaks]
  }
  
  extension [Self <: RelationshipSchemeForPolylineColorsForClassBreaks](x: Self) {
    
    inline def setColors(value: js.Array[js.Array[Color_]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: js.Array[Color_]*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
  }
}
