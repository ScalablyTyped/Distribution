package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When 'true', columns can be reordered by dragging a column's header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
    */
  var columnReorderingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A collection of [columns](module-esri-widgets-FeatureTable-Grid-Column.html) within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columns)
    */
  var columns: js.UndefOr[CollectionProperties[FieldColumnProperties]] = js.undefined
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of individual field configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.undefined
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.undefined
  
  /**
    * Set this object to customize the feature table's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTableViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
    */
  var visibleElements: js.UndefOr[FeatureTableVisibleElements] = js.undefined
}
object FeatureTableProperties {
  
  @scala.inline
  def apply(): FeatureTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableProperties]
  }
  
  @scala.inline
  implicit class FeatureTablePropertiesMutableBuilder[Self <: FeatureTableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentsEnabled(value: Boolean): Self = StObject.set(x, "attachmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsEnabledUndefined: Self = StObject.set(x, "attachmentsEnabled", js.undefined)
    
    @scala.inline
    def setColumnReorderingEnabled(value: Boolean): Self = StObject.set(x, "columnReorderingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnReorderingEnabledUndefined: Self = StObject.set(x, "columnReorderingEnabled", js.undefined)
    
    @scala.inline
    def setColumns(value: CollectionProperties[FieldColumnProperties]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: FieldColumnProperties*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    @scala.inline
    def setFieldConfigs(value: js.Array[FieldColumnConfigProperties]): Self = StObject.set(x, "fieldConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldConfigsUndefined: Self = StObject.set(x, "fieldConfigs", js.undefined)
    
    @scala.inline
    def setFieldConfigsVarargs(value: FieldColumnConfigProperties*): Self = StObject.set(x, "fieldConfigs", js.Array(value :_*))
    
    @scala.inline
    def setHighlightOnRowSelectEnabled(value: Boolean): Self = StObject.set(x, "highlightOnRowSelectEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightOnRowSelectEnabledUndefined: Self = StObject.set(x, "highlightOnRowSelectEnabled", js.undefined)
    
    @scala.inline
    def setLayer(value: FeatureLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setMenuConfig(value: ButtonMenuConfig): Self = StObject.set(x, "menuConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuConfigUndefined: Self = StObject.set(x, "menuConfig", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: FeatureTableViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: FeatureTableVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
