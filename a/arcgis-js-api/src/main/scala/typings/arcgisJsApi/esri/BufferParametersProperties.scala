package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferParametersProperties extends js.Object {
  
  /**
    * The spatial reference in which the geometries are buffered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#bufferSpatialReference)
    */
  var bufferSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The distances the input features are buffered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#distances)
    */
  var distances: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * If the input geometries are in a geographic coordinate system, set geodesic to `true` to generate a buffer polygon using a geodesic distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  
  /**
    * The input geometries to buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * The spatial reference for the returned geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * If `true`, all geometries buffered at a given distance are unioned into a single (possibly multipart) polygon, and the unioned geometry is placed in the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unionResults)
    */
  var unionResults: js.UndefOr[Boolean] = js.native
  
  /**
    * The units for calculating each buffer distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unit)
    */
  var unit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
}
object BufferParametersProperties {
  
  @scala.inline
  def apply(): BufferParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferParametersProperties]
  }
  
  @scala.inline
  implicit class BufferParametersPropertiesOps[Self <: BufferParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setBufferSpatialReference(value: SpatialReferenceProperties): Self = this.set("bufferSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSpatialReference: Self = this.set("bufferSpatialReference", js.undefined)
    
    @scala.inline
    def setDistancesVarargs(value: Double*): Self = this.set("distances", js.Array(value :_*))
    
    @scala.inline
    def setDistances(value: js.Array[Double]): Self = this.set("distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistances: Self = this.set("distances", js.undefined)
    
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
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = this.set("outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutSpatialReference: Self = this.set("outSpatialReference", js.undefined)
    
    @scala.inline
    def setUnionResults(value: Boolean): Self = this.set("unionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnionResults: Self = this.set("unionResults", js.undefined)
    
    @scala.inline
    def setUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
