package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privilege extends Object {
  /**
    * The description of the privilege.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege)
    */
  var description: String
  /**
    * The unique id for the privilege.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege)
    */
  var id: Double
  /**
    * The name of the privilege.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege)
    */
  var name: String
}

object Privilege {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Privilege = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Privilege]
  }
}

