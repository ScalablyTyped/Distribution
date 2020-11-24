package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`10`
import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.anon.Avatar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseAlipayContactOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: Double = js.native
  
  /**
    * 10    没有权限
    * 11    用户取消操作(或设备未授权使用通讯录)
    */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.native
  
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: Avatar): Unit = js.native
}
object ChooseAlipayContactOptions {
  
  @scala.inline
  def apply(count: Double, success: Avatar => Unit): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
  
  @scala.inline
  implicit class ChooseAlipayContactOptionsOps[Self <: ChooseAlipayContactOptions] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Avatar => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFail(value: /* error */ `10` | `11` => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
  }
}
