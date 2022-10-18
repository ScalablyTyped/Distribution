package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationCallResponse extends StObject {
  
  /**
    * The actual call.
    */
  var SipMediaApplicationCall: js.UndefOr[typings.awsSdk.clientsChimeMod.SipMediaApplicationCall] = js.undefined
}
object CreateSipMediaApplicationCallResponse {
  
  inline def apply(): CreateSipMediaApplicationCallResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipMediaApplicationCallResponse]
  }
  
  extension [Self <: CreateSipMediaApplicationCallResponse](x: Self) {
    
    inline def setSipMediaApplicationCall(value: SipMediaApplicationCall): Self = StObject.set(x, "SipMediaApplicationCall", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationCallUndefined: Self = StObject.set(x, "SipMediaApplicationCall", js.undefined)
  }
}
