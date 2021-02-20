package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingGroupSublayerProperties extends BuildingSublayerProperties {
  
  /**
    * Indicates how the sublayer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingGroupSublayer.html#listMode)
    */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.native
}
object BuildingGroupSublayerProperties {
  
  @scala.inline
  def apply(): BuildingGroupSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingGroupSublayerProperties]
  }
  
  @scala.inline
  implicit class BuildingGroupSublayerPropertiesMutableBuilder[Self <: BuildingGroupSublayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
  }
}
