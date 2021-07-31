package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTemplatesViewModelSelectEvent extends StObject {
  
  var item: TemplateItem
  
  var template: FeatureTemplate
}
object FeatureTemplatesViewModelSelectEvent {
  
  @scala.inline
  def apply(item: TemplateItem, template: FeatureTemplate): FeatureTemplatesViewModelSelectEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplatesViewModelSelectEvent]
  }
  
  @scala.inline
  implicit class FeatureTemplatesViewModelSelectEventMutableBuilder[Self <: FeatureTemplatesViewModelSelectEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: TemplateItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: FeatureTemplate): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}
