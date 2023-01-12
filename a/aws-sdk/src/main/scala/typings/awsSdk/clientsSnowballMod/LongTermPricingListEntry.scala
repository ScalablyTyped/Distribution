package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LongTermPricingListEntry extends StObject {
  
  /**
    * The current active jobs on the device the long-term pricing type.
    */
  var CurrentActiveJob: js.UndefOr[JobId] = js.undefined
  
  /**
    * If set to true, specifies that the current long-term pricing type for the device should be automatically renewed before the long-term pricing contract expires.
    */
  var IsLongTermPricingAutoRenew: js.UndefOr[JavaBoolean] = js.undefined
  
  /**
    * The IDs of the jobs that are associated with a long-term pricing type.
    */
  var JobIds: js.UndefOr[LongTermPricingAssociatedJobIdList] = js.undefined
  
  /**
    * The end date the long-term pricing contract.
    */
  var LongTermPricingEndDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the long-term pricing type for the device.
    */
  var LongTermPricingId: js.UndefOr[typings.awsSdk.clientsSnowballMod.LongTermPricingId] = js.undefined
  
  /**
    * The start date of the long-term pricing contract.
    */
  var LongTermPricingStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the long-term pricing type.
    */
  var LongTermPricingStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The type of long-term pricing that was selected for the device.
    */
  var LongTermPricingType: js.UndefOr[typings.awsSdk.clientsSnowballMod.LongTermPricingType] = js.undefined
  
  /**
    * A new device that replaces a device that is ordered with long-term pricing.
    */
  var ReplacementJob: js.UndefOr[JobId] = js.undefined
  
  /**
    * The type of Snow Family devices associated with this long-term pricing job.
    */
  var SnowballType: js.UndefOr[typings.awsSdk.clientsSnowballMod.SnowballType] = js.undefined
}
object LongTermPricingListEntry {
  
  inline def apply(): LongTermPricingListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongTermPricingListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LongTermPricingListEntry] (val x: Self) extends AnyVal {
    
    inline def setCurrentActiveJob(value: JobId): Self = StObject.set(x, "CurrentActiveJob", value.asInstanceOf[js.Any])
    
    inline def setCurrentActiveJobUndefined: Self = StObject.set(x, "CurrentActiveJob", js.undefined)
    
    inline def setIsLongTermPricingAutoRenew(value: JavaBoolean): Self = StObject.set(x, "IsLongTermPricingAutoRenew", value.asInstanceOf[js.Any])
    
    inline def setIsLongTermPricingAutoRenewUndefined: Self = StObject.set(x, "IsLongTermPricingAutoRenew", js.undefined)
    
    inline def setJobIds(value: LongTermPricingAssociatedJobIdList): Self = StObject.set(x, "JobIds", value.asInstanceOf[js.Any])
    
    inline def setJobIdsUndefined: Self = StObject.set(x, "JobIds", js.undefined)
    
    inline def setJobIdsVarargs(value: JobId*): Self = StObject.set(x, "JobIds", js.Array(value*))
    
    inline def setLongTermPricingEndDate(value: js.Date): Self = StObject.set(x, "LongTermPricingEndDate", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingEndDateUndefined: Self = StObject.set(x, "LongTermPricingEndDate", js.undefined)
    
    inline def setLongTermPricingId(value: LongTermPricingId): Self = StObject.set(x, "LongTermPricingId", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingIdUndefined: Self = StObject.set(x, "LongTermPricingId", js.undefined)
    
    inline def setLongTermPricingStartDate(value: js.Date): Self = StObject.set(x, "LongTermPricingStartDate", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingStartDateUndefined: Self = StObject.set(x, "LongTermPricingStartDate", js.undefined)
    
    inline def setLongTermPricingStatus(value: String): Self = StObject.set(x, "LongTermPricingStatus", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingStatusUndefined: Self = StObject.set(x, "LongTermPricingStatus", js.undefined)
    
    inline def setLongTermPricingType(value: LongTermPricingType): Self = StObject.set(x, "LongTermPricingType", value.asInstanceOf[js.Any])
    
    inline def setLongTermPricingTypeUndefined: Self = StObject.set(x, "LongTermPricingType", js.undefined)
    
    inline def setReplacementJob(value: JobId): Self = StObject.set(x, "ReplacementJob", value.asInstanceOf[js.Any])
    
    inline def setReplacementJobUndefined: Self = StObject.set(x, "ReplacementJob", js.undefined)
    
    inline def setSnowballType(value: SnowballType): Self = StObject.set(x, "SnowballType", value.asInstanceOf[js.Any])
    
    inline def setSnowballTypeUndefined: Self = StObject.set(x, "SnowballType", js.undefined)
  }
}
