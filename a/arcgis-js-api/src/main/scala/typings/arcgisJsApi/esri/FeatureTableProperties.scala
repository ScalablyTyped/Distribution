package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTableProperties extends WidgetProperties {
  /**
    * Indicates whether to display the `Attachments` field in the table. This is only applicable if the feature layer supports attachments. Currently, this field only displays the count of attachments per feature.  ![featuretable attachmentenabled](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/attachments-enabled.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#attachmentsEnabled)
    *
    * @default false
    */
  var attachmentsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * When 'true', columns can be reordered by dragging a column's header.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columnReorderingEnabled)
    *
    * @default true
    */
  var columnReorderingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A collection of [columns](module-esri-widgets-FeatureTable-Grid-Column.html) within the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#columns)
    */
  var columns: js.UndefOr[CollectionProperties[FieldColumn]] = js.native
  /**
    * Indicates whether editing is enabled on the data within the feature table. Double-clicking in a cell will enable editing for that value.  Editing permissions can be broken down with the following levels of priority:  1. [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) - This is derived from the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). It takes what is set in the [Field.editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable) property. This must always be `true` for editing to be enabled. This can be overriden using a [field column configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 2. [Config](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html) - The editable permissions on a field can be configured by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property of the [FieldColumnConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 3. [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) - The [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled) property must be set on the table in order for any type of editing to be enabled.  For example, if table editing is disabled in the widget, i.e. `enableEditing` is not set, it is still possible to enable editing for a specific column by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property. Vice versa is also true, if table editing is enabled, a field configuration can be used to disable editing for a specific column.
    * > Ultimately, if the service's field is not editable, it is not possible to override its permissions using one of the options above.
    * ![featuretable editing](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/editing.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled)
    *
    * @default false
    */
  var editingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * An array of individual field configuration objects. This is where you can specify what fields to display and how you wish to display them.  When not set, all fields except for `CreationDate`, `Creator`, `EditDate`, `Editor`, and `GlobalID` will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#fieldConfigs)
    *
    * @default null
    */
  var fieldConfigs: js.UndefOr[js.Array[FieldColumnConfigProperties]] = js.native
  /**
    * Indicates whether to highlight the associated feature when a row is selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#highlightOnRowSelectEnabled)
    *
    * @default true
    */
  var highlightOnRowSelectEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) containing the fields and attributes to display within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#layer)
    */
  var layer: js.UndefOr[FeatureLayerProperties] = js.native
  /**
    * Set this object to customize the feature table's menu content.  ![default and custom feature table menus](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featuretable/combined-menu-items.jpg)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). This property must be set for the select/highlight in the map to work.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [FeatureTableViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FeatureTableViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#viewModel)
    */
  var viewModel: js.UndefOr[FeatureTableViewModel] = js.native
  /**
    * The visible elements that are displayed within the widget. This property provides the ability to turn individual elements of the widget's display on/off.
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
    def setColumnsVarargs(value: FieldColumn*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: CollectionProperties[FieldColumn]): Self = this.set("columns", value.asInstanceOf[js.Any])
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
    def setViewModel(value: FeatureTableViewModel): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    @scala.inline
    def setVisibleElements(value: FeatureTableVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
  
}

