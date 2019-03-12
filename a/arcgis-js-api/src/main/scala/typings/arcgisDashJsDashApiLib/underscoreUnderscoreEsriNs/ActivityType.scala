package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityType
  extends stdLib.Object {
  /**
    * The description of the activity being recorded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var desription: java.lang.String
  /**
    * The unique id of the activity that is logged.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var id: scala.Double
  /**
    * The message that will be logged when this type of activity occurs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var message: java.lang.String
  /**
    * The name of the activity that occurred.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType)
    */
  var name: java.lang.String
}

object ActivityType {
  @scala.inline
  def apply(
    constructor: js.Function,
    desription: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): ActivityType = {
    val __obj = js.Dynamic.literal(constructor = constructor, desription = desription, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, message = message, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ActivityType]
  }
}

