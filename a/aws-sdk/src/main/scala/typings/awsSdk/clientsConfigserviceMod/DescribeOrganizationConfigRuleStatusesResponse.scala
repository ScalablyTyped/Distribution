package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigRuleStatusesResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of OrganizationConfigRuleStatus objects.
    */
  var OrganizationConfigRuleStatuses: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationConfigRuleStatuses] = js.undefined
}
object DescribeOrganizationConfigRuleStatusesResponse {
  
  inline def apply(): DescribeOrganizationConfigRuleStatusesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRuleStatusesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationConfigRuleStatusesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationConfigRuleStatuses(value: OrganizationConfigRuleStatuses): Self = StObject.set(x, "OrganizationConfigRuleStatuses", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRuleStatusesUndefined: Self = StObject.set(x, "OrganizationConfigRuleStatuses", js.undefined)
    
    inline def setOrganizationConfigRuleStatusesVarargs(value: OrganizationConfigRuleStatus*): Self = StObject.set(x, "OrganizationConfigRuleStatuses", js.Array(value*))
  }
}
