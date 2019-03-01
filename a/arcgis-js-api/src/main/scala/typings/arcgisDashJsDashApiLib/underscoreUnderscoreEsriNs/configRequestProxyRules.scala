package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configRequestProxyRules
  extends stdLib.Object {
  /**
    * The URL of the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL prefix for resources that need to be accessed through a specific proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var urlPrefix: js.UndefOr[java.lang.String] = js.undefined
}

object configRequestProxyRules {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    proxyUrl: java.lang.String = null,
    urlPrefix: java.lang.String = null
  ): configRequestProxyRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix)
    __obj.asInstanceOf[configRequestProxyRules]
  }
}

