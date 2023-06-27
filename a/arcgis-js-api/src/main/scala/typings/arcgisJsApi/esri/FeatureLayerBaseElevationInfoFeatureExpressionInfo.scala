package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerBaseElevationInfoFeatureExpressionInfo extends StObject {
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Feature Z Profile](https://developers.arcgis.com/javascript/latest/arcade/#z-values).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-FeatureLayerBase.html#elevationInfo)
  		 */
  var expression: js.UndefOr[String] = js.undefined
}
object FeatureLayerBaseElevationInfoFeatureExpressionInfo {
  
  inline def apply(): FeatureLayerBaseElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureLayerBaseElevationInfoFeatureExpressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerBaseElevationInfoFeatureExpressionInfo] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
