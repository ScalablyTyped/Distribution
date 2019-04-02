package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edits
  extends stdLib.Object {
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
  var modified: scala.Boolean
}

object Edits {
  @scala.inline
  def apply(
    constructor: js.Function,
    feature: Graphic,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    modified: scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): Edits = {
    val __obj = js.Dynamic.literal(constructor = constructor, feature = feature, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), modified = modified, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Edits]
  }
}

