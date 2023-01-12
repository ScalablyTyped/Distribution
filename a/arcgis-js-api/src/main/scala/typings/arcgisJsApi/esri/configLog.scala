package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.info
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configLog extends StObject {
  
  /**
    * An array of custom interceptor functions that can be used to intercept log messages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var interceptors: js.Array[LogInterceptor]
  
  /**
    * The level of messages to log.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var level: none_ | error | warn | info
}
object configLog {
  
  inline def apply(interceptors: js.Array[LogInterceptor], level: none_ | error | warn | info): configLog = {
    val __obj = js.Dynamic.literal(interceptors = interceptors.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[configLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: configLog] (val x: Self) extends AnyVal {
    
    inline def setInterceptors(value: js.Array[LogInterceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    inline def setInterceptorsVarargs(value: LogInterceptor*): Self = StObject.set(x, "interceptors", js.Array(value*))
    
    inline def setLevel(value: none_ | error | warn | info): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
