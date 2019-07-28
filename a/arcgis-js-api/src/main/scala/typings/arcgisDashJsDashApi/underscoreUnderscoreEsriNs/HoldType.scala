package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldType extends Object {
  /**
    * The description of the type of hold.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType)
    */
  var description: String
  /**
    * The unique id for the hold type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType)
    */
  var id: Double
  /**
    * The name of the hold type
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#HoldType)
    */
  var name: String
}

object HoldType {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HoldType = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[HoldType]
  }
}

