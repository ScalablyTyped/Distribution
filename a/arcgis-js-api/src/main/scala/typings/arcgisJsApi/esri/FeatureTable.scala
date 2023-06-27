package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`selection-change`
import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loaded
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTable
  extends StObject
     with Widget_ {
  
  /**
  		 * A read-only property indicating the type of filter used by the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#activeFilters)
  		 */
  val activeFilters: Collection[GeometryFilter | SelectionFilter] = js.native
  
  /**
  		 * Use this read-only property if needing to query features while retaining a column's sort order.
  		 *
  		 * @default []
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#activeSortOrders)
  		 */
  val activeSortOrders: js.Array[ColumnSortOrder] = js.native
  
  /**
  		 * Indicates whether to display the `Attachments` field in the table.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
  		 */
  var attachmentsEnabled: Boolean = js.native
  
  /**
  		 * Automatically refreshes the table when its associated layer has been updated.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#autoRefreshEnabled)
  		 */
  var autoRefreshEnabled: Boolean = js.native
  
  /**
  		 * This clears any highlighted features.
  		 *
  		 * @deprecated since version 4.25. Use {@link module:esri/core/Collection#removeAll highlightIds.removeAll()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearHighlights)
  		 */
  def clearHighlights(): scala.Unit = js.native
  
  /**
  		 * Clears the current selection within the table.
  		 *
  		 * @deprecated since version 4.25. Use {@link module:esri/core/Collection#removeAll highlightIds.removeAll()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearSelection)
  		 */
  def clearSelection(): scala.Unit = js.native
  
  /**
  		 * Clears the current selection filter within the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearSelectionFilter)
  		 */
  def clearSelectionFilter(): scala.Unit = js.native
  
  /**
  		 * When `true`, columns can be reordered by dragging a column's header.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
  		 */
  var columnReorderingEnabled: Boolean = js.native
  
  /**
  		 * A read-only collection of [field columns](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html) and/or [grouped field columns](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-Grid-GroupColumn.html) within the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columns)
  		 */
  val columns: Collection[FieldColumn | GroupColumn] = js.native
  
  /**
  		 * Deletes all the selected rows from the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#deleteSelection)
  		 */
  def deleteSelection(): js.Promise[scala.Unit] = js.native
  def deleteSelection(showWarningPrompt: Boolean): js.Promise[scala.Unit] = js.native
  
  def deselectRows(params: js.Array[Double | Graphic]): scala.Unit = js.native
  /**
  		 * Unselects the specified rows within the table.
  		 *
  		 * @deprecated since 4.25. Use {@link module:esri/widgets/FeatureTable#highlightIds highlightIds.remove()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#deselectRows)
  		 */
  def deselectRows(params: Double): scala.Unit = js.native
  def deselectRows(params: Graphic): scala.Unit = js.native
  
  /**
  		 * Indicates whether editing is enabled on the data within the feature table.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
  		 */
  var editingEnabled: Boolean = js.native
  
  /**
  		 * An array of individual field configuration objects.
  		 *
  		 * @default All fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID`
  		 * @deprecated since version 4.24. Use {@link module:esri/widgets/FeatureTable/support/FieldColumnTemplate} via the FeatureTable's {@link module:esri/widgets/FeatureTable/support/TableTemplate tableTemplate}.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
  		 */
  var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  
  /**
  		 * Filters the table by the current selection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#filterBySelection)
  		 */
  def filterBySelection(): scala.Unit = js.native
  
  /**
  		 * Set this property to filter the features displayed in the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#filterGeometry)
  		 */
  var filterGeometry: Geometry_ = js.native
  
  /**
  		 * Finds the specified column within the feature table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#findColumn)
  		 */
  def findColumn(fieldName: String): Column | GroupColumn = js.native
  
  /**
  		 * A collection of string [field.names](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) that are to remain hidden within the table.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#hiddenFields)
  		 */
  var hiddenFields: Collection[String] = js.native
  
  /**
  		 * Hides the specified column from the feature table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#hideColumn)
  		 */
  def hideColumn(fieldName: String): scala.Unit = js.native
  
  /**
  		 * Indicates whether to highlight the associated feature when a row is selected.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightEnabled)
  		 */
  var highlightEnabled: Boolean = js.native
  
  /**
  		 * This property accepts and returns a collection of feature ObjectId's.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightIds)
  		 */
  var highlightIds: Collection[Double] = js.native
  
  /**
  		 * Indicates whether to highlight the associated feature when a row is selected.
  		 *
  		 * @default true
  		 * @deprecated since version 4.25. Use {@link module:esri/widgets/FeatureTable#highlightEnabled highlightEnabled} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
  		 */
  var highlightOnRowSelectEnabled: Boolean = js.native
  
  /**
  		 * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html), or [WFSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WFSLayer.html) containing the fields and attributes to display within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
  		 */
  var layer: FeatureLayer | SceneLayer | GeoJSONLayer | CSVLayer | WFSLayer | ImageryLayer = js.native
  
  /**
  		 * Reference to the FeatureTable's menu.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menu)
  		 */
  val menu: ButtonMenu = js.native
  
  /**
  		 * Set this object to customize the feature table's menu content.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
  		 */
  var menuConfig: ButtonMenuConfig = js.native
  
  /**
  		 * Indicates whether sorting multiple columns is supported within the table.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#multiSortEnabled)
  		 */
  var multiSortEnabled: Boolean = js.native
  
  @JSName("on")
  def on_selectionchange(name: `selection-change`, eventHandler: FeatureTableSelectionChangeEventHandler): IHandle = js.native
  
  /**
  		 * The default page size used when displaying features within the table.
  		 *
  		 * @default 50
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#pageSize)
  		 */
  var pageSize: Double = js.native
  
  /**
  		 * Refreshes the table contents while maintaining the current scroll position.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#refresh)
  		 */
  def refresh(): js.Promise[scala.Unit] = js.native
  
  /**
  		 * Indicates whether to fetch geometries for the corresponding features displayed in the table.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#returnGeometryEnabled)
  		 */
  var returnGeometryEnabled: Boolean = js.native
  
  /**
  		 * Scrolls the table to a row based on a specified index.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#scrollToIndex)
  		 */
  def scrollToIndex(index: Double): scala.Unit = js.native
  
  def selectRows(params: js.Array[Double | Graphic]): scala.Unit = js.native
  /**
  		 * Selects the specified rows within the table.
  		 *
  		 * @deprecated since 4.25. Use {@link module:esri/widgets/FeatureTable#highlightIds highlightIds.add()} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#selectRows)
  		 */
  def selectRows(params: Double): scala.Unit = js.native
  def selectRows(params: Graphic): scala.Unit = js.native
  
  /**
  		 * Shows all of the columns in the table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#showAllColumns)
  		 */
  def showAllColumns(): scala.Unit = js.native
  
  /**
  		 * Shows the specified column within the feature table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#showColumn)
  		 */
  def showColumn(fieldName: String): scala.Unit = js.native
  
  /**
  		 * Sorts the column in either ascending ("asc") or descending ("desc") order.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#sortColumn)
  		 */
  def sortColumn(path: String, direction: asc_ | desc_): scala.Unit = js.native
  
  /**
  		 * The state of the widget.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#state)
  		 */
  val state: disabled | loading | loaded | ready = js.native
  
  /**
  		 * The associated [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-TableTemplate.html) used for the feature table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#tableTemplate)
  		 */
  var tableTemplate: TableTemplate = js.native
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
  		 */
  var view: MapView | SceneView = js.native
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
  		 */
  var viewModel: FeatureTableViewModel = js.native
  
  /**
  		 * The visible elements that are displayed within the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
  		 */
  var visibleElements: FeatureTableVisibleElements = js.native
  
  /**
  		 * Zooms the view to the extent of the current row selection.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#zoomToSelection)
  		 */
  def zoomToSelection(): scala.Unit = js.native
}
