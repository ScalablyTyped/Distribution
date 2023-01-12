package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFieldGroupProperties extends StObject {
  
  /**
    * The group's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[expanded | collapsed] = js.undefined
  
  /**
    * Arcade expression to determine whether this group is visible or not.
    *
    * @default null
    * @deprecated Since 4.23. Use {@link esri/form/elements/GroupElement#visibilityExpression groupElement.visibilityExpression}
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visibilityExpression)
    */
  var visibilityExpression: js.UndefOr[String] = js.undefined
}
object InputFieldGroupProperties {
  
  inline def apply(): InputFieldGroupProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputFieldGroupProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputFieldGroupProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setState(value: expanded | collapsed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setVisibilityExpression(value: String): Self = StObject.set(x, "visibilityExpression", value.asInstanceOf[js.Any])
    
    inline def setVisibilityExpressionUndefined: Self = StObject.set(x, "visibilityExpression", js.undefined)
  }
}
