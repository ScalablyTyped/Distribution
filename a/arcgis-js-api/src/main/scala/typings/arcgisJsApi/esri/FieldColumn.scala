package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldColumn extends Column {
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#alias)
    */
  val alias: String = js.native
  /**
    * The field configuration for the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#config)
    */
  var config: FieldColumnConfig = js.native
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#defaultValue)
    */
  val defaultValue: Double | String | js.Any = js.native
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#description)
    */
  val description: String = js.native
  /**
    * Controls the sort order of the column. This property will only be honored on one column in the FeatureTable widget. If direction is specified on more than one column in the same FeatureTable, it will only be honored on the column with the highest index.
    *
    * Possible Value | Description
    * ---------------|------------
    * asc | Sorts the column in ascending order.
    * desc | Sorts the column in descending order.
    * null | No sort is applied to the column.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#direction)
    */
  var direction: asc_ | desc_ | js.Any = js.native
  /**
    * Indicates whether the field is editable. Editing permissions can be broken down with the following levels of priority:  1. [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) - This is derived from the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). It takes what is set in the [Field.editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable) property. This must always be `true` for editing to be enabled. This can be overriden using a [field column configuration](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 2. [Config](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html) - The editable permissions on a field can be configured by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property of the [FieldColumnConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html). 3. [FeatureTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html) - The [editingEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#editingEnabled) property must be set on the table in order for any type of editing to be enabled.  For example, if table editing is disabled in the widget, i.e. `enableEditing` is not set, it is still possible to enable editing for a specific column by setting the [editable](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#editable) property. Vice versa is also true, if table editing is enabled, a field configuration can be used to disable editing for a specific column.
    * > Ultimately, if the service's field is not editable, it is not possible to override its permissions using one of the options above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#editable)
    */
  val editable: Boolean = js.native
  /**
    * The [Field](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html) associated with this column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#field)
    */
  var field: Field = js.native
  /**
    * If applicable, the associated [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) tied to the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#layer)
    */
  var layer: FeatureLayer = js.native
  /**
    * Restricts the input length for the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#maxLength)
    */
  val maxLength: Double = js.native
  /**
    * The [Object](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#ButtonMenuConfig) used to customize the column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#menuConfig)
    */
  val menuConfig: ButtonMenuConfig = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#name)
    */
  val name: String = js.native
  /**
    * Indicates if the field can accept `null` values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#nullable)
    */
  val nullable: Boolean = js.native
  /**
    * Indicates whether the field is required.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#required)
    */
  val required: Boolean = js.native
  /**
    * Indicates whether the field is sortable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumn.html#sortable)
    */
  val sortable: Boolean = js.native
}

object FieldColumn {
  @scala.inline
  def apply(
    alias: String,
    config: FieldColumnConfig,
    defaultValue: Double | String | js.Any,
    description: String,
    direction: asc_ | desc_ | js.Any,
    editable: Boolean,
    field: Field,
    getMenuItems: () => ButtonMenuItemConfig,
    layer: FeatureLayer,
    maxLength: Double,
    menu: ButtonMenu,
    menuConfig: ButtonMenuConfig,
    name: String,
    nullable: Boolean,
    required: Boolean,
    resizable: Boolean,
    sortable: Boolean
  ): FieldColumn = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], getMenuItems = js.Any.fromFunction0(getMenuItems), layer = layer.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], menuConfig = menuConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], resizable = resizable.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldColumn]
  }
  @scala.inline
  implicit class FieldColumnOps[Self <: FieldColumn] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: FieldColumnConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: Double | String | js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: asc_ | desc_ | js.Any): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: Field): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: FeatureLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuConfig(value: ButtonMenuConfig): Self = this.set("menuConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNullable(value: Boolean): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
  }
  
}

