package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.info
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.warn
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait configLog extends Object {
  
  /**
    * An array of custom interceptor functions that can be used to intercept log messages.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var interceptors: js.Array[LogInterceptor] = js.native
  
  /**
    * The level of messages to log.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#log)
    */
  var level: none | error | warn | info = js.native
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
  implicit class configLogOps[Self <: configLog] (val x: Self) extends AnyVal {
    
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
    def setInterceptorsVarargs(value: LogInterceptor*): Self = this.set("interceptors", js.Array(value :_*))
    
    @scala.inline
    def setInterceptors(value: js.Array[LogInterceptor]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: none | error | warn | info): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
