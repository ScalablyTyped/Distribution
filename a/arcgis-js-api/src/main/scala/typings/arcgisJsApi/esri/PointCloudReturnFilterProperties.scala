package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.firstOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.last
import typings.arcgisJsApi.arcgisJsApiStrings.lastOfMany
import typings.arcgisJsApi.arcgisJsApiStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointCloudReturnFilterProperties extends PointCloudFilterProperties {
  /**
    * An array of return types used to filter points. Possible values for the return types are:
    *
    * Value | Description
    * ------|------------
    * `firstOfMany` | The point was the first to be collected in a series of many returns.
    * `last` | The last point in a series of many returns or a single point.
    * `lastOfMany` | The last point in a series of many returns.
    * `single` | All the points that were collected from laser pulses with a single return.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudReturnFilter.html#includedReturns)
    */
  var includedReturns: js.UndefOr[js.Array[firstOfMany | last | lastOfMany | single]] = js.native
}

object PointCloudReturnFilterProperties {
  @scala.inline
  def apply(): PointCloudReturnFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudReturnFilterProperties]
  }
  @scala.inline
  implicit class PointCloudReturnFilterPropertiesOps[Self <: PointCloudReturnFilterProperties] (val x: Self) extends AnyVal {
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
    def setIncludedReturnsVarargs(value: (firstOfMany | last | lastOfMany | single)*): Self = this.set("includedReturns", js.Array(value :_*))
    @scala.inline
    def setIncludedReturns(value: js.Array[firstOfMany | last | lastOfMany | single]): Self = this.set("includedReturns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludedReturns: Self = this.set("includedReturns", js.undefined)
  }
  
}

