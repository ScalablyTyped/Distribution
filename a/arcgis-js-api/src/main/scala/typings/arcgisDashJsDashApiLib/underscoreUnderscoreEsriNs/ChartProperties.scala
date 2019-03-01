package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartProperties extends MediaMediaProperties {
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Media-Chart.html#value)
    */
  var value: js.UndefOr[ValueProperties] = js.undefined
}

object ChartProperties {
  @scala.inline
  def apply(caption: java.lang.String = null, title: java.lang.String = null, value: ValueProperties = null): ChartProperties = {
    val __obj = js.Dynamic.literal()
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (title != null) __obj.updateDynamic("title")(title)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartProperties]
  }
}

