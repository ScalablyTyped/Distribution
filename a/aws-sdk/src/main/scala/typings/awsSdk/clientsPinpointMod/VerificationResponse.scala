package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerificationResponse extends StObject {
  
  /**
    * Specifies whether the OTP is valid or not.
    */
  var Valid: js.UndefOr[boolean] = js.undefined
}
object VerificationResponse {
  
  inline def apply(): VerificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerificationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerificationResponse] (val x: Self) extends AnyVal {
    
    inline def setValid(value: boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "Valid", js.undefined)
  }
}
