package typings.angularStrap.mgcrea.ngStrap.tooltip

import typings.angular.mod.IAugmentedJQuery
import typings.angularStrap.anon.Hide
import typings.angularStrap.anon.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipOptions extends js.Object {
  
  var animation: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[String | Boolean] = js.native
  
  var delay: js.UndefOr[Double | Hide] = js.native
  
  var html: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var onBeforeHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.native
  
  var onBeforeShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.native
  
  var onHide: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.native
  
  var onShow: js.UndefOr[js.Function1[/* tooltip */ ITooltip, Unit]] = js.native
  
  var placement: js.UndefOr[String] = js.native
  
  var prefixEvent: js.UndefOr[String] = js.native
  
  var target: js.UndefOr[String | IAugmentedJQuery | Boolean] = js.native
  
  var template: js.UndefOr[String] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var titleTemplate: js.UndefOr[String] = js.native
  
  var trigger: js.UndefOr[String] = js.native
  
  var viewport: js.UndefOr[String | Padding] = js.native
}
object ITooltipOptions {
  
  @scala.inline
  def apply(): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipOptions]
  }
  
  @scala.inline
  implicit class ITooltipOptionsOps[Self <: ITooltipOptions] (val x: Self) extends AnyVal {
    
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
    def setOnBeforeHide(value: /* tooltip */ ITooltip => Unit): Self = this.set("onBeforeHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeHide: Self = this.set("onBeforeHide", js.undefined)
    
    @scala.inline
    def setOnBeforeShow(value: /* tooltip */ ITooltip => Unit): Self = this.set("onBeforeShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeShow: Self = this.set("onBeforeShow", js.undefined)
    
    @scala.inline
    def setOnHide(value: /* tooltip */ ITooltip => Unit): Self = this.set("onHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* tooltip */ ITooltip => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
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
    def setTarget(value: String | IAugmentedJQuery | Boolean): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
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
    def setTitleTemplate(value: String): Self = this.set("titleTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTemplate: Self = this.set("titleTemplate", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setViewport(value: String | Padding): Self = this.set("viewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
  }
}
