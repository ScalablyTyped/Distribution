package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait popupExpressionInfoProperties extends StObject {
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Popup Profile](https://developers.arcgis.com/javascript/latest/arcade/#popup).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#expression)
  		 */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates the return type of the Arcade expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#returnType)
  		 */
  var returnType: js.UndefOr[string_ | number] = js.undefined
  
  /**
  		 * The title used to describe the value returned by the expression in the popup.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-ExpressionInfo.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object popupExpressionInfoProperties {
  
  inline def apply(): popupExpressionInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[popupExpressionInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: popupExpressionInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturnType(value: string_ | number): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
