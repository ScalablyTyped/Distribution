package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configWorkers
  extends stdLib.Object {
  /**
    * The configuration parameters for [the workers framework](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-workers.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderConfig: js.UndefOr[configWorkersLoaderConfig] = js.undefined
  /**
    * The absolute url to the AMD loader used in the worker. The default url points to the AMD loader used by the API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#workers)
    */
  var loaderUrl: js.UndefOr[js.Any] = js.undefined
}

object configWorkers {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    loaderConfig: configWorkersLoaderConfig = null,
    loaderUrl: js.Any = null
  ): configWorkers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (loaderConfig != null) __obj.updateDynamic("loaderConfig")(loaderConfig)
    if (loaderUrl != null) __obj.updateDynamic("loaderUrl")(loaderUrl)
    __obj.asInstanceOf[configWorkers]
  }
}

