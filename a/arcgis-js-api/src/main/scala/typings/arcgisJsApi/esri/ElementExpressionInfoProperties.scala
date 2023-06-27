package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementExpressionInfoProperties extends StObject {
  
  /**
  		 * The [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression evaluating to a dictionary.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html#expression)
  		 */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The return type of the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html#returnType)
  		 */
  var returnType: js.UndefOr[dictionary] = js.undefined
  
  /**
  		 * The title used to describe the popup element returned by the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ElementExpressionInfo.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object ElementExpressionInfoProperties {
  
  inline def apply(): ElementExpressionInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementExpressionInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementExpressionInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setReturnType(value: dictionary): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
