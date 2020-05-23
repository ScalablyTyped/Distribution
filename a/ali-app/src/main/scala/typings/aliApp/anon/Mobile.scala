package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mobile extends js.Object {
      // 选中的联系人姓名
  var mobile: String
  var name: String
}

object Mobile {
  @scala.inline
  def apply(mobile: String, name: String): Mobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mobile]
  }
}

