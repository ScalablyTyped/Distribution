package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mesh
  extends Geometry
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.geometryNs.Geometry
     with geometryGeometry {
  /**
    * An array of mesh components that can be used to apply materials to different regions of the same mesh. There are three common usage patterns for components.  1. **Specify a material for the whole mesh.** In this case, use a single component with only a material (leaving faces as `null`). 2. **Reuse vertex attributes.** When modeling continuous surfaces, it can be convenient to only specify vertices once and then simply refer to them. In this case, use a single component with faces set to index the vertex attributes that form triangles. 3. **Specify multiple materials for the same mesh.** In this case, use multiple components with faces that determine to which region of the mesh the material of the component applies.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#components)
    */
  var components: js.Array[MeshComponent] = js.native
  /**
    * For Mesh, the type is always `mesh`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#type)
    */
  @JSName("type")
  val type_Mesh: mesh = js.native
  /**
    * Object describing the attributes of each vertex of the mesh. Vertex attributes are flat numerical arrays that describe the position (mandatory), normal (used for lighting calculations and shading) and uv (used for mapping material images to the mesh surface) for each vertex.  Vertex attributes can be addressed by indices specified in the components [faces](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces) property. If the mesh does not contain any components, or if a component does not specify any faces, then the vertex attributes are interpreted as if each consecutive vertex triple makes up a triangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var vertexAttributes: MeshVertexAttributes = js.native
  /**
    * Adds a component to the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#addComponent)
    *
    * @param component The component to add.
    *
    */
  def addComponent(component: MeshComponent): Unit = js.native
  def addComponent(component: MeshComponentProperties): Unit = js.native
  /**
    * Centers the mesh at the specified location without changing its scale. The mesh will be modified in place. To modify a copy of the mesh instead, use [clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#clone) before calling [centerAt()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#centerAt)
    *
    * @param location The location at which to center the mesh.
    * @param params Additional parameters.
    * @param params.geographic Indicates whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the offset applied to center the mesh is applied in a Cartesian system with respect to the local coordinate system on the globe and is specified in meters.
    * @param params.origin The origin at which to center. If not specified, the mesh will be centered at the mesh extent center.
    *
    */
  def centerAt(location: Point): Mesh = js.native
  def centerAt(location: Point, params: MeshCenterAtParams): Mesh = js.native
  /**
    * Offsets the mesh geometry by the specified distance in x, y, and z. The units of x, y, and z are the units of the spatial reference. When the offset is applied geographically (default for either WGS84 or WebMercator), then the offsets are interpreted in meters. The mesh will be modified in place. To modify a copy of the mesh instead, use [clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#clone) before calling [offset()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#offset).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#offset)
    *
    * @param dx The amount to offset the geometry in the x direction.
    * @param dy The amount to offset the geometry in the y direction.
    * @param dz The amount to offset the geometry in the z direction.
    * @param params Additional parameters.
    * @param params.geographic Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the offset is applied in a Cartesian system with respect to the local coordinate system on the globe and is specified in meters.
    *
    */
  def offset(dx: Double, dy: Double, dz: Double): Mesh = js.native
  def offset(dx: Double, dy: Double, dz: Double, params: MeshOffsetParams): Mesh = js.native
  /**
    * Removes a component from the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#removeComponent)
    *
    * @param component The component to remove.
    *
    */
  def removeComponent(component: MeshComponent): Unit = js.native
  /**
    * Rotates the mesh geometry around its x, y and z axis (in that order). For each rotation angle, the rotation direction is clockwise when looking in the direction of the respective axis. The mesh will be modified in place. To modify a copy of the mesh instead, use [clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#clone) before calling [rotate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#rotate).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#rotate)
    *
    * @param angleX The angle by which to rotate around the x-axis (in degrees).
    * @param angleY The angle by which to rotate around the y-axis (in degrees).
    * @param angleZ The angle by which to rotate around the z-axis (in degrees).
    * @param params Additional parameters.
    * @param params.geographic Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the rotation is applied in a Cartesian system with respect to the local coordinate system on the globe and is specified in meters.
    * @param params.origin The origin around which to rotate. If not specified, the mesh will be rotated around the mesh extent center.
    *
    */
  def rotate(angleX: Double, angleY: Double, angleZ: Double): Mesh = js.native
  def rotate(angleX: Double, angleY: Double, angleZ: Double, params: MeshRotateParams): Mesh = js.native
  /**
    * Scales the mesh geometry by the specified factor. The mesh will be modified in place. To modify a copy of the mesh instead, use [clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#clone) before calling [scale()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#scale)
    *
    * @param factor The amount to scale the geometry.
    * @param params Additional parameters.
    * @param params.geographic Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the offset is applied in a Cartesian system with respect to the local coordinate system on the globe and is specified in meters.
    * @param params.origin The origin point for scaling. If not specified, the mesh will be scaled around the mesh extent center.
    *
    */
  def scale(factor: Double): Mesh = js.native
  def scale(factor: Double, params: MeshScaleParams): Mesh = js.native
  /**
    * Notifies that any cached values that depend on vertex attributes need to be recalculated. Use this method after modifying the vertex attributes in place so that values that depend on them (such as the calculation of the extent) are recalculated accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributesChanged)
    *
    *
    */
  def vertexAttributesChanged(): Unit = js.native
}

@JSGlobal("__esri.Mesh")
@js.native
/**
  * A mesh is a general, client-side 3D [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) type composed of [vertices with attributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes). The vertices include geographic position, normals that affect lighting/shading and uv coordinates that can be used to map images to the mesh. Vertices are combined into 3D primitives to render the mesh in the scene (only triangle primitives are currently supported).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html)
  */
class MeshCls () extends Mesh {
  def this(properties: MeshProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

