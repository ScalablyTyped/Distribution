package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bevel
import typings.arcgisJsApi.arcgisJsApiStrings.miter
import typings.arcgisJsApi.arcgisJsApiStrings.round
import typings.arcgisJsApi.arcgisJsApiStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait geometryEngine extends StObject {
  
  def buffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def buffer(
    geometry: js.Array[Geometry_],
    distance: js.Array[Double],
    unit: LinearUnits,
    unionResults: Boolean
  ): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  /**
    * Creates planar (or Euclidean) buffer polygons at a specified distance around the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#buffer)
    */
  def buffer(geometry: Geometry_, distance: Double, unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def buffer(geometry: Geometry_, distance: Double, unit: LinearUnits, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  
  /**
    * Calculates the clipped geometry from a target geometry by an envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#clip)
    */
  def clip(geometry: Geometry_, envelope: Extent): Geometry_ = js.native
  
  /**
    * Indicates if one geometry contains another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#contains)
    */
  def contains(containerGeometry: Geometry_, insideGeometry: Geometry_): Boolean = js.native
  
  /**
    * Calculates the convex hull of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#convexHull)
    */
  def convexHull(geometry: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  def convexHull(geometry: Geometry_, merge: Boolean): Geometry_ | js.Array[Geometry_] = js.native
  
  /**
    * Indicates if one geometry crosses another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#crosses)
    */
  def crosses(geometry1: Geometry_, geometry2: Geometry_): Boolean = js.native
  
  /**
    * Split the input Polyline or Polygon where it crosses a cutting Polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#cut)
    */
  def cut(geometry: Geometry_, cutter: Polyline): js.Array[Geometry_] = js.native
  
  def densify(geometry: Geometry_, maxSegmentLength: Double, maxSegmentLengthUnit: Double): Geometry_ = js.native
  /**
    * Densify geometries by plotting points between existing vertices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#densify)
    */
  def densify(geometry: Geometry_, maxSegmentLength: Double, maxSegmentLengthUnit: LinearUnits): Geometry_ = js.native
  
  def difference(inputGeometry: js.Array[Geometry_], subtractor: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  /**
    * Creates the difference of two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#difference)
    */
  def difference(inputGeometry: Geometry_, subtractor: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  
  /**
    * Indicates if one geometry is disjoint (doesn't intersect in any way) with another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#disjoint)
    */
  def disjoint(geometry1: Geometry_, geometry2: Geometry_): Boolean = js.native
  
  def distance(geometry1: Geometry_, geometry2: Geometry_, distanceUnit: Double): Double = js.native
  /**
    * Calculates the shortest planar distance between two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#distance)
    */
  def distance(geometry1: Geometry_, geometry2: Geometry_, distanceUnit: LinearUnits): Double = js.native
  
  /**
    * Indicates if two geometries are equal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#equals)
    */
  def equals(geometry1: Geometry_, geometry2: Geometry_): Boolean = js.native
  
  /**
    * Returns an Object containing additional information about the input spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#extendedSpatialReferenceInfo)
    */
  def extendedSpatialReferenceInfo(spatialReference: SpatialReference): SpatialReferenceInfo = js.native
  
  /**
    * Flips a geometry on the horizontal axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#flipHorizontal)
    */
  def flipHorizontal(geometry: Geometry_): Geometry_ = js.native
  def flipHorizontal(geometry: Geometry_, flipOrigin: Point): Geometry_ = js.native
  
  /**
    * Flips a geometry on the vertical axis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#flipVertical)
    */
  def flipVertical(geometry: Geometry_): Geometry_ = js.native
  def flipVertical(geometry: Geometry_, flipOrigin: Point): Geometry_ = js.native
  
  /**
    * Performs the generalize operation on the geometries in the cursor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#generalize)
    */
  def generalize(geometry: Geometry_, maxDeviation: Double): Geometry_ = js.native
  def generalize(geometry: Geometry_, maxDeviation: Double, removeDegenerateParts: Boolean): Geometry_ = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: Boolean,
    maxDeviationUnit: Double
  ): Geometry_ = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: Boolean,
    maxDeviationUnit: LinearUnits
  ): Geometry_ = js.native
  def generalize(geometry: Geometry_, maxDeviation: Double, removeDegenerateParts: Unit, maxDeviationUnit: Double): Geometry_ = js.native
  def generalize(
    geometry: Geometry_,
    maxDeviation: Double,
    removeDegenerateParts: Unit,
    maxDeviationUnit: LinearUnits
  ): Geometry_ = js.native
  
  def geodesicArea(geometry: Polygon, unit: Double): Double = js.native
  /**
    * Calculates the area of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicArea)
    */
  def geodesicArea(geometry: Polygon, unit: ArealUnits): Double = js.native
  
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: js.Array[Double], unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(
    geometry: js.Array[Geometry_],
    distance: js.Array[Double],
    unit: LinearUnits,
    unionResults: Boolean
  ): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: js.Array[Geometry_], distance: Double, unit: LinearUnits, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: js.Array[Double], unit: LinearUnits, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: Double): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: Double, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  /**
    * Creates geodesic buffer polygons at a specified distance around the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicBuffer)
    */
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: LinearUnits): Polygon | js.Array[Polygon] = js.native
  def geodesicBuffer(geometry: Geometry_, distance: Double, unit: LinearUnits, unionResults: Boolean): Polygon | js.Array[Polygon] = js.native
  
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double): Geometry_ = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double, maxSegmentLengthUnit: Double): Geometry_ = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double, maxSegmentLengthUnit: LinearUnits): Geometry_ = js.native
  /**
    * Returns a geodesically densified version of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicDensify)
    */
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double): Geometry_ = js.native
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double, maxSegmentLengthUnit: Double): Geometry_ = js.native
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double, maxSegmentLengthUnit: LinearUnits): Geometry_ = js.native
  
  def geodesicLength(geometry: Geometry_, unit: Double): Double = js.native
  /**
    * Calculates the length of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#geodesicLength)
    */
  def geodesicLength(geometry: Geometry_, unit: LinearUnits): Double = js.native
  
  def intersect(geometry: js.Array[Geometry_], intersector: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  /**
    * Creates a new geometry through intersection between two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#intersect)
    */
  def intersect(geometry: Geometry_, intersector: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  
  /**
    * Indicates if one geometry intersects another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#intersects)
    */
  def intersects(geometry1: Geometry_, geometry2: Geometry_): Boolean = js.native
  
  /**
    * Indicates if the given geometry is topologically simple.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#isSimple)
    */
  def isSimple(geometry: Geometry_): Boolean = js.native
  
  /**
    * Finds the coordinate of the geometry that is closest to the specified point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#nearestCoordinate)
    */
  def nearestCoordinate(geometry: Geometry_, inputPoint: Point): NearestPointResult = js.native
  
  /**
    * Finds the vertex on the geometry nearest to the specified point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#nearestVertex)
    */
  def nearestVertex(geometry: Geometry_, inputPoint: Point): NearestPointResult = js.native
  
  /**
    * Finds all vertices in the given distance from the specified point, sorted from the closest to the furthest and returns them as an array of Objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#nearestVertices)
    */
  def nearestVertices(geometry: Geometry_, inputPoint: Point, searchRadius: Double, maxVertexCountToReturn: Double): js.Array[NearestPointResult] = js.native
  
  /**
    * The offset operation creates a geometry that is a constant planar distance from an input polyline or polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#offset)
    */
  def offset(
    geometry: Geometry_ | js.Array[Geometry_],
    offsetDistance: Double,
    offsetUnit: LinearUnits | Double,
    joinType: round | bevel | miter | square,
    bevelRatio: js.UndefOr[Double],
    flattenError: js.UndefOr[Double]
  ): Geometry_ | js.Array[Geometry_] = js.native
  
  /**
    * Indicates if one geometry overlaps another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#overlaps)
    */
  def overlaps(geometry1: Geometry_, geometry2: Geometry_): Boolean = js.native
  
  def planarArea(geometry: Polygon, unit: Double): Double = js.native
  /**
    * Calculates the area of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarArea)
    */
  def planarArea(geometry: Polygon, unit: ArealUnits): Double = js.native
  
  def planarLength(geometry: Geometry_, unit: Double): Double = js.native
  /**
    * Calculates the length of the input geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#planarLength)
    */
  def planarLength(geometry: Geometry_, unit: LinearUnits): Double = js.native
  
  /**
    * Indicates if the given DE-9IM relation holds for the two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#relate)
    */
  def relate(geometry1: Geometry_, geometry2: Geometry_, relation: String): Boolean = js.native
  
  /**
    * Rotates a geometry counterclockwise by the specified number of degrees.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#rotate)
    */
  def rotate(geometry: Geometry_, angle: Double): Geometry_ = js.native
  def rotate(geometry: Geometry_, angle: Double, rotationOrigin: Point): Geometry_ = js.native
  
  /**
    * Performs the simplify operation on the geometry which alters the given geometries to make their definitions topologically legal with respect to their geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#simplify)
    */
  def simplify(geometry: Geometry_): Geometry_ = js.native
  
  def symmetricDifference(leftGeometry: js.Array[Geometry_], rightGeometry: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  /**
    * Creates the symmetric difference of two geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#symmetricDifference)
    */
  def symmetricDifference(leftGeometry: Geometry_, rightGeometry: Geometry_): Geometry_ | js.Array[Geometry_] = js.native
  
  /**
    * Indicates if one geometry touches another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#touches)
    */
  def touches(geometry1: Geometry_, geometry2: Geometry_): Boolean = js.native
  
  /**
    * All inputs must be of the same type of geometries and share one spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#union)
    */
  def union(geometries: js.Array[Geometry_]): Geometry_ = js.native
  
  /**
    * Indicates if one geometry is within another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#within)
    */
  def within(innerGeometry: Geometry_, outerGeometry: Geometry_): Boolean = js.native
}
