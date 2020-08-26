package typings.angularStrap.mgcrea.ngStrap.select

import typings.angularStrap.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISelectOptions extends js.Object {
  var allNoneButtons: js.UndefOr[Boolean] = js.native
  var allText: js.UndefOr[String] = js.native
  var animation: js.UndefOr[String] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var iconCheckmark: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var maxLengthHtml: js.UndefOr[String] = js.native
  var multiple: js.UndefOr[Boolean] = js.native
  var noneText: js.UndefOr[String] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* select */ ISelect, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placement: js.UndefOr[String] = js.native
  var sort: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var toggle: js.UndefOr[Boolean] = js.native
  var trigger: js.UndefOr[String] = js.native
}

object ISelectOptions {
  @scala.inline
  def apply(): ISelectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISelectOptions]
  }
  @scala.inline
  implicit class ISelectOptionsOps[Self <: ISelectOptions] (val x: Self) extends AnyVal {
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
    def setAllNoneButtons(value: Boolean): Self = this.set("allNoneButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllNoneButtons: Self = this.set("allNoneButtons", js.undefined)
    @scala.inline
    def setAllText(value: String): Self = this.set("allText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllText: Self = this.set("allText", js.undefined)
    @scala.inline
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setDelay(value: Double | Hide): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setIconCheckmark(value: String): Self = this.set("iconCheckmark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconCheckmark: Self = this.set("iconCheckmark", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxLengthHtml(value: String): Self = this.set("maxLengthHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLengthHtml: Self = this.set("maxLengthHtml", js.undefined)
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
    @scala.inline
    def setNoneText(value: String): Self = this.set("noneText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoneText: Self = this.set("noneText", js.undefined)
    @scala.inline
    def setOnBeforeHide(value: /* select */ ISelect => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    @scala.inline
    def setOnBeforeShow(value: /* select */ ISelect => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    @scala.inline
    def setOnHide(value: /* select */ ISelect => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: /* select */ ISelect => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setToggle(value: Boolean): Self = this.set("toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
  
}

