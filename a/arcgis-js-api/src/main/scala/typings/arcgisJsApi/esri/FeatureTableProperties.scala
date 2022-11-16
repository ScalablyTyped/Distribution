package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CSVLayerPropertiestypecsv
import typings.arcgisJsApi.anon.FeatureLayerPropertiestyp
import typings.arcgisJsApi.anon.GeoJSONLayerPropertiestyp
import typings.arcgisJsApi.anon.ImageryLayerPropertiestyp
import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneLayerPropertiestypes
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.anon.WFSLayerPropertiestypewfs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Automatically refreshes the table when its associated layer has been updated.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#autoRefreshEnabled)
    */
  var autoRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, columns can be reordered by dragging a column's header.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
    */
  var columnReorderingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of individual field configuration objects.
    *
    * @default All fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID`
    * @deprecated since version 4.24. Use {@link module:esri/widgets/FeatureTable/support/FieldColumnTemplate} via the FeatureTable's {@link module:esri/widgets/FeatureTable/support/TableTemplate tableTemplate}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.undefined
  
  /**
    * Set this property to filter the features displayed in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#filterGeometry)
    */
  var filterGeometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
    * A collection of string [field.names](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) that are to remain hidden within the table.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#hiddenFields)
    */
  var hiddenFields: js.UndefOr[CollectionProperties[String]] = js.undefined
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightEnabled)
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property accepts and returns a collection of feature ObjectId's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightIds)
    */
  var highlightIds: js.UndefOr[CollectionProperties[Double]] = js.undefined
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * @default true
    * @deprecated since version 4.25. Use {@link module:esri/widgets/FeatureTable#highlightEnabled highlightEnabled} instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), or [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: js.UndefOr[
    FeatureLayerPropertiestyp | SceneLayerPropertiestypes | GeoJSONLayerPropertiestyp | CSVLayerPropertiestypecsv | WFSLayerPropertiestypewfs | ImageryLayerPropertiestyp
  ] = js.undefined
  
  /**
    * Set this object to customize the feature table's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.undefined
  
  /**
    * Indicates whether sorting multiple columns is supported within the table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#multiSortEnabled)
    */
  var multiSortEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The default page size used when displaying features within the table.
    *
    * @default 50
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#pageSize)
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html) used for the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#tableTemplate)
    */
  var tableTemplate: js.UndefOr[TableTemplateProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
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
  
  inline def apply(): FeatureTableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableProperties]
  }
  
  extension [Self <: FeatureTableProperties](x: Self) {
    
    inline def setAttachmentsEnabled(value: Boolean): Self = StObject.set(x, "attachmentsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsEnabledUndefined: Self = StObject.set(x, "attachmentsEnabled", js.undefined)
    
    inline def setAutoRefreshEnabled(value: Boolean): Self = StObject.set(x, "autoRefreshEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshEnabledUndefined: Self = StObject.set(x, "autoRefreshEnabled", js.undefined)
    
    inline def setColumnReorderingEnabled(value: Boolean): Self = StObject.set(x, "columnReorderingEnabled", value.asInstanceOf[js.Any])
    
    inline def setColumnReorderingEnabledUndefined: Self = StObject.set(x, "columnReorderingEnabled", js.undefined)
    
    inline def setEditingEnabled(value: Boolean): Self = StObject.set(x, "editingEnabled", value.asInstanceOf[js.Any])
    
    inline def setEditingEnabledUndefined: Self = StObject.set(x, "editingEnabled", js.undefined)
    
    inline def setFieldConfigs(value: js.Array[FieldColumnConfigProperties]): Self = StObject.set(x, "fieldConfigs", value.asInstanceOf[js.Any])
    
    inline def setFieldConfigsUndefined: Self = StObject.set(x, "fieldConfigs", js.undefined)
    
    inline def setFieldConfigsVarargs(value: FieldColumnConfigProperties*): Self = StObject.set(x, "fieldConfigs", js.Array(value*))
    
    inline def setFilterGeometry(value: GeometryProperties): Self = StObject.set(x, "filterGeometry", value.asInstanceOf[js.Any])
    
    inline def setFilterGeometryUndefined: Self = StObject.set(x, "filterGeometry", js.undefined)
    
    inline def setHiddenFields(value: CollectionProperties[String]): Self = StObject.set(x, "hiddenFields", value.asInstanceOf[js.Any])
    
    inline def setHiddenFieldsUndefined: Self = StObject.set(x, "hiddenFields", js.undefined)
    
    inline def setHiddenFieldsVarargs(value: String*): Self = StObject.set(x, "hiddenFields", js.Array(value*))
    
    inline def setHighlightEnabled(value: Boolean): Self = StObject.set(x, "highlightEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightEnabledUndefined: Self = StObject.set(x, "highlightEnabled", js.undefined)
    
    inline def setHighlightIds(value: CollectionProperties[Double]): Self = StObject.set(x, "highlightIds", value.asInstanceOf[js.Any])
    
    inline def setHighlightIdsUndefined: Self = StObject.set(x, "highlightIds", js.undefined)
    
    inline def setHighlightIdsVarargs(value: Double*): Self = StObject.set(x, "highlightIds", js.Array(value*))
    
    inline def setHighlightOnRowSelectEnabled(value: Boolean): Self = StObject.set(x, "highlightOnRowSelectEnabled", value.asInstanceOf[js.Any])
    
    inline def setHighlightOnRowSelectEnabledUndefined: Self = StObject.set(x, "highlightOnRowSelectEnabled", js.undefined)
    
    inline def setLayer(
      value: FeatureLayerPropertiestyp | SceneLayerPropertiestypes | GeoJSONLayerPropertiestyp | CSVLayerPropertiestypecsv | WFSLayerPropertiestypewfs | ImageryLayerPropertiestyp
    ): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setMenuConfig(value: ButtonMenuConfig): Self = StObject.set(x, "menuConfig", value.asInstanceOf[js.Any])
    
    inline def setMenuConfigUndefined: Self = StObject.set(x, "menuConfig", js.undefined)
    
    inline def setMultiSortEnabled(value: Boolean): Self = StObject.set(x, "multiSortEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiSortEnabledUndefined: Self = StObject.set(x, "multiSortEnabled", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setTableTemplate(value: TableTemplateProperties): Self = StObject.set(x, "tableTemplate", value.asInstanceOf[js.Any])
    
    inline def setTableTemplateUndefined: Self = StObject.set(x, "tableTemplate", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: FeatureTableViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: FeatureTableVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
