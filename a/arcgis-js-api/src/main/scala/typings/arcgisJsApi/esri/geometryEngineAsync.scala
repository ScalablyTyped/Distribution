package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bevel
import typings.arcgisJsApi.arcgisJsApiStrings.miter
import typings.arcgisJsApi.arcgisJsApiStrings.round
import typings.arcgisJsApi.arcgisJsApiStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geometryEngineAsync extends js.Object {
  
  def buffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(
    geometry: js.Array[Geometry_],
    distance: js.Array[Double],
    unit: LinearUnits,
    unionResults: Boolean
  ): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: Double, unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: Double, unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  /**
    * Creates planar (or Euclidean) buffer polygons at a specified distance around the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#buffer)
    */
  def buffer(geometry: Geometry_, distance: Double, unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def buffer(geometry: Geometry_, distance: Double, unit: LinearUnits, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  
  /**
    * Calculates the clipped geometry from a target geometry by an envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#clip)
    */
  def clip(geometry: Geometry_, envelope: Extent): js.Promise[Geometry_] = js.native
  
  /**
    * Indicates if one geometry contains another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#contains)
    */
  def contains(containerGeometry: Geometry_, insideGeometry: Geometry_): js.Promise[Boolean] = js.native
  
  /**
    * Calculates the convex hull of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#convexHull)
    */
  def convexHull(geometry: Geometry_): js.Promise[Geometry_] = js.native
  def convexHull(geometry: Geometry_, merge: Boolean): js.Promise[Geometry_] = js.native
  
  /**
    * Indicates if one geometry crosses another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#crosses)
    */
  def crosses(geometry1: Geometry_, geometry2: Geometry_): js.Promise[Boolean] = js.native
  
  /**
    * Split the input Polyline or Polygon where it crosses a cutting Polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#cut)
    */
  def cut(geometry: Geometry_, cutter: Polyline): js.Promise[js.Array[Geometry_]] = js.native
  
  def densify(geometry: Geometry_, maxSegmentLength: Double, maxSegmentLengthUnit: Double): js.Promise[Geometry_] = js.native
  /**
    * Densify geometries by plotting points between existing vertices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#densify)
    */
  def densify(geometry: Geometry_, maxSegmentLength: Double, maxSegmentLengthUnit: LinearUnits): js.Promise[Geometry_] = js.native
  
  def difference(inputGeometry: js.Array[Geometry_], subtractor: Geometry_): js.Promise[Geometry_] = js.native
  /**
    * Creates the difference of two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#difference)
    */
  def difference(inputGeometry: Geometry_, subtractor: Geometry_): js.Promise[Geometry_] = js.native
  
  /**
    * Indicates if one geometry is disjoint (doesn't intersect in any way) with another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#disjoint)
    */
  def disjoint(geometry1: Geometry_, geometry2: Geometry_): js.Promise[Boolean] = js.native
  
  def distance(geometry1: Geometry_, geometry2: Geometry_, distanceUnit: Double): js.Promise[Double] = js.native
  /**
    * Calculates the shortest planar distance between two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#distance)
    */
  def distance(geometry1: Geometry_, geometry2: Geometry_, distanceUnit: LinearUnits): js.Promise[Double] = js.native
  
  /**
    * Indicates if two geometries are equal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#equals)
    */
  def equals(geometry1: Geometry_, geometry2: Geometry_): js.Promise[Boolean] = js.native
  
  /**
    * Returns an Object containing additional information about the input spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#extendedSpatialReferenceInfo)
    */
  def extendedSpatialReferenceInfo(spatialReference: SpatialReference): js.Promise[geometryEngineAsyncSpatialReferenceInfo] = js.native
  
  /**
    * Flips a geometry on the horizontal axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#flipHorizontal)
    */
  def flipHorizontal(geometry: Geometry_): js.Promise[Geometry_] = js.native
  def flipHorizontal(geometry: Geometry_, flipOrigin: Point): js.Promise[Geometry_] = js.native
  
  /**
    * Flips a geometry on the vertical axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#flipVertical)
    */
  def flipVertical(geometry: Geometry_): js.Promise[Geometry_] = js.native
  def flipVertical(geometry: Geometry_, flipOrigin: Point): js.Promise[Geometry_] = js.native
  
  /**
    * Performs the generalize operation on the geometries in the cursor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#generalize)
    */
  def generalize(geometry: Geometry_, maxDeviation: Double): js.Promise[Geometry_] = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: js.UndefOr[scala.Nothing],
    maxDeviationUnit: Double
  ): js.Promise[Geometry_] = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: js.UndefOr[scala.Nothing],
    maxDeviationUnit: LinearUnits
  ): js.Promise[Geometry_] = js.native
  def generalize(geometry: Geometry_, maxDeviation: Double, removeDegenerateParts: Boolean): js.Promise[Geometry_] = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: Boolean,
    maxDeviationUnit: Double
  ): js.Promise[Geometry_] = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: Boolean,
    maxDeviationUnit: LinearUnits
  ): js.Promise[Geometry_] = js.native
  
  def geodesicArea(geometry: Polygon, unit: Double): js.Promise[Double] = js.native
  /**
    * Calculates the area of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#geodesicArea)
    */
  def geodesicArea(geometry: Polygon, unit: ArealUnits): js.Promise[Double] = js.native
  
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(
    geometry: js.Array[Geometry_],
    distance: js.Array[Double],
    unit: LinearUnits,
    unionResults: Boolean
  ): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: Double): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: Double, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  /**
    * Creates geodesic buffer polygons at a specified distance around the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#geodesicBuffer)
    */
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: LinearUnits): js.Promise[Polygon | js.Array[Polygon]] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: LinearUnits, unionResults: Boolean): js.Promise[Polygon | js.Array[Polygon]] = js.native
  
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double): js.Promise[Geometry_] = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double, maxSegmentLengthUnit: Double): js.Promise[Geometry_] = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double, maxSegmentLengthUnit: LinearUnits): js.Promise[Geometry_] = js.native
  /**
    * Returns a geodesically densified version of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#geodesicDensify)
    */
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double): js.Promise[Geometry_] = js.native
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double, maxSegmentLengthUnit: Double): js.Promise[Geometry_] = js.native
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double, maxSegmentLengthUnit: LinearUnits): js.Promise[Geometry_] = js.native
  
  def geodesicLength(geometry: Geometry_, unit: Double): js.Promise[Double] = js.native
  /**
    * Calculates the length of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#geodesicLength)
    */
  def geodesicLength(geometry: Geometry_, unit: LinearUnits): js.Promise[Double] = js.native
  
  def intersect(geometry: js.Array[Geometry_], intersector: Geometry_): js.Promise[Geometry_] = js.native
  /**
    * Creates a new geometry through intersection between two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#intersect)
    */
  def intersect(geometry: Geometry_, intersector: Geometry_): js.Promise[Geometry_] = js.native
  
  /**
    * Indicates if one geometry intersects another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#intersects)
    */
  def intersects(geometry1: Geometry_, geometry2: Geometry_): js.Promise[Boolean] = js.native
  
  /**
    * Indicates if the given geometry is topologically simple.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#isSimple)
    */
  def isSimple(geometry: Geometry_): js.Promise[Boolean] = js.native
  
  /**
    * Finds the coordinate of the geometry that is closest to the specified point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#nearestCoordinate)
    */
  def nearestCoordinate(geometry: Geometry_, inputPoint: Point): js.Promise[NearestPointResult] = js.native
  
  /**
    * Finds vertex on the geometry nearest to the specified point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#nearestVertex)
    */
  def nearestVertex(geometry: Geometry_, inputPoint: Point): js.Promise[NearestPointResult] = js.native
  
  /**
    * Finds all vertices in the given distance from the specified point, sorted from the closest to the furthest and returns them as an array of Objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#nearestVertices)
    */
  def nearestVertices(geometry: Geometry_, inputPoint: Point, searchRadius: Double, maxVertexCountToReturn: Double): js.Promise[NearestPointResult] = js.native
  
  /**
    * The offset operation creates a geometry that is a constant planar distance from an input polyline or polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#offset)
    */
  def offset(
    geometry: Geometry_ | js.Array[Geometry_],
    offsetDistance: Double,
    offsetUnit: LinearUnits | Double,
    joinType: round | bevel | miter | square,
    bevelRatio: js.UndefOr[Double],
    flattenError: js.UndefOr[Double]
  ): js.Promise[Geometry_ | js.Array[Geometry_]] = js.native
  
  /**
    * Indicates if one geometry overlaps another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#overlaps)
    */
  def overlaps(geometry1: Geometry_, geometry2: Geometry_): js.Promise[Boolean] = js.native
  
  def planarArea(geometry: Polygon, unit: Double): js.Promise[Double] = js.native
  /**
    * Calculates the area of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#planarArea)
    */
  def planarArea(geometry: Polygon, unit: ArealUnits): js.Promise[Double] = js.native
  
  def planarLength(geometry: Geometry_, unit: Double): js.Promise[Double] = js.native
  /**
    * Calculates the length of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#planarLength)
    */
  def planarLength(geometry: Geometry_, unit: LinearUnits): js.Promise[Double] = js.native
  
  /**
    * Indicates if the given DE-9IM relation holds for the two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#relate)
    */
  def relate(geometry1: Geometry_, geometry2: Geometry_, relation: String): js.Promise[Boolean] = js.native
  
  /**
    * Rotates a geometry counterclockwise by the specified number of degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#rotate)
    */
  def rotate(geometry: Geometry_, angle: Double): js.Promise[Geometry_] = js.native
  def rotate(geometry: Geometry_, angle: Double, rotationOrigin: Point): js.Promise[Geometry_] = js.native
  
  /**
    * Performs the simplify operation on the geometry which alters the given geometries to make their definitions topologically legal with respect to their geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#simplify)
    */
  def simplify(geometry: Geometry_): js.Promise[Geometry_] = js.native
  
  def symmetricDifference(leftGeometry: js.Array[Geometry_], rightGeometry: Geometry_): js.Promise[Geometry_ | js.Array[Geometry_]] = js.native
  /**
    * Creates the symmetric difference of two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#symmetricDifference)
    */
  def symmetricDifference(leftGeometry: Geometry_, rightGeometry: Geometry_): js.Promise[Geometry_ | js.Array[Geometry_]] = js.native
  
  /**
    * Indicates if one geometry touches another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#touches)
    */
  def touches(geometry1: Geometry_, geometry2: Geometry_): js.Promise[Boolean] = js.native
  
  /**
    * All inputs must be of the same type of geometries and share one spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#union)
    */
  def union(geometries: js.Array[Geometry_]): js.Promise[Geometry_] = js.native
  
  /**
    * Indicates if one geometry is within another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngineAsync.html#within)
    */
  def within(innerGeometry: Geometry_, outerGeometry: Geometry_): js.Promise[Boolean] = js.native
}
