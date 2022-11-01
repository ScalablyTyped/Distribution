package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressTransfer extends StObject {
  
  /**
    * The Elastic IP address transfer status.
    */
  var AddressTransferStatus: js.UndefOr[typings.awsSdk.clientsEc2Mod.AddressTransferStatus] = js.undefined
  
  /**
    * The allocation ID of an Elastic IP address.
    */
  var AllocationId: js.UndefOr[String] = js.undefined
  
  /**
    * The Elastic IP address being transferred.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account that you want to transfer the Elastic IP address to.
    */
  var TransferAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the Elastic IP address transfer was accepted.
    */
  var TransferOfferAcceptedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp when the Elastic IP address transfer expired. When the source account starts the transfer, the transfer account has seven hours to allocate the Elastic IP address to complete the transfer, or the Elastic IP address will return to its original owner.
    */
  var TransferOfferExpirationTimestamp: js.UndefOr[js.Date] = js.undefined
}
object AddressTransfer {
  
  inline def apply(): AddressTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressTransfer]
  }
  
  extension [Self <: AddressTransfer](x: Self) {
    
    inline def setAddressTransferStatus(value: AddressTransferStatus): Self = StObject.set(x, "AddressTransferStatus", value.asInstanceOf[js.Any])
    
    inline def setAddressTransferStatusUndefined: Self = StObject.set(x, "AddressTransferStatus", js.undefined)
    
    inline def setAllocationId(value: String): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    inline def setTransferAccountId(value: String): Self = StObject.set(x, "TransferAccountId", value.asInstanceOf[js.Any])
    
    inline def setTransferAccountIdUndefined: Self = StObject.set(x, "TransferAccountId", js.undefined)
    
    inline def setTransferOfferAcceptedTimestamp(value: js.Date): Self = StObject.set(x, "TransferOfferAcceptedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setTransferOfferAcceptedTimestampUndefined: Self = StObject.set(x, "TransferOfferAcceptedTimestamp", js.undefined)
    
    inline def setTransferOfferExpirationTimestamp(value: js.Date): Self = StObject.set(x, "TransferOfferExpirationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setTransferOfferExpirationTimestampUndefined: Self = StObject.set(x, "TransferOfferExpirationTimestamp", js.undefined)
  }
}
