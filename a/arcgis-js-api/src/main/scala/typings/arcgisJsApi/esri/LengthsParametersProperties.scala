package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`preserve-shape`
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.arcgisJsApi.arcgisJsApiStrings.planar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LengthsParametersProperties extends js.Object {
  
  /**
    * Defines the type of calculation for the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#calculationType)
    */
  var calculationType: js.UndefOr[planar | geodesic | `preserve-shape`] = js.native
  
  /**
    * If polylines are in a geographic coordinate system, then geodesic needs to be set to `true` in order to calculate the ellipsoidal shortest path distance between each pair of the vertices in the polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  
  /**
    * The length unit in which perimeters of polygons will be calculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#lengthUnit)
    */
  var lengthUnit: js.UndefOr[Double | String] = js.native
  
  /**
    * The array of polylines whose lengths are to be computed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LengthsParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.native
}
object LengthsParametersProperties {
  
  @scala.inline
  def apply(): LengthsParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LengthsParametersProperties]
  }
  
  @scala.inline
  implicit class LengthsParametersPropertiesOps[Self <: LengthsParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setCalculationType(value: planar | geodesic | `preserve-shape`): Self = this.set("calculationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculationType: Self = this.set("calculationType", js.undefined)
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    
    @scala.inline
    def setLengthUnit(value: Double | String): Self = this.set("lengthUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLengthUnit: Self = this.set("lengthUnit", js.undefined)
    
    @scala.inline
    def setPolylinesVarargs(value: PolylineProperties*): Self = this.set("polylines", js.Array(value :_*))
    
    @scala.inline
    def setPolylines(value: js.Array[PolylineProperties]): Self = this.set("polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylines: Self = this.set("polylines", js.undefined)
  }
}
