package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMobile extends js.Object {
  	// 选中的联系人姓名
  var mobile: String
  var name: String
}

object AnonMobile {
  @scala.inline
  def apply(mobile: String, name: String): AnonMobile = {
    val __obj = js.Dynamic.literal(mobile = mobile.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMobile]
  }
}

