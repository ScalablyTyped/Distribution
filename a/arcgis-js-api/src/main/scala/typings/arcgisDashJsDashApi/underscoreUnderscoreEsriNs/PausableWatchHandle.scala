package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PausableWatchHandle extends Object {
  /**
    * Pauses the handle preventing changes to invoke the associated callback.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def pause(): Unit
  /**
    * Removes the watch handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def remove(): Unit
  /**
    * Resumes a paused the handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-watchUtils.html#PausableWatchHandle)
    *
    *
    */
  def resume(): Unit
}

object PausableWatchHandle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    pause: () => Unit,
    propertyIsEnumerable: PropertyKey => Boolean,
    remove: () => Unit,
    resume: () => Unit
  ): PausableWatchHandle = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pause = js.Any.fromFunction0(pause), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), remove = js.Any.fromFunction0(remove), resume = js.Any.fromFunction0(resume))
  
    __obj.asInstanceOf[PausableWatchHandle]
  }
}

