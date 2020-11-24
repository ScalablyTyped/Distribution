package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`selection-change`
import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureTable extends Widget_ {
  
  /**
    * Indicates whether to display the `Attachments` field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    */
  var attachmentsEnabled: Boolean = js.native
  
  /**
    * This clears any highlighted features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearHighlights)
    */
  def clearHighlights(): Unit = js.native
  
  /**
    * Clears the current selection within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearSelection)
    */
  def clearSelection(): Unit = js.native
  
  /**
    * When 'true', columns can be reordered by dragging a column's header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
    */
  var columnReorderingEnabled: Boolean = js.native
  
  /**
    * A collection of [columns](module-esri-widgets-FeatureTable-Grid-Column.html) within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columns)
    */
  var columns: Collection[FieldColumn] = js.native
  
  def deselectRows(params: js.Array[Double | Graphic]): Unit = js.native
  /**
    * Unselects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#deselectRows)
    */
  def deselectRows(params: Double): Unit = js.native
  def deselectRows(params: Graphic): Unit = js.native
  
  /**
    * Indicates whether editing is enabled on the data within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
    */
  var editingEnabled: Boolean = js.native
  
  /**
    * An array of individual field configuration objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    */
  var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  
  /**
    * Finds the specified column within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#findColumn)
    */
  def findColumn(fieldName: String): Unit = js.native
  
  /**
    * Hides the specified column from the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#hideColumn)
    */
  def hideColumn(fieldName: String): Unit = js.native
  
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
    */
  var highlightOnRowSelectEnabled: Boolean = js.native
  
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: FeatureLayer = js.native
  
  /**
    * Set this object to customize the feature table's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
    */
  var menuConfig: ButtonMenuConfig = js.native
  
  @JSName("on")
  def on_selectionchange(name: `selection-change`, eventHandler: FeatureTableSelectionChangeEventHandler): IHandle = js.native
  
  /**
    * Refreshes the table contents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#refresh)
    */
  def refresh(): Unit = js.native
  
  def selectRows(params: js.Array[Double | Graphic]): Unit = js.native
  /**
    * Selects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#selectRows)
    */
  def selectRows(params: Double): Unit = js.native
  def selectRows(params: Graphic): Unit = js.native
  
  /**
    * Shows all the columns in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#showAllColumns)
    */
  def showAllColumns(): Unit = js.native
  
  /**
    * Shows the specified column within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#showColumn)
    */
  def showColumn(fieldName: String): Unit = js.native
  
  /**
    * Sorts the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#sortColumn)
    */
  @JSName("sortColumn")
  def sortColumn_asc(path: String, direction: asc_): Unit = js.native
  @JSName("sortColumn")
  def sortColumn_desc(path: String, direction: desc_): Unit = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
    */
  var view: MapView = js.native
  
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
}
