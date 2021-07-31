package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait urlUtils extends StObject {
  
  /**
    * Adds the given proxy rule to the proxy rules list: `esriConfig.request.proxyRules`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#addProxyRule)
    */
  def addProxyRule(rule: urlUtilsAddProxyRuleRule): Double
  
  /**
    * Returns the proxy rule that matches the given URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#getProxyRule)
    */
  def getProxyRule(url: String): js.Any
  
  /**
    * Converts the URL arguments to an object representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#urlToObject)
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
  
  @scala.inline
  implicit class urlUtilsMutableBuilder[Self <: urlUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddProxyRule(value: urlUtilsAddProxyRuleRule => Double): Self = StObject.set(x, "addProxyRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProxyRule(value: String => js.Any): Self = StObject.set(x, "getProxyRule", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUrlToObject(value: String => js.Any): Self = StObject.set(x, "urlToObject", js.Any.fromFunction1(value))
  }
}
