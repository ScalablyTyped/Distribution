package typings.arcgisJsApi.esri

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeExtent extends JSONSupport {
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    *
    * @default null
    */
  var end: Date = js.native
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    *
    * @default null
    */
  var start: Date = js.native
  /**
    * Returns the time extent resulting from the intersection of a given time extent and parsed time extent. Returns a timeExtent with `undefined` values for [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end) properties if the two time extents do not intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#intersection)
    *
    * @param timeExtent The time extent to be intersected with the time extent on which `intersection()` is being called on.
    *
    */
  def intersection(timeExtent: TimeExtent): TimeExtent = js.native
}

object TimeExtent {
  @scala.inline
  def apply(end: Date, intersection: TimeExtent => TimeExtent, start: Date, toJSON: () => js.Any): TimeExtent = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], intersection = js.Any.fromFunction1(intersection), start = start.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TimeExtent]
  }
  @scala.inline
  implicit class TimeExtentOps[Self <: TimeExtent] (val x: Self) extends AnyVal {
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
    def setEnd(value: Date): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntersection(value: TimeExtent => TimeExtent): Self = this.set("intersection", js.Any.fromFunction1(value))
    @scala.inline
    def setStart(value: Date): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

