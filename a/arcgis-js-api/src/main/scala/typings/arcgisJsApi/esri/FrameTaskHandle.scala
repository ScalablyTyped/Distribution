package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameTaskHandle extends StObject {
  
  /**
    * Pause the execution the frame task at every frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    */
  def pause(): scala.Unit
  
  /**
    * Removes the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    */
  def remove(): scala.Unit
  
  /**
    * Resumes the execution the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    */
  def resume(): scala.Unit
}
object FrameTaskHandle {
  
  inline def apply(pause: () => scala.Unit, remove: () => scala.Unit, resume: () => scala.Unit): FrameTaskHandle = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), remove = js.Any.fromFunction0(remove), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[FrameTaskHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameTaskHandle] (val x: Self) extends AnyVal {
    
    inline def setPause(value: () => scala.Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setRemove(value: () => scala.Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setResume(value: () => scala.Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
  }
}
