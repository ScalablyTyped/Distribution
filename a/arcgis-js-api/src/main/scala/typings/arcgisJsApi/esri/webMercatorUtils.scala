package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait webMercatorUtils extends js.Object {
  def canProject(source: js.Any, target: js.Any): Boolean = js.native
  def canProject(source: js.Any, target: SpatialReference): Boolean = js.native
  def canProject(source: SpatialReference, target: js.Any): Boolean = js.native
  /**
    * Returns `true` if the `source` spatial reference can be projected to the `target` spatial reference with the [project()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#project) function, or if the `source` and `target` are the same [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#canProject)
    *
    * @param source The input [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) or an object with `spatialReference` property such as [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) or [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    * @param target The target [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) or an object with `spatialReference` property such as [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) or [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    */
  def canProject(source: SpatialReference, target: SpatialReference): Boolean = js.native
  /**
    * Converts a geometry from geographic units (wkid: 4326) to Web Mercator units (wkid: 3857).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#geographicToWebMercator)
    *
    * @param geometry The input geometry to convert.
    *
    */
  def geographicToWebMercator(geometry: Geometry_): Geometry_ = js.native
  /**
    * Translates the given latitude and longitude (decimal degree) values to Web Mercator XY values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#lngLatToXY)
    *
    * @param long The longitude value to convert.
    * @param lat The latitude value to convert.
    *
    */
  def lngLatToXY(long: Double, lat: Double): js.Array[Double] = js.native
  def project(geometry: Geometry_, spatialReference: js.Any): Geometry_ = js.native
  /**
    * Projects the geometry clientside (if possible). You should test the input geometry in [canProject()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#canProject) prior to using this function. If the result of [canProject()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#canProject) is `true`, then proceed to project. If [canProject()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#canProject) returns `false`, then `project()` won't return useful results. Use [GeometryService.project()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#project) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#project)
    *
    * @param geometry The input geometry.
    * @param spatialReference The target [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) or an object with `spatialReference` property such as [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) or [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html).
    *
    */
  def project(geometry: Geometry_, spatialReference: SpatialReference): Geometry_ = js.native
  /**
    * Converts a geometry from Web Mercator units (wkid: 3857) to geographic units (wkid: 4326).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#webMercatorToGeographic)
    *
    * @param geometry The input geometry to convert.
    *
    */
  def webMercatorToGeographic(geometry: Geometry_): Geometry_ = js.native
  /**
    * Translates the given Web Mercator coordinates to Longitude and Latitude values (decimal degrees). By default the returned longitude is normalized so that it is within -180 and +180.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-webMercatorUtils.html#xyToLngLat)
    *
    * @param x The X coordinate value to convert.
    * @param y The Y coordinate value to convert.
    *
    */
  def xyToLngLat(x: Double, y: Double): js.Array[Double] = js.native
}

