package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.button
import typings.arcgisJsApi.arcgisJsApiStrings.slider
import typings.arcgisJsApi.arcgisJsApiStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionBaseProperties extends StObject {
  
  /**
  		 * Set this property to `true` to display a spinner icon.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#active)
  		 */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * This adds a CSS class to the [ActionButton's](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) node.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#className)
  		 */
  var className: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether this action is disabled.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#disabled)
  		 */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Calcite icon used for the action.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#icon)
  		 */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of the ID assigned to this action.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title of the action.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the type of action.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#type)
  		 */
  var `type`: js.UndefOr[button | slider | toggle] = js.undefined
  
  /**
  		 * Indicates if the action is visible.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ActionBaseProperties {
  
  inline def apply(): ActionBaseProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBaseProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionBaseProperties] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: button | slider | toggle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
