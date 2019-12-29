package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`nautical-miles`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`us-feet`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.centimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.decimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.down
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.east
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.feet_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.inches
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.kilometers_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.meters_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miles_
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.millimeters
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.north
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.south
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.up
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.west
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.yards
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreatePlaneParams extends Object {
  /**
    * Direction the plane is facing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    *
    * @default "up"
    */
  var facing: js.UndefOr[east | west | north | south | up | down] = js.undefined
  /**
    * Whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var geographic: js.UndefOr[Boolean] = js.undefined
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var material: js.UndefOr[MeshMaterial] = js.undefined
  /**
    * A uniform size value or an object containing individual values width and height. The unit of the size values is derived from the spatial reference of the provided location, unless a unit is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var size: js.UndefOr[Double | MeshCreatePlaneParamsSize] = js.undefined
  /**
    * The unit of the size (defaults to the unit of the location's spatial reference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createPlane)
    */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
}

object MeshCreatePlaneParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    facing: east | west | north | south | up | down = null,
    geographic: js.UndefOr[Boolean] = js.undefined,
    material: MeshMaterial = null,
    size: Double | MeshCreatePlaneParamsSize = null,
    unit: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet` = null
  ): MeshCreatePlaneParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (facing != null) __obj.updateDynamic("facing")(facing.asInstanceOf[js.Any])
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCreatePlaneParams]
  }
}

