package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocatorProperties extends TaskProperties {
  /**
    * The spatial reference of the output geometries. If not specified, the output geometries are in the spatial reference of the input geometries when performing a reverse geocode and in the default spatial reference returned by the service if finding locations by address.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
}

object LocatorProperties {
  @scala.inline
  def apply(): LocatorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocatorProperties]
  }
  @scala.inline
  implicit class LocatorPropertiesOps[Self <: LocatorProperties] (val x: Self) extends AnyVal {
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
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
  }
  
}

