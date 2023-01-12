package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageRecord extends StObject {
  
  /**
    * The unique identifier for the Amazon Web Services account that the data applies to.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when the free trial started for the account.
    */
  var freeTrialStartDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An array of objects that contains usage data and quotas for the account. Each object contains the data for a specific usage metric and the corresponding quota.
    */
  var usage: js.UndefOr[listOfUsageByAccount] = js.undefined
}
object UsageRecord {
  
  inline def apply(): UsageRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageRecord] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setFreeTrialStartDate(value: js.Date): Self = StObject.set(x, "freeTrialStartDate", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialStartDateUndefined: Self = StObject.set(x, "freeTrialStartDate", js.undefined)
    
    inline def setUsage(value: listOfUsageByAccount): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUsageVarargs(value: UsageByAccount*): Self = StObject.set(x, "usage", js.Array(value*))
  }
}
