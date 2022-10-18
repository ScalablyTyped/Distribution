package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Receipt extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the contact channel Incident Manager engaged.
    */
  var ContactChannelArn: js.UndefOr[SsmContactsArn] = js.undefined
  
  /**
    * Information provided during the page acknowledgement.
    */
  var ReceiptInfo: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.ReceiptInfo] = js.undefined
  
  /**
    * The time receipt was SENT, DELIVERED, or READ.
    */
  var ReceiptTime: js.Date
  
  /**
    * The type follows the engagement cycle, SENT, DELIVERED, and READ.
    */
  var ReceiptType: typings.awsSdk.clientsSsmcontactsMod.ReceiptType
}
object Receipt {
  
  inline def apply(ReceiptTime: js.Date, ReceiptType: ReceiptType): Receipt = {
    val __obj = js.Dynamic.literal(ReceiptTime = ReceiptTime.asInstanceOf[js.Any], ReceiptType = ReceiptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receipt]
  }
  
  extension [Self <: Receipt](x: Self) {
    
    inline def setContactChannelArn(value: SsmContactsArn): Self = StObject.set(x, "ContactChannelArn", value.asInstanceOf[js.Any])
    
    inline def setContactChannelArnUndefined: Self = StObject.set(x, "ContactChannelArn", js.undefined)
    
    inline def setReceiptInfo(value: ReceiptInfo): Self = StObject.set(x, "ReceiptInfo", value.asInstanceOf[js.Any])
    
    inline def setReceiptInfoUndefined: Self = StObject.set(x, "ReceiptInfo", js.undefined)
    
    inline def setReceiptTime(value: js.Date): Self = StObject.set(x, "ReceiptTime", value.asInstanceOf[js.Any])
    
    inline def setReceiptType(value: ReceiptType): Self = StObject.set(x, "ReceiptType", value.asInstanceOf[js.Any])
  }
}
