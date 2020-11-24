package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-centimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-decimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-inches`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-meters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-millimeters`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`square-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.acres
import typings.arcgisJsApi.arcgisJsApiStrings.ares
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.hectares
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geodesicUtils extends js.Object {
  
  /**
    * Geodetically computes the area for one or more polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicAreas)
    */
  def geodesicAreas(polygons: js.Array[Polygon]): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_acres(polygons: js.Array[Polygon], unit: acres): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_ares(polygons: js.Array[Polygon], unit: ares): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_hectares(polygons: js.Array[Polygon], unit: hectares): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squarecentimeters(polygons: js.Array[Polygon], unit: `square-centimeters`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squaredecimeters(polygons: js.Array[Polygon], unit: `square-decimeters`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squarefeet(polygons: js.Array[Polygon], unit: `square-feet`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squareinches(polygons: js.Array[Polygon], unit: `square-inches`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squarekilometers(polygons: js.Array[Polygon], unit: `square-kilometers`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squaremeters(polygons: js.Array[Polygon], unit: `square-meters`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squaremiles(polygons: js.Array[Polygon], unit: `square-miles`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squaremillimeters(polygons: js.Array[Polygon], unit: `square-millimeters`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squareusfeet(polygons: js.Array[Polygon], unit: `square-us-feet`): js.Array[Double] = js.native
  @JSName("geodesicAreas")
  def geodesicAreas_squareyards(polygons: js.Array[Polygon], unit: `square-yards`): js.Array[Double] = js.native
  
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double): Polyline | Polygon = js.native
  /**
    * Computes and returns a densified polyline or polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicDensify)
    */
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double): Polyline | Polygon = js.native
  
  /**
    * Geodetically computes the direction and distance between two known locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicDistance)
    */
  def geodesicDistance(from: Point, to: Point): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_centimeters(from: Point, to: Point, unit: centimeters): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_decimeters(from: Point, to: Point, unit: decimeters): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_feet(from: Point, to: Point, unit: feet_): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_inches(from: Point, to: Point, unit: inches): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_kilometers(from: Point, to: Point, unit: kilometers_): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_meters(from: Point, to: Point, unit: meters_): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_miles(from: Point, to: Point, unit: miles_): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_millimeters(from: Point, to: Point, unit: millimeters): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_nauticalmiles(from: Point, to: Point, unit: `nautical-miles`): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_usfeet(from: Point, to: Point, unit: `us-feet`): GeodesicDistanceResult = js.native
  @JSName("geodesicDistance")
  def geodesicDistance_yards(from: Point, to: Point, unit: yards): GeodesicDistanceResult = js.native
  
  /**
    * Geodetically computes polygon perimeter or polyline length for one or more geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicLengths)
    */
  def geodesicLengths(geometries: js.Array[Polygon | Polyline]): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_centimeters(geometries: js.Array[Polygon | Polyline], unit: centimeters): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_decimeters(geometries: js.Array[Polygon | Polyline], unit: decimeters): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_feet(geometries: js.Array[Polygon | Polyline], unit: feet_): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_inches(geometries: js.Array[Polygon | Polyline], unit: inches): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_kilometers(geometries: js.Array[Polygon | Polyline], unit: kilometers_): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_meters(geometries: js.Array[Polygon | Polyline], unit: meters_): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_miles(geometries: js.Array[Polygon | Polyline], unit: miles_): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_millimeters(geometries: js.Array[Polygon | Polyline], unit: millimeters): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_nauticalmiles(geometries: js.Array[Polygon | Polyline], unit: `nautical-miles`): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_usfeet(geometries: js.Array[Polygon | Polyline], unit: `us-feet`): js.Array[Double] = js.native
  @JSName("geodesicLengths")
  def geodesicLengths_yards(geometries: js.Array[Polygon | Polyline], unit: yards): js.Array[Double] = js.native
  
  /**
    * Geodetically computes the location at a defined distance and direction from a known location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#pointFromDistance)
    */
  def pointFromDistance(point: Point, distance: Double, azimuth: Double): Point = js.native
}
