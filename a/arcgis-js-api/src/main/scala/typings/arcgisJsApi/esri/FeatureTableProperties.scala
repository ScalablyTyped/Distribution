package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTableProperties extends WidgetProperties {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * When 'true', columns can be reordered by dragging a column's header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
    */
  var columnReorderingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A collection of [columns](module-esri-widgets-FeatureTable-Grid-Column.html) within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columns)
    */
  var columns: js.UndefOr[CollectionProperties[FieldColumnProperties]] = js.native
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An array of individual field configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.native
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
  
  /**
    * Set this object to customize the feature table's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTableViewModelProperties] = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTableVisibleElements] = js.native
}
object FeatureTableProperties {
  
  @scala.inline
  def apply(): FeatureTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableProperties]
  }
  
  @scala.inline
  implicit class FeatureTablePropertiesOps[Self <: FeatureTableProperties] (val x: Self) extends AnyVal {
    
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
    def setColumnReorderingEnabled(value: Boolean): Self = this.set("columnReorderingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnReorderingEnabled: Self = this.set("columnReorderingEnabled", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: FieldColumnProperties*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: CollectionProperties[FieldColumnProperties]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
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
    def setHighlightOnRowSelectEnabled(value: Boolean): Self = this.set("highlightOnRowSelectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightOnRowSelectEnabled: Self = this.set("highlightOnRowSelectEnabled", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setMenuConfig(value: ButtonMenuConfig): Self = this.set("menuConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuConfig: Self = this.set("menuConfig", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: FeatureTableViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: FeatureTableVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
}
