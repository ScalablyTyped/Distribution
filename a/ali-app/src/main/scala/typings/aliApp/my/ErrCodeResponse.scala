package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrCodeResponse extends StObject {
  
  var errCode: Double = js.native
}
object ErrCodeResponse {
  
  @scala.inline
  def apply(errCode: Double): ErrCodeResponse = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrCodeResponse]
  }
  
  @scala.inline
  implicit class ErrCodeResponseMutableBuilder[Self <: ErrCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "errCode", value.asInstanceOf[js.Any])
  }
}
