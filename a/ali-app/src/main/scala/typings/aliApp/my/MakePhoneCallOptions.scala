package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 拨打电话 https://docs.alipay.com/mini/api/macke-call
@js.native
trait MakePhoneCallOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要拨打的电话号码
    */
  var number: String = js.native
}
object MakePhoneCallOptions {
  
  @scala.inline
  def apply(number: String): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
  
  @scala.inline
  implicit class MakePhoneCallOptionsMutableBuilder[Self <: MakePhoneCallOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
