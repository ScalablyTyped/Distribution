package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait urlUtils extends js.Object {
  /**
    * Adds the given proxy rule to the proxy rules list: `esriConfig.request.proxyRules`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#addProxyRule)
    *
    * @param rule An object specifying a URL that should use the proxy. See the object specification table below for the required properties of this object.
    * @param rule.proxyUrl The URL of the proxy.
    * @param rule.urlPrefix The URL prefix of the resources that should be accessed through the given proxy.
    *
    */
  def addProxyRule(rule: urlUtilsAddProxyRuleRule): scala.Double
  /**
    * Returns the proxy rule that matches the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#getProxyRule)
    *
    * @param url The URL of the resources accessed via proxy.
    *
    */
  def getProxyRule(url: java.lang.String): js.Any
  /**
    * Converts the URL arguments to an object representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#urlToObject)
    *
    * @param url The input URL.
    *
    */
  def urlToObject(url: java.lang.String): js.Any
}

object urlUtils {
  @scala.inline
  def apply(
    addProxyRule: js.Function1[urlUtilsAddProxyRuleRule, scala.Double],
    getProxyRule: js.Function1[java.lang.String, js.Any],
    urlToObject: js.Function1[java.lang.String, js.Any]
  ): urlUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addProxyRule")(addProxyRule)
    __obj.updateDynamic("getProxyRule")(getProxyRule)
    __obj.updateDynamic("urlToObject")(urlToObject)
    __obj.asInstanceOf[urlUtils]
  }
}

