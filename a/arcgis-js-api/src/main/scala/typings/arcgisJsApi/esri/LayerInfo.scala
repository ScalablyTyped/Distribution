package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerInfo extends Object {
  
  /**
    * Indicates whether to enable `Add feature` functionality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var addEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display the attachments widget in the Editor's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var allowAttachments: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to enable the ability to delete features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var deleteEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to enable editing on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The configuration options for displaying an array of fields within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfig]] = js.native
  
  /**
    * The associated feature layer containing the editable fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var layer: FeatureLayer = js.native
  
  /**
    * Indicates whether to enable `Update feature` functionality.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var updateEnabled: js.UndefOr[Boolean] = js.native
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
  implicit class LayerInfoOps[Self <: LayerInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLayer(value: FeatureLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEnabled(value: Boolean): Self = this.set("addEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddEnabled: Self = this.set("addEnabled", js.undefined)
    
    @scala.inline
    def setAllowAttachments(value: Boolean): Self = this.set("allowAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAttachments: Self = this.set("allowAttachments", js.undefined)
    
    @scala.inline
    def setDeleteEnabled(value: Boolean): Self = this.set("deleteEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteEnabled: Self = this.set("deleteEnabled", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setFieldConfigVarargs(value: FieldConfig*): Self = this.set("fieldConfig", js.Array(value :_*))
    
    @scala.inline
    def setFieldConfig(value: js.Array[FieldConfig]): Self = this.set("fieldConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldConfig: Self = this.set("fieldConfig", js.undefined)
    
    @scala.inline
    def setUpdateEnabled(value: Boolean): Self = this.set("updateEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateEnabled: Self = this.set("updateEnabled", js.undefined)
  }
}
