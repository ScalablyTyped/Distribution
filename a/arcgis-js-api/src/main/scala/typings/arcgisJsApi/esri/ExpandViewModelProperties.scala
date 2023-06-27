package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandViewModelProperties extends StObject {
  
  /**
  		 * Automatically collapses the expand widget instance when the view's viewpoint updates.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#autoCollapse)
  		 */
  var autoCollapse: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Whether the widget is currently expanded or not.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#expanded)
  		 */
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * This value associates two or more Expand widget instances with each other, allowing one instance to auto collapse when another instance in the same group is expanded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#group)
  		 */
  var group: js.UndefOr[String] = js.undefined
  
  /**
  		 * The view in which the Expand is used.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Expand-ExpandViewModel.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
}
object ExpandViewModelProperties {
  
  inline def apply(): ExpandViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpandViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setAutoCollapse(value: Boolean): Self = StObject.set(x, "autoCollapse", value.asInstanceOf[js.Any])
    
    inline def setAutoCollapseUndefined: Self = StObject.set(x, "autoCollapse", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
