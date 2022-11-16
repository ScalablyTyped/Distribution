package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.asc_
import typings.arcgisJsApi.arcgisJsApiStrings.center_
import typings.arcgisJsApi.arcgisJsApiStrings.desc_
import typings.arcgisJsApi.arcgisJsApiStrings.end
import typings.arcgisJsApi.arcgisJsApiStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnTemplateBaseProperties extends StObject {
  
  /**
    * Controls the sort order of the column.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#direction)
    */
  var direction: js.UndefOr[asc_ | desc_ | Null] = js.undefined
  
  /**
    * Use this in combination with [FeatureTable.multiSortEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable.html#multiSortEnabled) and FeatureTable.direction properties to set sorting functionality on multiple columns.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#initialSortPriority)
    */
  var initialSortPriority: js.UndefOr[Double] = js.undefined
  
  /**
    * A string value containing the column alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Set this object to customize the column's menu content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#menuConfig)
    */
  var menuConfig: js.UndefOr[ButtonMenuConfig] = js.undefined
  
  /**
    * Indicates whether the field column can be sorted.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#sortable)
    */
  var sortable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Aligns the columns cell content horizontally.
    *
    * @default start
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#textAlign)
    */
  var textAlign: js.UndefOr[start | center_ | end] = js.undefined
  
  /**
    * Indicates whether the column is visible.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTable-support-ColumnTemplateBase.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object ColumnTemplateBaseProperties {
  
  inline def apply(): ColumnTemplateBaseProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnTemplateBaseProperties]
  }
  
  extension [Self <: ColumnTemplateBaseProperties](x: Self) {
    
    inline def setDirection(value: asc_ | desc_): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setInitialSortPriority(value: Double): Self = StObject.set(x, "initialSortPriority", value.asInstanceOf[js.Any])
    
    inline def setInitialSortPriorityUndefined: Self = StObject.set(x, "initialSortPriority", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMenuConfig(value: ButtonMenuConfig): Self = StObject.set(x, "menuConfig", value.asInstanceOf[js.Any])
    
    inline def setMenuConfigUndefined: Self = StObject.set(x, "menuConfig", js.undefined)
    
    inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
    
    inline def setTextAlign(value: start | center_ | end): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
