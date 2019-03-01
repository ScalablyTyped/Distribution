package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Admitstate extends js.Object {
  /**
  				 * 是否准入:Y:准入；N:不准入(该字段目前无实际意义)
  				 */
  var admit_state: aliDashAppLib.aliDashAppLibStrings.Y | aliDashAppLib.aliDashAppLibStrings.N | java.lang.String
  var callbackData: js.Any
  /**
  				 * 商户发起借用服务时传入的参数，需要在借用结束后返回给商户的参数
  				 * @example
  				 * {"user_name":"john"}
  				 */
  var invoke_state: java.lang.String
  /**
  				 * 芝麻信用借还订单号
  				 * @example
  				 * 10020027631
  				 */
  var order_no: java.lang.String
  /**
  				 * 外部订单号，需要唯一，由商户传入，芝麻内部会做幂等控制，格式为：yyyyMMddHHmmss+4位随机数
  				 * @example
  				 * 201610010000283627
  				 */
  var out_order_no: java.lang.String
  /**
  				 * 物品借用/租赁者的用户id
  				 * @example
  				 * 2088202924240029
  				 */
  var user_id: java.lang.String
}

object Anon_Admitstate {
  @scala.inline
  def apply(
    admit_state: aliDashAppLib.aliDashAppLibStrings.Y | aliDashAppLib.aliDashAppLibStrings.N | java.lang.String,
    callbackData: js.Any,
    invoke_state: java.lang.String,
    order_no: java.lang.String,
    out_order_no: java.lang.String,
    user_id: java.lang.String
  ): Anon_Admitstate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("admit_state")(admit_state.asInstanceOf[js.Any])
    __obj.updateDynamic("callbackData")(callbackData)
    __obj.updateDynamic("invoke_state")(invoke_state)
    __obj.updateDynamic("order_no")(order_no)
    __obj.updateDynamic("out_order_no")(out_order_no)
    __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[Anon_Admitstate]
  }
}

