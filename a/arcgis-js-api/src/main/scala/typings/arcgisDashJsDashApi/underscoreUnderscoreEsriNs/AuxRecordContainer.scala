package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecordContainer extends Object {
  /**
    * The array of extended property [records](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer)
    */
  var records: AuxRecord
  /**
    * The type of extended property relationship.  **Possible Values:** one-to-one | one-to-many
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer)
    */
  var relationshipType: String
  /**
    * The table alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer)
    */
  var tableAlias: String
  /**
    * The table name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer)
    */
  var tableName: String
}

object AuxRecordContainer {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    records: AuxRecord,
    relationshipType: String,
    tableAlias: String,
    tableName: String
  ): AuxRecordContainer = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), records = records, relationshipType = relationshipType, tableAlias = tableAlias, tableName = tableName)
  
    __obj.asInstanceOf[AuxRecordContainer]
  }
}

