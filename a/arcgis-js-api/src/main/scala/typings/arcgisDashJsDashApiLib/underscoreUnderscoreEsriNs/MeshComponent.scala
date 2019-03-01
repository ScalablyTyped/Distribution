package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshComponent extends Accessor {
  /**
    * A flat array of indices that refer to vertices in the [vertexAttributes](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) of the mesh to which the component belongs. Each triple of indices defines a triangle to render (i.e. the faces array must always have a length that is a multiple of 3). Note that the indices refer to **vertices** and not to the index of the first coordinate of a vertex in the [vertexAttributes.position](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes) array.  If faces is `null`, then all the vertices in the mesh will be rendered as triangles for this component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#faces)
    */
  var faces: stdLib.Uint32Array = js.native
  /**
    * The material determines how the component is visualized. Materials specify a color that may either be a single color value (a [ValueMeshColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html)) or an image ( an [ImageMeshColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html)), which is mapped to the uv coordinate specified for each vertex in the mesh vertex attributes.  The material property supports a number of convenience autocast types, including hex color strings and well known color strings (autocasts to [ValueMeshColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ValueMeshColor.html)), or strings representing urls, HTMLImageElements or HTMLCanvasElements (autocasts to [ImageMeshColor](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-ImageMeshColor.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var material: MeshComponentMaterial = js.native
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
  var shading: java.lang.String = js.native
}

