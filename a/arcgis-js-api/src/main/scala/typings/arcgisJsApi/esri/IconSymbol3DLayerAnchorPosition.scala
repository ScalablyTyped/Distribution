package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSymbol3DLayerAnchorPosition extends StObject {
  
  /**
    * Value defining the position relative to the icon's width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var x: Double
  
  /**
    * Value defining the position relative to the icon's height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var y: Double
}
object IconSymbol3DLayerAnchorPosition {
  
  inline def apply(x: Double, y: Double): IconSymbol3DLayerAnchorPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSymbol3DLayerAnchorPosition]
  }
  
  extension [Self <: IconSymbol3DLayerAnchorPosition](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
