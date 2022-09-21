package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshConstructor
  extends StObject
     with /**
  * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
  */
Instantiable0[Mesh]
     with Instantiable1[/* properties */ MeshProperties, Mesh] {
  
  /**
    * Creates a mesh representing a box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createBox)
    */
  def createBox(location: Point): Mesh = js.native
  def createBox(location: Point, params: MeshCreateBoxParams): Mesh = js.native
  
  /**
    * Creates a mesh representing a cylinder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  def createCylinder(location: Point): Mesh = js.native
  def createCylinder(location: Point, params: MeshCreateCylinderParams): Mesh = js.native
  
  /**
    * Creates a new mesh geometry from a glTF model referenced by the `url` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromGLTF)
    */
  def createFromGLTF(location: Point, url: String): js.Promise[Mesh] = js.native
  def createFromGLTF(location: Point, url: String, params: MeshCreateFromGLTFParams): js.Promise[Mesh] = js.native
  
  /**
    * Creates a new mesh geometry from a polygon geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    */
  def createFromPolygon(polygon: Polygon): Mesh = js.native
  def createFromPolygon(polygon: Polygon, params: MeshCreateFromPolygonParams): Mesh = js.native
  
  /**
    * Creates a mesh representing a plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  def createPlane(location: Point): Mesh = js.native
  def createPlane(location: Point, params: MeshCreatePlaneParams): Mesh = js.native
  
  /**
    * Creates a mesh representing a sphere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  def createSphere(location: Point): Mesh = js.native
  def createSphere(location: Point, params: MeshCreateSphereParams): Mesh = js.native
  
  def fromJSON(json: Any): Mesh = js.native
}
