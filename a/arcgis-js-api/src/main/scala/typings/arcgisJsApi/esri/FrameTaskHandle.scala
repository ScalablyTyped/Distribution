package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameTaskHandle
  extends StObject
     with Object {
  
  /**
    * Pause the execution the frame task at every frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    */
  def pause(): Unit
  
  /**
    * Removes the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    */
  def remove(): Unit
  
  /**
    * Resumes the execution the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    */
  def resume(): Unit
}
object FrameTaskHandle {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    pause: () => Unit,
    propertyIsEnumerable: PropertyKey => Boolean,
    remove: () => Unit,
    resume: () => Unit
  ): FrameTaskHandle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pause = js.Any.fromFunction0(pause), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), remove = js.Any.fromFunction0(remove), resume = js.Any.fromFunction0(resume))
    __obj.asInstanceOf[FrameTaskHandle]
  }
  
  @scala.inline
  implicit class FrameTaskHandleMutableBuilder[Self <: FrameTaskHandle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResume(value: () => Unit): Self = StObject.set(x, "resume", js.Any.fromFunction0(value))
  }
}
