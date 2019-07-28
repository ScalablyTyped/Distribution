package typings.atAntDashDesignReactDashNative.libModalStyleMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalStyle extends js.Object {
  var body: ViewStyle
  var buttonGroupH: ViewStyle
  var buttonGroupV: ViewStyle
  var buttonText: TextStyle
  var buttonTextOperation: TextStyle
  var buttonWrapH: ViewStyle
  var buttonWrapV: ViewStyle
  var close: TextStyle
  var closeWrap: ViewStyle
  var container: ViewStyle
  var footer: ViewStyle
  var header: TextStyle
  var innerContainer: ViewStyle
  var maskClosable: ViewStyle
  var operationBody: ViewStyle
  var operationContainer: ViewStyle
  var popupContainer: ViewStyle
  var popupSlideDown: ViewStyle
  var popupSlideUp: ViewStyle
  var wrap: ViewStyle
}

object ModalStyle {
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
    popupSlideDown: ViewStyle,
    popupSlideUp: ViewStyle,
    wrap: ViewStyle
  ): ModalStyle = {
    val __obj = js.Dynamic.literal(body = body, buttonGroupH = buttonGroupH, buttonGroupV = buttonGroupV, buttonText = buttonText, buttonTextOperation = buttonTextOperation, buttonWrapH = buttonWrapH, buttonWrapV = buttonWrapV, close = close, closeWrap = closeWrap, container = container, footer = footer, header = header, innerContainer = innerContainer, maskClosable = maskClosable, operationBody = operationBody, operationContainer = operationContainer, popupContainer = popupContainer, popupSlideDown = popupSlideDown, popupSlideUp = popupSlideUp, wrap = wrap)
  
    __obj.asInstanceOf[ModalStyle]
  }
}

