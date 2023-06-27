package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphicsLayerElevationInfoFeatureExpressionInfo extends StObject {
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Feature Z Profile](https://developers.arcgis.com/javascript/latest/arcade/#z-values).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#elevationInfo)
  		 */
  var expression: js.UndefOr[String] = js.undefined
}
object GraphicsLayerElevationInfoFeatureExpressionInfo {
  
  inline def apply(): GraphicsLayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphicsLayerElevationInfoFeatureExpressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphicsLayerElevationInfoFeatureExpressionInfo] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
