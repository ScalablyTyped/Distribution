package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseCallbacks
  extends stdLib.Object {
  /**
    * A callback called before rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var prepare: js.UndefOr[PhaseCallback] = js.undefined
  /**
    * A callback to execute rendering logic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var render: js.UndefOr[PhaseCallback] = js.undefined
  /**
    * A callback to execute state update logic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseCallbacks)
    */
  var update: js.UndefOr[PhaseCallback] = js.undefined
}

object PhaseCallbacks {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    prepare: PhaseCallback = null,
    render: PhaseCallback = null,
    update: PhaseCallback = null
  ): PhaseCallbacks = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (prepare != null) __obj.updateDynamic("prepare")(prepare)
    if (render != null) __obj.updateDynamic("render")(render)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[PhaseCallbacks]
  }
}

