package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`10`
import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.anon.Avatar
import org.scalablytyped.runtime.StObject
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
  implicit class ChooseAlipayContactOptionsMutableBuilder[Self <: ChooseAlipayContactOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: /* error */ `10` | `11` => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: Avatar => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
