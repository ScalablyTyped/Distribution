package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobType
  extends stdLib.Object {
  /**
    * A category to group other similar job types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var category: java.lang.String
  /**
    * The description of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var description: java.lang.String
  /**
    * The unique id for the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var id: java.lang.String
  /**
    * The name of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var name: java.lang.String
  /**
    * The state of the job type.  **Possible Values:** draft | active | retired
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var state: java.lang.String
}

object JobType {
  @scala.inline
  def apply(
    category: java.lang.String,
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    state: java.lang.String
  ): JobType = {
    val __obj = js.Dynamic.literal(category = category, constructor = constructor, description = description, hasOwnProperty = hasOwnProperty, id = id, name = name, propertyIsEnumerable = propertyIsEnumerable, state = state)
  
    __obj.asInstanceOf[JobType]
  }
}

