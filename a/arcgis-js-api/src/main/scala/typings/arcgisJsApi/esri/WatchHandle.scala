package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchHandle extends StObject {
  
  /**
    * Removes the watch handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#WatchHandle)
    */
  def remove(): scala.Unit
}
object WatchHandle {
  
  inline def apply(remove: () => scala.Unit): WatchHandle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[WatchHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchHandle] (val x: Self) extends AnyVal {
    
    inline def setRemove(value: () => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
