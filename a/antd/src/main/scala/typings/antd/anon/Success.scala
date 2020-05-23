package typings.antd.anon

import typings.react.mod.ForwardRefExoticComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success extends js.Object {
  var error: ForwardRefExoticComponent[PickAntdIconPropschildren]
  var info: ForwardRefExoticComponent[PickAntdIconPropschildren]
  var success: ForwardRefExoticComponent[PickAntdIconPropschildren]
  var warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
}

object Success {
  @scala.inline
  def apply(
    error: ForwardRefExoticComponent[PickAntdIconPropschildren],
    info: ForwardRefExoticComponent[PickAntdIconPropschildren],
    success: ForwardRefExoticComponent[PickAntdIconPropschildren],
    warning: ForwardRefExoticComponent[PickAntdIconPropschildren]
  ): Success = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
}

