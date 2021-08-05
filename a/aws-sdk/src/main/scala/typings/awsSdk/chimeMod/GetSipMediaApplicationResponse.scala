package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipMediaApplicationResponse extends StObject {
  
  /**
    * The SIP media application details.
    */
  var SipMediaApplication: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplication] = js.undefined
}
object GetSipMediaApplicationResponse {
  
  inline def apply(): GetSipMediaApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationResponse]
  }
  
  extension [Self <: GetSipMediaApplicationResponse](x: Self) {
    
    inline def setSipMediaApplication(value: SipMediaApplication): Self = StObject.set(x, "SipMediaApplication", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationUndefined: Self = StObject.set(x, "SipMediaApplication", js.undefined)
  }
}
