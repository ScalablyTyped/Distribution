package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeExtentProperties extends js.Object {
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    *
    * @default null
    */
  var end: js.UndefOr[DateProperties] = js.undefined
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    *
    * @default null
    */
  var start: js.UndefOr[DateProperties] = js.undefined
}

object TimeExtentProperties {
  @scala.inline
  def apply(end: DateProperties = null, start: DateProperties = null): TimeExtentProperties = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeExtentProperties]
  }
}

