package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DensifyParametersProperties extends js.Object {
  /**
    * If `true`, Geographic Coordinate System spatial references are used or densify geodesic will be performed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /**
    * The array of geometries to be densified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  /**
    * The length unit of `maxSegmentLength`. For a list of valid units, see [esriSRUnitType Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnitType_Constants/000w00000042000000/) and [esriSRUnit2Type Constants](http://resources.arcgis.com/en/help/arcobjects-cpp/componenthelp/index.html#/esriSRUnit2Type_Constants/000w00000041000000/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
  /**
    * All segments longer than `maxSegmentLength` are replaced with sequences of lines no longer than `maxSegmentLength.`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DensifyParameters.html#maxSegmentLength)
    */
  var maxSegmentLength: js.UndefOr[Double] = js.native
}

object DensifyParametersProperties {
  @scala.inline
  def apply(): DensifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DensifyParametersProperties]
  }
  @scala.inline
  implicit class DensifyParametersPropertiesOps[Self <: DensifyParametersProperties] (val x: Self) extends AnyVal {
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
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = this.set("geometries", js.Array(value :_*))
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    @scala.inline
    def setLengthUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = this.set("lengthUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLengthUnit: Self = this.set("lengthUnit", js.undefined)
    @scala.inline
    def setMaxSegmentLength(value: Double): Self = this.set("maxSegmentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSegmentLength: Self = this.set("maxSegmentLength", js.undefined)
  }
  
}

