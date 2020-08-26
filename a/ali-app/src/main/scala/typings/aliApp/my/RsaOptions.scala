package typings.aliApp.my

import typings.aliApp.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region 数据安全 https://docs.alipay.com/mini/api/data-safe
@js.native
trait RsaOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 使用rsa加密还是rsa解密，encrypt加密，decrypt解密
    */
  var action: String = js.native
  /**
    * rsa秘钥，加密使用公钥，解密使用私钥
    */
  var key: String = js.native
  @JSName("success")
  var success_RsaOptions: js.UndefOr[js.Function1[/* res */ Text, Unit]] = js.native
  /**
    * 要处理的文本，加密为原始文本，解密为Base64编码格式文本
    */
  var text: String = js.native
}

object RsaOptions {
  @scala.inline
  def apply(action: String, key: String, text: String): RsaOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOptions]
  }
  @scala.inline
  implicit class RsaOptionsOps[Self <: RsaOptions] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: /* res */ Text => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

