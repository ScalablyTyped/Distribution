package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureViewModelFormattedAttributes extends StObject {
  
  /**
    * The formatted attributes for an individual content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Feature-FeatureViewModel.html#formattedAttributes)
    */
  var content: js.UndefOr[Any] = js.undefined
  
  /**
    * The formatted attributes specified at the root level of the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) using the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property.
    *
    * [Read more...](global.html)
    */
  var global: js.UndefOr[Any] = js.undefined
}
object FeatureViewModelFormattedAttributes {
  
  inline def apply(): FeatureViewModelFormattedAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureViewModelFormattedAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureViewModelFormattedAttributes] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGlobal(value: Any): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
  }
}
