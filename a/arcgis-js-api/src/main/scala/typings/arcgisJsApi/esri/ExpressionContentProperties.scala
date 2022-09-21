package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionContentProperties
  extends StObject
     with ContentProperties {
  
  /**
    * Contains the Arcade expression used to create a popup content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ExpressionContent.html#expressionInfo)
    */
  var expressionInfo: js.UndefOr[ElementExpressionInfoProperties] = js.undefined
}
object ExpressionContentProperties {
  
  inline def apply(): ExpressionContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionContentProperties]
  }
  
  extension [Self <: ExpressionContentProperties](x: Self) {
    
    inline def setExpressionInfo(value: ElementExpressionInfoProperties): Self = StObject.set(x, "expressionInfo", value.asInstanceOf[js.Any])
    
    inline def setExpressionInfoUndefined: Self = StObject.set(x, "expressionInfo", js.undefined)
  }
}
