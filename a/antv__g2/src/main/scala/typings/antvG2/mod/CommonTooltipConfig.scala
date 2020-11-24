package typings.antvG2.mod

import typings.antvG2.anon.Style
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.click
import typings.antvG2.antvG2Strings.default
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.mini
import typings.antvG2.antvG2Strings.mousemove
import typings.antvG2.antvG2Strings.none
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonTooltipConfig extends js.Object {
  
  var crosshairs: js.UndefOr[Style] = js.native
  
  var follow: js.UndefOr[Boolean] = js.native
  
  var hideMarkers: js.UndefOr[Boolean] = js.native
  
  var inPlot: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[left | right | top | bottom] = js.native
  
  var shared: js.UndefOr[Boolean] = js.native
  
  var showTitle: js.UndefOr[Boolean] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var triggerOn: js.UndefOr[mousemove | click | none] = js.native
  
  var `type`: js.UndefOr[default | mini] = js.native
  
  var useHtml: js.UndefOr[Boolean] = js.native
}
object CommonTooltipConfig {
  
  @scala.inline
  def apply(): CommonTooltipConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonTooltipConfig]
  }
  
  @scala.inline
  implicit class CommonTooltipConfigOps[Self <: CommonTooltipConfig] (val x: Self) extends AnyVal {
    
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
    def setCrosshairs(value: Style): Self = this.set("crosshairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrosshairs: Self = this.set("crosshairs", js.undefined)
    
    @scala.inline
    def setFollow(value: Boolean): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setHideMarkers(value: Boolean): Self = this.set("hideMarkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideMarkers: Self = this.set("hideMarkers", js.undefined)
    
    @scala.inline
    def setInPlot(value: Boolean): Self = this.set("inPlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPlot: Self = this.set("inPlot", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPosition(value: left | right | top | bottom): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShared(value: Boolean): Self = this.set("shared", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShared: Self = this.set("shared", js.undefined)
    
    @scala.inline
    def setShowTitle(value: Boolean): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTriggerOn(value: mousemove | click | none): Self = this.set("triggerOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerOn: Self = this.set("triggerOn", js.undefined)
    
    @scala.inline
    def setType(value: default | mini): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUseHtml(value: Boolean): Self = this.set("useHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseHtml: Self = this.set("useHtml", js.undefined)
  }
}
