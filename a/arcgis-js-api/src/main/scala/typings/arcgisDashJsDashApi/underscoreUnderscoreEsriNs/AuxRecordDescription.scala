package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecordDescription extends Object {
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
  var recordId: Double
  /**
    * The table name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordDescription)
    */
  var tableName: String
}

object AuxRecordDescription {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    properties: js.Any,
    propertyIsEnumerable: PropertyKey => Boolean,
    recordId: Double,
    tableName: String
  ): AuxRecordDescription = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), properties = properties, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), recordId = recordId, tableName = tableName)
  
    __obj.asInstanceOf[AuxRecordDescription]
  }
}

