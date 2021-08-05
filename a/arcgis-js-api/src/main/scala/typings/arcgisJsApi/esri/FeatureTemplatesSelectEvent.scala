package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplatesSelectEvent extends StObject {
  
  var item: TemplateItem
  
  var template: FeatureTemplate
}
object FeatureTemplatesSelectEvent {
  
  inline def apply(item: TemplateItem, template: FeatureTemplate): FeatureTemplatesSelectEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplatesSelectEvent]
  }
  
  extension [Self <: FeatureTemplatesSelectEvent](x: Self) {
    
    inline def setItem(value: TemplateItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: FeatureTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
