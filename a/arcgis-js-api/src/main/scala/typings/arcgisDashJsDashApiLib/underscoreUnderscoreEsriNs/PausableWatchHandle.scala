package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PausableWatchHandle
  extends stdLib.Object {
  /**
    * Pauses the handle preventing changes to invoke the associated callback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def pause(): scala.Unit
  /**
    * Removes the watch handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def remove(): scala.Unit
  /**
    * Resumes a paused the handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def resume(): scala.Unit
}

object PausableWatchHandle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    pause: js.Function0[scala.Unit],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    remove: js.Function0[scala.Unit],
    resume: js.Function0[scala.Unit]
  ): PausableWatchHandle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("pause")(pause)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("resume")(resume)
    __obj.asInstanceOf[PausableWatchHandle]
  }
}

