package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Converts Web Mercator coordinates to geographic coordinates and vice versa.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html)
  */
@js.native
trait webMercatorUtils extends StObject {
  
  def canProject(source: Any, target: Any): Boolean = js.native
  def canProject(source: Any, target: SpatialReference): Boolean = js.native
  def canProject(source: SpatialReference, target: Any): Boolean = js.native
  /**
    * Returns `true` if the `source` spatial reference can be projected to the `target` spatial reference with the [project()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#project) function, or if the `source` and `target` are the same [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#canProject)
    */
  def canProject(source: SpatialReference, target: SpatialReference): Boolean = js.native
  
  /**
    * Converts a geometry from geographic units (wkid: 4326) to Web Mercator units (wkid: 3857).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#geographicToWebMercator)
    */
  def geographicToWebMercator(geometry: Geometry_): Geometry_ = js.native
  
  /**
    * Translates the given latitude and longitude (decimal degree) values to Web Mercator XY values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#lngLatToXY)
    */
  def lngLatToXY(long: Double, lat: Double): js.Array[Double] = js.native
  
  def project(geometry: Geometry_, spatialReference: Any): Geometry_ = js.native
  /**
    * Projects the geometry clientside (if possible).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#project)
    */
  def project(geometry: Geometry_, spatialReference: SpatialReference): Geometry_ = js.native
  
  /**
    * Converts a geometry from Web Mercator units (wkid: 3857) to geographic units (wkid: 4326).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#webMercatorToGeographic)
    */
  def webMercatorToGeographic(geometry: Geometry_, isLinear: Boolean): Geometry_ = js.native
  
  /**
    * Translates the given Web Mercator coordinates to Longitude and Latitude values (decimal degrees).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#xyToLngLat)
    */
  def xyToLngLat(x: Double, y: Double): js.Array[Double] = js.native
}
