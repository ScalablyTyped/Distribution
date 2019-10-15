package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateCylinderParams extends Object {
  /**
    * The additional number of subdivisions for generating the mesh representing a cylinder. A densificationFactor parameter of 0 will generate a default of 16 vertices to approximate the cylinder. A densificationFactor of 1 will generate 32 vertices, etc. The larger the densificationFactor, the better the mesh will approximate a perfect cylinder (at the cost of processing and rendering performance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var densificationFactor: js.UndefOr[Double] = js.undefined
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var material: js.UndefOr[MeshMaterial] = js.undefined
  /**
    * A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location, unless a specific unit is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var size: js.UndefOr[Double | MeshCreateCylinderParamsSize] = js.undefined
  /**
    * The unit of the size (defaults to the unit of the location's spatial reference).  **Possible Values:** millimeters | centimeters | decimeters | meters | kilometers | inches | feet | yards | miles | nautical-miles | us-feet
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var unit: js.UndefOr[String] = js.undefined
}

object MeshCreateCylinderParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    densificationFactor: Int | Double = null,
    geographic: js.UndefOr[Boolean] = js.undefined,
    material: MeshMaterial = null,
    size: Double | MeshCreateCylinderParamsSize = null,
    unit: String = null
  ): MeshCreateCylinderParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (densificationFactor != null) __obj.updateDynamic("densificationFactor")(densificationFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[MeshCreateCylinderParams]
  }
}

