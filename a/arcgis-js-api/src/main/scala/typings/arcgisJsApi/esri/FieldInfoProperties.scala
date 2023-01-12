package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`rich-text`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import typings.arcgisJsApi.arcgisJsApiStrings.`var`
import typings.arcgisJsApi.arcgisJsApiStrings.avg
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.stddev
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldInfoProperties extends StObject {
  
  /**
    * The field name as defined by the service or the name of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#fieldName)
    */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
    * Class which provides formatting options for numerical or date fields and how they should display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#format)
    */
  var format: js.UndefOr[FieldInfoFormatProperties] = js.undefined
  
  /**
    * A Boolean determining whether users can edit this field.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#isEditable)
    */
  var isEditable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A string containing the field alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#statisticType)
    */
  var statisticType: js.UndefOr[count | sum | min | max | avg | stddev | `var`] = js.undefined
  
  /**
    * A string determining what type of input box editors see when editing the field.
    *
    * @default text-box
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#stringFieldOption)
    */
  var stringFieldOption: js.UndefOr[`rich-text` | `text-area` | `text-box`] = js.undefined
  
  /**
    * A string providing an editing hint for editors of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#tooltip)
    */
  var tooltip: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the field is visible in the popup window.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object FieldInfoProperties {
  
  inline def apply(): FieldInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setFormat(value: FieldInfoFormatProperties): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setIsEditableUndefined: Self = StObject.set(x, "isEditable", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStatisticType(value: count | sum | min | max | avg | stddev | `var`): Self = StObject.set(x, "statisticType", value.asInstanceOf[js.Any])
    
    inline def setStatisticTypeUndefined: Self = StObject.set(x, "statisticType", js.undefined)
    
    inline def setStringFieldOption(value: `rich-text` | `text-area` | `text-box`): Self = StObject.set(x, "stringFieldOption", value.asInstanceOf[js.Any])
    
    inline def setStringFieldOptionUndefined: Self = StObject.set(x, "stringFieldOption", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
