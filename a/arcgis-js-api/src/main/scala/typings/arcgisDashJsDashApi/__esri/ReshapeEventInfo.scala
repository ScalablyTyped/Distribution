package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshapeEventInfo
  extends Object
     with UpdateToolEventInfo {
  /**
    * Returns information indicating the stage of the reshape operation.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * reshape-start | The type changes to `reshape-start` at the start of `reshape` operation.
    * reshape | The type changes to `reshape` while graphics are being reshaped.
    * reshape-stop | The type changes to `reshape-stop` once graphics are reshaped.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#ReshapeEventInfo)
    */
  var `type`: String
}

object ReshapeEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReshapeEventInfo]
  }
}

