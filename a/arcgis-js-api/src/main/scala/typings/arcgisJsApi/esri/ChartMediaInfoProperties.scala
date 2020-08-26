package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartMediaInfoProperties extends js.Object {
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  var value: js.UndefOr[ChartMediaInfoValueProperties] = js.native
}

object ChartMediaInfoProperties {
  @scala.inline
  def apply(): ChartMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMediaInfoProperties]
  }
  @scala.inline
  implicit class ChartMediaInfoPropertiesOps[Self <: ChartMediaInfoProperties] (val x: Self) extends AnyVal {
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
    def setValue(value: ChartMediaInfoValueProperties): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

