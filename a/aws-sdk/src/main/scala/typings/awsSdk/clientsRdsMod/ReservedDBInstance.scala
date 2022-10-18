package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedDBInstance extends StObject {
  
  /**
    * The currency code for the reserved DB instance.
    */
  var CurrencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * The DB instance class for the reserved DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The number of reserved DB instances.
    */
  var DBInstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The duration of the reservation in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The fixed price charged for this reserved DB instance.
    */
  var FixedPrice: js.UndefOr[Double] = js.undefined
  
  /**
    * The unique identifier for the lease associated with the reserved DB instance.  Amazon Web Services Support might request the lease ID for an issue related to a reserved DB instance. 
    */
  var LeaseId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the reservation applies to Multi-AZ deployments.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The offering type of this reserved DB instance.
    */
  var OfferingType: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the reserved DB instance.
    */
  var ProductDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The recurring price charged to run this reserved DB instance.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the reserved DB instance.
    */
  var ReservedDBInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the reservation.
    */
  var ReservedDBInstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The offering identifier.
    */
  var ReservedDBInstancesOfferingId: js.UndefOr[String] = js.undefined
  
  /**
    * The time the reservation started.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the reserved DB instance.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * The hourly price charged for this reserved DB instance.
    */
  var UsagePrice: js.UndefOr[Double] = js.undefined
}
object ReservedDBInstance {
  
  inline def apply(): ReservedDBInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedDBInstance]
  }
  
  extension [Self <: ReservedDBInstance](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceCount(value: Integer): Self = StObject.set(x, "DBInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceCountUndefined: Self = StObject.set(x, "DBInstanceCount", js.undefined)
    
    inline def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setFixedPrice(value: Double): Self = StObject.set(x, "FixedPrice", value.asInstanceOf[js.Any])
    
    inline def setFixedPriceUndefined: Self = StObject.set(x, "FixedPrice", js.undefined)
    
    inline def setLeaseId(value: String): Self = StObject.set(x, "LeaseId", value.asInstanceOf[js.Any])
    
    inline def setLeaseIdUndefined: Self = StObject.set(x, "LeaseId", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setOfferingType(value: String): Self = StObject.set(x, "OfferingType", value.asInstanceOf[js.Any])
    
    inline def setOfferingTypeUndefined: Self = StObject.set(x, "OfferingType", js.undefined)
    
    inline def setProductDescription(value: String): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    inline def setRecurringCharges(value: RecurringChargeList): Self = StObject.set(x, "RecurringCharges", value.asInstanceOf[js.Any])
    
    inline def setRecurringChargesUndefined: Self = StObject.set(x, "RecurringCharges", js.undefined)
    
    inline def setRecurringChargesVarargs(value: RecurringCharge*): Self = StObject.set(x, "RecurringCharges", js.Array(value*))
    
    inline def setReservedDBInstanceArn(value: String): Self = StObject.set(x, "ReservedDBInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstanceArnUndefined: Self = StObject.set(x, "ReservedDBInstanceArn", js.undefined)
    
    inline def setReservedDBInstanceId(value: String): Self = StObject.set(x, "ReservedDBInstanceId", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstanceIdUndefined: Self = StObject.set(x, "ReservedDBInstanceId", js.undefined)
    
    inline def setReservedDBInstancesOfferingId(value: String): Self = StObject.set(x, "ReservedDBInstancesOfferingId", value.asInstanceOf[js.Any])
    
    inline def setReservedDBInstancesOfferingIdUndefined: Self = StObject.set(x, "ReservedDBInstancesOfferingId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setUsagePrice(value: Double): Self = StObject.set(x, "UsagePrice", value.asInstanceOf[js.Any])
    
    inline def setUsagePriceUndefined: Self = StObject.set(x, "UsagePrice", js.undefined)
  }
}
