package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationConfigurationResponse extends StObject {
  
  /**
    * Whether to automatically enable Security Hub for new accounts in the organization. If set to true, then Security Hub is enabled for new accounts. If set to false, then new accounts are not added automatically.
    */
  var AutoEnable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to automatically enable Security Hub default standards for new member accounts in the organization. The default value of this parameter is equal to DEFAULT. If equal to DEFAULT, then Security Hub default standards are automatically enabled for new member accounts. If equal to NONE, then default standards are not automatically enabled for new member accounts.
    */
  var AutoEnableStandards: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.AutoEnableStandards] = js.undefined
  
  /**
    * Whether the maximum number of allowed member accounts are already associated with the Security Hub administrator account.
    */
  var MemberAccountLimitReached: js.UndefOr[Boolean] = js.undefined
}
object DescribeOrganizationConfigurationResponse {
  
  inline def apply(): DescribeOrganizationConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOrganizationConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableStandards(value: AutoEnableStandards): Self = StObject.set(x, "AutoEnableStandards", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableStandardsUndefined: Self = StObject.set(x, "AutoEnableStandards", js.undefined)
    
    inline def setAutoEnableUndefined: Self = StObject.set(x, "AutoEnable", js.undefined)
    
    inline def setMemberAccountLimitReached(value: Boolean): Self = StObject.set(x, "MemberAccountLimitReached", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountLimitReachedUndefined: Self = StObject.set(x, "MemberAccountLimitReached", js.undefined)
  }
}
