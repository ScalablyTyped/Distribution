package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredominantExpressionsPredominantCategory extends StObject {
  
  /**
    * valueExpression - An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-support-predominanceUtils.html#PredominantExpressions)
    */
  var valueExpression: String
}
object PredominantExpressionsPredominantCategory {
  
  inline def apply(valueExpression: String): PredominantExpressionsPredominantCategory = {
    val __obj = js.Dynamic.literal(valueExpression = valueExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredominantExpressionsPredominantCategory]
  }
  
  extension [Self <: PredominantExpressionsPredominantCategory](x: Self) {
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
  }
}
