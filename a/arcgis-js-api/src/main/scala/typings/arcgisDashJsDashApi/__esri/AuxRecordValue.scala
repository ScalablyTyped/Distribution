package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecordValue extends Object {
  /**
    * The alias for the field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var alias: String
  /**
    * Indicates whether the extended property value can be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var canUpdate: Boolean
  /**
    * The data contained in the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var data: js.Any
  /**
    * The type of data expected in the field.  **Possible Values:** small-integer | integer | single | double | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var dataType: String
  /**
    * The order each field is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var displayOrder: Double
  /**
    * The type of extended property item.  **Possible Values:** default | text | date | domain | file | geo-file | folder | list | table-list | multi-level-table-list
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var displayType: String
  /**
    * The domain value configured for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var domain: String
  /**
    * The filter to restrict the types of records supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var filter: String
  /**
    * The length of the property string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var length: Double
  /**
    * The name property associated with the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var name: String
  /**
    * Indicates whether the property is a required or optional field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var required: Boolean
  /**
    * The lookup table that contains the list of values which will be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var tableListClass: String
  /**
    * The field that will be displayed for the extended property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var tableListDisplayField: String
  /**
    * The field that contains the value that gets stored as the extended property value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var tableListStoreField: String
  /**
    * Indicates whether the value will be visible to the user or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var userVisible: Boolean
}

object AuxRecordValue {
  @scala.inline
  def apply(
    alias: String,
    canUpdate: Boolean,
    constructor: js.Function,
    data: js.Any,
    dataType: String,
    displayOrder: Double,
    displayType: String,
    domain: String,
    filter: String,
    hasOwnProperty: PropertyKey => Boolean,
    length: Double,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    required: Boolean,
    tableListClass: String,
    tableListDisplayField: String,
    tableListStoreField: String,
    userVisible: Boolean
  ): AuxRecordValue = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], displayOrder = displayOrder.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), required = required.asInstanceOf[js.Any], tableListClass = tableListClass.asInstanceOf[js.Any], tableListDisplayField = tableListDisplayField.asInstanceOf[js.Any], tableListStoreField = tableListStoreField.asInstanceOf[js.Any], userVisible = userVisible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuxRecordValue]
  }
}

