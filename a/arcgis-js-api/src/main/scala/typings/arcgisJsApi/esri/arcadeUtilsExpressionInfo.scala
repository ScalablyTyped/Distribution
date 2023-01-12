package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait arcadeUtilsExpressionInfo extends StObject {
  
  /**
    * An Arcade expression defined on a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
    */
  var expression: String
  
  /**
    * The name of the expression used when referencing it in popup and form templates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the profile, or environment, where the expression was defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
    */
  var profileInfo: ExpressionInfoProfileInfo
  
  /**
    * The expression's title, describing it in the legend and other UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-arcadeUtils.html#ExpressionInfo)
    */
  var title: js.UndefOr[String] = js.undefined
}
object arcadeUtilsExpressionInfo {
  
  inline def apply(expression: String, profileInfo: ExpressionInfoProfileInfo): arcadeUtilsExpressionInfo = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], profileInfo = profileInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[arcadeUtilsExpressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: arcadeUtilsExpressionInfo] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProfileInfo(value: ExpressionInfoProfileInfo): Self = StObject.set(x, "profileInfo", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
