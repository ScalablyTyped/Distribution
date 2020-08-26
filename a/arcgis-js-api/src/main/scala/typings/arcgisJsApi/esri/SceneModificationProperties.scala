package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clip
import typings.arcgisJsApi.arcgisJsApiStrings.mask
import typings.arcgisJsApi.arcgisJsApiStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneModificationProperties extends js.Object {
  /**
    * The geometry representing the location of the modification. Only polygon geometries are currently supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#geometry)
    */
  var geometry: js.UndefOr[PolygonProperties] = js.native
  /**
    * The type of modification to perform.
    *
    * Illustration | Modification | Description
    * ------|------------|--------
    * <img src="../../assets/img/apiref/layers/modification-clip.png" alt="modification-type-clip" style="width:100px;"/>| <b>clip</b> - removes selected area | Clip-out portions of the integrated mesh to see features below. For example, utility work on gas or water lines in an area. Planners can create a scene in which the integrated mesh is clipped out at a site to expose the water or gas lines below it.
    * <img src="../../assets/img/apiref/layers/modification-mask.png" alt="modification-type-mask" style="width:100px;"/> | <b>mask</b> - displays only selected area |  Define an area of interest. Use a polygon and draw only parts of the integrated mesh inside that polygon. For example, if you want to show only a portion of an integrated mesh within the boundaries of a city.
    * <img src="../../assets/img/apiref/layers/modification-replace.png" alt="modification-type-replace" style="width:100px;"/> | <b>replace</b> - flattens selected area |Replace an area of an integrated mesh based on a 3D polygon. For example, to add constructed buildings, flatten the integrated mesh at the footprint of a building so the new building can be visualized. Create different scenarios of the new construction area and share the scenarios as a web scene to discuss with stakeholders. The integrated mesh flattens to the minimum z-vertex of the modification polygon.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#type)
    *
    * @default clip
    */
  var `type`: js.UndefOr[clip | mask | replace] = js.native
}

object SceneModificationProperties {
  @scala.inline
  def apply(): SceneModificationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneModificationProperties]
  }
  @scala.inline
  implicit class SceneModificationPropertiesOps[Self <: SceneModificationProperties] (val x: Self) extends AnyVal {
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
    def setGeometry(value: PolygonProperties): Self = this.set("geometry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    @scala.inline
    def setType(value: clip | mask | replace): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

