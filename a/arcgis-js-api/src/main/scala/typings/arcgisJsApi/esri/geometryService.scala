package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience module for importing [geometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html) functions when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/typescript-setup/).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html)
  */
@js.native
trait geometryService extends StObject {
  
  /**
    * Computes the area and length for the input [polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#areasAndLengths)
    */
  def areasAndLengths(url: String, areasAndLengthsParameters: AreasAndLengthsParameters): js.Promise[Any] = js.native
  def areasAndLengths(url: String, areasAndLengthsParameters: AreasAndLengthsParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * The Auto Complete operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#autoComplete)
    */
  def autoComplete(url: String, polygons: js.Array[Polygon], polylines: js.Array[Polyline]): js.Promise[Polygon] = js.native
  def autoComplete(url: String, polygons: js.Array[Polygon], polylines: js.Array[Polyline], requestOptions: Any): js.Promise[Polygon] = js.native
  
  /**
    * Creates buffer polygons at a specified distance around the given geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#buffer)
    */
  def buffer(url: String, bufferParameters: BufferParameters): js.Promise[js.Array[Polygon]] = js.native
  def buffer(url: String, bufferParameters: BufferParameters, requestOptions: Any): js.Promise[js.Array[Polygon]] = js.native
  
  /**
    * The convexHull operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#convexHull)
    */
  def convexHull(url: String, geometries: js.Array[Geometry_]): js.Promise[Geometry_] = js.native
  def convexHull(url: String, geometries: js.Array[Geometry_], requestOptions: Any): js.Promise[Geometry_] = js.native
  
  /**
    * The cut operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#cut)
    */
  def cut(url: String, geometries: js.Array[Geometry_], cutter: Polyline): js.Promise[Any] = js.native
  def cut(url: String, geometries: js.Array[Geometry_], cutter: Polyline, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * The densify operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#densify)
    */
  def densify(url: String, densifyParameters: DensifyParameters): js.Promise[js.Array[Geometry_]] = js.native
  def densify(url: String, densifyParameters: DensifyParameters, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * The difference operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#difference)
    */
  def difference(url: String, geometries: js.Array[Geometry_], geometry: Geometry_): js.Promise[Geometry_] = js.native
  def difference(url: String, geometries: js.Array[Geometry_], geometry: Geometry_, requestOptions: Any): js.Promise[Geometry_] = js.native
  
  /**
    * Measures the planar or geodesic distance between geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#distance)
    */
  def distance(url: String, distanceParameters: DistanceParameters): js.Promise[Double] = js.native
  def distance(url: String, distanceParameters: DistanceParameters, requestOptions: Any): js.Promise[Double] = js.native
  
  /**
    * Converts an array of well-known strings into xy-coordinates based on the conversion type and spatial reference supplied by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#fromGeoCoordinateString)
    */
  def fromGeoCoordinateString(url: String, params: geometryServiceFromGeoCoordinateStringParams): js.Promise[Any] = js.native
  def fromGeoCoordinateString(url: String, params: geometryServiceFromGeoCoordinateStringParams, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * Generalizes the input geometries using the Douglas-Peucker algorithm.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#generalize)
    */
  def generalize(url: String, generalizeParameters: GeneralizeParameters): js.Promise[js.Array[Geometry_]] = js.native
  def generalize(url: String, generalizeParameters: GeneralizeParameters, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * The intersect operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#intersect)
    */
  def intersect(url: String, geometries: js.Array[Geometry_], intersector: Geometry_): js.Promise[js.Array[Geometry_]] = js.native
  def intersect(url: String, geometries: js.Array[Geometry_], intersector: Geometry_, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Calculates an interior point for each polygon specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#labelPoints)
    */
  def labelPoints(url: String, polygons: js.Array[Polygon]): js.Promise[Point] = js.native
  def labelPoints(url: String, polygons: js.Array[Polygon], requestOptions: Any): js.Promise[Point] = js.native
  
  /**
    * Gets the lengths for a [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) when the geometry type is [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#lengths)
    */
  def lengths(url: String, lengthsParameters: LengthsParameters): js.Promise[Any] = js.native
  def lengths(url: String, lengthsParameters: LengthsParameters, requestOptions: Any): js.Promise[Any] = js.native
  
  /**
    * Constructs the offset of the input geometries based on a planar distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#offset)
    */
  def offset(url: String, offsetParameters: OffsetParameters): js.Promise[js.Array[Geometry_]] = js.native
  def offset(url: String, offsetParameters: OffsetParameters, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Projects a set of geometries to a new spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#project)
    */
  def project(url: String, projectParameters: ProjectParameters): js.Promise[js.Array[Geometry_]] = js.native
  def project(url: String, projectParameters: ProjectParameters, requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Computes the set of pairs of geometries from the input geometry arrays that belong to the specified relation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#relation)
    */
  def relation(url: String, relationParameters: RelationParameters): js.Promise[js.Array[Polygon]] = js.native
  def relation(url: String, relationParameters: RelationParameters, requestOptions: Any): js.Promise[js.Array[Polygon]] = js.native
  
  /**
    * The reshape operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#reshape)
    */
  def reshape(url: String, geometry: Geometry_, reshaper: Polyline): js.Promise[Geometry_] = js.native
  def reshape(url: String, geometry: Geometry_, reshaper: Polyline, requestOptions: Any): js.Promise[Geometry_] = js.native
  
  /**
    * Alters the given geometries to make their definitions topologically legal with respect to their geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#simplify)
    */
  def simplify(geometries: js.Array[Geometry_]): js.Promise[js.Array[Geometry_]] = js.native
  def simplify(geometries: js.Array[Geometry_], requestOptions: Any): js.Promise[js.Array[Geometry_]] = js.native
  
  /**
    * Converts an array of XY-coordinates into well-known strings based on the conversion type and spatial reference supplied by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#toGeoCoordinateString)
    */
  def toGeoCoordinateString(url: String, params: geometryServiceToGeoCoordinateStringParams): js.Promise[js.Array[String]] = js.native
  def toGeoCoordinateString(url: String, params: geometryServiceToGeoCoordinateStringParams, requestOptions: Any): js.Promise[js.Array[String]] = js.native
  
  /**
    * Trims or extends the input polylines using the user specified guide polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#trimExtend)
    */
  def trimExtend(url: String, trimExtendParameters: TrimExtendParameters): js.Promise[js.Array[Polyline]] = js.native
  def trimExtend(url: String, trimExtendParameters: TrimExtendParameters, requestOptions: Any): js.Promise[js.Array[Polyline]] = js.native
  
  /**
    * The union operation is performed on a geometry service resource.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#union)
    */
  def union(url: String, geometries: js.Array[Geometry_]): js.Promise[Geometry_] = js.native
  def union(url: String, geometries: js.Array[Geometry_], requestOptions: Any): js.Promise[Geometry_] = js.native
}
