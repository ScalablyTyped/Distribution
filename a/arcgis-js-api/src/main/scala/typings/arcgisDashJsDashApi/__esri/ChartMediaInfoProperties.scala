package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartMediaInfoProperties extends js.Object {
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  var value: js.UndefOr[ChartMediaInfoValueProperties] = js.undefined
}

object ChartMediaInfoProperties {
  @scala.inline
  def apply(value: ChartMediaInfoValueProperties = null): ChartMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartMediaInfoProperties]
  }
}

