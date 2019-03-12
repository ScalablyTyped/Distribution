package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateSphereParams
  extends stdLib.Object {
  /**
    * The additional number of subdivisions for generating the mesh representing a sphere. A densificationFactor parameter of 0 will generate a default of 16-by-16 vertices to approximate the sphere. A densificationFactor of 1 will generate 32-by-32 vertices, etc. The larger the densificationFactor, the better the mesh will approximate a perfect sphere (at the cost of processing and rendering performance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var densificationFactor: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var geographic: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var material: js.UndefOr[MeshCreateSphereParamsMaterial] = js.undefined
  /**
    * A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var size: js.UndefOr[scala.Double | MeshCreateSphereParamsSize] = js.undefined
}

object MeshCreateSphereParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    densificationFactor: scala.Int | scala.Double = null,
    geographic: js.UndefOr[scala.Boolean] = js.undefined,
    material: MeshCreateSphereParamsMaterial = null,
    size: scala.Double | MeshCreateSphereParamsSize = null
  ): MeshCreateSphereParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (densificationFactor != null) __obj.updateDynamic("densificationFactor")(densificationFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(geographic)) __obj.updateDynamic("geographic")(geographic)
    if (material != null) __obj.updateDynamic("material")(material)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCreateSphereParams]
  }
}

