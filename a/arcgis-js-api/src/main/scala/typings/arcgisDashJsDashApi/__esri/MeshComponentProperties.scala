package typings.arcgisDashJsDashApi.__esri

import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshComponentProperties extends js.Object {
  /**
    * A flat array of indices that refer to vertices in the [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) of the mesh to which the component belongs. Each triple of indices defines a triangle to render (i.e. the faces array must always have a length that is a multiple of 3). Note that the indices refer to **vertices** and not to the index of the first coordinate of a vertex in the [vertexAttributes.position](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) array.  If faces is `null`, then all the vertices in the mesh will be rendered as triangles for this component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces)
    */
  var faces: js.UndefOr[Uint32Array | js.Array[Double] | Uint16Array] = js.undefined
  /**
    * The material determines how the component is visualized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var material: js.UndefOr[MeshMaterialProperties] = js.undefined
  /**
    * Specifies the type of normals used for lighting. This determines whether the object has a smooth or an angular appearance. The following shading types are supported:
    *
    * | Type | Description |
    * |------|-------------|
    * | source | Shading uses the normals as defined in the vertex attributes. If no normals are defined, then shading defaults back to `flat` |
    * | flat | Shading uses normals created per triangle face. This type of shading is good for objects with sharp edges such as boxes. |
    * | smooth | Shading uses per-vertex normals that average the normals of all the faces a vertex is a part of. This type of shading is good for meshes that approximate curved surfaces such as spheres. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#shading)
    */
  var shading: js.UndefOr[String] = js.undefined
}

object MeshComponentProperties {
  @scala.inline
  def apply(
    faces: Uint32Array | js.Array[Double] | Uint16Array = null,
    material: MeshMaterialProperties = null,
    shading: String = null
  ): MeshComponentProperties = {
    val __obj = js.Dynamic.literal()
    if (faces != null) __obj.updateDynamic("faces")(faces.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    if (shading != null) __obj.updateDynamic("shading")(shading)
    __obj.asInstanceOf[MeshComponentProperties]
  }
}

