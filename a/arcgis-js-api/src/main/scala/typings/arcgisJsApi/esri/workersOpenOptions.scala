package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dedicated
import typings.arcgisJsApi.arcgisJsApiStrings.distributed
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait workersOpenOptions extends Object {
  /**
    * The objects defining the API accessible from the module.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var client: js.UndefOr[js.Any] = js.undefined
  /**
    * [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) allows for cancelable asynchronous job. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * Possible Value | Description
    * ---------------|------------
    * distributed | The module is loaded in each available worker. Each call to [Connection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke) will be targeting an available worker. Use this strategy if the module doesn't maintain information between invocations (stateless).
    * dedicated | The module is loaded in one worker. Each call to [Connection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers-Connection.html#invoke) will be targeting a same worker. Use this strategy if the module maintains information from previous invocations or communication between main and worker threads needs to be stateful.
    * local | The module is loaded in the main thread. Use this strategy if when using the worker framework API while disabling the use of workers.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Indicates how to load the module. See the table below for a list of possible values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html#open)
    *
    * @default distributed
    */
  var strategy: js.UndefOr[distributed | dedicated | local] = js.undefined
}

object workersOpenOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    client: js.Any = null,
    signal: AbortSignal = null,
    strategy: distributed | dedicated | local = null
  ): workersOpenOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[workersOpenOptions]
  }
}

