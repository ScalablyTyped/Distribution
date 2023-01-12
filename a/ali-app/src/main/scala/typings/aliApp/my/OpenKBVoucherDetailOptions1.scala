package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenKBVoucherDetailOptions1
  extends StObject
     with BaseOptions[Any, Any] {
  
  var passId: String
}
object OpenKBVoucherDetailOptions1 {
  
  inline def apply(passId: String): OpenKBVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenKBVoucherDetailOptions1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenKBVoucherDetailOptions1] (val x: Self) extends AnyVal {
    
    inline def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
