package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSymbol3DLayerResource
  extends stdLib.Object {
  /**
    * The URL to the 3D model. [See these instructions](https://github.com/Esri/arcgis-pro-sdk-community-samples/tree/master/Map-Authoring/ExportWeb3DObjectResource#exportweb3dobjectresource) to learn how to create a custom 3D model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
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
  var primitive: js.UndefOr[java.lang.String] = js.undefined
}

object ObjectSymbol3DLayerResource {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    href: java.lang.String = null,
    primitive: java.lang.String = null
  ): ObjectSymbol3DLayerResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (href != null) __obj.updateDynamic("href")(href)
    if (primitive != null) __obj.updateDynamic("primitive")(primitive)
    __obj.asInstanceOf[ObjectSymbol3DLayerResource]
  }
}

