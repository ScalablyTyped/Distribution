package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplatesSelectEvent extends js.Object {
  var item: TemplateItem
  var template: FeatureTemplate
}

object FeatureTemplatesSelectEvent {
  @scala.inline
  def apply(item: TemplateItem, template: FeatureTemplate): FeatureTemplatesSelectEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FeatureTemplatesSelectEvent]
  }
}

