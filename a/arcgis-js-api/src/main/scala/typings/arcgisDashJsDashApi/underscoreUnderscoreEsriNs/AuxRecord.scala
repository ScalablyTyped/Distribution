package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuxRecord extends Object {
  /**
    * The display value of the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord)
    */
  var displayProperty: js.Any
  /**
    * The unique id of the record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord)
    */
  var id: Double
  /**
    * The array of the values in the [records](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecordValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#AuxRecord)
    */
  var recordvalues: AuxRecordValue
}

object AuxRecord {
  @scala.inline
  def apply(
    constructor: js.Function,
    displayProperty: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    recordvalues: AuxRecordValue
  ): AuxRecord = {
    val __obj = js.Dynamic.literal(constructor = constructor, displayProperty = displayProperty, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), recordvalues = recordvalues)
  
    __obj.asInstanceOf[AuxRecord]
  }
}

