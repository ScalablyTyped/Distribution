package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`10`
import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.anon.Avatar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseAlipayContactOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: Double
  
  /**
    * 10    没有权限
    * 11    用户取消操作(或设备未授权使用通讯录)
    */
  @JSName("fail")
  var fail_ChooseAlipayContactOptions: js.UndefOr[js.Function1[/* error */ `10` | `11`, Unit]] = js.undefined
  
  @JSName("success")
  def success_MChooseAlipayContactOptions(result: Avatar): Unit
}
object ChooseAlipayContactOptions {
  
  inline def apply(count: Double, success: Avatar => Unit): ChooseAlipayContactOptions = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseAlipayContactOptions]
  }
  
  extension [Self <: ChooseAlipayContactOptions](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setFail(value: /* error */ `10` | `11` => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: Avatar => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
