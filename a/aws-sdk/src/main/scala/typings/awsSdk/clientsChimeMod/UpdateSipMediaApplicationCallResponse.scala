package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSipMediaApplicationCallResponse extends StObject {
  
  /**
    * A Call instance for a SIP media application.
    */
  var SipMediaApplicationCall: js.UndefOr[typings.awsSdk.clientsChimeMod.SipMediaApplicationCall] = js.undefined
}
object UpdateSipMediaApplicationCallResponse {
  
  inline def apply(): UpdateSipMediaApplicationCallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSipMediaApplicationCallResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSipMediaApplicationCallResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationCall(value: SipMediaApplicationCall): Self = StObject.set(x, "SipMediaApplicationCall", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationCallUndefined: Self = StObject.set(x, "SipMediaApplicationCall", js.undefined)
  }
}
