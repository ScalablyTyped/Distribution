package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTableViewModelProperties extends js.Object {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#attachmentsEnabled)
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of individual configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#fieldConfigs)
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.native
  
  /**
    * A collection of fields to remain hidden within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#hiddenFields)
    */
  var hiddenFields: js.UndefOr[CollectionProperties[String]] = js.native
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
}
object FeatureTableViewModelProperties {
  
  @scala.inline
  def apply(): FeatureTableViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableViewModelProperties]
  }
  
  @scala.inline
  implicit class FeatureTableViewModelPropertiesOps[Self <: FeatureTableViewModelProperties] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsEnabled(value: Boolean): Self = this.set("attachmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentsEnabled: Self = this.set("attachmentsEnabled", js.undefined)
    
    @scala.inline
    def setEditingEnabled(value: Boolean): Self = this.set("editingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditingEnabled: Self = this.set("editingEnabled", js.undefined)
    
    @scala.inline
    def setFieldConfigsVarargs(value: FieldColumnConfigProperties*): Self = this.set("fieldConfigs", js.Array(value :_*))
    
    @scala.inline
    def setFieldConfigs(value: js.Array[FieldColumnConfigProperties]): Self = this.set("fieldConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldConfigs: Self = this.set("fieldConfigs", js.undefined)
    
    @scala.inline
    def setHiddenFieldsVarargs(value: String*): Self = this.set("hiddenFields", js.Array(value :_*))
    
    @scala.inline
    def setHiddenFields(value: CollectionProperties[String]): Self = this.set("hiddenFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenFields: Self = this.set("hiddenFields", js.undefined)
    
    @scala.inline
    def setHighlightOnRowSelectEnabled(value: Boolean): Self = this.set("highlightOnRowSelectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightOnRowSelectEnabled: Self = this.set("highlightOnRowSelectEnabled", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
