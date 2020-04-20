package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureTemplatesViewModelSelectEvent extends js.Object {
  var item: TemplateItem
  var template: FeatureTemplate
}

object FeatureTemplatesViewModelSelectEvent {
  @scala.inline
  def apply(item: TemplateItem, template: FeatureTemplate): FeatureTemplatesViewModelSelectEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplatesViewModelSelectEvent]
  }
}

