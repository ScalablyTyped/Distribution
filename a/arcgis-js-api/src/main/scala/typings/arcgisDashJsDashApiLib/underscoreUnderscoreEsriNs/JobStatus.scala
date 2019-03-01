package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatus
  extends stdLib.Object {
  /**
    * An alias name for the status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var caption: java.lang.String
  /**
    * The description of the type of status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var description: java.lang.String
  /**
    * The unique id for the status type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var id: scala.Double
  /**
    * The name of the status type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var name: java.lang.String
}

object JobStatus {
  @scala.inline
  def apply(
    caption: java.lang.String,
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): JobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("caption")(caption)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[JobStatus]
  }
}

