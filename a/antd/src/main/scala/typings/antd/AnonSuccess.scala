package typings.antd

import typings.antDesignIcons.componentsAntdIconMod.AntdIconProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess extends js.Object {
  var error: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]]
  var info: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]]
  var success: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]]
  var warning: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]]
}

object AnonSuccess {
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]],
    info: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]],
    success: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]],
    warning: ForwardRefExoticComponent[AntdIconProps with RefAttributes[HTMLSpanElement]]
  ): AnonSuccess = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSuccess]
  }
}

