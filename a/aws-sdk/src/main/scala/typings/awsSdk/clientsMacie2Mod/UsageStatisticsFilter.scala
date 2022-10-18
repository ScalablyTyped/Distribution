package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageStatisticsFilter extends StObject {
  
  /**
    * The operator to use in the condition. If the value for the key property is accountId, this value must be CONTAINS. If the value for the key property is any other supported field, this value can be EQ, GT, GTE, LT, LTE, or NE.
    */
  var comparator: js.UndefOr[UsageStatisticsFilterComparator] = js.undefined
  
  /**
    * The field to use in the condition.
    */
  var key: js.UndefOr[UsageStatisticsFilterKey] = js.undefined
  
  /**
    * An array that lists values to use in the condition, based on the value for the field specified by the key property. If the value for the key property is accountId, this array can specify multiple values. Otherwise, this array can specify only one value. Valid values for each supported field are: accountId - The unique identifier for an Amazon Web Services account. freeTrialStartDate - The date and time, in UTC and extended ISO 8601 format, when the free trial started for an account. serviceLimit - A Boolean (true or false) value that indicates whether an account has reached its monthly quota. total - A string that represents the current estimated cost for an account.
    */
  var values: js.UndefOr[listOfString] = js.undefined
}
object UsageStatisticsFilter {
  
  inline def apply(): UsageStatisticsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageStatisticsFilter]
  }
  
  extension [Self <: UsageStatisticsFilter](x: Self) {
    
    inline def setComparator(value: UsageStatisticsFilterComparator): Self = StObject.set(x, "comparator", value.asInstanceOf[js.Any])
    
    inline def setComparatorUndefined: Self = StObject.set(x, "comparator", js.undefined)
    
    inline def setKey(value: UsageStatisticsFilterKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValues(value: listOfString): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
