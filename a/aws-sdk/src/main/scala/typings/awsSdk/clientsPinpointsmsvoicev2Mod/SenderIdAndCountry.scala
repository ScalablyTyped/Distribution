package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderIdAndCountry extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The unique identifier of the sender.
    */
  var SenderId: SenderIdOrArn
}
object SenderIdAndCountry {
  
  inline def apply(IsoCountryCode: IsoCountryCode, SenderId: SenderIdOrArn): SenderIdAndCountry = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderIdAndCountry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SenderIdAndCountry] (val x: Self) extends AnyVal {
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setSenderId(value: SenderIdOrArn): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
  }
}
