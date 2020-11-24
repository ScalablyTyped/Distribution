package typings.angularTooltips.mod

import typings.angularTooltips.angularTooltipsStrings.`bottom left`
import typings.angularTooltips.angularTooltipsStrings.`bottom right`
import typings.angularTooltips.angularTooltipsStrings.`top left`
import typings.angularTooltips.angularTooltipsStrings.`top right`
import typings.angularTooltips.angularTooltipsStrings.bottom
import typings.angularTooltips.angularTooltipsStrings.fast
import typings.angularTooltips.angularTooltipsStrings.large
import typings.angularTooltips.angularTooltipsStrings.left
import typings.angularTooltips.angularTooltipsStrings.medium
import typings.angularTooltips.angularTooltipsStrings.right
import typings.angularTooltips.angularTooltipsStrings.slow
import typings.angularTooltips.angularTooltipsStrings.small
import typings.angularTooltips.angularTooltipsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipsConfProviderOptions extends js.Object {
  
  var `class`: js.UndefOr[String] = js.native
  
  var closeButton: js.UndefOr[Boolean] = js.native
  
  var hideTrigger: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var showTrigger: js.UndefOr[String] = js.native
  
  var side: js.UndefOr[
    left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
  ] = js.native
  
  var size: js.UndefOr[small | medium | large] = js.native
  
  var smart: js.UndefOr[Boolean] = js.native
  
  var speed: js.UndefOr[slow | medium | fast] = js.native
  
  var tooltipTemplateUrlCache: js.UndefOr[Boolean] = js.native
}
object TooltipsConfProviderOptions {
  
  @scala.inline
  def apply(): TooltipsConfProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipsConfProviderOptions]
  }
  
  @scala.inline
  implicit class TooltipsConfProviderOptionsOps[Self <: TooltipsConfProviderOptions] (val x: Self) extends AnyVal {
    
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setHideTrigger(value: String): Self = this.set("hideTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideTrigger: Self = this.set("hideTrigger", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setShowTrigger(value: String): Self = this.set("showTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTrigger: Self = this.set("showTrigger", js.undefined)
    
    @scala.inline
    def setSide(
      value: left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
    ): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
    
    @scala.inline
    def setSize(value: small | medium | large): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSmart(value: Boolean): Self = this.set("smart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmart: Self = this.set("smart", js.undefined)
    
    @scala.inline
    def setSpeed(value: slow | medium | fast): Self = this.set("speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeed: Self = this.set("speed", js.undefined)
    
    @scala.inline
    def setTooltipTemplateUrlCache(value: Boolean): Self = this.set("tooltipTemplateUrlCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltipTemplateUrlCache: Self = this.set("tooltipTemplateUrlCache", js.undefined)
  }
}
