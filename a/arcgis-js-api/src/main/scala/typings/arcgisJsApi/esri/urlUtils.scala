package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def addProxyRule(rule: urlUtilsAddProxyRuleRule): Double = js.native
  /**
    * Returns the proxy rule that matches the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#getProxyRule)
    *
    * @param url The URL of the resources accessed via proxy.
    *
    */
  def getProxyRule(url: String): js.Any = js.native
  /**
    * Converts the URL arguments to an object representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#urlToObject)
    *
    * @param url The input URL.
    *
    */
  def urlToObject(url: String): js.Any = js.native
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
  @scala.inline
  implicit class urlUtilsOps[Self <: urlUtils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddProxyRule(value: urlUtilsAddProxyRuleRule => Double): Self = this.set("addProxyRule", js.Any.fromFunction1(value))
    @scala.inline
    def setGetProxyRule(value: String => js.Any): Self = this.set("getProxyRule", js.Any.fromFunction1(value))
    @scala.inline
    def setUrlToObject(value: String => js.Any): Self = this.set("urlToObject", js.Any.fromFunction1(value))
  }
  
}

