package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Feet
import typings.arcgisJsApi.arcgisJsApiStrings.Kilometers
import typings.arcgisJsApi.arcgisJsApiStrings.Meters
import typings.arcgisJsApi.arcgisJsApiStrings.Miles
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTemplateLayoutOptions extends Object {
  
  /**
    * The text used for the author if the specified layout contains an author text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var authorText: js.UndefOr[String] = js.native
  
  /**
    * The text used for the copyright if the specified layout contains a copyright text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var copyrightText: js.UndefOr[String] = js.native
  
  /**
    * An array of name-value pair objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var customTextElements: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * An array of [LegendLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-LegendLayer.html) containing the ids of the layers that will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var legendLayers: js.UndefOr[js.Array[LegendLayer]] = js.native
  
  /**
    * The unit used for the scalebar.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var scalebarUnit: js.UndefOr[Miles | Kilometers | Meters | Feet] = js.native
  
  /**
    * The text used for the map title if the specified layout contains a title text element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html#layoutOptions)
    */
  var titleText: js.UndefOr[String] = js.native
}
object PrintTemplateLayoutOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PrintTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PrintTemplateLayoutOptions]
  }
  
  @scala.inline
  implicit class PrintTemplateLayoutOptionsMutableBuilder[Self <: PrintTemplateLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorText(value: String): Self = StObject.set(x, "authorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorTextUndefined: Self = StObject.set(x, "authorText", js.undefined)
    
    @scala.inline
    def setCopyrightText(value: String): Self = StObject.set(x, "copyrightText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightTextUndefined: Self = StObject.set(x, "copyrightText", js.undefined)
    
    @scala.inline
    def setCustomTextElements(value: js.Array[_]): Self = StObject.set(x, "customTextElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomTextElementsUndefined: Self = StObject.set(x, "customTextElements", js.undefined)
    
    @scala.inline
    def setCustomTextElementsVarargs(value: js.Any*): Self = StObject.set(x, "customTextElements", js.Array(value :_*))
    
    @scala.inline
    def setLegendLayers(value: js.Array[LegendLayer]): Self = StObject.set(x, "legendLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendLayersUndefined: Self = StObject.set(x, "legendLayers", js.undefined)
    
    @scala.inline
    def setLegendLayersVarargs(value: LegendLayer*): Self = StObject.set(x, "legendLayers", js.Array(value :_*))
    
    @scala.inline
    def setScalebarUnit(value: Miles | Kilometers | Meters | Feet): Self = StObject.set(x, "scalebarUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalebarUnitUndefined: Self = StObject.set(x, "scalebarUnit", js.undefined)
    
    @scala.inline
    def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextUndefined: Self = StObject.set(x, "titleText", js.undefined)
  }
}
