package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.button
import typings.arcgisJsApi.arcgisJsApiStrings.slider
import typings.arcgisJsApi.arcgisJsApiStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionBaseProperties extends StObject {
  
  /**
    * Set this property to `true` to display a spinner icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#active)
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * This adds a CSS class to the [ActionButton's](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) node.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#className)
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this action is disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the ID assigned to this action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#id)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The title of the action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#title)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#type)
    */
  var `type`: js.UndefOr[button | slider | toggle] = js.native
  
  /**
    * Indicates if the action is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ActionBaseProperties {
  
  @scala.inline
  def apply(): ActionBaseProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionBaseProperties]
  }
  
  @scala.inline
  implicit class ActionBasePropertiesMutableBuilder[Self <: ActionBaseProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: button | slider | toggle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
