package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Appid extends js.Object {
  var app_id: String = js.native
              // 应用id
  var auth_code: String = js.native
          // 会员卡表单信息请求Id
  var out_string: String = js.native
      // 会员卡模板Id
  var request_id: String = js.native
              // 授权的state
  var scope: String = js.native
          // 授权码，用于换取authtoken
  var state: String = js.native
              // 授权scope
  var template_id: String = js.native
}

object Appid {
  @scala.inline
  def apply(
    app_id: String,
    auth_code: String,
    out_string: String,
    request_id: String,
    scope: String,
    state: String,
    template_id: String
  ): Appid = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], auth_code = auth_code.asInstanceOf[js.Any], out_string = out_string.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], template_id = template_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  @scala.inline
  implicit class AppidOps[Self <: Appid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApp_id(value: String): Self = this.set("app_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth_code(value: String): Self = this.set("auth_code", value.asInstanceOf[js.Any])
    @scala.inline
    def setOut_string(value: String): Self = this.set("out_string", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest_id(value: String): Self = this.set("request_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate_id(value: String): Self = this.set("template_id", value.asInstanceOf[js.Any])
  }
  
}

