package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edits extends Object {
  /**
    * The feature to be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#Edits)
    */
  var feature: Graphic
  /**
    * *Read-only* When true, the edited feature has been modified from its original state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-Workflow.html#Edits)
    */
  var modified: Boolean
}

object Edits {
  @scala.inline
  def apply(
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: PropertyKey => Boolean,
    modified: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): Edits = {
    val __obj = js.Dynamic.literal(constructor = constructor, feature = feature, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), modified = modified, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Edits]
  }
}

