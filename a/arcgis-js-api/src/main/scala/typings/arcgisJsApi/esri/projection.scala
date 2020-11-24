package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side projection engine for converting geometries from one [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) to another.
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
    * Returns the default geographic transformation used to convert the geometry from the input spatial reference to the output spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#getTransformation)
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
    * Returns a list of all geographic transformations suitable to convert geometries from the input spatial reference to the specified output spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#getTransformations)
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
    */
  def isLoaded(): Boolean = js.native
  
  /**
    * Indicates if this module is supported in the browser.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#isSupported)
    */
  def isSupported(): Boolean = js.native
  
  /**
    * Loads this module's dependencies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#load)
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
    * Projects a geometry or an array of geometries to the specified output spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html#project)
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
