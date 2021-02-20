package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clip
import typings.arcgisJsApi.arcgisJsApiStrings.mask
import typings.arcgisJsApi.arcgisJsApiStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneModificationProperties extends StObject {
  
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
  implicit class SceneModificationPropertiesMutableBuilder[Self <: SceneModificationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: PolygonProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setType(value: clip | mask | replace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
