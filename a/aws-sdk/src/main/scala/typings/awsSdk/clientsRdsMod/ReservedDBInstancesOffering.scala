package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedDBInstancesOffering extends StObject {
  
  /**
    * The currency code for the reserved DB instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The duration of the offering in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The fixed price charged for this offering.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates if the offering applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The offering type.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  
  /**
    * The database engine used by the offering.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The hourly price charged for this offering.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}
object ReservedDBInstancesOffering {
  
  inline def apply(): ReservedDBInstancesOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstancesOffering]
  }
  
  extension [Self <: ReservedDBInstancesOffering](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    inline def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    inline def setProductDescription(value: String): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservedDBInstancesOfferingId(value: String): Self = StObject.set(x, "ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstancesOfferingIdUndefined: Self = StObject.set(x, "ReservedDBInstancesOfferingId", js.undefined)
    
    inline def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    inline def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
