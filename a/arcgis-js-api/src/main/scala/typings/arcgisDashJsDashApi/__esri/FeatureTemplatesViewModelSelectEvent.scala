package typings.arcgisDashJsDashApi.__esri

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
    val __obj = js.Dynamic.literal(item = item, template = template)
  
    __obj.asInstanceOf[FeatureTemplatesViewModelSelectEvent]
  }
}

