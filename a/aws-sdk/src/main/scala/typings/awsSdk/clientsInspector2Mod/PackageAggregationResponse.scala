package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageAggregationResponse extends StObject {
  
  /**
    * The ID of the Amazon Web Services account associated with the findings.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of the operating system package.
    */
  var packageName: NonEmptyString
  
  /**
    * An object that contains the count of matched findings per severity.
    */
  var severityCounts: js.UndefOr[SeverityCounts] = js.undefined
}
object PackageAggregationResponse {
  
  inline def apply(packageName: NonEmptyString): PackageAggregationResponse = {
    val __obj = js.Dynamic.literal(packageName = packageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageAggregationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageAggregationResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setPackageName(value: NonEmptyString): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setSeverityCounts(value: SeverityCounts): Self = StObject.set(x, "severityCounts", value.asInstanceOf[js.Any])
    
    inline def setSeverityCountsUndefined: Self = StObject.set(x, "severityCounts", js.undefined)
  }
}
