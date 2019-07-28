package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mobile extends js.Object {
  	// 选中的联系人姓名
  var mobile: String
  var name: String
}

object Anon_Mobile {
  @scala.inline
  def apply(mobile: String, name: String): Anon_Mobile = {
    val __obj = js.Dynamic.literal(mobile = mobile, name = name)
  
    __obj.asInstanceOf[Anon_Mobile]
  }
}

