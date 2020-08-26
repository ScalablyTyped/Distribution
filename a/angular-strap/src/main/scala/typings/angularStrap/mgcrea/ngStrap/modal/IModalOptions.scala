package typings.angularStrap.mgcrea.ngStrap.modal

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalOptions extends js.Object {
  var animation: js.UndefOr[String] = js.native
  var backdrop: js.UndefOr[Boolean | String] = js.native
  var backdropAnimation: js.UndefOr[String] = js.native
  var container: js.UndefOr[String | Boolean] = js.native
  var content: js.UndefOr[String] = js.native
  var contentTemplate: js.UndefOr[String] = js.native
  var controller: js.UndefOr[js.Any] = js.native
  var controllerAs: js.UndefOr[String] = js.native
  var html: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var keyboard: js.UndefOr[Boolean] = js.native
  var locals: js.UndefOr[js.Any] = js.native
  var onBeforeHide: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
  var onBeforeShow: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
  var onHide: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
  var onShow: js.UndefOr[js.Function1[/* modal */ IModal, Unit]] = js.native
  var placement: js.UndefOr[String] = js.native
  var prefixEvent: js.UndefOr[String] = js.native
  var resolve: js.UndefOr[js.Any] = js.native
  var scope: js.UndefOr[IScope] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[String] = js.native
  var templateUrl: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object IModalOptions {
  @scala.inline
  def apply(): IModalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModalOptions]
  }
  @scala.inline
  implicit class IModalOptionsOps[Self <: IModalOptions] (val x: Self) extends AnyVal {
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
    def setBackdrop(value: Boolean | String): Self = this.set("backdrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdrop: Self = this.set("backdrop", js.undefined)
    @scala.inline
    def setBackdropAnimation(value: String): Self = this.set("backdropAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackdropAnimation: Self = this.set("backdropAnimation", js.undefined)
    @scala.inline
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setContentTemplate(value: String): Self = this.set("contentTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTemplate: Self = this.set("contentTemplate", js.undefined)
    @scala.inline
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKeyboard(value: Boolean): Self = this.set("keyboard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboard: Self = this.set("keyboard", js.undefined)
    @scala.inline
    def setLocals(value: js.Any): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
    @scala.inline
    def setOnBeforeHide(value: /* modal */ IModal => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    @scala.inline
    def setOnBeforeShow(value: /* modal */ IModal => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    @scala.inline
    def setOnHide(value: /* modal */ IModal => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnShow(value: /* modal */ IModal => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPrefixEvent(value: String): Self = this.set("prefixEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixEvent: Self = this.set("prefixEvent", js.undefined)
    @scala.inline
    def setResolve(value: js.Any): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setScope(value: IScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

