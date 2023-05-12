package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationResponse extends StObject {
  
  /**
    * The SIP media application details.
    */
  var SipMediaApplication: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SipMediaApplication] = js.undefined
}
object CreateSipMediaApplicationResponse {
  
  inline def apply(): CreateSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipMediaApplicationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSipMediaApplicationResponse] (val x: Self) extends AnyVal {
    
    inline def setSipMediaApplication(value: SipMediaApplication): Self = StObject.set(x, "SipMediaApplication", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationUndefined: Self = StObject.set(x, "SipMediaApplication", js.undefined)
  }
}
