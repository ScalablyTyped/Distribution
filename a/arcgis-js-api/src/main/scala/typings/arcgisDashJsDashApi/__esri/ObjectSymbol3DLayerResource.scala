package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSymbol3DLayerResource extends Object {
  /**
    * The URL to the 3D model in [glTF format](https://www.khronos.org/gltf/). The URL should point to a glTF file (.gltf or .glb) which can reference additional binary (.bin) and image files (.jpg, .png). See the guide topic on [Visualizing points with 3D symbols](https://developers.arcgis.com/javascript/latest/guide/visualizing-points-3d/index.html) to learn how to use a custom 3D model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * Uses a built-in shape. See the table below for possible values.
    *
    * Value | Description
    * ------|------------
    * sphere | ![s3d-object-sphere](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-sphere.png)
    * cylinder | ![s3d-object-cylinder](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-cylinder.png)
    * cube | ![s3d-object-cube](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-cube.png)
    * cone | ![s3d-object-cone](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-cone.png)
    * inverted-cone | ![s3d-object-inverted-cone](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-inverted-cone.png)
    * diamond | ![s3d-object-diamond](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-diamond.png)
    * tetrahedron | ![s3d-object-tetrahedron](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-object-tetrahedron.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var primitive: js.UndefOr[String] = js.undefined
}

object ObjectSymbol3DLayerResource {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    href: String = null,
    primitive: String = null
  ): ObjectSymbol3DLayerResource = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (href != null) __obj.updateDynamic("href")(href)
    if (primitive != null) __obj.updateDynamic("primitive")(primitive)
    __obj.asInstanceOf[ObjectSymbol3DLayerResource]
  }
}

