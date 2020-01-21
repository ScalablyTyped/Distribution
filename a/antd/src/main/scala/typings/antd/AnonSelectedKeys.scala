package typings.antd

import typings.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelectedKeys extends js.Object {
  var selectedKeys: js.UndefOr[js.Array[ReactText]] = js.undefined
}

object AnonSelectedKeys {
  @scala.inline
  def apply(selectedKeys: js.Array[ReactText] = null): AnonSelectedKeys = {
    val __obj = js.Dynamic.literal()
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSelectedKeys]
  }
}

