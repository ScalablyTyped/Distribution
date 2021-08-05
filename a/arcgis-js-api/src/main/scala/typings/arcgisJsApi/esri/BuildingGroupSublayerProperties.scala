package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingGroupSublayerProperties
  extends StObject
     with BuildingSublayerProperties {
  
  /**
    * Indicates how the sublayer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#listMode)
    */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.undefined
}
object BuildingGroupSublayerProperties {
  
  inline def apply(): BuildingGroupSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingGroupSublayerProperties]
  }
  
  extension [Self <: BuildingGroupSublayerProperties](x: Self) {
    
    inline def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
  }
}
