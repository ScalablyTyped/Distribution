package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchHandle
  extends stdLib.Object {
  /**
    * Removes the watch handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#WatchHandle)
    *
    *
    */
  def remove(): scala.Unit
}

object WatchHandle {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    remove: js.Function0[scala.Unit]
  ): WatchHandle = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, remove = remove)
  
    __obj.asInstanceOf[WatchHandle]
  }
}

