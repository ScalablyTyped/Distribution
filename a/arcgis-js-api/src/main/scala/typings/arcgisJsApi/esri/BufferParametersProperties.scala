package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferParametersProperties extends StObject {
  
  /**
    * The spatial reference in which the geometries are buffered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#bufferSpatialReference)
    */
  var bufferSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The distances the input features are buffered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#distances)
    */
  var distances: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * If the input geometries are in a geographic coordinate system, set geodesic to `true` to generate a buffer polygon using a geodesic distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geodesic)
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The input geometries to buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.undefined
  
  /**
    * The spatial reference for the returned geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#outSpatialReference)
    */
  var outSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * If `true`, all geometries buffered at a given distance are unioned into a single (possibly multipart) polygon, and the unioned geometry is placed in the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unionResults)
    */
  var unionResults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The units for calculating each buffer distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-BufferParameters.html#unit)
    */
  var unit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.undefined
}
object BufferParametersProperties {
  
  @scala.inline
  def apply(): BufferParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferParametersProperties]
  }
  
  @scala.inline
  implicit class BufferParametersPropertiesMutableBuilder[Self <: BufferParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "bufferSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSpatialReferenceUndefined: Self = StObject.set(x, "bufferSpatialReference", js.undefined)
    
    @scala.inline
    def setDistances(value: js.Array[Double]): Self = StObject.set(x, "distances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistancesUndefined: Self = StObject.set(x, "distances", js.undefined)
    
    @scala.inline
    def setDistancesVarargs(value: Double*): Self = StObject.set(x, "distances", js.Array(value :_*))
    
    @scala.inline
    def setGeodesic(value: Boolean): Self = StObject.set(x, "geodesic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeodesicUndefined: Self = StObject.set(x, "geodesic", js.undefined)
    
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setOutSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    @scala.inline
    def setUnionResults(value: Boolean): Self = StObject.set(x, "unionResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnionResultsUndefined: Self = StObject.set(x, "unionResults", js.undefined)
    
    @scala.inline
    def setUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
