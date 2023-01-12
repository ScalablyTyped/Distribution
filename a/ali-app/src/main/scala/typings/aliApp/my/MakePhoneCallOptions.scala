package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 拨打电话 https://docs.alipay.com/mini/api/macke-call
trait MakePhoneCallOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 需要拨打的电话号码
    */
  var number: String
}
object MakePhoneCallOptions {
  
  inline def apply(number: String): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MakePhoneCallOptions] (val x: Self) extends AnyVal {
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
  }
}
