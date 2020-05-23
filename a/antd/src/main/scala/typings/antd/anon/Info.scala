package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var error: js.UndefOr[scala.Nothing] = js.undefined
  var info: ComponentStackString
}

object Info {
  @scala.inline
  def apply(info: ComponentStackString): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

