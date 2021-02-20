package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenVoucherDetailOptions1
  extends BaseOptions[js.Any, js.Any] {
  
  var passId: String = js.native
}
object OpenVoucherDetailOptions1 {
  
  @scala.inline
  def apply(passId: String): OpenVoucherDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenVoucherDetailOptions1]
  }
  
  @scala.inline
  implicit class OpenVoucherDetailOptions1MutableBuilder[Self <: OpenVoucherDetailOptions1] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
