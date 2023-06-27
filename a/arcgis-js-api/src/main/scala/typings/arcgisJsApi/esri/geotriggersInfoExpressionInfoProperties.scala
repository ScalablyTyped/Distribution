package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait geotriggersInfoExpressionInfoProperties extends StObject {
  
  /**
  		 * Optional expression in the [Arcade expression](https://developers.arcgis.com/arcade/) language.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html#expression)
  		 */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
  		 * Optional return type of the Arcade expression.
  		 *
  		 * @default string
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html#returnType)
  		 */
  var returnType: js.UndefOr[number | string_] = js.undefined
  
  /**
  		 * Optional title of the expression.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webdoc-geotriggersInfo-ExpressionInfo.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object geotriggersInfoExpressionInfoProperties {
  
  inline def apply(): geotriggersInfoExpressionInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[geotriggersInfoExpressionInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: geotriggersInfoExpressionInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setReturnType(value: number | string_): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
