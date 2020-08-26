package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Various utilities and convenience functions for executing code at various phases of browser frames. The scheduling module allows you to register tasks that are executed in every animation frame. This can be used to synchronize updates with ongoing animations of the view, or to animate the view manually by adjusting the extent or camera in every frame.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html)
  */
@js.native
trait scheduling extends js.Object {
  /**
    * Registers a frame task. An animation frame is composed of different phases to let various actors execute code before, after, or during the rendering of [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#addFrameTask)
    *
    * @param phases The callbacks for each phase of the frame.
    *
    */
  def addFrameTask(phases: PhaseCallbacks): FrameTaskHandle = js.native
  /**
    * Schedules the execution of a `callback` function at the next web browser tick. Unlike [addFrameTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#addFrameTask), a scheduled `callback` will only run once. Scheduling a task for the next execution tick can be useful when you want to throttle/accumulate functionality over a single javascript execution context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#schedule)
    *
    * @param callback The function to call at the next tick.
    *
    */
  def schedule(callback: js.Function): js.Any = js.native
}

object scheduling {
  @scala.inline
  def apply(addFrameTask: PhaseCallbacks => FrameTaskHandle, schedule: js.Function => js.Any): scheduling = {
    val __obj = js.Dynamic.literal(addFrameTask = js.Any.fromFunction1(addFrameTask), schedule = js.Any.fromFunction1(schedule))
    __obj.asInstanceOf[scheduling]
  }
  @scala.inline
  implicit class schedulingOps[Self <: scheduling] (val x: Self) extends AnyVal {
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
    def setAddFrameTask(value: PhaseCallbacks => FrameTaskHandle): Self = this.set("addFrameTask", js.Any.fromFunction1(value))
    @scala.inline
    def setSchedule(value: js.Function => js.Any): Self = this.set("schedule", js.Any.fromFunction1(value))
  }
  
}

