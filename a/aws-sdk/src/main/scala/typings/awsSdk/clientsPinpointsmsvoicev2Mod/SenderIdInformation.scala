package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SenderIdInformation extends StObject {
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageTypes: MessageTypeList
  
  /**
    * The monthly leasing price, in US dollars.
    */
  var MonthlyLeasingPrice: String
  
  /**
    * The alphanumeric sender ID in a specific country that you'd like to describe.
    */
  var SenderId: typings.awsSdk.clientsPinpointsmsvoicev2Mod.SenderId
  
  /**
    * The Amazon Resource Name (ARN) associated with the SenderId.
    */
  var SenderIdArn: String
}
object SenderIdInformation {
  
  inline def apply(
    IsoCountryCode: IsoCountryCode,
    MessageTypes: MessageTypeList,
    MonthlyLeasingPrice: String,
    SenderId: SenderId,
    SenderIdArn: String
  ): SenderIdInformation = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], MessageTypes = MessageTypes.asInstanceOf[js.Any], MonthlyLeasingPrice = MonthlyLeasingPrice.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SenderIdArn = SenderIdArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SenderIdInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SenderIdInformation] (val x: Self) extends AnyVal {
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setMessageTypes(value: MessageTypeList): Self = StObject.set(x, "MessageTypes", value.asInstanceOf[js.Any])
    
    inline def setMessageTypesVarargs(value: MessageType*): Self = StObject.set(x, "MessageTypes", js.Array(value*))
    
    inline def setMonthlyLeasingPrice(value: String): Self = StObject.set(x, "MonthlyLeasingPrice", value.asInstanceOf[js.Any])
    
    inline def setSenderId(value: SenderId): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdArn(value: String): Self = StObject.set(x, "SenderIdArn", value.asInstanceOf[js.Any])
  }
}
