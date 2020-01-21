package typings.aliApp

import typings.aliApp.aliAppStrings.N
import typings.aliApp.aliAppStrings.Y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdmitstate extends js.Object {
  /**
  				 * 是否准入:Y:准入；N:不准入(该字段目前无实际意义)
  				 */
  var admit_state: Y | N | String
  var callbackData: js.Any
  /**
  				 * 商户发起借用服务时传入的参数，需要在借用结束后返回给商户的参数
  				 * @example
  				 * {"user_name":"john"}
  				 */
  var invoke_state: String
  /**
  				 * 芝麻信用借还订单号
  				 * @example
  				 * 10020027631
  				 */
  var order_no: String
  /**
  				 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+4位随机数
  				 * @example
  				 * 201610010000283627
  				 */
  var out_order_no: String
  /**
  				 * 物品借用/租赁者的用户id
  				 * @example
  				 * 2088202924240029
  				 */
  var user_id: String
}

object AnonAdmitstate {
  @scala.inline
  def apply(
    admit_state: Y | N | String,
    callbackData: js.Any,
    invoke_state: String,
    order_no: String,
    out_order_no: String,
    user_id: String
  ): AnonAdmitstate = {
    val __obj = js.Dynamic.literal(admit_state = admit_state.asInstanceOf[js.Any], callbackData = callbackData.asInstanceOf[js.Any], invoke_state = invoke_state.asInstanceOf[js.Any], order_no = order_no.asInstanceOf[js.Any], out_order_no = out_order_no.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdmitstate]
  }
}

