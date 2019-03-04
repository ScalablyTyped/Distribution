package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecordValue
  extends stdLib.Object {
  /**
    * The alias for the field in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var alias: java.lang.String
  /**
    * Indicates whether the extended property value can be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var canUpdate: scala.Boolean
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
  var dataType: java.lang.String
  /**
    * The order each field is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var displayOrder: scala.Double
  /**
    * The type of extended property item.  **Possible Values:** default | text | date | domain | file | geo-file | folder | list | table-list | multi-level-table-list
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var displayType: java.lang.String
  /**
    * The domain value configured for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var domain: java.lang.String
  /**
    * The filter to restrict the types of records supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var filter: java.lang.String
  /**
    * The length of the property string.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var length: scala.Double
  /**
    * The name property associated with the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var name: java.lang.String
  /**
    * Indicates whether the property is a required or optional field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var required: scala.Boolean
  /**
    * The lookup table that contains the list of values which will be selected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var tableListClass: java.lang.String
  /**
    * The field that will be displayed for the extended property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var tableListDisplayField: java.lang.String
  /**
    * The field that contains the value that gets stored as the extended property value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var tableListStoreField: java.lang.String
  /**
    * Indicates whether the value will be visible to the user or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue)
    */
  var userVisible: scala.Boolean
}

object AuxRecordValue {
  @scala.inline
  def apply(
    alias: java.lang.String,
    canUpdate: scala.Boolean,
    constructor: js.Function,
    data: js.Any,
    dataType: java.lang.String,
    displayOrder: scala.Double,
    displayType: java.lang.String,
    domain: java.lang.String,
    filter: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    length: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    required: scala.Boolean,
    tableListClass: java.lang.String,
    tableListDisplayField: java.lang.String,
    tableListStoreField: java.lang.String,
    userVisible: scala.Boolean
  ): AuxRecordValue = {
    val __obj = js.Dynamic.literal(alias = alias, canUpdate = canUpdate, constructor = constructor, data = data, dataType = dataType, displayOrder = displayOrder, displayType = displayType, domain = domain, filter = filter, hasOwnProperty = hasOwnProperty, length = length, name = name, propertyIsEnumerable = propertyIsEnumerable, required = required, tableListClass = tableListClass, tableListDisplayField = tableListDisplayField, tableListStoreField = tableListStoreField, userVisible = userVisible)
  
    __obj.asInstanceOf[AuxRecordValue]
  }
}

