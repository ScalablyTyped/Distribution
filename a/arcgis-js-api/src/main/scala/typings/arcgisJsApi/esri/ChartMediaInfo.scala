package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartMediaInfo extends js.Object {
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  var value: ChartMediaInfoValue = js.native
}

object ChartMediaInfo {
  @scala.inline
  def apply(value: ChartMediaInfoValue): ChartMediaInfo = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMediaInfo]
  }
  @scala.inline
  implicit class ChartMediaInfoOps[Self <: ChartMediaInfo] (val x: Self) extends AnyVal {
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
    def setValue(value: ChartMediaInfoValue): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

