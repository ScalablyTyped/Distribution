package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.virtual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.websceneVirtualLightingProperties & {  type :'virtual'} */
trait websceneVirtualLightingPr extends StObject {
  
  /**
    * Indicates whether to show shadows cast by the light source.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-VirtualLighting.html#directShadowsEnabled)
    */
  var directShadowsEnabled: js.UndefOr[Boolean] = js.undefined
  
  var `type`: virtual
}
object websceneVirtualLightingPr {
  
  inline def apply(): websceneVirtualLightingPr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("virtual")
    __obj.asInstanceOf[websceneVirtualLightingPr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: websceneVirtualLightingPr] (val x: Self) extends AnyVal {
    
    inline def setDirectShadowsEnabled(value: Boolean): Self = StObject.set(x, "directShadowsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDirectShadowsEnabledUndefined: Self = StObject.set(x, "directShadowsEnabled", js.undefined)
    
    inline def setType(value: virtual): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
