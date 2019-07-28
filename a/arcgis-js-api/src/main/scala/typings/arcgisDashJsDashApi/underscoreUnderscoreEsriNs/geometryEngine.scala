package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait geometryEngine extends js.Object {
  def buffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: String): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: Double, unit: String): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: Double, unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry], distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: js.Array[Double], unit: String): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: js.Array[Double], unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  /**
    * Creates planar (or Euclidean) buffer polygons at a specified distance around the input geometries.  The GeometryEngine has two methods for buffering geometries client-side: buffer and [geodesicBuffer](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicBuffer). Use caution when deciding which method to use. As a general rule, use [geodesicBuffer](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicBuffer) if the input geometries have a spatial reference of either WGS84 (wkid: 4326) or [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator). Only use buffer (this method) when attempting to buffer geometries with a [projected coordinate system](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) other than Web Mercator. If you need to buffer geometries with a [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) other than WGS84 (wkid: 4326), use [GeometryService.buffer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#buffer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#buffer)
    *
    * @param geometry The buffer input geometry. The `geometry` and `distance` parameters must be specified as either both arrays or both non-arrays. Never specify one as an array and the other a non-array.
    * @param distance The specified distance(s) for buffering. The `geometry` and `distance` parameters must be specified as either both arrays or both non-arrays. Never specify one as an array and the other a non-array. When using an array of geometries as input, the length of the geometry array does not have to equal the length of the `distance` array. For example, if you pass an array of four geometries: `[g1, g2, g3, g4]` and an array with one distance: `[d1]`, all four geometries will be buffered by the single distance value. If instead you use an array of three distances: `[d1, d2, d3]`, `g1` will be buffered by `d1`, `g2` by `d2`, and `g3` and `g4` will both be buffered by `d3`. The value of the geometry array will be matched one to one with those in the distance array until the final value of the distance array is reached, in which case that value will be applied to the remaining geometries.
    * @param unit Measurement unit of the distance(s). Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    * @param unionResults Determines whether the output geometries should be unioned into a single polygon.
    *
    */
  def buffer(geometry: Geometry, distance: Double, unit: String): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: Double, unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry, distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  /**
    * Calculates the clipped geometry from a target geometry by an envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#clip)
    *
    * @param geometry The geometry to be clipped.
    * @param envelope The envelope used to clip.
    *
    */
  def clip(geometry: Geometry, envelope: Extent): Geometry = js.native
  /**
    * Indicates if one geometry contains another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#contains)
    *
    * @param containerGeometry The geometry that is tested for the "contains" relationship to the other geometry. Think of this geometry as the potential "container" of the `insideGeometry`.
    * @param insideGeometry The geometry that is tested for the "within" relationship to the `containerGeometry`.
    *
    */
  def contains(containerGeometry: Geometry, insideGeometry: Geometry): Boolean = js.native
  /**
    * Calculates the convex hull of the input geometry. A convex hull is the smallest convex polygon that encloses a group of Objects, such as points. The input geometry can be a point, multipoint, polyline or polygon. The hull is typically a polygon but can also be a polyline or point in degenerate cases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#convexHull)
    *
    * @param geometry The input geometry.
    * @param merge Dictates whether to merge output geometries.
    *
    */
  def convexHull(geometry: Geometry): Geometry | js.Array[Geometry] = js.native
  def convexHull(geometry: Geometry, merge: Boolean): Geometry | js.Array[Geometry] = js.native
  /**
    * Indicates if one geometry crosses another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#crosses)
    *
    * @param geometry1 The geometry to cross.
    * @param geometry2 The geometry being crossed.
    *
    */
  def crosses(geometry1: Geometry, geometry2: Geometry): Boolean = js.native
  /**
    * Split the input Polyline or Polygon where it crosses a cutting Polyline. For Polylines, all left cuts are grouped together in the first Geometry. Right cuts and coincident cuts are grouped in the second Geometry and each undefined cut, along with any uncut parts, are output as separate Polylines. For Polygons, all left cuts are grouped in the first Polygon, all right cuts are grouped in the second Polygon, and each undefined cut, along with any left-over parts after cutting, are output as a separate Polygon. If no cuts are returned then the array will be empty. An undefined cut will only be produced if a left cut or right cut was produced and there was a part left over after cutting, or a cut is bounded to the left and right of the cutter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#cut)
    *
    * @param geometry The geometry to be cut.
    * @param cutter The polyline to cut the geometry.
    *
    */
  def cut(geometry: Geometry, cutter: Polyline): js.Array[Geometry] = js.native
  /**
    * Densify geometries by plotting points between existing vertices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#densify)
    *
    * @param geometry The geometry to be densified.
    * @param maxSegmentLength The maximum segment length allowed. Must be a positive value.
    * @param maxSegmentLengthUnit Measurement unit for maxSegmentLength. Defaults to the units of the input geometry. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    *
    */
  def densify(geometry: Geometry, maxSegmentLength: Double, maxSegmentLengthUnit: String): Geometry = js.native
  def densify(geometry: Geometry, maxSegmentLength: Double, maxSegmentLengthUnit: Double): Geometry = js.native
  def difference(inputGeometry: js.Array[Geometry], subtractor: Geometry): Geometry | js.Array[Geometry] = js.native
  /**
    * Creates the difference of two geometries. The resultant geometry is the portion of `inputGeometry` not in the `subtractor`. The dimension of the `subtractor` has to be equal to or greater than that of the `inputGeometry`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#difference)
    *
    * @param inputGeometry The input geometry to subtract from.
    * @param subtractor The geometry being subtracted from inputGeometry.
    *
    */
  def difference(inputGeometry: Geometry, subtractor: Geometry): Geometry | js.Array[Geometry] = js.native
  /**
    * Indicates if one geometry is disjoint (doesn't intersect in any way) with another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#disjoint)
    *
    * @param geometry1 The base geometry that is tested for the "disjoint" relationship to the other geometry.
    * @param geometry2 The comparison geometry that is tested for the "disjoint" relationship to the other geometry.
    *
    */
  def disjoint(geometry1: Geometry, geometry2: Geometry): Boolean = js.native
  /**
    * Calculates the shortest planar distance between two geometries. Distance is reported in the linear units specified by `distanceUnit` or, if `distanceUnit` is null, the units of the spatialReference of input geometry.
    * > To calculate the geodesic distance between two points, first construct a [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) using the two points of interest as the beginning and ending points of a single path. Then use the polyline as input for the [geodesicLength()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicLength) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#distance)
    *
    * @param geometry1 First input geometry.
    * @param geometry2 Second input geometry.
    * @param distanceUnit Measurement unit of the return value. Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    *
    */
  def distance(geometry1: Geometry, geometry2: Geometry, distanceUnit: String): Double = js.native
  def distance(geometry1: Geometry, geometry2: Geometry, distanceUnit: Double): Double = js.native
  /**
    * Indicates if two geometries are equal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#equals)
    *
    * @param geometry1 First input geometry.
    * @param geometry2 Second input geometry.
    *
    */
  def equals(geometry1: Geometry, geometry2: Geometry): Boolean = js.native
  /**
    * Returns an Object containing additional information about the input spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#extendedSpatialReferenceInfo)
    *
    * @param spatialReference The input spatial reference.
    *
    */
  def extendedSpatialReferenceInfo(spatialReference: SpatialReference): js.Any = js.native
  /**
    * Flips a geometry on the horizontal axis. Can optionally be flipped around a point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#flipHorizontal)
    *
    * @param geometry The input geometry to be flipped.
    * @param flipOrigin Point to flip the geometry around. Defaults to the centroid of the geometry.
    *
    */
  def flipHorizontal(geometry: Geometry): Geometry = js.native
  def flipHorizontal(geometry: Geometry, flipOrigin: Point): Geometry = js.native
  /**
    * Flips a geometry on the vertical axis. Can optionally be flipped around a point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#flipVertical)
    *
    * @param geometry The input geometry to be flipped.
    * @param flipOrigin Point to flip the geometry around. Defaults to the centroid of the geometry.
    *
    */
  def flipVertical(geometry: Geometry): Geometry = js.native
  def flipVertical(geometry: Geometry, flipOrigin: Point): Geometry = js.native
  /**
    * Performs the generalize operation on the geometries in the cursor. Point and Multipoint geometries are left unchanged. Envelope is converted to a Polygon and then generalized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#generalize)
    *
    * @param geometry The input geometry to be generalized.
    * @param maxDeviation The maximum allowed deviation from the generalized geometry to the original geometry.
    * @param removeDegenerateParts When `true` the degenerate parts of the geometry will be removed from the output (may be undesired for drawing).
    * @param maxDeviationUnit Measurement unit for maxDeviation. Defaults to the units of the input geometry. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    *
    */
  def generalize(geometry: Geometry, maxDeviation: Double): Geometry = js.native
  def generalize(geometry: Geometry, maxDeviation: Double, removeDegenerateParts: Boolean): Geometry = js.native
  def generalize(geometry: Geometry, maxDeviation: Double, removeDegenerateParts: Boolean, maxDeviationUnit: String): Geometry = js.native
  def generalize(geometry: Geometry, maxDeviation: Double, removeDegenerateParts: Boolean, maxDeviationUnit: Double): Geometry = js.native
  /**
    * Calculates the area of the input geometry. As opposed to [planarArea()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarArea), geodesicArea takes into account the curvature of the earth when performing this calculation. Therefore, when using input geometries with a spatial reference of either WGS84 (wkid: 4326) or [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator), it is best practice to calculate areas using geodesicArea(). If the input geometries have a projected coordinate system other than Web Mercator, use [planarArea()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarArea) instead.  This method only works with WGS84 (wkid: 4326) and [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator) spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicArea)
    *
    * @param geometry The input polygon.
    * @param unit Measurement unit of the return value. Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for area units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.AreaUnit.Code.ACRE). **Possible Values:** acres | ares | hectares | square-feet | square-meters | square-yards | square-kilometers | square-miles
    *
    */
  def geodesicArea(geometry: Polygon, unit: String): Double = js.native
  def geodesicArea(geometry: Polygon, unit: Double): Double = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: String): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: Double, unit: String): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: Double, unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry], distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: js.Array[Double], unit: String): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: js.Array[Double], unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  /**
    * Creates geodesic buffer polygons at a specified distance around the input geometries. When calculating distances, this method takes the curvature of the earth into account, which provides highly accurate results when dealing with very large geometries and/or geometries that spatially vary on a global scale where one projected coordinate system could not accurately plot coordinates and measure distances for all the geometries.  This method only works with WGS84 (wkid: 4326) and [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator) spatial references. In general, if your input geometries are assigned one of those two spatial references, you should always use geodesicBuffer() to obtain the most accurate results for those geometries. If needing to buffer points assigned a [projected coordinate system other than Web Mercator](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm), use [buffer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#buffer) instead. If the input geometries have a [geographic coordinate system](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) other than WGS84 (wkid: 4326), use [GeometryService.buffer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#buffer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicBuffer)
    *
    * @param geometry The buffer input geometry. The `geometry` and `distance` parameters must be specified as either both arrays or both non-arrays. Never specify one as an array and the other a non-array.
    * @param distance The specified distance(s) for buffering. The `geometry` and `distance` parameters must be specified as either both arrays or both non-arrays. Never specify one as an array and the other a non-array. When using an array of geometries as input, the length of the geometry array does not have to equal the length of the `distance` array. For example, if you pass an array of four geometries: `[g1, g2, g3, g4]` and an array with one distance: `[d1]`, all four geometries will be buffered by the single distance value. If instead you use an array of three distances: `[d1, d2, d3]`, `g1` will be buffered by `d1`, `g2` by `d2`, and `g3` and `g4` will both be buffered by `d3`. The value of the geometry array will be matched one to one with those in the distance array until the final value of the distance array is reached, in which case that value will be applied to the remaining geometries.
    * @param unit Measurement unit of the distance(s). Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    * @param unionResults Determines whether the output geometries should be unioned into a single polygon.
    *
    */
  def geodesicBuffer(geometry: Geometry, distance: Double, unit: String): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: Double, unit: String, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry, distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double, maxSegmentLengthUnit: String): Geometry = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double, maxSegmentLengthUnit: Double): Geometry = js.native
  /**
    * Returns a geodesically densified version of the input geometry. Use this function to draw the line(s) of the geometry along great circles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicDensify)
    *
    * @param geometry A polyline or polygon to densify.
    * @param maxSegmentLength The maximum segment length allowed. This must be a positive value.
    * @param maxSegmentLengthUnit Measurement unit for `maxSegmentLength`. If a unit is not specified, the units are considered to be the same as the units of the `geometry`. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    *
    */
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double, maxSegmentLengthUnit: String): Geometry = js.native
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double, maxSegmentLengthUnit: Double): Geometry = js.native
  /**
    * Calculates the length of the input geometry. As opposed to [planarLength()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarLength), geodesicLength() takes into account the curvature of the earth when performing this calculation. Therefore, when using input geometries with a spatial reference of either WGS84 (wkid: 4326) or [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator), it is best practice to calculate lengths using geodesicLength(). If the input geometries have a projected coordinate system other than Web Mercator, use [planarLength()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarLength) instead.  This method only works with WGS84 (wkid: 4326) and [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator) spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicLength)
    *
    * @param geometry The input geometry.
    * @param unit Measurement unit of the return value. Defaults to the units of the input geometry. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    *
    */
  def geodesicLength(geometry: Geometry, unit: String): Double = js.native
  def geodesicLength(geometry: Geometry, unit: Double): Double = js.native
  def intersect(geometry: js.Array[Geometry], intersector: Geometry): Geometry | js.Array[Geometry] = js.native
  /**
    * Creates a new geometry through intersection between two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#intersect)
    *
    * @param geometry The input geometry(ies).
    * @param intersector The geometry being intersected.
    *
    */
  def intersect(geometry: Geometry, intersector: Geometry): Geometry | js.Array[Geometry] = js.native
  /**
    * Indicates if one geometry intersects another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#intersects)
    *
    * @param geometry1 The geometry that is tested for the intersects relationship to the other geometry.
    * @param geometry2 The geometry being intersected.
    *
    */
  def intersects(geometry1: Geometry, geometry2: Geometry): Boolean = js.native
  /**
    * Indicates if the given geometry is topologically simple.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#isSimple)
    *
    * @param geometry The input geometry.
    *
    */
  def isSimple(geometry: Geometry): Boolean = js.native
  /**
    * Finds the coordinate of the geometry that is closest to the specified point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#nearestCoordinate)
    *
    * @param geometry The geometry to consider.
    * @param inputPoint The point used to search the nearest coordinate in the geometry.
    *
    */
  def nearestCoordinate(geometry: Geometry, inputPoint: Point): NearestPointResult = js.native
  /**
    * Finds the vertex on the geometry nearest to the specified point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#nearestVertex)
    *
    * @param geometry The geometry to consider.
    * @param inputPoint The point used to search the nearest vertex in the geometry.
    *
    */
  def nearestVertex(geometry: Geometry, inputPoint: Point): NearestPointResult = js.native
  /**
    * Finds all vertices in the given distance from the specified point, sorted from the closest to the furthest and returns them as an array of Objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#nearestVertices)
    *
    * @param geometry The geometry to consider.
    * @param inputPoint The point from which to measure.
    * @param searchRadius The distance to search from the inputPoint in the units of the view's spatial reference.
    * @param maxVertexCountToReturn The maximum number of vertices to return.
    *
    */
  def nearestVertices(geometry: Geometry, inputPoint: Point, searchRadius: Double, maxVertexCountToReturn: Double): js.Array[NearestPointResult] = js.native
  def offset(geometry: js.Array[Geometry], offsetDistance: Double, offsetUnit: String, joinType: String): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: js.Array[Geometry],
    offsetDistance: Double,
    offsetUnit: String,
    joinType: String,
    bevelRatio: Double
  ): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: js.Array[Geometry],
    offsetDistance: Double,
    offsetUnit: String,
    joinType: String,
    bevelRatio: Double,
    flattenError: Double
  ): Geometry | js.Array[Geometry] = js.native
  def offset(geometry: js.Array[Geometry], offsetDistance: Double, offsetUnit: Double, joinType: String): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: js.Array[Geometry],
    offsetDistance: Double,
    offsetUnit: Double,
    joinType: String,
    bevelRatio: Double
  ): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: js.Array[Geometry],
    offsetDistance: Double,
    offsetUnit: Double,
    joinType: String,
    bevelRatio: Double,
    flattenError: Double
  ): Geometry | js.Array[Geometry] = js.native
  /**
    * The offset operation creates a geometry that is a constant planar distance from an input polyline or polygon. It is similar to buffering, but produces a one-sided result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#offset)
    *
    * @param geometry The geometries to offset.
    * @param offsetDistance The planar distance to offset from the input geometry. If offsetDistance > 0, then the offset geometry is constructed to the right of the oriented input geometry, if offsetDistance = 0, then there is no change in the geometries, otherwise it is constructed to the left. For a simple polygon, the orientation of outer rings is clockwise and for inner rings it is counter clockwise. So the "right side" of a simple polygon is always its inside.
    * @param offsetUnit Measurement unit of the offset distance. Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER). **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    * @param joinType The join type.     **Possible values:** round | bevel | miter | square
    * @param bevelRatio Applicable when `joinType = 'miter'`; bevelRatio is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled.
    * @param flattenError Applicable when `joinType = 'round'`; flattenError determines the maximum distance of the resulting segments compared to the true circular arc. The algorithm never produces more than around 180 vertices for each round join.
    *
    */
  def offset(geometry: Geometry, offsetDistance: Double, offsetUnit: String, joinType: String): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: Geometry,
    offsetDistance: Double,
    offsetUnit: String,
    joinType: String,
    bevelRatio: Double
  ): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: Geometry,
    offsetDistance: Double,
    offsetUnit: String,
    joinType: String,
    bevelRatio: Double,
    flattenError: Double
  ): Geometry | js.Array[Geometry] = js.native
  def offset(geometry: Geometry, offsetDistance: Double, offsetUnit: Double, joinType: String): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: Geometry,
    offsetDistance: Double,
    offsetUnit: Double,
    joinType: String,
    bevelRatio: Double
  ): Geometry | js.Array[Geometry] = js.native
  def offset(
    geometry: Geometry,
    offsetDistance: Double,
    offsetUnit: Double,
    joinType: String,
    bevelRatio: Double,
    flattenError: Double
  ): Geometry | js.Array[Geometry] = js.native
  /**
    * Indicates if one geometry overlaps another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#overlaps)
    *
    * @param geometry1 The base geometry that is tested for the "overlaps" relationship with the other geometry.
    * @param geometry2 The comparison geometry that is tested for the "overlaps" relationship with the other geometry.
    *
    */
  def overlaps(geometry1: Geometry, geometry2: Geometry): Boolean = js.native
  /**
    * Calculates the area of the input geometry. As opposed to [geodesicArea()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicArea), planarArea() performs this calculation using projected coordinates and does not take into account the earth's curvature. When using input geometries with a spatial reference of either WGS84 (wkid: 4326) or [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator), it is best practice to calculate areas using [geodesicArea()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicArea). If the input geometries have a projected coordinate system other than Web Mercator, use planarArea() instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarArea)
    *
    * @param geometry The input polygon.
    * @param unit Measurement unit of the return value. Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for area units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.AreaUnit.Code.ACRE).  **Possible Values:** acres | ares | hectares | square-feet | square-meters | square-yards | square-kilometers | square-miles
    *
    */
  def planarArea(geometry: Polygon, unit: String): Double = js.native
  def planarArea(geometry: Polygon, unit: Double): Double = js.native
  /**
    * Calculates the length of the input geometry. As opposed to [geodesicLength()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicLength), planarLength() uses projected coordinates and does not take into account the curvature of the earth when performing this calculation. When using input geometries with a spatial reference of either WGS84 (wkid: 4326) or [Web Mercator](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator), it is best practice to calculate lengths using [geodesicLength()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicLength). If the input geometries have a projected coordinate system other than Web Mercator, use planarLength() instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarLength)
    *
    * @param geometry The input geometry.
    * @param unit Measurement unit of the return value. Defaults to the units of the input geometries. Use one of the possible values listed below or any of the [numeric codes for linear units](https://developers.arcgis.com/java/api-reference/constant-values.html#com.esri.core.geometry.LinearUnit.Code.CENTIMETER).  **Possible Values:** meters | feet | kilometers | miles | nautical-miles | yards
    *
    */
  def planarLength(geometry: Geometry, unit: String): Double = js.native
  def planarLength(geometry: Geometry, unit: Double): Double = js.native
  /**
    * Indicates if the given DE-9IM relation holds for the two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#relate)
    *
    * @param geometry1 The first geometry for the relation.
    * @param geometry2 The second geometry for the relation.
    * @param relation The Dimensionally Extended 9 Intersection Model (DE-9IM) matrix relation (encoded as a string) to test against the relationship of the two geometries. This string contains the test result of each intersection represented in the DE-9IM matrix. Each result is one character of the string and may be represented as either a number (maximum dimension returned: `0`,`1`,`2`), a Boolean value (`T` or `F`), or a mask character (for ignoring results: '\*').    Example: Each of the following DE-9IM string codes are valid for testing whether a polygon geometry completely contains a line geometry: `TTTFFTFFT` (Boolean), 'T*\*\*\*\*\*FF\*' (ignore irrelevant intersections), or '102FF\*FF\*' (dimension form). Each returns the same result.    See [this article](https://en.wikipedia.org/wiki/DE-9IM) and [this ArcGIS help page](https://desktop.arcgis.com/en/arcmap/latest/manage-data/using-sql-with-gdbs/relational-functions-for-st-geometry.htm) for more information about the DE-9IM model and how string codes are constructed.
    *
    */
  def relate(geometry1: Geometry, geometry2: Geometry, relation: String): Boolean = js.native
  /**
    * Rotates a geometry counterclockwise by the specified number of degrees. Rotation is around the centroid, or a given rotation point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#rotate)
    *
    * @param geometry The geometry to rotate.
    * @param angle The rotation angle in degrees.
    * @param rotationOrigin Point to rotate the geometry around. Defaults to the centroid of the geometry.
    *
    */
  def rotate(geometry: Geometry, angle: Double): Geometry = js.native
  def rotate(geometry: Geometry, angle: Double, rotationOrigin: Point): Geometry = js.native
  /**
    * Performs the simplify operation on the geometry which alters the given geometries to make their definitions topologically legal with respect to their geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#simplify)
    *
    * @param geometry The geometry to be simplified.
    *
    */
  def simplify(geometry: Geometry): Geometry = js.native
  def symmetricDifference(leftGeometry: js.Array[Geometry], rightGeometry: Geometry): Geometry | js.Array[Geometry] = js.native
  /**
    * Creates the symmetric difference of two geometries. The symmetric difference includes the parts that are in either of the sets, but not in both.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#symmetricDifference)
    *
    * @param leftGeometry One of the Geometry instances in the XOR operation.
    * @param rightGeometry One of the Geometry instances in the XOR operation.
    *
    */
  def symmetricDifference(leftGeometry: Geometry, rightGeometry: Geometry): Geometry | js.Array[Geometry] = js.native
  /**
    * Indicates if one geometry touches another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#touches)
    *
    * @param geometry1 The geometry to test the "touches" relationship with the other geometry.
    * @param geometry2 The geometry to be touched.
    *
    */
  def touches(geometry1: Geometry, geometry2: Geometry): Boolean = js.native
  /**
    * All inputs must be of the same type of geometries and share one spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#union)
    *
    * @param geometries An array of Geometries to union.
    *
    */
  def union(geometries: js.Array[Geometry]): Geometry = js.native
  /**
    * Indicates if one geometry is within another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#within)
    *
    * @param innerGeometry The base geometry that is tested for the "within" relationship to the other geometry.
    * @param outerGeometry The comparison geometry that is tested for the "contains" relationship to the other geometry.
    *
    */
  def within(innerGeometry: Geometry, outerGeometry: Geometry): Boolean = js.native
}

