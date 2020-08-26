package typings.angularStrap.mgcrea.ngStrap.typeahead

import typings.angularStrap.anon.Hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITypeaheadOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var autoSelect: js.UndefOr[Boolean] = js.native
  var comparator: js.UndefOr[String] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var delay: js.UndefOr[Double | Hide] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var limit: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* typeahead */ ITypeahead, Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var template: js.UndefOr[String] = js.native
  var trigger: js.UndefOr[String] = js.native
  var trimValue: js.UndefOr[Boolean] = js.native
  var watchOptions: js.UndefOr[Boolean] = js.native
}

object ITypeaheadOptions {
  @scala.inline
  def apply(): ITypeaheadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITypeaheadOptions]
  }
  @scala.inline
  implicit class ITypeaheadOptionsOps[Self <: ITypeaheadOptions] (val x: Self) extends AnyVal {
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
    def setAnimation(value: String): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAutoSelect(value: Boolean): Self = this.set("autoSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoSelect: Self = this.set("autoSelect", js.undefined)
    @scala.inline
    def setComparator(value: String): Self = this.set("comparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparator: Self = this.set("comparator", js.undefined)
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setOnBeforeHide(value: /* typeahead */ ITypeahead => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    @scala.inline
    def setOnBeforeShow(value: /* typeahead */ ITypeahead => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    @scala.inline
    def setOnHide(value: /* typeahead */ ITypeahead => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnSelect(value: /* typeahead */ ITypeahead => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnShow(value: /* typeahead */ ITypeahead => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    @scala.inline
    def setTrimValue(value: Boolean): Self = this.set("trimValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimValue: Self = this.set("trimValue", js.undefined)
    @scala.inline
    def setWatchOptions(value: Boolean): Self = this.set("watchOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatchOptions: Self = this.set("watchOptions", js.undefined)
  }
  
}

