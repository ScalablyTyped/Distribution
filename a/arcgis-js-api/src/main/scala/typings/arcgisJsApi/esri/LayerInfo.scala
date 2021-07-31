package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerInfo
  extends StObject
     with Object {
  
  /**
    * Indicates whether to enable `Add feature` functionality.
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
    * The configuration options for displaying an array of fields within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfig]] = js.undefined
  
  /**
    * The associated feature layer containing the editable fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var layer: FeatureLayer
  
  /**
    * Indicates whether to enable `Update feature` functionality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var updateEnabled: js.UndefOr[Boolean] = js.undefined
}
object LayerInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LayerInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LayerInfo]
  }
  
  @scala.inline
  implicit class LayerInfoMutableBuilder[Self <: LayerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEnabled(value: Boolean): Self = StObject.set(x, "addEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEnabledUndefined: Self = StObject.set(x, "addEnabled", js.undefined)
    
    @scala.inline
    def setAllowAttachments(value: Boolean): Self = StObject.set(x, "allowAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAttachmentsUndefined: Self = StObject.set(x, "allowAttachments", js.undefined)
    
    @scala.inline
    def setDeleteEnabled(value: Boolean): Self = StObject.set(x, "deleteEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteEnabledUndefined: Self = StObject.set(x, "deleteEnabled", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setFieldConfig(value: js.Array[FieldConfig]): Self = StObject.set(x, "fieldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldConfigUndefined: Self = StObject.set(x, "fieldConfig", js.undefined)
    
    @scala.inline
    def setFieldConfigVarargs(value: FieldConfig*): Self = StObject.set(x, "fieldConfig", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: FeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEnabled(value: Boolean): Self = StObject.set(x, "updateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateEnabledUndefined: Self = StObject.set(x, "updateEnabled", js.undefined)
  }
}
