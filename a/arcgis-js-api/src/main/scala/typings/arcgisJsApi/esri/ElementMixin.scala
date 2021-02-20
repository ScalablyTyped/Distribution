package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementMixin extends StObject {
  
  /**
    * The element's description providing the purpose behind it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#description)
    */
  var description: String = js.native
  
  /**
    * A string value containing the field alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#label)
    */
  var label: String = js.native
  
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#visibilityExpression)
    */
  var visibilityExpression: String = js.native
}
object ElementMixin {
  
  @scala.inline
  def apply(description: String, label: String, visibilityExpression: String): ElementMixin = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], visibilityExpression = visibilityExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementMixin]
  }
  
  @scala.inline
  implicit class ElementMixinMutableBuilder[Self <: ElementMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityExpression(value: String): Self = StObject.set(x, "visibilityExpression", value.asInstanceOf[js.Any])
  }
}
