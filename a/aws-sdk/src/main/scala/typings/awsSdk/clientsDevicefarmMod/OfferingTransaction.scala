package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfferingTransaction extends StObject {
  
  /**
    * The cost of an offering transaction.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.undefined
  
  /**
    * The date on which an offering transaction was created.
    */
  var createdOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID that corresponds to a device offering promotion.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
  
  /**
    * The status of an offering transaction.
    */
  var offeringStatus: js.UndefOr[OfferingStatus] = js.undefined
  
  /**
    * The transaction ID of the offering transaction.
    */
  var transactionId: js.UndefOr[TransactionIdentifier] = js.undefined
}
object OfferingTransaction {
  
  inline def apply(): OfferingTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OfferingTransaction]
  }
  
  extension [Self <: OfferingTransaction](x: Self) {
    
    inline def setCost(value: MonetaryAmount): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setCreatedOnUndefined: Self = StObject.set(x, "createdOn", js.undefined)
    
    inline def setOfferingPromotionId(value: OfferingPromotionIdentifier): Self = StObject.set(x, "offeringPromotionId", value.asInstanceOf[js.Any])
    
    inline def setOfferingPromotionIdUndefined: Self = StObject.set(x, "offeringPromotionId", js.undefined)
    
    inline def setOfferingStatus(value: OfferingStatus): Self = StObject.set(x, "offeringStatus", value.asInstanceOf[js.Any])
    
    inline def setOfferingStatusUndefined: Self = StObject.set(x, "offeringStatus", js.undefined)
    
    inline def setTransactionId(value: TransactionIdentifier): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
