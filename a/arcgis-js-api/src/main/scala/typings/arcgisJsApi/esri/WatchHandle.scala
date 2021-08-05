package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchHandle
  extends StObject
     with Object {
  
  /**
    * Removes the watch handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#WatchHandle)
    */
  def remove(): Unit
}
object WatchHandle {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    remove: () => Unit
  ): WatchHandle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[WatchHandle]
  }
  
  extension [Self <: WatchHandle](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
