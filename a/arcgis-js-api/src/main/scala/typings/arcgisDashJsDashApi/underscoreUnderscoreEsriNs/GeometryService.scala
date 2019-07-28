package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryService extends Task {
  /**
    * Computes the area and length for the input [polygons](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#areasAndLengths)
    *
    * @param areasAndLengthsParameters Specify the input polygons and optionally the linear and area units.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def areasAndLengths(areasAndLengthsParameters: AreasAndLengthsParameters): IPromise[_] = js.native
  def areasAndLengths(areasAndLengthsParameters: AreasAndLengthsParameters, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * The Auto Complete operation is performed on a geometry service resource. The AutoComplete operation simplifies the process of constructing new polygons that are adjacent to other polygons. It constructs polygons that fill in the gaps between existing polygons and a set of polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#autoComplete)
    *
    * @param polygons The array of polygons that will provide boundaries for new polygons.
    * @param polylines An array of polylines that will provide the remaining boundaries for new polygons.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def autoComplete(polygons: js.Array[Polygon], polylines: js.Array[Polyline]): IPromise[Polygon] = js.native
  def autoComplete(polygons: js.Array[Polygon], polylines: js.Array[Polyline], requestOptions: js.Any): IPromise[Polygon] = js.native
  /**
    * Creates buffer polygons at a specified distance around the given geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#buffer)
    *
    * @param bufferParameters Specifies the input geometries, buffer distances, and other options.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def buffer(bufferParameters: BufferParameters): IPromise[js.Array[Polygon]] = js.native
  def buffer(bufferParameters: BufferParameters, requestOptions: js.Any): IPromise[js.Array[Polygon]] = js.native
  /**
    * The convexHull operation is performed on a geometry service resource. It returns the convex hull of the input geometry. The input geometry can be a point, multipoint, polyline or polygon. The hull is typically a polygon but can also be a polyline or point in degenerate cases.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#convexHull)
    *
    * @param geometries The geometries whose convex hull is to be created.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def convexHull(geometries: js.Array[Geometry]): IPromise[Geometry] = js.native
  def convexHull(geometries: js.Array[Geometry], requestOptions: js.Any): IPromise[Geometry] = js.native
  /**
    * The cut operation is performed on a geometry service resource. This operation splits the input polyline or polygon where it crosses a cutting polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#cut)
    *
    * @param geometries The polylines or polygons to be cut.
    * @param cutter The polyline that will be used to divide the target into pieces where it crosses the target.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def cut(geometries: js.Array[Geometry], cutter: Polyline): IPromise[_] = js.native
  def cut(geometries: js.Array[Geometry], cutter: Polyline, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * The densify operation is performed on a geometry service resource. This operation densifies geometries by plotting points between existing vertices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#densify)
    *
    * @param densifyParameters The DensifyParameters objects contains `geometries`, `geodesic`, `lengthUnit`, and `maxSegmentLength` properties.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def densify(densifyParameters: DensifyParameters): IPromise[js.Array[Geometry]] = js.native
  def densify(densifyParameters: DensifyParameters, requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * The difference operation is performed on a geometry service resource. This operation constructs the set-theoretic difference between an array of geometries and another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#difference)
    *
    * @param geometries An array of points, multipoints, polylines or polygons.
    * @param geometry A single geometry of any type, with a dimension equal to or greater than the items in geometries.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def difference(geometries: js.Array[Geometry], geometry: Geometry): IPromise[Geometry] = js.native
  def difference(geometries: js.Array[Geometry], geometry: Geometry, requestOptions: js.Any): IPromise[Geometry] = js.native
  /**
    * Measures the planar or geodesic distance between geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#distance)
    *
    * @param params Sets the input geometries to measure, distance units, and other parameters.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def distance(params: DistanceParameters): IPromise[Double] = js.native
  def distance(params: DistanceParameters, requestOptions: js.Any): IPromise[Double] = js.native
  /**
    * Converts an array of well-known strings into xy-coordinates based on the conversion type and spatial reference supplied by the user. Only available with ArcGIS Server 10.3 or above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#fromGeoCoordinateString)
    *
    * @param params See the object specifications table below for the structure of the  `params`  object.
    * @param params.strings An array of formatted strings as specified by `conversionType`. Example: `["01N AA 66021 00000" , "11S NT 00000 62155" , "31U BT 94071 65288"]`
    * @param params.sr The spatial reference or well-known ID to convert the input string coordinates to.
    * @param params.conversionType The conversion type of the input strings.  **Possible Values:** mrgs | usng | utm | geo-ref | gars | dms | ddm | dd
    * @param params.conversionMode Conversion options for mrgs, utm and gars conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for possible values and their descriptions.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def fromGeoCoordinateString(params: GeometryServiceFromGeoCoordinateStringParams): IPromise[_] = js.native
  def fromGeoCoordinateString(params: GeometryServiceFromGeoCoordinateStringParams, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * Generalizes the input geometries using the Douglas-Peucker algorithm.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#generalize)
    *
    * @param params An array of geometries to generalize and a maximum deviation. Optionally set the deviation units.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def generalize(params: GeneralizeParameters): IPromise[js.Array[Geometry]] = js.native
  def generalize(params: GeneralizeParameters, requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * The intersect operation is performed on a geometry service resource. This operation constructs the set-theoretic intersection between an array of geometries and another geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#intersect)
    *
    * @param geometries An array of points, multipoints, polylines, or polygons.
    * @param intersector A single geometry of any type, of dimension equal to or greater than the dimension of the items in `geometries`.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def intersect(geometries: js.Array[Geometry], intersector: Geometry): IPromise[js.Array[Geometry]] = js.native
  def intersect(geometries: js.Array[Geometry], intersector: Geometry, requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * Calculates an interior point for each polygon specified. These interior points can be used by clients for labeling the polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#labelPoints)
    *
    * @param polygons The polygon graphics to process.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def labelPoints(polygons: js.Array[Polygon]): IPromise[Point] = js.native
  def labelPoints(polygons: js.Array[Polygon], requestOptions: js.Any): IPromise[Point] = js.native
  /**
    * Gets the lengths for a [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) when the geometry type is [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#lengths)
    *
    * @param params Specify the polylines and optionally the length unit and the geodesic length option.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def lengths(params: LengthsParameters): IPromise[_] = js.native
  def lengths(params: LengthsParameters, requestOptions: js.Any): IPromise[_] = js.native
  /**
    * Constructs the offset of the input geometries based on a planar distance. If the offsetDistance is positive the constructed offset will be on the right side of the geometry. Left side offsets are constructed with negative values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#offset)
    *
    * @param params Set the geometries to offset, distance, and units.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def offset(params: OffsetParameters): IPromise[js.Array[Geometry]] = js.native
  def offset(params: OffsetParameters, requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * Projects a set of geometries to a new spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#project)
    *
    * @param params The input projection parameters.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def project(params: ProjectParameters): IPromise[js.Array[Geometry]] = js.native
  def project(params: ProjectParameters, requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * Computes the set of pairs of geometries from the input geometry arrays that belong to the specified relation. Both arrays are assumed to be in the same spatial reference. The relations are evaluated in 2D. Z-coordinates are not used. Geometry types cannot be mixed within an array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#relation)
    *
    * @param params The set of parameters required to perform the comparison.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def relation(params: RelationParameters): IPromise[js.Array[Polygon]] = js.native
  def relation(params: RelationParameters, requestOptions: js.Any): IPromise[js.Array[Polygon]] = js.native
  /**
    * The reshape operation is performed on a geometry service resource. It reshapes a [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) or a part of a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) using a reshaping line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#reshape)
    *
    * @param targetGeometry The Polyline or Polygon to be reshaped.
    * @param reshaper The single-part polyline that performs the reshaping.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def reshape(targetGeometry: Geometry, reshaper: Geometry): IPromise[Geometry] = js.native
  def reshape(targetGeometry: Geometry, reshaper: Geometry, requestOptions: js.Any): IPromise[Geometry] = js.native
  /**
    * Alters the given geometries to make their definitions topologically legal with respect to their geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#simplify)
    *
    * @param geometries The geometries to simplify.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def simplify(geometries: js.Array[Geometry]): IPromise[js.Array[Geometry]] = js.native
  def simplify(geometries: js.Array[Geometry], requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * Converts an array of XY-coordinates into well-known strings based on the conversion type and spatial reference supplied by the user. Only available with ArcGIS Server 10.3 or above.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#toGeoCoordinateString)
    *
    * @param params See the object specifications table below for the structure of the `params` object.
    * @param params.sr The spatial reference (or WKID of the spatial reference) of the XY-coordinates to be converted.
    * @param params.coordinates An array of XY-coordinates (in JSON format) to be converted.
    * @param params.conversionType The conversion type of the input strings.  **Possible values:** mgrs | usng | utm | geo-ref | gars | dms | ddm | dd
    * @param params.conversionMode Conversion options for mgrs and utm conversion types. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/to-geocoordinatestring.htm) for valid conversion modes and their descriptions.
    * @param params.numOfDigits The number of digits to output for each of the numerical portions in the string. The default value depends of `conversionType`. See the [ArcGIS REST API documentation](https://developers.arcgis.com/rest/services-reference/from-geocoordinatestring.htm) for default values.
    * @param params.rounding If `true`, then numeric portions of the string are rounded to the nearest whole magnitude as specified by `numOfDigits`. Otherwise, numeric portions of the string are truncated. The rounding parameter applies only to conversion types `mgrs`, `usng` and `geo-ref`.
    * @param params.addSpaces If `true`, then spaces are added between components of the string. The `addSpaces` parameter applies only to conversion types `mgrs`, `usng` and `utm`. The default value for `mgrs` is `false` , while the default value for both `usng` and `utm` is `true`.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def toGeoCoordinateString(params: GeometryServiceToGeoCoordinateStringParams): IPromise[js.Array[String]] = js.native
  def toGeoCoordinateString(params: GeometryServiceToGeoCoordinateStringParams, requestOptions: js.Any): IPromise[js.Array[String]] = js.native
  /**
    * Trims or extends the input polylines using the user specified guide polyline. When trimming features, the portion to the left of the cutting line is preserved in the output and the rest is discarded. If the input polyline is not cut or extended then an empty polyline is added to the output array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#trimExtend)
    *
    * @param params Input parameters for the `trimExtend` operation.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def trimExtend(params: TrimExtendParameters): IPromise[js.Array[Geometry]] = js.native
  def trimExtend(params: TrimExtendParameters, requestOptions: js.Any): IPromise[js.Array[Geometry]] = js.native
  /**
    * The union operation is performed on a geometry service resource. This operation constructs the set-theoretic union of the geometries in the input array. All inputs must be of the same type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html#union)
    *
    * @param geometries An array of the geometries to be unioned.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def union(geometries: js.Array[Geometry]): IPromise[Geometry] = js.native
  def union(geometries: js.Array[Geometry], requestOptions: js.Any): IPromise[Geometry] = js.native
}

@JSGlobal("__esri.GeometryService")
@js.native
/**
  * Represents a geometry service resource exposed by the ArcGIS REST API. It is used to perform various operations on geometries such as project, simplify, buffer, and relationships.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-GeometryService.html)
  */
class GeometryServiceCls () extends GeometryService {
  def this(properties: GeometryServiceProperties) = this()
}

