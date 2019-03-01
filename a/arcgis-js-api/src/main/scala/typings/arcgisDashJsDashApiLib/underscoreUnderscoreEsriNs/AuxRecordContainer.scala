package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecordContainer
  extends stdLib.Object {
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
  var relationshipType: java.lang.String
  /**
    * The table alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer)
    */
  var tableAlias: java.lang.String
  /**
    * The table name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordContainer)
    */
  var tableName: java.lang.String
}

object AuxRecordContainer {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    records: AuxRecord,
    relationshipType: java.lang.String,
    tableAlias: java.lang.String,
    tableName: java.lang.String
  ): AuxRecordContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("records")(records)
    __obj.updateDynamic("relationshipType")(relationshipType)
    __obj.updateDynamic("tableAlias")(tableAlias)
    __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[AuxRecordContainer]
  }
}

