package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationCallResponse extends StObject {
  
  /**
    * The actual call.
    */
  var SipMediaApplicationCall: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplicationCall] = js.undefined
}
object CreateSipMediaApplicationCallResponse {
  
  inline def apply(): CreateSipMediaApplicationCallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipMediaApplicationCallResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSipMediaApplicationCallResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplicationCall(value: SipMediaApplicationCall): Self = StObject.set(x, "SipMediaApplicationCall", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationCallUndefined: Self = StObject.set(x, "SipMediaApplicationCall", js.undefined)
  }
}
