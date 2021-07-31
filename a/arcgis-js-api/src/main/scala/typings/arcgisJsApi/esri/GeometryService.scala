package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryService
  extends StObject
     with Task {
  
  /**
    * Computes the area and length for the input [polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#areasAndLengths)
    */
  def areasAndLengths(areasAndLengthsParameters: AreasAndLengthsParameters): js.Promise[js.Any] = js.native
  def areasAndLengths(areasAndLengthsParameters: AreasAndLengthsParameters, requestOptions: js.Any): js.Promise[js.Any] = js.native
  
  /**
    * The Auto Complete operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#autoComplete)
    */
  def autoComplete(polygons: js.Array[Polygon], polylines: js.Array[Polyline]): js.Promise[Polygon] = js.native
  def autoComplete(polygons: js.Array[Polygon], polylines: js.Array[Polyline], requestOptions: js.Any): js.Promise[Polygon] = js.native
  
  /**
    * Creates buffer polygons at a specified distance around the given geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#buffer)
    */
  def buffer(bufferParameters: BufferParameters): js.Promise[js.Array[Polygon]] = js.native
  def buffer(bufferParameters: BufferParameters, requestOptions: js.Any): js.Promise[js.Array[Polygon]] = js.native
  
  /**
    * The convexHull operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#convexHull)
    */
  def convexHull(geometries: js.Array[Geometry_]): js.Promise[Geometry_] = js.native
  def convexHull(geometries: js.Array[Geometry_], requestOptions: js.Any): js.Promise[Geometry_] = js.native
  
  /**
    * The cut operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#cut)
    */
  def cut(geometries: js.Array[Geometry_], cutter: Polyline): js.Promise[js.Any] = js.native
  def cut(geometries: js.Array[Geometry_], cutter: Polyline, requestOptions: js.Any): js.Promise[js.Any] = js.native
  
  /**
    * The densify operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#densify)
    */
  def densify(densifyParameters: DensifyParameters): js.Promise[js.Array[Geometry_]] = js.native
  def densify(densifyParameters: DensifyParameters, requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * The difference operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#difference)
    */
  def difference(geometries: js.Array[Geometry_], geometry: Geometry_): js.Promise[Geometry_] = js.native
  def difference(geometries: js.Array[Geometry_], geometry: Geometry_, requestOptions: js.Any): js.Promise[Geometry_] = js.native
  
  /**
    * Measures the planar or geodesic distance between geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#distance)
    */
  def distance(params: DistanceParameters): js.Promise[Double] = js.native
  def distance(params: DistanceParameters, requestOptions: js.Any): js.Promise[Double] = js.native
  
  /**
    * Converts an array of well-known strings into xy-coordinates based on the conversion type and spatial reference supplied by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    */
  def fromGeoCoordinateString(params: GeometryServiceFromGeoCoordinateStringParams): js.Promise[js.Any] = js.native
  def fromGeoCoordinateString(params: GeometryServiceFromGeoCoordinateStringParams, requestOptions: js.Any): js.Promise[js.Any] = js.native
  
  /**
    * Generalizes the input geometries using the Douglas-Peucker algorithm.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#generalize)
    */
  def generalize(params: GeneralizeParameters): js.Promise[js.Array[Geometry_]] = js.native
  def generalize(params: GeneralizeParameters, requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * The intersect operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#intersect)
    */
  def intersect(geometries: js.Array[Geometry_], intersector: Geometry_): js.Promise[js.Array[Geometry_]] = js.native
  def intersect(geometries: js.Array[Geometry_], intersector: Geometry_, requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Calculates an interior point for each polygon specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#labelPoints)
    */
  def labelPoints(polygons: js.Array[Polygon]): js.Promise[Point] = js.native
  def labelPoints(polygons: js.Array[Polygon], requestOptions: js.Any): js.Promise[Point] = js.native
  
  /**
    * Gets the lengths for a [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) when the geometry type is [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#lengths)
    */
  def lengths(params: LengthsParameters): js.Promise[js.Any] = js.native
  def lengths(params: LengthsParameters, requestOptions: js.Any): js.Promise[js.Any] = js.native
  
  /**
    * Constructs the offset of the input geometries based on a planar distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#offset)
    */
  def offset(params: OffsetParameters): js.Promise[js.Array[Geometry_]] = js.native
  def offset(params: OffsetParameters, requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Projects a set of geometries to a new spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#project)
    */
  def project(params: ProjectParameters): js.Promise[js.Array[Geometry_]] = js.native
  def project(params: ProjectParameters, requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Computes the set of pairs of geometries from the input geometry arrays that belong to the specified relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#relation)
    */
  def relation(params: RelationParameters): js.Promise[js.Array[Polygon]] = js.native
  def relation(params: RelationParameters, requestOptions: js.Any): js.Promise[js.Array[Polygon]] = js.native
  
  /**
    * The reshape operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#reshape)
    */
  def reshape(targetGeometry: Geometry_, reshaper: Polyline): js.Promise[Geometry_] = js.native
  def reshape(targetGeometry: Geometry_, reshaper: Polyline, requestOptions: js.Any): js.Promise[Geometry_] = js.native
  
  /**
    * Alters the given geometries to make their definitions topologically legal with respect to their geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#simplify)
    */
  def simplify(geometries: js.Array[Geometry_]): js.Promise[js.Array[Geometry_]] = js.native
  def simplify(geometries: js.Array[Geometry_], requestOptions: js.Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Converts an array of XY-coordinates into well-known strings based on the conversion type and spatial reference supplied by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    */
  def toGeoCoordinateString(params: GeometryServiceToGeoCoordinateStringParams): js.Promise[js.Array[String]] = js.native
  def toGeoCoordinateString(params: GeometryServiceToGeoCoordinateStringParams, requestOptions: js.Any): js.Promise[js.Array[String]] = js.native
  
  /**
    * Trims or extends the input polylines using the user specified guide polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#trimExtend)
    */
  def trimExtend(params: TrimExtendParameters): js.Promise[js.Array[Polyline]] = js.native
  def trimExtend(params: TrimExtendParameters, requestOptions: js.Any): js.Promise[js.Array[Polyline]] = js.native
  
  /**
    * The union operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#union)
    */
  def union(geometries: js.Array[Geometry_]): js.Promise[Geometry_] = js.native
  def union(geometries: js.Array[Geometry_], requestOptions: js.Any): js.Promise[Geometry_] = js.native
}
