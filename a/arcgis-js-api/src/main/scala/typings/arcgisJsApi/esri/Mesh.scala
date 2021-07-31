package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.esri.geometry.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mesh
  extends StObject
     with Geometry_
     with Geometry
     with geometryGeometry {
  
  /**
    * Adds a component to the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#addComponent)
    */
  def addComponent(component: MeshComponent): Unit = js.native
  def addComponent(component: MeshComponentProperties): Unit = js.native
  
  /**
    * Centers the mesh at the specified location without changing its scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt)
    */
  def centerAt(location: Point): Mesh = js.native
  def centerAt(location: Point, params: MeshCenterAtParams): Mesh = js.native
  
  /**
    * An array of mesh components that can be used to apply materials to different regions of the same mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#components)
    */
  var components: js.Array[MeshComponent] = js.native
  
  /**
    * Offsets the mesh geometry by the specified distance in x, y, and z.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#offset)
    */
  def offset(dx: Double, dy: Double, dz: Double): Mesh = js.native
  def offset(dx: Double, dy: Double, dz: Double, params: MeshOffsetParams): Mesh = js.native
  
  /**
    * Removes a component from the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#removeComponent)
    */
  def removeComponent(component: MeshComponent): Unit = js.native
  
  /**
    * Rotates the mesh geometry around its x, y and z axis (in that order).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#rotate)
    */
  def rotate(angleX: Double, angleY: Double, angleZ: Double): Mesh = js.native
  def rotate(angleX: Double, angleY: Double, angleZ: Double, params: MeshRotateParams): Mesh = js.native
  
  /**
    * Scales the mesh geometry by the specified factor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale)
    */
  def scale(factor: Double): Mesh = js.native
  def scale(factor: Double, params: MeshScaleParams): Mesh = js.native
  
  /**
    * The string value representing the type of geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#type)
    */
  @JSName("type")
  val type_Mesh: mesh = js.native
  
  /**
    * Object describing the attributes of each vertex of the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var vertexAttributes: MeshVertexAttributes = js.native
  
  /**
    * Notifies that any cached values that depend on vertex attributes need to be recalculated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributesChanged)
    */
  def vertexAttributesChanged(): Unit = js.native
}
