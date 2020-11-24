package typings.angularUiNotification.mod.uiNotification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGlobalMessageOptions extends js.Object {
  
  var closeOnClick: js.UndefOr[Boolean] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var horizontalSpacing: js.UndefOr[Double] = js.native
  
  var maxCount: js.UndefOr[Double] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.native
  
  var positionX: js.UndefOr[XPosition] = js.native
  
  var positionY: js.UndefOr[YPosition] = js.native
  
  var replaceMessage: js.UndefOr[Boolean] = js.native
  
  var startRight: js.UndefOr[Double] = js.native
  
  var startTop: js.UndefOr[Double] = js.native
  
  var templateUrl: js.UndefOr[String] = js.native
  
  var verticalSpacing: js.UndefOr[Double] = js.native
}
object IGlobalMessageOptions {
  
  @scala.inline
  def apply(): IGlobalMessageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGlobalMessageOptions]
  }
  
  @scala.inline
  implicit class IGlobalMessageOptionsOps[Self <: IGlobalMessageOptions] (val x: Self) extends AnyVal {
    
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
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setHorizontalSpacing(value: Double): Self = this.set("horizontalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalSpacing: Self = this.set("horizontalSpacing", js.undefined)
    
    @scala.inline
    def setMaxCount(value: Double): Self = this.set("maxCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCount: Self = this.set("maxCount", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* element */ js.Any => _): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setPositionX(value: XPosition): Self = this.set("positionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionX: Self = this.set("positionX", js.undefined)
    
    @scala.inline
    def setPositionY(value: YPosition): Self = this.set("positionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositionY: Self = this.set("positionY", js.undefined)
    
    @scala.inline
    def setReplaceMessage(value: Boolean): Self = this.set("replaceMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceMessage: Self = this.set("replaceMessage", js.undefined)
    
    @scala.inline
    def setStartRight(value: Double): Self = this.set("startRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartRight: Self = this.set("startRight", js.undefined)
    
    @scala.inline
    def setStartTop(value: Double): Self = this.set("startTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTop: Self = this.set("startTop", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = this.set("templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUrl: Self = this.set("templateUrl", js.undefined)
    
    @scala.inline
    def setVerticalSpacing(value: Double): Self = this.set("verticalSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalSpacing: Self = this.set("verticalSpacing", js.undefined)
  }
}
