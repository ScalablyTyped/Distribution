package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side projection engine for converting geometries from one [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) to another. When projecting geometries the starting spatial reference must be specified on the input geometry. You can specify a specific geographic (datum) transformation for the [project](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#project) operation, or accept the default transformation if one is needed.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html)
  */
@js.native
trait projection extends js.Object {
  def getTransformation(inSpatialReference: SpatialReferenceProperties, outSpatialReference: SpatialReference): GeographicTransformation = js.native
  def getTransformation(inSpatialReference: SpatialReferenceProperties, outSpatialReference: SpatialReferenceProperties): GeographicTransformation = js.native
  def getTransformation(
    inSpatialReference: SpatialReferenceProperties,
    outSpatialReference: SpatialReferenceProperties,
    extent: Extent
  ): GeographicTransformation = js.native
  def getTransformation(
    inSpatialReference: SpatialReferenceProperties,
    outSpatialReference: SpatialReference,
    extent: Extent
  ): GeographicTransformation = js.native
  /**
    * Returns the default geographic transformation used to convert the geometry from the input spatial reference to the output spatial reference. The default transformation is used when [projecting geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#project) where the datum transformation is required but not specified in the `geographicTransformation` parameter.
    * > **Known Limitations**
    *   * This method returns equation-based geographic transformations only.
    *   * Geographic transformations are returned with their maximum number of [steps](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps). Currently, number of steps is limited to 2.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#getTransformation)
    *
    * @param inSpatialReference The input spatial reference from which to project geometries. This is the spatial reference of the input geometries.
    * @param outSpatialReference The spatial reference to which you are converting the geometries.
    * @param extent An extent used to determine the suitability of the returned transformation. The extent will be re-projected to the `inSpatialReference` if it has a different spatial reference.
    *
    */
  def getTransformation(inSpatialReference: SpatialReference, outSpatialReference: SpatialReference): GeographicTransformation = js.native
  def getTransformation(inSpatialReference: SpatialReference, outSpatialReference: SpatialReferenceProperties): GeographicTransformation = js.native
  def getTransformation(
    inSpatialReference: SpatialReference,
    outSpatialReference: SpatialReferenceProperties,
    extent: Extent
  ): GeographicTransformation = js.native
  def getTransformation(inSpatialReference: SpatialReference, outSpatialReference: SpatialReference, extent: Extent): GeographicTransformation = js.native
  def getTransformations(inSpatialReference: SpatialReferenceProperties, outSpatialReference: SpatialReference): js.Array[GeographicTransformation] = js.native
  def getTransformations(inSpatialReference: SpatialReferenceProperties, outSpatialReference: SpatialReferenceProperties): js.Array[GeographicTransformation] = js.native
  def getTransformations(
    inSpatialReference: SpatialReferenceProperties,
    outSpatialReference: SpatialReferenceProperties,
    extent: Extent
  ): js.Array[GeographicTransformation] = js.native
  def getTransformations(
    inSpatialReference: SpatialReferenceProperties,
    outSpatialReference: SpatialReference,
    extent: Extent
  ): js.Array[GeographicTransformation] = js.native
  /**
    * Returns a list of all geographic transformations suitable to convert geometries from the input spatial reference to the specified output spatial reference. The list is ordered in descending order by suitability, with the most suitable being first in the list.
    * > **Known Limitations**
    *   * This method returns all the suitable equation-based geographic transformations.
    *   * Geographic transformations are returned with their maximum number of [steps](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-GeographicTransformation.html#steps). Currently, number of steps is limited to 2.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#getTransformations)
    *
    * @param inSpatialReference The spatial reference that the geometries are currently using.
    * @param outSpatialReference The spatial reference to which you are converting the geometries to.
    * @param extent An extent used to determine the suitability of the returned transformations. The extent will be re-projected to the input spatial reference if necessary.
    *
    */
  def getTransformations(inSpatialReference: SpatialReference, outSpatialReference: SpatialReference): js.Array[GeographicTransformation] = js.native
  def getTransformations(inSpatialReference: SpatialReference, outSpatialReference: SpatialReferenceProperties): js.Array[GeographicTransformation] = js.native
  def getTransformations(
    inSpatialReference: SpatialReference,
    outSpatialReference: SpatialReferenceProperties,
    extent: Extent
  ): js.Array[GeographicTransformation] = js.native
  def getTransformations(inSpatialReference: SpatialReference, outSpatialReference: SpatialReference, extent: Extent): js.Array[GeographicTransformation] = js.native
  /**
    * Indicates if all dependencies of this module have been loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#isLoaded)
    *
    *
    */
  def isLoaded(): Boolean = js.native
  /**
    * Indicates if this module is supported in the browser. The browser must support [WebAssembly](https://caniuse.com/#feat=wasm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#isSupported)
    *
    *
    */
  def isSupported(): Boolean = js.native
  /**
    * Loads this module's dependencies. This method must be called before [projecting](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#project) geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#load)
    *
    *
    */
  def load(): js.Promise[_] = js.native
  def project(geometry: js.Array[Geometry_], outSpatialReference: SpatialReference): Geometry_ | js.Array[Geometry_] = js.native
  def project(geometry: js.Array[Geometry_], outSpatialReference: SpatialReferenceProperties): Geometry_ | js.Array[Geometry_] = js.native
  def project(
    geometry: js.Array[Geometry_],
    outSpatialReference: SpatialReferenceProperties,
    geographicTransformation: GeographicTransformation
  ): Geometry_ | js.Array[Geometry_] = js.native
  def project(
    geometry: js.Array[Geometry_],
    outSpatialReference: SpatialReference,
    geographicTransformation: GeographicTransformation
  ): Geometry_ | js.Array[Geometry_] = js.native
  /**
    * Projects a geometry or an array of geometries to the specified output spatial reference. A default geographic transformation is used if not explicitly provided, but required. Use the [getTransformation()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#getTransformation) method to find out which transformation is used by default for the given input and output spatial references.  Note that you must [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#load) this module before attempting to project geometries.
    * > **Known Limitations**  This method uses the spatial reference of the first geometry as an input spatial reference. Therefore all geometries in the array must have the same spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#project)
    *
    * @param geometry The geometry or geometries to project.
    * @param outSpatialReference The spatial reference to which you are converting the geometries' coordinates.
    * @param geographicTransformation The geographic transformation used to transform the geometries. Specify this parameter to project a geometry when the default transformation is not appropriate for your requirements.
    *
    */
  def project(geometry: Geometry_, outSpatialReference: SpatialReference): Geometry_ | js.Array[Geometry_] = js.native
  def project(geometry: Geometry_, outSpatialReference: SpatialReferenceProperties): Geometry_ | js.Array[Geometry_] = js.native
  def project(
    geometry: Geometry_,
    outSpatialReference: SpatialReferenceProperties,
    geographicTransformation: GeographicTransformation
  ): Geometry_ | js.Array[Geometry_] = js.native
  def project(
    geometry: Geometry_,
    outSpatialReference: SpatialReference,
    geographicTransformation: GeographicTransformation
  ): Geometry_ | js.Array[Geometry_] = js.native
}

@JSGlobal("__esri.projection")
@js.native
object projection extends TopLevel[projection]

