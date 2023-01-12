package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Utility methods for working with URLs.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html)
  */
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
  def getProxyRule(url: String): Any
  
  /**
    * Converts the URL arguments to an object representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#urlToObject)
    */
  def urlToObject(url: String): Any
}
object urlUtils {
  
  inline def apply(
    addProxyRule: urlUtilsAddProxyRuleRule => Double,
    getProxyRule: String => Any,
    urlToObject: String => Any
  ): urlUtils = {
    val __obj = js.Dynamic.literal(addProxyRule = js.Any.fromFunction1(addProxyRule), getProxyRule = js.Any.fromFunction1(getProxyRule), urlToObject = js.Any.fromFunction1(urlToObject))
    __obj.asInstanceOf[urlUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: urlUtils] (val x: Self) extends AnyVal {
    
    inline def setAddProxyRule(value: urlUtilsAddProxyRuleRule => Double): Self = StObject.set(x, "addProxyRule", js.Any.fromFunction1(value))
    
    inline def setGetProxyRule(value: String => Any): Self = StObject.set(x, "getProxyRule", js.Any.fromFunction1(value))
    
    inline def setUrlToObject(value: String => Any): Self = StObject.set(x, "urlToObject", js.Any.fromFunction1(value))
  }
}
