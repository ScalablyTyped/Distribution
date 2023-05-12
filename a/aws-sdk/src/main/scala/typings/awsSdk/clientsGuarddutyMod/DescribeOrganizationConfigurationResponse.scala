package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationResponse extends StObject {
  
  /**
    * Indicates whether GuardDuty is automatically enabled for accounts added to the organization. Even though this is still supported, we recommend using AutoEnableOrganizationMembers to achieve the similar results.
    */
  var AutoEnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the auto-enablement configuration of GuardDuty for the member accounts in the organization.    NEW: Indicates that when a new account joins the organization, they will have GuardDuty enabled automatically.     ALL: Indicates that all accounts in the Amazon Web Services Organization have GuardDuty enabled automatically. This includes NEW accounts that join the organization and accounts that may have been suspended or removed from the organization in GuardDuty.    NONE: Indicates that GuardDuty will not be automatically enabled for any accounts in the organization. GuardDuty must be managed for each account individually by the administrator.  
    */
  var AutoEnableOrganizationMembers: js.UndefOr[AutoEnableMembers] = js.undefined
  
  /**
    * Describes which data sources are enabled automatically for member accounts.
    */
  var DataSources: js.UndefOr[OrganizationDataSourceConfigurationsResult] = js.undefined
  
  /**
    * A list of features that are configured for this organization.
    */
  var Features: js.UndefOr[OrganizationFeaturesConfigurationsResults] = js.undefined
  
  /**
    * Indicates whether the maximum number of allowed member accounts are already associated with the delegated administrator account for your organization.
    */
  var MemberAccountLimitReached: Boolean
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeOrganizationConfigurationResponse {
  
  inline def apply(MemberAccountLimitReached: Boolean): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal(MemberAccountLimitReached = MemberAccountLimitReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableOrganizationMembers(value: AutoEnableMembers): Self = StObject.set(x, "AutoEnableOrganizationMembers", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableOrganizationMembersUndefined: Self = StObject.set(x, "AutoEnableOrganizationMembers", js.undefined)
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setDataSources(value: OrganizationDataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setFeatures(value: OrganizationFeaturesConfigurationsResults): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "Features", js.undefined)
    
    inline def setFeaturesVarargs(value: OrganizationFeatureConfigurationResult*): Self = StObject.set(x, "Features", js.Array(value*))
    
    inline def setMemberAccountLimitReached(value: Boolean): Self = StObject.set(x, "MemberAccountLimitReached", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
