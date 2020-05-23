package typings.antd.layoutLayoutMod

import typings.antd.anon.AddSider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutContextProps extends js.Object {
  var siderHook: AddSider
}

object LayoutContextProps {
  @scala.inline
  def apply(siderHook: AddSider): LayoutContextProps = {
    val __obj = js.Dynamic.literal(siderHook = siderHook.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutContextProps]
  }
}

