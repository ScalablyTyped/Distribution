package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appid extends js.Object {
  var app_id: java.lang.String
  			// 应用id
  var auth_code: java.lang.String
  		// 会员卡表单信息请求Id
  var out_string: java.lang.String
  	// 会员卡模板Id
  var request_id: java.lang.String
  			// 授权的state
  var scope: java.lang.String
  		// 授权码，用于换取authtoken
  var state: java.lang.String
  			// 授权scope
  var template_id: java.lang.String
}

object Anon_Appid {
  @scala.inline
  def apply(
    app_id: java.lang.String,
    auth_code: java.lang.String,
    out_string: java.lang.String,
    request_id: java.lang.String,
    scope: java.lang.String,
    state: java.lang.String,
    template_id: java.lang.String
  ): Anon_Appid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app_id")(app_id)
    __obj.updateDynamic("auth_code")(auth_code)
    __obj.updateDynamic("out_string")(out_string)
    __obj.updateDynamic("request_id")(request_id)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("template_id")(template_id)
    __obj.asInstanceOf[Anon_Appid]
  }
}

