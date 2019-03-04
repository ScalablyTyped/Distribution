package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateCylinderParamsSize
  extends stdLib.Object {
  /**
    * The depth of the created mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the created mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the created mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MeshCreateCylinderParamsSize {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    depth: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): MeshCreateCylinderParamsSize = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCreateCylinderParamsSize]
  }
}

