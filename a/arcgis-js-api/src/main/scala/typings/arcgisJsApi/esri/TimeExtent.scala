package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeExtent extends JSONSupport {
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    *
    * @default null
    */
  var end: Date
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    *
    * @default null
    */
  var start: Date
  /**
    * Returns the time extent resulting from the intersection of the current time extent and parsed time extent. Returns `null` if two time extents do not intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#intersection)
    *
    * @param timeExtent The time extent to be intersected with the time extent on which `intersection()` is being called on.
    *
    */
  def intersection(timeExtent: TimeExtent): TimeExtent
}

@JSGlobal("__esri.TimeExtent")
@js.native
object TimeExtent extends TopLevel[TimeExtentConstructor]

