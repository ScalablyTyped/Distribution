package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureTemplatesViewModelSelectEvent extends js.Object {
  var item: TemplateItem = js.native
  var template: FeatureTemplate = js.native
}

object FeatureTemplatesViewModelSelectEvent {
  @scala.inline
  def apply(item: TemplateItem, template: FeatureTemplate): FeatureTemplatesViewModelSelectEvent = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTemplatesViewModelSelectEvent]
  }
  @scala.inline
  implicit class FeatureTemplatesViewModelSelectEventOps[Self <: FeatureTemplatesViewModelSelectEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItem(value: TemplateItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: FeatureTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

