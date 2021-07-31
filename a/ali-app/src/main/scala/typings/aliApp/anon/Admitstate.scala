package typings.aliApp.anon

import typings.aliApp.aliAppStrings.N
import typings.aliApp.aliAppStrings.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Admitstate extends StObject {
  
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
object Admitstate {
  
  @scala.inline
  def apply(
    admit_state: Y | N | String,
    callbackData: js.Any,
    invoke_state: String,
    order_no: String,
    out_order_no: String,
    user_id: String
  ): Admitstate = {
    val __obj = js.Dynamic.literal(admit_state = admit_state.asInstanceOf[js.Any], callbackData = callbackData.asInstanceOf[js.Any], invoke_state = invoke_state.asInstanceOf[js.Any], order_no = order_no.asInstanceOf[js.Any], out_order_no = out_order_no.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Admitstate]
  }
  
  @scala.inline
  implicit class AdmitstateMutableBuilder[Self <: Admitstate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmit_state(value: Y | N | String): Self = StObject.set(x, "admit_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackData(value: js.Any): Self = StObject.set(x, "callbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoke_state(value: String): Self = StObject.set(x, "invoke_state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder_no(value: String): Self = StObject.set(x, "order_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOut_order_no(value: String): Self = StObject.set(x, "out_order_no", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
  }
}
