package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`selection-change`
import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTable extends Widget_ {
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachmentenabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    *
    * @default false
    */
  var attachmentsEnabled: Boolean = js.native
  /**
    * When 'true', columns can be reordered by dragging a column's header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
    *
    * @default true
    */
  var columnReorderingEnabled: Boolean = js.native
  /**
    * A collection of [columns](module-esri-widgets-FeatureTable-Grid-Column.html) within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columns)
    */
  var columns: Collection[FieldColumn] = js.native
  /**
    * Indicates whether editing is enabled on the data within the feature table. Double-clicking in a cell will enable editing for that value.  Editing permissions can be broken down with the following levels of priority:  1. [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) - This is derived from the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). It takes what is set in the [Field.editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable) property. This must always be `true` for editing to be enabled. This can be overriden using a [field column configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 2. [Config](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html) - The editable permissions on a field can be configured by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property of the [FieldColumnConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 3. [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) - The [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled) property must be set on the table in order for any type of editing to be enabled.  For example, if table editing is disabled in the widget, i.e. `enableEditing` is not set, it is still possible to enable editing for a specific column by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property. Vice versa is also true, if table editing is enabled, a field configuration can be used to disable editing for a specific column.
    * > Ultimately, if the service's field is not editable, it is not possible to override its permissions using one of the options above.
    * ![featuretable editing](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/editing.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: Boolean = js.native
  /**
    * An array of individual field configuration objects. This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    *
    * @default null
    */
  var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
    *
    * @default true
    */
  var highlightOnRowSelectEnabled: Boolean = js.native
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * Set this object to customize the feature table's menu content.  ![default and custom feature table menus](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/combined-menu-items.jpg)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
    */
  var menuConfig: ButtonMenuConfig = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This property must be set for the select/highlight in the map to work.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTableViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: FeatureTableViewModel = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#visibleElements)
    */
  var visibleElements: FeatureTableVisibleElements = js.native
  /**
    * This clears any highlighted features. Take note that the associated rows are not deselected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearHighlights)
    *
    *
    */
  def clearHighlights(): Unit = js.native
  /**
    * Clears the current selection within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#clearSelection)
    *
    *
    */
  def clearSelection(): Unit = js.native
  def deselectRows(params: js.Array[Double | Graphic]): Unit = js.native
  /**
    * Unselects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#deselectRows)
    *
    * @param params The selection parameters to deselect within the feature table.
    *
    */
  def deselectRows(params: Double): Unit = js.native
  def deselectRows(params: Graphic): Unit = js.native
  /**
    * Finds the specified column within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#findColumn)
    *
    * @param fieldName The `fieldName` of the column to find.
    *
    */
  def findColumn(fieldName: String): Unit = js.native
  /**
    * Hides the specified column from the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#hideColumn)
    *
    * @param fieldName The `fieldName` of the column to hide.
    *
    */
  def hideColumn(fieldName: String): Unit = js.native
  @JSName("on")
  def on_selectionchange(name: `selection-change`, eventHandler: FeatureTableSelectionChangeEventHandler): IHandle = js.native
  /**
    * Refreshes the table contents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#refresh)
    *
    *
    */
  def refresh(): Unit = js.native
  def selectRows(params: js.Array[Double | Graphic]): Unit = js.native
  /**
    * Selects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#selectRows)
    *
    * @param params The selection parameters to select within the feature table.
    *
    */
  def selectRows(params: Double): Unit = js.native
  def selectRows(params: Graphic): Unit = js.native
  /**
    * Shows all the columns in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#showAllColumns)
    *
    *
    */
  def showAllColumns(): Unit = js.native
  /**
    * Shows the specified column within the feature table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#showColumn)
    *
    * @param fieldName The `fieldName` of the column to show.
    *
    */
  def showColumn(fieldName: String): Unit = js.native
  /**
    * Sorts the column.
    *   * **Possible Values**
    *
    *
    *
    * Value | Description |
    * ----- | ----------- |
    * asc | Sorts the column in ascending order.
    * desc | Sorts the column in descending order.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#sortColumn)
    *
    * @param path The specified field name to sort.
    * @param direction The direction to sort.
    *
    */
  @JSName("sortColumn")
  def sortColumn_asc(path: String, direction: asc_): Unit = js.native
  @JSName("sortColumn")
  def sortColumn_desc(path: String, direction: desc_): Unit = js.native
}

