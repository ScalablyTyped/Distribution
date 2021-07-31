package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.info
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.warn
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait configLog
  extends StObject
     with Object {
  
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
  var level: none | error | warn | info
}
object configLog {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    interceptors: js.Array[LogInterceptor],
    level: none | error | warn | info,
    propertyIsEnumerable: PropertyKey => Boolean
  ): configLog = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), interceptors = interceptors.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[configLog]
  }
  
  @scala.inline
  implicit class configLogMutableBuilder[Self <: configLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterceptors(value: js.Array[LogInterceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptorsVarargs(value: LogInterceptor*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    
    @scala.inline
    def setLevel(value: none | error | warn | info): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
