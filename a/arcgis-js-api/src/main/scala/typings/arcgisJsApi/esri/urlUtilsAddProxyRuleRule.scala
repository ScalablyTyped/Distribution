package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait urlUtilsAddProxyRuleRule
  extends StObject
     with Object {
  
  /**
    * The URL of the proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#addProxyRule)
    */
  var proxyUrl: String
  
  /**
    * The URL prefix of the resources that should be accessed through the given proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-urlUtils.html#addProxyRule)
    */
  var urlPrefix: String
}
object urlUtilsAddProxyRuleRule {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    proxyUrl: String,
    urlPrefix: String
  ): urlUtilsAddProxyRuleRule = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), proxyUrl = proxyUrl.asInstanceOf[js.Any], urlPrefix = urlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlUtilsAddProxyRuleRule]
  }
  
  @scala.inline
  implicit class urlUtilsAddProxyRuleRuleMutableBuilder[Self <: urlUtilsAddProxyRuleRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
  }
}
