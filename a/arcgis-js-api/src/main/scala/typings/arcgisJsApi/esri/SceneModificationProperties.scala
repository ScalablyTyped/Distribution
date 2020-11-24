package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clip
import typings.arcgisJsApi.arcgisJsApiStrings.mask
import typings.arcgisJsApi.arcgisJsApiStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneModificationProperties extends js.Object {
  
  /**
    * The geometry representing the location of the modification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#geometry)
    */
  var geometry: js.UndefOr[PolygonProperties] = js.native
  
  /**
    * The type of modification to perform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html#type)
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
