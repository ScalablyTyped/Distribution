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

trait FeatureTableViewModelProperties extends StObject {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#attachmentsEnabled)
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to refresh the table when the layer is refreshed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#autoRefreshEnabled)
    */
  var autoRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#editingEnabled)
    */
  var editingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array of individual configuration objects.
    *
    * @default All fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID`
    * @deprecated since version 4.24. Use {@link module:esri/widgets/FeatureTable/support/FieldColumnTemplate} via the FeatureTable's {@link module:esri/widgets/FeatureTable/support/TableTemplate tableTemplate}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#fieldConfigs)
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.undefined
  
  /**
    * Set this property to filter the features displayed in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#filterGeometry)
    */
  var filterGeometry: js.UndefOr[GeometryProperties] = js.undefined
  
  /**
    * A collection of string [field.names](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) that are to remain hidden within the table.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#hiddenFields)
    */
  var hiddenFields: js.UndefOr[CollectionProperties[String]] = js.undefined
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightEnabled)
    */
  var highlightEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This property accepts and returns a collection of feature ObjectId's.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightIds)
    */
  var highlightIds: js.UndefOr[CollectionProperties[Double]] = js.undefined
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * @default true
    * @deprecated since version 4.25. Use {@link module:esri/widgets/FeatureTable/FeatureTableViewModel#highlightEnabled highlightEnabled} instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), or [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#layer)
    */
  var layer: js.UndefOr[
    FeatureLayerPropertiestyp | SceneLayerPropertiestypes | GeoJSONLayerPropertiestyp | CSVLayerPropertiestypecsv | WFSLayerPropertiestypewfs | ImageryLayerPropertiestyp
  ] = js.undefined
  
  /**
    * Indicates whether sorting multiple columns is supported within the table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#multiSortEnabled)
    */
  var multiSortEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html) used for the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#tableTemplate)
    */
  var tableTemplate: js.UndefOr[TableTemplateProperties] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object FeatureTableViewModelProperties {
  
  inline def apply(): FeatureTableViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTableViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureTableViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setAttachmentsEnabled(value: Boolean): Self = StObject.set(x, "attachmentsEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsEnabledUndefined: Self = StObject.set(x, "attachmentsEnabled", js.undefined)
    
    inline def setAutoRefreshEnabled(value: Boolean): Self = StObject.set(x, "autoRefreshEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshEnabledUndefined: Self = StObject.set(x, "autoRefreshEnabled", js.undefined)
    
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
    
    inline def setMultiSortEnabled(value: Boolean): Self = StObject.set(x, "multiSortEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiSortEnabledUndefined: Self = StObject.set(x, "multiSortEnabled", js.undefined)
    
    inline def setTableTemplate(value: TableTemplateProperties): Self = StObject.set(x, "tableTemplate", value.asInstanceOf[js.Any])
    
    inline def setTableTemplateUndefined: Self = StObject.set(x, "tableTemplate", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
