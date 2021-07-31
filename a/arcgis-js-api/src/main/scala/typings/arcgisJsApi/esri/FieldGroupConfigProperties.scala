package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldGroupConfigProperties extends StObject {
  
  /**
    * The field's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The field configurations belonging to a group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties]] = js.undefined
  
  var initialState: js.UndefOr[expanded | collapsed] = js.undefined
  
  /**
    * The field's label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#visibilityExpression)
    */
  var visibilityExpression: js.UndefOr[String] = js.undefined
}
object FieldGroupConfigProperties {
  
  @scala.inline
  def apply(): FieldGroupConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldGroupConfigProperties]
  }
  
  @scala.inline
  implicit class FieldGroupConfigPropertiesMutableBuilder[Self <: FieldGroupConfigProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFieldConfig(value: js.Array[FieldConfigProperties]): Self = StObject.set(x, "fieldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldConfigUndefined: Self = StObject.set(x, "fieldConfig", js.undefined)
    
    @scala.inline
    def setFieldConfigVarargs(value: FieldConfigProperties*): Self = StObject.set(x, "fieldConfig", js.Array(value :_*))
    
    @scala.inline
    def setInitialState(value: expanded | collapsed): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStateUndefined: Self = StObject.set(x, "initialState", js.undefined)
    
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
