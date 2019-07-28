package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityType extends Object {
  /**
    * The description of the activity being recorded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var desription: String
  /**
    * The unique id of the activity that is logged.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var id: Double
  /**
    * The message that will be logged when this type of activity occurs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var message: String
  /**
    * The name of the activity that occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var name: String
}

object ActivityType {
  @scala.inline
  def apply(
    constructor: js.Function,
    desription: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    message: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ActivityType = {
    val __obj = js.Dynamic.literal(constructor = constructor, desription = desription, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, message = message, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ActivityType]
  }
}

