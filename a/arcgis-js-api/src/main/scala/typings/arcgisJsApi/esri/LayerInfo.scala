package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerInfo extends StObject {
  
  /**
    * Indicates whether to enable the ability to create new features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var addEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display the attachments widget in the Editor's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var allowAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to enable or disable attribute update from the feature's form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var attributeUpdatesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to enable the ability to delete features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var deleteEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to enable editing on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A template that defines the feature's form content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var formTemplate: js.UndefOr[FormTemplate] = js.undefined
  
  /**
    * Indicates whether to enable or disable geometry updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var geometryUpdatesEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The associated feature layer containing the editable fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var layer: FeatureLayer
  
  /**
    * Indicates whether to enable the ability to update existing features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var updateEnabled: js.UndefOr[Boolean] = js.undefined
}
object LayerInfo {
  
  inline def apply(layer: FeatureLayer): LayerInfo = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerInfo] (val x: Self) extends AnyVal {
    
    inline def setAddEnabled(value: Boolean): Self = StObject.set(x, "addEnabled", value.asInstanceOf[js.Any])
    
    inline def setAddEnabledUndefined: Self = StObject.set(x, "addEnabled", js.undefined)
    
    inline def setAllowAttachments(value: Boolean): Self = StObject.set(x, "allowAttachments", value.asInstanceOf[js.Any])
    
    inline def setAllowAttachmentsUndefined: Self = StObject.set(x, "allowAttachments", js.undefined)
    
    inline def setAttributeUpdatesEnabled(value: Boolean): Self = StObject.set(x, "attributeUpdatesEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesEnabledUndefined: Self = StObject.set(x, "attributeUpdatesEnabled", js.undefined)
    
    inline def setDeleteEnabled(value: Boolean): Self = StObject.set(x, "deleteEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeleteEnabledUndefined: Self = StObject.set(x, "deleteEnabled", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormTemplate(value: FormTemplate): Self = StObject.set(x, "formTemplate", value.asInstanceOf[js.Any])
    
    inline def setFormTemplateUndefined: Self = StObject.set(x, "formTemplate", js.undefined)
    
    inline def setGeometryUpdatesEnabled(value: Boolean): Self = StObject.set(x, "geometryUpdatesEnabled", value.asInstanceOf[js.Any])
    
    inline def setGeometryUpdatesEnabledUndefined: Self = StObject.set(x, "geometryUpdatesEnabled", js.undefined)
    
    inline def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnabled(value: Boolean): Self = StObject.set(x, "updateEnabled", value.asInstanceOf[js.Any])
    
    inline def setUpdateEnabledUndefined: Self = StObject.set(x, "updateEnabled", js.undefined)
  }
}
