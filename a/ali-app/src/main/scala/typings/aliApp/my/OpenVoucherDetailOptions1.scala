package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenVoucherDetailOptions1
  extends StObject
     with BaseOptions[Any, Any] {
  
  var passId: String
}
object OpenVoucherDetailOptions1 {
  
  inline def apply(passId: String): OpenVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenVoucherDetailOptions1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenVoucherDetailOptions1] (val x: Self) extends AnyVal {
    
    inline def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
