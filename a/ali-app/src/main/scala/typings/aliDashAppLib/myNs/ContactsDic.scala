package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsDic extends js.Object {
  /**
  		 * 账号的头像链接
  		 */
  var avatar: java.lang.String
  /**
  		 * 账号的显示名称：也即支付宝设置的备注名称，默认为朋友圈里面的昵称
  		 */
  var displayName: java.lang.String
  /**
  		 * 账号对应的手机号码
  		 */
  var mobile: java.lang.String
  /**
  		 * 账号的真实姓名
  		 */
  var realName: java.lang.String
  /**
  		 * 支付宝账号唯一 userId
  		 */
  var userId: java.lang.String
}

object ContactsDic {
  @scala.inline
  def apply(
    avatar: java.lang.String,
    displayName: java.lang.String,
    mobile: java.lang.String,
    realName: java.lang.String,
    userId: java.lang.String
  ): ContactsDic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("avatar")(avatar)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("mobile")(mobile)
    __obj.updateDynamic("realName")(realName)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[ContactsDic]
  }
}

