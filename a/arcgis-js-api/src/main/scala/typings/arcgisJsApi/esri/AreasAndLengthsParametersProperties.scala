package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.planar
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreasAndLengthsParametersProperties extends js.Object {
  
  /**
    * The area unit in which areas of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#areaUnit)
    */
  var areaUnit: js.UndefOr[
    acres | hectares | `square-miles` | `square-kilometers` | `square-meters` | `square-feet` | `square-yards`
  ] = js.native
  
  /**
    * Defines the type of calculation for the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#calculationType)
    */
  var calculationType: js.UndefOr[planar | geodesic | `preserve-shape`] = js.native
  
  /**
    * The length unit in which perimeters of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
  
  /**
    * Polygon geometries for which to compute areas and lengths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AreasAndLengthsParameters.html#polygons)
    */
  var polygons: js.UndefOr[js.Array[PolygonProperties]] = js.native
}
object AreasAndLengthsParametersProperties {
  
  @scala.inline
  def apply(): AreasAndLengthsParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreasAndLengthsParametersProperties]
  }
  
  @scala.inline
  implicit class AreasAndLengthsParametersPropertiesOps[Self <: AreasAndLengthsParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setAreaUnit(
      value: acres | hectares | `square-miles` | `square-kilometers` | `square-meters` | `square-feet` | `square-yards`
    ): Self = this.set("areaUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaUnit: Self = this.set("areaUnit", js.undefined)
    
    @scala.inline
    def setCalculationType(value: planar | geodesic | `preserve-shape`): Self = this.set("calculationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationType: Self = this.set("calculationType", js.undefined)
    
    @scala.inline
    def setLengthUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = this.set("lengthUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthUnit: Self = this.set("lengthUnit", js.undefined)
    
    @scala.inline
    def setPolygonsVarargs(value: PolygonProperties*): Self = this.set("polygons", js.Array(value :_*))
    
    @scala.inline
    def setPolygons(value: js.Array[PolygonProperties]): Self = this.set("polygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygons: Self = this.set("polygons", js.undefined)
  }
}
