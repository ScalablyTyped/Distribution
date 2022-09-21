package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loaded
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTableViewModel
  extends StObject
     with Accessor {
  
  /**
    * A read-only property indicating the type of filter used by the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#activeFilters)
    */
  val activeFilters: Collection[GeometryFilter | SelectionFilter] = js.native
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#attachmentsEnabled)
    */
  var attachmentsEnabled: Boolean = js.native
  
  /**
    * Indicates whether to refresh the table when the layer is refreshed.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#autoRefreshEnabled)
    */
  var autoRefreshEnabled: Boolean = js.native
  
  /**
    * This clears any highlighted features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#clearHighlights)
    */
  def clearHighlights(): scala.Unit = js.native
  
  /**
    * Clears the current selection within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#clearSelection)
    */
  def clearSelection(): scala.Unit = js.native
  
  /**
    * Clears the current [filterBySelection](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#filterBySelection) so that the table displays all of the table rows.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#clearSelectionFilter)
    */
  def clearSelectionFilter(): scala.Unit = js.native
  
  def deselectRows(params: js.Array[Double | Graphic]): scala.Unit = js.native
  /**
    * Unselects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#deselectRows)
    */
  def deselectRows(params: Double): scala.Unit = js.native
  def deselectRows(params: Graphic): scala.Unit = js.native
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#editingEnabled)
    */
  var editingEnabled: Boolean = js.native
  
  /**
    * An array of individual configuration objects.
    *
    * @default All fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID`
    * @deprecated since version 4.24. Use {@link module:esri/widgets/FeatureTable/support/FieldColumnTemplate} via the FeatureTable's {@link module:esri/widgets/FeatureTable/support/TableTemplate tableTemplate}.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#fieldConfigs)
    */
  var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  
  /**
    * Filters the table using the current row selection and displays only those selected table rows.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#filterBySelection)
    */
  def filterBySelection(): scala.Unit = js.native
  
  /**
    * Set this property to filter the features displayed in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#filterGeometry)
    */
  var filterGeometry: Geometry_ = js.native
  
  /**
    * Returns the current row index for the associated feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#getObjectIdIndex)
    */
  def getObjectIdIndex(objectId: Double): Double = js.native
  
  /**
    * Returns a field value given the specified feature `ObjectId` and an associated `fieldName`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#getValue)
    */
  def getValue(objectId: Double, fieldName: String): String | Double | Any = js.native
  
  /**
    * A collection of string [field.names](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) that are to remain hidden within the table.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#hiddenFields)
    */
  var hiddenFields: Collection[String] = js.native
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: Boolean = js.native
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), or [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#layer)
    */
  var layer: FeatureLayer | SceneLayer | GeoJSONLayer | CSVLayer | WFSLayer | ImageryLayer = js.native
  
  /**
    * Indicates whether sorting multiple columns is supported within the table.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#multiSortEnabled)
    */
  var multiSortEnabled: Boolean = js.native
  
  /**
    * Refreshes the table contents while maintaining the current scroll position.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#refresh)
    */
  def refresh(): scala.Unit = js.native
  
  /**
    * Performs a full reset of the entire table resulting in the table scrolling to the top-most row.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#reset)
    */
  def reset(): scala.Unit = js.native
  
  /**
    * Scrolls the table to a row based on a specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#scrollToIndex)
    */
  def scrollToIndex(index: Double): scala.Unit = js.native
  
  def selectRows(params: js.Array[Double | Graphic]): scala.Unit = js.native
  /**
    * Selects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#selectRows)
    */
  def selectRows(params: Double): scala.Unit = js.native
  def selectRows(params: Graphic): scala.Unit = js.native
  
  /**
    * The view model's state.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#state)
    */
  val state: disabled | loading | loaded | ready = js.native
  
  /**
    * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html) used for the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#tableTemplate)
    */
  var tableTemplate: TableTemplate = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * Zooms the view to the extent of the current row selection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#zoomToSelection)
    */
  def zoomToSelection(): scala.Unit = js.native
}
