package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSipMediaApplicationResponse extends StObject {
  
  /**
    * The updated SIP media application details.
    */
  var SipMediaApplication: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplication] = js.undefined
}
object UpdateSipMediaApplicationResponse {
  
  inline def apply(): UpdateSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSipMediaApplicationResponse]
  }
  
  extension [Self <: UpdateSipMediaApplicationResponse](x: Self) {
    
    inline def setSipMediaApplication(value: SipMediaApplication): Self = StObject.set(x, "SipMediaApplication", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationUndefined: Self = StObject.set(x, "SipMediaApplication", js.undefined)
  }
}
