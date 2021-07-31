package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassBreaksRendererResult
  extends StObject
     with Object {
  
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var basemapId: String
  
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var basemapTheme: String
  
  /**
    * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var classBreaksResult: ClassBreaksResult
  
  /**
    * The color scheme used for the class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var colorScheme: ColorScheme
  
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var defaultValuesUsed: Boolean
  
  /**
    * The renderer object configured to best match the given basemap and the spread of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var renderer: ClassBreaksRenderer
}
object ClassBreaksRendererResult {
  
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    classBreaksResult: ClassBreaksResult,
    colorScheme: ColorScheme,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: ClassBreaksRenderer
  ): ClassBreaksRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], classBreaksResult = classBreaksResult.asInstanceOf[js.Any], colorScheme = colorScheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBreaksRendererResult]
  }
  
  @scala.inline
  implicit class ClassBreaksRendererResultMutableBuilder[Self <: ClassBreaksRendererResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasemapId(value: String): Self = StObject.set(x, "basemapId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasemapTheme(value: String): Self = StObject.set(x, "basemapTheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassBreaksResult(value: ClassBreaksResult): Self = StObject.set(x, "classBreaksResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValuesUsed(value: Boolean): Self = StObject.set(x, "defaultValuesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: ClassBreaksRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
  }
}
