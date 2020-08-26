package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectSymbol3DLayerResource extends Object {
  /**
    * The URL to the 3D model in [glTF format](https://www.khronos.org/gltf/). The URL should point to a glTF file (.gltf or .glb) which can reference additional binary (.bin) and image files (.jpg, .png). See the guide topic on [Visualizing points with 3D symbols](https://developers.arcgis.com/javascript/latest/guide/visualizing-points-3d/index.html) to learn how to use a custom 3D model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var href: js.UndefOr[String] = js.native
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
  var primitive: js.UndefOr[String] = js.native
}

object ObjectSymbol3DLayerResource {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ObjectSymbol3DLayerResource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ObjectSymbol3DLayerResource]
  }
  @scala.inline
  implicit class ObjectSymbol3DLayerResourceOps[Self <: ObjectSymbol3DLayerResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setPrimitive(value: String): Self = this.set("primitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitive: Self = this.set("primitive", js.undefined)
  }
  
}

