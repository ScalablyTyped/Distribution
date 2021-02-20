package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenCardDetailOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var passId: String = js.native
}
object OpenCardDetailOptions {
  
  @scala.inline
  def apply(passId: String): OpenCardDetailOptions = {
    val __obj = js.Dynamic.literal(passId = passId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCardDetailOptions]
  }
  
  @scala.inline
  implicit class OpenCardDetailOptionsMutableBuilder[Self <: OpenCardDetailOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassId(value: String): Self = StObject.set(x, "passId", value.asInstanceOf[js.Any])
  }
}
