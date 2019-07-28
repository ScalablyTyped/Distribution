package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartMediaInfo extends js.Object {
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  var value: ChartMediaInfoValue
}

@JSGlobal("__esri.ChartMediaInfo")
@js.native
class ChartMediaInfoCls () extends ChartMediaInfo {
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  /* CompleteClass */
  override var value: ChartMediaInfoValue = js.native
}

object ChartMediaInfo {
  @scala.inline
  def apply(value: ChartMediaInfoValue): ChartMediaInfo = {
    val __obj = js.Dynamic.literal(value = value)
  
    __obj.asInstanceOf[ChartMediaInfo]
  }
}

