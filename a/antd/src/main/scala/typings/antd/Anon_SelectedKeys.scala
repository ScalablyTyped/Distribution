package typings.antd

import typings.react.reactMod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SelectedKeys extends js.Object {
  var selectedKeys: js.UndefOr[js.Array[ReactText]] = js.undefined
}

object Anon_SelectedKeys {
  @scala.inline
  def apply(selectedKeys: js.Array[ReactText] = null): Anon_SelectedKeys = {
    val __obj = js.Dynamic.literal()
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SelectedKeys]
  }
}

