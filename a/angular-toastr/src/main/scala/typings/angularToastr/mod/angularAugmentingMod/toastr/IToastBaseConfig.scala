package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angularToastr.anon.Progressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastBaseConfig extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.native
  var closeButton: js.UndefOr[Boolean] = js.native
  var closeHtml: js.UndefOr[String] = js.native
  var extendedTimeOut: js.UndefOr[Double] = js.native
  var extraData: js.UndefOr[js.Any] = js.native
  var messageClass: js.UndefOr[String] = js.native
  var onHidden: js.UndefOr[js.Function2[/* wasClicked */ Boolean, /* toast */ IToast, Unit]] = js.native
  var onShown: js.UndefOr[js.Function1[/* toast */ IToast, Unit]] = js.native
  var onTap: js.UndefOr[js.Function1[/* toast */ IToast, Unit]] = js.native
  var progressBar: js.UndefOr[Boolean] = js.native
  var tapToDismiss: js.UndefOr[Boolean] = js.native
  var templates: js.UndefOr[Progressbar] = js.native
  var timeOut: js.UndefOr[Double] = js.native
  var titleClass: js.UndefOr[String] = js.native
  var toastClass: js.UndefOr[String] = js.native
}

object IToastBaseConfig {
  @scala.inline
  def apply(): IToastBaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastBaseConfig]
  }
  @scala.inline
  implicit class IToastBaseConfigOps[Self <: IToastBaseConfig] (val x: Self) extends AnyVal {
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
    def setAllowHtml(value: Boolean): Self = this.set("allowHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHtml: Self = this.set("allowHtml", js.undefined)
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    @scala.inline
    def setCloseHtml(value: String): Self = this.set("closeHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseHtml: Self = this.set("closeHtml", js.undefined)
    @scala.inline
    def setExtendedTimeOut(value: Double): Self = this.set("extendedTimeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedTimeOut: Self = this.set("extendedTimeOut", js.undefined)
    @scala.inline
    def setExtraData(value: js.Any): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setMessageClass(value: String): Self = this.set("messageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessageClass: Self = this.set("messageClass", js.undefined)
    @scala.inline
    def setOnHidden(value: (/* wasClicked */ Boolean, /* toast */ IToast) => Unit): Self = this.set("onHidden", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHidden: Self = this.set("onHidden", js.undefined)
    @scala.inline
    def setOnShown(value: /* toast */ IToast => Unit): Self = this.set("onShown", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShown: Self = this.set("onShown", js.undefined)
    @scala.inline
    def setOnTap(value: /* toast */ IToast => Unit): Self = this.set("onTap", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTap: Self = this.set("onTap", js.undefined)
    @scala.inline
    def setProgressBar(value: Boolean): Self = this.set("progressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressBar: Self = this.set("progressBar", js.undefined)
    @scala.inline
    def setTapToDismiss(value: Boolean): Self = this.set("tapToDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapToDismiss: Self = this.set("tapToDismiss", js.undefined)
    @scala.inline
    def setTemplates(value: Progressbar): Self = this.set("templates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplates: Self = this.set("templates", js.undefined)
    @scala.inline
    def setTimeOut(value: Double): Self = this.set("timeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeOut: Self = this.set("timeOut", js.undefined)
    @scala.inline
    def setTitleClass(value: String): Self = this.set("titleClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleClass: Self = this.set("titleClass", js.undefined)
    @scala.inline
    def setToastClass(value: String): Self = this.set("toastClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToastClass: Self = this.set("toastClass", js.undefined)
  }
  
}

