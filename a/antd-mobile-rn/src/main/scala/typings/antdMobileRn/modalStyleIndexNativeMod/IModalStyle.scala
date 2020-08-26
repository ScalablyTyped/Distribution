package typings.antdMobileRn.modalStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModalStyle extends js.Object {
  var body: ViewStyle = js.native
  var buttonGroupH: ViewStyle = js.native
  var buttonGroupV: ViewStyle = js.native
  var buttonText: TextStyle = js.native
  var buttonTextOperation: TextStyle = js.native
  var buttonWrapH: ViewStyle = js.native
  var buttonWrapV: ViewStyle = js.native
  var close: TextStyle = js.native
  var closeWrap: ViewStyle = js.native
  var container: ViewStyle = js.native
  var footer: ViewStyle = js.native
  var header: TextStyle = js.native
  var innerContainer: ViewStyle = js.native
  var maskClosable: ViewStyle = js.native
  var operationBody: ViewStyle = js.native
  var operationContainer: ViewStyle = js.native
  var popupContainer: ViewStyle = js.native
  var wrap: ViewStyle = js.native
}

object IModalStyle {
  @scala.inline
  def apply(
    body: ViewStyle,
    buttonGroupH: ViewStyle,
    buttonGroupV: ViewStyle,
    buttonText: TextStyle,
    buttonTextOperation: TextStyle,
    buttonWrapH: ViewStyle,
    buttonWrapV: ViewStyle,
    close: TextStyle,
    closeWrap: ViewStyle,
    container: ViewStyle,
    footer: ViewStyle,
    header: TextStyle,
    innerContainer: ViewStyle,
    maskClosable: ViewStyle,
    operationBody: ViewStyle,
    operationContainer: ViewStyle,
    popupContainer: ViewStyle,
    wrap: ViewStyle
  ): IModalStyle = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttonGroupH = buttonGroupH.asInstanceOf[js.Any], buttonGroupV = buttonGroupV.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextOperation = buttonTextOperation.asInstanceOf[js.Any], buttonWrapH = buttonWrapH.asInstanceOf[js.Any], buttonWrapV = buttonWrapV.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], operationBody = operationBody.asInstanceOf[js.Any], operationContainer = operationContainer.asInstanceOf[js.Any], popupContainer = popupContainer.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModalStyle]
  }
  @scala.inline
  implicit class IModalStyleOps[Self <: IModalStyle] (val x: Self) extends AnyVal {
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
    def setBody(value: ViewStyle): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonGroupH(value: ViewStyle): Self = this.set("buttonGroupH", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonGroupV(value: ViewStyle): Self = this.set("buttonGroupV", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonText(value: TextStyle): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonTextOperation(value: TextStyle): Self = this.set("buttonTextOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonWrapH(value: ViewStyle): Self = this.set("buttonWrapH", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonWrapV(value: ViewStyle): Self = this.set("buttonWrapV", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: TextStyle): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseWrap(value: ViewStyle): Self = this.set("closeWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setFooter(value: ViewStyle): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: TextStyle): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setInnerContainer(value: ViewStyle): Self = this.set("innerContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaskClosable(value: ViewStyle): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationBody(value: ViewStyle): Self = this.set("operationBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationContainer(value: ViewStyle): Self = this.set("operationContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopupContainer(value: ViewStyle): Self = this.set("popupContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrap(value: ViewStyle): Self = this.set("wrap", value.asInstanceOf[js.Any])
  }
  
}

