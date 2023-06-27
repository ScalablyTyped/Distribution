package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PausableWatchHandle extends StObject {
  
  /**
  		 * Pauses the handle preventing changes to invoke the associated callback.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
  		 */
  def pause(): scala.Unit
  
  /**
  		 * Removes the watch handle.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
  		 */
  def remove(): scala.Unit
  
  /**
  		 * Resumes a paused the handle.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
  		 */
  def resume(): scala.Unit
}
object PausableWatchHandle {
  
  inline def apply(pause: () => scala.Unit, remove: () => scala.Unit, resume: () => scala.Unit): PausableWatchHandle = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), remove = js.Any.fromFunction0(remove), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[PausableWatchHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PausableWatchHandle] (val x: Self) extends AnyVal {
    
    inline def setPause(value: () => scala.Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => scala.Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
  }
}
