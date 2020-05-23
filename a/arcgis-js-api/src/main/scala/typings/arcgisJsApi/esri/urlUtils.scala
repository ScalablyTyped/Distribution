package typings.arcgisJsApi.esri

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
  def addProxyRule(rule: urlUtilsAddProxyRuleRule): Double
  /**
    * Returns the proxy rule that matches the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#getProxyRule)
    *
    * @param url The URL of the resources accessed via proxy.
    *
    */
  def getProxyRule(url: String): js.Any
  /**
    * Converts the URL arguments to an object representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#urlToObject)
    *
    * @param url The input URL.
    *
    */
  def urlToObject(url: String): js.Any
}

object urlUtils {
  @scala.inline
  def apply(
    addProxyRule: urlUtilsAddProxyRuleRule => Double,
    getProxyRule: String => js.Any,
    urlToObject: String => js.Any
  ): urlUtils = {
    val __obj = js.Dynamic.literal(addProxyRule = js.Any.fromFunction1(addProxyRule), getProxyRule = js.Any.fromFunction1(getProxyRule), urlToObject = js.Any.fromFunction1(urlToObject))
    __obj.asInstanceOf[urlUtils]
  }
}

