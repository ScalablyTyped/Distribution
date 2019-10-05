package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieChartMediaInfoProperties
  extends MediaInfoProperties
     with ChartMediaInfoProperties

object PieChartMediaInfoProperties {
  @scala.inline
  def apply(caption: String = null, title: String = null, value: ChartMediaInfoValueProperties = null): PieChartMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PieChartMediaInfoProperties]
  }
}

