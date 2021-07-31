package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementMixinProperties extends StObject {
  
  /**
    * The element's description providing the purpose behind it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A string value containing the field alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#visibilityExpression)
    */
  var visibilityExpression: js.UndefOr[String] = js.undefined
}
object ElementMixinProperties {
  
  @scala.inline
  def apply(): ElementMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementMixinProperties]
  }
  
  @scala.inline
  implicit class ElementMixinPropertiesMutableBuilder[Self <: ElementMixinProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setVisibilityExpression(value: String): Self = StObject.set(x, "visibilityExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityExpressionUndefined: Self = StObject.set(x, "visibilityExpression", js.undefined)
  }
}
