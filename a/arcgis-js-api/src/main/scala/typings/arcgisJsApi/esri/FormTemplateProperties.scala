package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormTemplateProperties extends StObject {
  
  /**
    * The description of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * An array of [form element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html) objects that represent an ordered list of form elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements)
    */
  var elements: js.UndefOr[js.Array[ElementProperties]] = js.undefined
  
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expressions following the specification defined by the [Constraint Profile](https://developers.arcgis.com/javascript/latest/arcade/#constraint) or the [Form Calculation Profile](https://developers.arcgis.com/javascript/latest/arcade/#form-calculation).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos)
    */
  var expressionInfos: js.UndefOr[js.Array[ExpressionInfoProperties]] = js.undefined
  
  /**
    * Indicates whether to retain or clear a [form's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) [field element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#preserveFieldValuesWhenHidden)
    */
  var preserveFieldValuesWhenHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The string template for defining how to format the title displayed at the top of a form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
}
object FormTemplateProperties {
  
  inline def apply(): FormTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormTemplateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormTemplateProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElements(value: js.Array[ElementProperties]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: ElementProperties*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setExpressionInfos(value: js.Array[ExpressionInfoProperties]): Self = StObject.set(x, "expressionInfos", value.asInstanceOf[js.Any])
    
    inline def setExpressionInfosUndefined: Self = StObject.set(x, "expressionInfos", js.undefined)
    
    inline def setExpressionInfosVarargs(value: ExpressionInfoProperties*): Self = StObject.set(x, "expressionInfos", js.Array(value*))
    
    inline def setPreserveFieldValuesWhenHidden(value: Boolean): Self = StObject.set(x, "preserveFieldValuesWhenHidden", value.asInstanceOf[js.Any])
    
    inline def setPreserveFieldValuesWhenHiddenUndefined: Self = StObject.set(x, "preserveFieldValuesWhenHidden", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
