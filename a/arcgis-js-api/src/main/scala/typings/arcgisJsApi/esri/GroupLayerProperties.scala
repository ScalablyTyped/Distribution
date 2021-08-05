package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.exclusive
import typings.arcgisJsApi.arcgisJsApiStrings.independent
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLayerProperties
  extends StObject
     with LayerProperties
     with LayersMixinProperties
     with TablesMixinProperties
     with PortalLayerProperties
     with BlendLayerProperties {
  
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: js.UndefOr[independent | inherited | exclusive] = js.undefined
}
object GroupLayerProperties {
  
  inline def apply(): GroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLayerProperties]
  }
  
  extension [Self <: GroupLayerProperties](x: Self) {
    
    inline def setVisibilityMode(value: independent | inherited | exclusive): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
    
    inline def setVisibilityModeUndefined: Self = StObject.set(x, "visibilityMode", js.undefined)
  }
}
