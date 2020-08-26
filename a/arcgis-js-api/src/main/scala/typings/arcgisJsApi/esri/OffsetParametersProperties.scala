package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.bevelled
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.mitered
import typings.arcgisJsApi.arcgisJsApiStrings.rounded
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetParametersProperties extends js.Object {
  /**
    * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled. When mitered is specified, the value set for `bevelRatio` is ignored and `10` is used internally. If beveled is specified, `1.1` will be used if no value is set for bevelRatio. The bevelRatio is ignored when `rounded` is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#bevelRatio)
    */
  var bevelRatio: js.UndefOr[Double] = js.native
  /**
    * The array of geometries to be offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  /**
    * Specifies the planar distance for constructing an offset based on the input geometries. If the `offsetDistance` parameter is positive, the constructed offset will be on the right side of the curve. Left side offsets are constructed with negative values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetDistance)
    */
  var offsetDistance: js.UndefOr[Double] = js.native
  /**
    * Options that determine how the ends intersect. Set to one of the following options:
    *
    * Possible Value | Description
    * ---------------|-------------
    * bevelled | Squares off the corner after a given ratio distance.
    * mitered | Attempts to allow extended offsets to naturally intersect. If the intersection occurs too far from a corner, the corner will be beveled off at a fixed distance.
    * rounded | Rounds the corner between extended offsets.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetHow)
    */
  var offsetHow: js.UndefOr[bevelled | mitered | rounded] = js.native
  /**
    * The offset distance unit. For a list of valid units see [esriSRUnitType constants](http://resources.esri.com/help/9.3/ArcGISDesktop/ArcObjects/esriGeometry/esriSRUnitType.htm) or [esriSRUnit2Type constants](http://resources.esri.com/help/9.3/ArcGISDesktop/ArcObjects/esriGeometry/esriSRUnit2Type.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetUnit)
    */
  var offsetUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
}

object OffsetParametersProperties {
  @scala.inline
  def apply(): OffsetParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetParametersProperties]
  }
  @scala.inline
  implicit class OffsetParametersPropertiesOps[Self <: OffsetParametersProperties] (val x: Self) extends AnyVal {
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
    def setBevelRatio(value: Double): Self = this.set("bevelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBevelRatio: Self = this.set("bevelRatio", js.undefined)
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = this.set("geometries", js.Array(value :_*))
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    @scala.inline
    def setOffsetDistance(value: Double): Self = this.set("offsetDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetDistance: Self = this.set("offsetDistance", js.undefined)
    @scala.inline
    def setOffsetHow(value: bevelled | mitered | rounded): Self = this.set("offsetHow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetHow: Self = this.set("offsetHow", js.undefined)
    @scala.inline
    def setOffsetUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = this.set("offsetUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffsetUnit: Self = this.set("offsetUnit", js.undefined)
  }
  
}

