package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`auto-complete-polygon`
import typings.arcgisJsApi.arcgisJsApiStrings.`down-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`left-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`right-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.`up-arrow`
import typings.arcgisJsApi.arcgisJsApiStrings.arrow
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.ellipse
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.line
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.triangle_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplateProperties extends StObject {
  
  /**
    * Description of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the default drawing tool defined for the template to create a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#drawingTool)
    */
  var drawingTool: js.UndefOr[
    `auto-complete-polygon` | circle | ellipse | freehand | line | none_ | point | polygon | rectangle | arrow | triangle_ | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
  ] = js.undefined
  
  /**
    * Name of the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An object used to create a thumbnail image that represents a feature type in the feature template.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html#thumbnail)
    */
  var thumbnail: js.UndefOr[FeatureTemplateThumbnail] = js.undefined
}
object FeatureTemplateProperties {
  
  inline def apply(): FeatureTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureTemplateProperties]
  }
  
  extension [Self <: FeatureTemplateProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDrawingTool(
      value: `auto-complete-polygon` | circle | ellipse | freehand | line | none_ | point | polygon | rectangle | arrow | triangle_ | `left-arrow` | `right-arrow` | `up-arrow` | `down-arrow`
    ): Self = StObject.set(x, "drawingTool", value.asInstanceOf[js.Any])
    
    inline def setDrawingToolUndefined: Self = StObject.set(x, "drawingTool", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setThumbnail(value: FeatureTemplateThumbnail): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
