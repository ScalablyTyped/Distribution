package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenKBVoucherDetailOptions1
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  var passId: String
}
object OpenKBVoucherDetailOptions1 {
  
  @scala.inline
  def apply(passId: String): OpenKBVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenKBVoucherDetailOptions1]
  }
  
  @scala.inline
  implicit class OpenKBVoucherDetailOptions1MutableBuilder[Self <: OpenKBVoucherDetailOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
