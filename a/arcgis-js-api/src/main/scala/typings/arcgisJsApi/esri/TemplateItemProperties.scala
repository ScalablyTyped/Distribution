package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateItemProperties extends StObject {
  
  /**
  		 * The description that is displayed for the template item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * The label that is displayed for the template item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#label)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * The [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) associated with the template item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#layer)
  		 */
  var layer: js.UndefOr[FeatureLayerProperties] = js.undefined
  
  /**
  		 * The associated [FeatureTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureTemplate.html) for the item.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates-TemplateItem.html#template)
  		 */
  var template: js.UndefOr[FeatureTemplateProperties] = js.undefined
}
object TemplateItemProperties {
  
  inline def apply(): TemplateItemProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateItemProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TemplateItemProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayer(value: FeatureLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setTemplate(value: FeatureTemplateProperties): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
