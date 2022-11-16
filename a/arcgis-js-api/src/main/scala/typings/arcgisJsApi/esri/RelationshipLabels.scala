package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipLabels extends StObject {
  
  /**
    * The label corresponding with the bottom corner of the legend if the focus is set to `HH`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var bottom: String
  
  /**
    * The label corresponding with the left corner of the legend (if the focus is set to `HH`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var left: String
  
  /**
    * The label corresponding with the right corner of the legend (if the focus is set to `HH`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var right: String
  
  /**
    * The label corresponding with the top corner of the legend if the focus is set to `HH`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipLabels)
    */
  var top: String
}
object RelationshipLabels {
  
  inline def apply(bottom: String, left: String, right: String, top: String): RelationshipLabels = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipLabels]
  }
  
  extension [Self <: RelationshipLabels](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
