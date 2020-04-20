package typings.antd.layoutLayoutMod

import typings.antd.AnonAddSider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutContextProps extends js.Object {
  var siderHook: AnonAddSider
}

object LayoutContextProps {
  @scala.inline
  def apply(siderHook: AnonAddSider): LayoutContextProps = {
    val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutContextProps]
  }
}

