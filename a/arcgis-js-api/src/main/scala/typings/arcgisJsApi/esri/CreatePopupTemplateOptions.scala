package typings.arcgisJsApi.esri

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePopupTemplateOptions extends StObject {
  
  /**
    * An array of field types to ignore when creating the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#CreatePopupTemplateOptions)
    */
  var ignoreFieldTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of field names set to be visible within the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-popupUtils.html#CreatePopupTemplateOptions)
    */
  var visibleFieldNames: js.UndefOr[Set[String]] = js.undefined
}
object CreatePopupTemplateOptions {
  
  inline def apply(): CreatePopupTemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePopupTemplateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePopupTemplateOptions] (val x: Self) extends AnyVal {
    
    inline def setIgnoreFieldTypes(value: js.Array[String]): Self = StObject.set(x, "ignoreFieldTypes", value.asInstanceOf[js.Any])
    
    inline def setIgnoreFieldTypesUndefined: Self = StObject.set(x, "ignoreFieldTypes", js.undefined)
    
    inline def setIgnoreFieldTypesVarargs(value: String*): Self = StObject.set(x, "ignoreFieldTypes", js.Array(value*))
    
    inline def setVisibleFieldNames(value: Set[String]): Self = StObject.set(x, "visibleFieldNames", value.asInstanceOf[js.Any])
    
    inline def setVisibleFieldNamesUndefined: Self = StObject.set(x, "visibleFieldNames", js.undefined)
  }
}
