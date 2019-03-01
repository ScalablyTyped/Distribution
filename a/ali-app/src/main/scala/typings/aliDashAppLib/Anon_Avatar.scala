package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avatar extends js.Object {
  		// 账号的邮箱
  var avatar: java.lang.String
  		// 账号对应的手机号码
  var email: java.lang.String
  	// 账号的真实姓名
  var mobile: java.lang.String
  var realName: java.lang.String
  		// 账号的头像链接
  var userId: java.lang.String
}

object Anon_Avatar {
  @scala.inline
  def apply(
    avatar: java.lang.String,
    email: java.lang.String,
    mobile: java.lang.String,
    realName: java.lang.String,
    userId: java.lang.String
  ): Anon_Avatar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatar")(avatar)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("mobile")(mobile)
    __obj.updateDynamic("realName")(realName)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[Anon_Avatar]
  }
}

