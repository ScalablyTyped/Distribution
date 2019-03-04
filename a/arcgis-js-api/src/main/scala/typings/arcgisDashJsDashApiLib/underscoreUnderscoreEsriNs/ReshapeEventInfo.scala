package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshapeEventInfo
  extends stdLib.Object
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
  var `type`: java.lang.String
}

object ReshapeEventInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String
  ): ReshapeEventInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReshapeEventInfo]
  }
}

