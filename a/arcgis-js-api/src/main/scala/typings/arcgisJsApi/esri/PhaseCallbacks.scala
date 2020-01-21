package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhaseCallbacks extends Object {
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
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    prepare: /* event */ js.UndefOr[PhaseEvent] => Unit = null,
    render: /* event */ js.UndefOr[PhaseEvent] => Unit = null,
    update: /* event */ js.UndefOr[PhaseEvent] => Unit = null
  ): PhaseCallbacks = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction1(prepare))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[PhaseCallbacks]
  }
}

