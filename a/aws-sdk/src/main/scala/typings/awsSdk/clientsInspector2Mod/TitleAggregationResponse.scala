package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TitleAggregationResponse extends StObject {
  
  /**
    * The ID of the Amazon Web Services account associated with the findings.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * An object that represent the count of matched findings per severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
  
  /**
    * The title that the findings were aggregated on.
    */
  var title: NonEmptyString
  
  /**
    * The vulnerability ID of the finding.
    */
  var vulnerabilityId: js.UndefOr[String] = js.undefined
}
object TitleAggregationResponse {
  
  inline def apply(title: NonEmptyString): TitleAggregationResponse = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TitleAggregationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TitleAggregationResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
    
    inline def setTitle(value: NonEmptyString): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityId(value: String): Self = StObject.set(x, "vulnerabilityId", value.asInstanceOf[js.Any])
    
    inline def setVulnerabilityIdUndefined: Self = StObject.set(x, "vulnerabilityId", js.undefined)
  }
}
