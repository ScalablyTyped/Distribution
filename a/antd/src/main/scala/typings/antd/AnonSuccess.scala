package typings.antd

import typings.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuccess extends js.Object {
  var error: ForwardRefExoticComponent[PickAntdIconPropschildren]
  var info: ForwardRefExoticComponent[PickAntdIconPropschildren]
  var success: ForwardRefExoticComponent[PickAntdIconPropschildren]
  var warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
}

object AnonSuccess {
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[PickAntdIconPropschildren],
    info: ForwardRefExoticComponent[PickAntdIconPropschildren],
    success: ForwardRefExoticComponent[PickAntdIconPropschildren],
    warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
  ): AnonSuccess = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuccess]
  }
}

