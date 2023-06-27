package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerElevationInfoFeatureExpressionInfo extends StObject {
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Feature Z Profile](https://developers.arcgis.com/javascript/latest/arcade/#z-values).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#elevationInfo)
  		 */
  var expression: js.UndefOr[String] = js.undefined
}
object KnowledgeGraphSublayerElevationInfoFeatureExpressionInfo {
  
  inline def apply(): KnowledgeGraphSublayerElevationInfoFeatureExpressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnowledgeGraphSublayerElevationInfoFeatureExpressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerElevationInfoFeatureExpressionInfo] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
  }
}
