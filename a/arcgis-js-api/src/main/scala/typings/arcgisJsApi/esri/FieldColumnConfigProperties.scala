package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldColumnConfigProperties extends FieldConfigProperties {
  
  /**
    * Controls the sort order of the column.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#direction)
    */
  var direction: js.UndefOr[asc_ | desc_ | js.Any] = js.native
  
  /**
    * Set this object to customize the field column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.native
  
  /**
    * Indicates whether the field column can be sorted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#sortable)
    */
  var sortable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the field column is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-FieldColumnConfig.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object FieldColumnConfigProperties {
  
  @scala.inline
  def apply(): FieldColumnConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldColumnConfigProperties]
  }
  
  @scala.inline
  implicit class FieldColumnConfigPropertiesMutableBuilder[Self <: FieldColumnConfigProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: asc_ | desc_ | js.Any): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setMenuConfig(value: ButtonMenuConfig): Self = StObject.set(x, "menuConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuConfigUndefined: Self = StObject.set(x, "menuConfig", js.undefined)
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
