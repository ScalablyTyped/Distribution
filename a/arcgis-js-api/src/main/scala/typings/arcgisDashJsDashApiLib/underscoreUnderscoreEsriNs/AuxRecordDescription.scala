package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecordDescription
  extends stdLib.Object {
  /**
    * The array of property/value pairs of the record.
    *
    * [Read more...](properties.html)
    */
  var properties: js.Any
  /**
    * The unique id of the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordDescription)
    */
  var recordId: scala.Double
  /**
    * The table name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordDescription)
    */
  var tableName: java.lang.String
}

object AuxRecordDescription {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    properties: js.Any,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    recordId: scala.Double,
    tableName: java.lang.String
  ): AuxRecordDescription = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, properties = properties, propertyIsEnumerable = propertyIsEnumerable, recordId = recordId, tableName = tableName)
  
    __obj.asInstanceOf[AuxRecordDescription]
  }
}

