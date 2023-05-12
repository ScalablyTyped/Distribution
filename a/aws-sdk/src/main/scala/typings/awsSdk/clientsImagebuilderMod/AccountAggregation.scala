package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAggregation extends StObject {
  
  /**
    * Identifies the account that owns the aggregated resource findings.
    */
  var accountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object AccountAggregation {
  
  inline def apply(): AccountAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountAggregation] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
