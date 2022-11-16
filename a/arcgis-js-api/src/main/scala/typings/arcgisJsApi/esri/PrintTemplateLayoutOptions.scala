package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Feet
import typings.arcgisJsApi.arcgisJsApiStrings.Kilometers
import typings.arcgisJsApi.arcgisJsApiStrings.Meters
import typings.arcgisJsApi.arcgisJsApiStrings.Miles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTemplateLayoutOptions extends StObject {
  
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var authorText: js.UndefOr[String] = js.undefined
  
  /**
    * The text used for the copyright if the specified layout contains a copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: js.UndefOr[String] = js.undefined
  
  /**
    * An array of name-value pair objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * An object containing optional elements from the print service that can be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var elementOverrides: js.UndefOr[Any] = js.undefined
  
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html) containing the ids of the layers that will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var legendLayers: js.UndefOr[js.Array[LegendLayer]] = js.undefined
  
  /**
    * The unit used for the scalebar.
    *
    * @default Miles
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var scalebarUnit: js.UndefOr[Miles | Kilometers | Meters | Feet] = js.undefined
  
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: js.UndefOr[String] = js.undefined
}
object PrintTemplateLayoutOptions {
  
  inline def apply(): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
  
  extension [Self <: PrintTemplateLayoutOptions](x: Self) {
    
    inline def setAuthorText(value: String): Self = StObject.set(x, "authorText", value.asInstanceOf[js.Any])
    
    inline def setAuthorTextUndefined: Self = StObject.set(x, "authorText", js.undefined)
    
    inline def setCopyrightText(value: String): Self = StObject.set(x, "copyrightText", value.asInstanceOf[js.Any])
    
    inline def setCopyrightTextUndefined: Self = StObject.set(x, "copyrightText", js.undefined)
    
    inline def setCustomTextElements(value: js.Array[Any]): Self = StObject.set(x, "customTextElements", value.asInstanceOf[js.Any])
    
    inline def setCustomTextElementsUndefined: Self = StObject.set(x, "customTextElements", js.undefined)
    
    inline def setCustomTextElementsVarargs(value: Any*): Self = StObject.set(x, "customTextElements", js.Array(value*))
    
    inline def setElementOverrides(value: Any): Self = StObject.set(x, "elementOverrides", value.asInstanceOf[js.Any])
    
    inline def setElementOverridesUndefined: Self = StObject.set(x, "elementOverrides", js.undefined)
    
    inline def setLegendLayers(value: js.Array[LegendLayer]): Self = StObject.set(x, "legendLayers", value.asInstanceOf[js.Any])
    
    inline def setLegendLayersUndefined: Self = StObject.set(x, "legendLayers", js.undefined)
    
    inline def setLegendLayersVarargs(value: LegendLayer*): Self = StObject.set(x, "legendLayers", js.Array(value*))
    
    inline def setScalebarUnit(value: Miles | Kilometers | Meters | Feet): Self = StObject.set(x, "scalebarUnit", value.asInstanceOf[js.Any])
    
    inline def setScalebarUnitUndefined: Self = StObject.set(x, "scalebarUnit", js.undefined)
    
    inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    inline def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
  }
}
