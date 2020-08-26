package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.loading
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTableViewModel extends js.Object {
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachments enabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#attachmentsEnabled)
    *
    * @default false
    */
  var attachmentsEnabled: Boolean = js.native
  /**
    * Indicates whether editing is enabled on the data within the feature table. Double-clicking in a cell will enable editing for that value.  Editing permissions can be broken down with the following levels of priority:  1. [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) - This is derived from the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). It takes what is set in the [Field.editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable) property. This must always be `true` for editing to be enabled. This can be overriden using a [field column configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 2. [Config](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html) - The editable permissions on a field can be configured by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property of the [FieldColumnConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 3. [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) - The [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled) property must be set on the table in order for any type of editing to be enabled.  For example, if table editing is disabled in the widget, i.e. `enableEditing` is not set, it is still possible to enable editing for a specific column by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property. Vice versa is also true, if table editing is enabled, a field configuration can be used to disable editing for a specific column.
    * > Ultimately, if the service's field is not editable, it is not possible to override its permissions using one of the options above.
    * ![featuretable editing](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/editing.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: Boolean = js.native
  /**
    * An array of individual configuration objects.  This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#fieldConfigs)
    */
  var fieldConfigs: js.Array[FieldColumnConfig] = js.native
  /**
    * A collection of fields to remain hidden within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#hiddenFields)
    */
  var hiddenFields: Collection[String] = js.native
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#highlightOnRowSelectEnabled)
    *
    * @default true
    */
  var highlightOnRowSelectEnabled: Boolean = js.native
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | loading | ready = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This property must be set for the select/highlight in the map to work.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * This clears any highlighted features. Take note that the associated rows are not deselected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#clearHighlights)
    *
    *
    */
  def clearHighlights(): Unit = js.native
  /**
    * Clears the current selection within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#clearSelection)
    *
    *
    */
  def clearSelection(): Unit = js.native
  def deselectRows(params: js.Array[Double | Graphic]): Unit = js.native
  /**
    * Unselects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#deselectRows)
    *
    * @param params The selection parameters to deselect within the feature table.
    *
    */
  def deselectRows(params: Double): Unit = js.native
  def deselectRows(params: Graphic): Unit = js.native
  /**
    * Returns current row index for the associated feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#getObjectIdIndex)
    *
    * @param objectId The `ObjectId` field of the specified row (feature).
    *
    */
  def getObjectIdIndex(objectId: Double): Double = js.native
  /**
    * Refreshes the table contents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#refresh)
    *
    *
    */
  def refresh(): Unit = js.native
  def selectRows(params: js.Array[Double | Graphic]): Unit = js.native
  /**
    * Selects the specified rows within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html#selectRows)
    *
    * @param params The selection parameters to select within the feature table.
    *
    */
  def selectRows(params: Double): Unit = js.native
  def selectRows(params: Graphic): Unit = js.native
}

