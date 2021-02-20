package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait meshUtils extends StObject {
  
  /**
    * Creates an elevation sampler from a mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createElevationSampler)
    */
  def createElevationSampler(mesh: Mesh): js.Promise[ElevationSampler] = js.native
  def createElevationSampler(mesh: Mesh, options: meshUtilsCreateElevationSamplerOptions): js.Promise[ElevationSampler] = js.native
  
  /**
    * Creates a mesh geometry by sampling elevation data from an elevation service on a regular grid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    */
  def createFromElevation(source: ElevationLayer, extent: Extent): js.Promise[Mesh] = js.native
  def createFromElevation(source: ElevationLayer, extent: Extent, options: meshUtilsCreateFromElevationOptions): js.Promise[Mesh] = js.native
  def createFromElevation(source: ElevationSampler, extent: Extent): js.Promise[Mesh] = js.native
  def createFromElevation(source: ElevationSampler, extent: Extent, options: meshUtilsCreateFromElevationOptions): js.Promise[Mesh] = js.native
  def createFromElevation(source: Ground, extent: Extent): js.Promise[Mesh] = js.native
  def createFromElevation(source: Ground, extent: Extent, options: meshUtilsCreateFromElevationOptions): js.Promise[Mesh] = js.native
  
  /**
    * Georeferences vertices specified in a Cartesian coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#georeference)
    */
  def georeference(vertexAttributes: VertexAttributes, location: Point): VertexAttributes = js.native
  def georeference(vertexAttributes: VertexAttributes, location: Point, options: meshUtilsGeoreferenceOptions): VertexAttributes = js.native
  
  /**
    * Merges multiple meshes into a single mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#merge)
    */
  def merge(geometries: js.Array[Mesh]): Mesh = js.native
  
  /**
    * Projects georeferenced vertices to a Cartesian coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#ungeoreference)
    */
  def ungeoreference(vertexAttributes: VertexAttributes, location: Point): VertexAttributes = js.native
  def ungeoreference(vertexAttributes: VertexAttributes, location: Point, options: meshUtilsUngeoreferenceOptions): VertexAttributes = js.native
}
