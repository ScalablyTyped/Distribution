package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigRulesResponse extends StObject {
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Returns a list of OrganizationConfigRule objects.
    */
  var OrganizationConfigRules: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.OrganizationConfigRules] = js.undefined
}
object DescribeOrganizationConfigRulesResponse {
  
  inline def apply(): DescribeOrganizationConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigRulesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationConfigRulesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrganizationConfigRules(value: OrganizationConfigRules): Self = StObject.set(x, "OrganizationConfigRules", value.asInstanceOf[js.Any])
    
    inline def setOrganizationConfigRulesUndefined: Self = StObject.set(x, "OrganizationConfigRules", js.undefined)
    
    inline def setOrganizationConfigRulesVarargs(value: OrganizationConfigRule*): Self = StObject.set(x, "OrganizationConfigRules", js.Array(value*))
  }
}
