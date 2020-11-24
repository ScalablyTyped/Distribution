package typings.angularStrap.mgcrea.ngStrap.alert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAlertOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String | Boolean] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var controller: js.UndefOr[js.Any] = js.native
  
  var controllerAs: js.UndefOr[String] = js.native
  
  var dismissable: js.UndefOr[Boolean] = js.native
  
  var duration: js.UndefOr[Double | Boolean] = js.native
  
  var onBeforeHide: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.native
  
  var onBeforeShow: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* alert */ IAlert, Unit]] = js.native
  
  var placement: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object IAlertOptions {
  
  @scala.inline
  def apply(): IAlertOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAlertOptions]
  }
  
  @scala.inline
  implicit class IAlertOptionsOps[Self <: IAlertOptions] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: String | Boolean): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setController(value: js.Any): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setControllerAs(value: String): Self = this.set("controllerAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerAs: Self = this.set("controllerAs", js.undefined)
    
    @scala.inline
    def setDismissable(value: Boolean): Self = this.set("dismissable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissable: Self = this.set("dismissable", js.undefined)
    
    @scala.inline
    def setDuration(value: Double | Boolean): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setOnBeforeHide(value: /* alert */ IAlert => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    
    @scala.inline
    def setOnBeforeShow(value: /* alert */ IAlert => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* alert */ IAlert => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* alert */ IAlert => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    
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
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
