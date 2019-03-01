package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameTaskHandle
  extends stdLib.Object {
  /**
    * Pause the execution the frame task at every frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def pause(): scala.Unit
  /**
    * Removes the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def remove(): scala.Unit
  /**
    * Resumes the execution the frame task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#FrameTaskHandle)
    *
    *
    */
  def resume(): scala.Unit
}

object FrameTaskHandle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    pause: js.Function0[scala.Unit],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    remove: js.Function0[scala.Unit],
    resume: js.Function0[scala.Unit]
  ): FrameTaskHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("resume")(resume)
    __obj.asInstanceOf[FrameTaskHandle]
  }
}

