package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameTaskHandle extends Object {
  /**
    * Pause the execution the frame task at every frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def pause(): Unit = js.native
  /**
    * Removes the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def remove(): Unit = js.native
  /**
    * Resumes the execution the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def resume(): Unit = js.native
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
  implicit class FrameTaskHandleOps[Self <: FrameTaskHandle] (val x: Self) extends AnyVal {
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
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
    @scala.inline
    def setResume(value: () => Unit): Self = this.set("resume", js.Any.fromFunction0(value))
  }
  
}

