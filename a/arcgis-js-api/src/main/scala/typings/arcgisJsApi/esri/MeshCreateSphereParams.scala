package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshCreateSphereParams extends Object {
  /**
    * The additional number of subdivisions for generating the mesh representing a sphere. A densificationFactor parameter of 0 will generate a default of 16-by-16 vertices to approximate the sphere. A densificationFactor of 1 will generate 32-by-32 vertices, etc. The larger the densificationFactor, the better the mesh will approximate a perfect sphere (at the cost of processing and rendering performance).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var densificationFactor: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to georeference relative to the globe or the projected coordinate system (PCS). This parameter is only relevant for spatial references that can be used in both local and global viewing modes (currently only WebMercator). This parameter defaults to `true` for WebMercator and WGS84, and `false` for any other PCS. When true, the mesh is created in a Cartesian system with respect to the local coordinate system on the globe and sizes are specified in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var geographic: js.UndefOr[Boolean] = js.native
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var material: js.UndefOr[MeshMaterial] = js.native
  /**
    * A uniform size value or an object containing individual values width, height and depth. The unit of the size values is derived from the spatial reference of the provided location, unless a unit is specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var size: js.UndefOr[Double | MeshCreateSphereParamsSize] = js.native
  /**
    * The unit of the size (defaults to the unit of the location's spatial reference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var unit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.native
}

object MeshCreateSphereParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshCreateSphereParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshCreateSphereParams]
  }
  @scala.inline
  implicit class MeshCreateSphereParamsOps[Self <: MeshCreateSphereParams] (val x: Self) extends AnyVal {
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
    def setDensificationFactor(value: Double): Self = this.set("densificationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDensificationFactor: Self = this.set("densificationFactor", js.undefined)
    @scala.inline
    def setGeographic(value: Boolean): Self = this.set("geographic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeographic: Self = this.set("geographic", js.undefined)
    @scala.inline
    def setMaterial(value: MeshMaterial): Self = this.set("material", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaterial: Self = this.set("material", js.undefined)
    @scala.inline
    def setSize(value: Double | MeshCreateSphereParamsSize): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

