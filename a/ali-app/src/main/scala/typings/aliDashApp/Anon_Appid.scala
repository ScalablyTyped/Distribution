package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appid extends js.Object {
  var app_id: String
  			// 应用id
  var auth_code: String
  		// 会员卡表单信息请求Id
  var out_string: String
  	// 会员卡模板Id
  var request_id: String
  			// 授权的state
  var scope: String
  		// 授权码，用于换取authtoken
  var state: String
  			// 授权scope
  var template_id: String
}

object Anon_Appid {
  @scala.inline
  def apply(
    app_id: String,
    auth_code: String,
    out_string: String,
    request_id: String,
    scope: String,
    state: String,
    template_id: String
  ): Anon_Appid = {
    val __obj = js.Dynamic.literal(app_id = app_id, auth_code = auth_code, out_string = out_string, request_id = request_id, scope = scope, state = state, template_id = template_id)
  
    __obj.asInstanceOf[Anon_Appid]
  }
}

