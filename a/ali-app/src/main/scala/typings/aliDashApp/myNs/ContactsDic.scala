package typings.aliDashApp.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactsDic extends js.Object {
  /**
  		 * 账号的头像链接
  		 */
  var avatar: String
  /**
  		 * 账号的显示名称：也即支付宝设置的备注名称，默认为朋友圈里面的昵称
  		 */
  var displayName: String
  /**
  		 * 账号对应的手机号码
  		 */
  var mobile: String
  /**
  		 * 账号的真实姓名
  		 */
  var realName: String
  /**
  		 * 支付宝账号唯一 userId
  		 */
  var userId: String
}

object ContactsDic {
  @scala.inline
  def apply(avatar: String, displayName: String, mobile: String, realName: String, userId: String): ContactsDic = {
    val __obj = js.Dynamic.literal(avatar = avatar, displayName = displayName, mobile = mobile, realName = realName, userId = userId)
  
    __obj.asInstanceOf[ContactsDic]
  }
}

