package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle extends StObject {
  
  /**
  		 * Removes the handle.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Handles.html#Handle)
  		 */
  def remove(): scala.Unit
}
object Handle {
  
  inline def apply(remove: () => scala.Unit): Handle = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
    
    inline def setRemove(value: () => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}
