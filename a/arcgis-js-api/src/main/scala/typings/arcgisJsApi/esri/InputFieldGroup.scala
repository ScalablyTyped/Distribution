package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Starting at version 4.27, this class is deprecated and should no longer be used.
	 *
	 * @deprecated since 4.27. Use {@link module:esri/widgets/FeatureForm/GroupInput} instead.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html)
	 */
trait InputFieldGroup extends StObject {
  
  val description: String
  
  val evaluatedVisibilityExpression: Boolean
  
  val inputFields: js.Array[InputField]
  
  val label: String
  
  val state: expanded | collapsed
  
  val visibilityExpression: String
  
  val visible: Boolean
}
object InputFieldGroup {
  
  inline def apply(
    description: String,
    evaluatedVisibilityExpression: Boolean,
    inputFields: js.Array[InputField],
    label: String,
    state: expanded | collapsed,
    visibilityExpression: String,
    visible: Boolean
  ): InputFieldGroup = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], evaluatedVisibilityExpression = evaluatedVisibilityExpression.asInstanceOf[js.Any], inputFields = inputFields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], visibilityExpression = visibilityExpression.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFieldGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputFieldGroup] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedVisibilityExpression(value: Boolean): Self = StObject.set(x, "evaluatedVisibilityExpression", value.asInstanceOf[js.Any])
    
    inline def setInputFields(value: js.Array[InputField]): Self = StObject.set(x, "inputFields", value.asInstanceOf[js.Any])
    
    inline def setInputFieldsVarargs(value: InputField*): Self = StObject.set(x, "inputFields", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setState(value: expanded | collapsed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setVisibilityExpression(value: String): Self = StObject.set(x, "visibilityExpression", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
