package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait configRequestProxyRules extends Object {
  /**
    * The URL of the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var proxyUrl: js.UndefOr[String] = js.undefined
  /**
    * URL prefix for resources that need to be accessed through a specific proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#request)
    */
  var urlPrefix: js.UndefOr[String] = js.undefined
}

object configRequestProxyRules {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    proxyUrl: String = null,
    urlPrefix: String = null
  ): configRequestProxyRules = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (proxyUrl != null) __obj.updateDynamic("proxyUrl")(proxyUrl)
    if (urlPrefix != null) __obj.updateDynamic("urlPrefix")(urlPrefix)
    __obj.asInstanceOf[configRequestProxyRules]
  }
}

