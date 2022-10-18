package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentTargets extends StObject {
  
  /**
    * Limit deployment targets to individual accounts or include additional accounts with provided OUs. The following is a list of possible values for the AccountFilterType operation.    INTERSECTION: StackSets deploys to the accounts specified in Accounts parameter.     DIFFERENCE: StackSets excludes the accounts specified in Accounts parameter. This enables user to avoid certain accounts within an OU such as suspended accounts.    UNION: (default value) StackSets includes additional accounts deployment targets.  This is the default value if AccountFilterType is not provided. This enables user to update an entire OU and individual accounts from a different OU in one request, which used to be two separate requests.    NONE: Deploys to all the accounts in specified organizational units (OU).  
    */
  var AccountFilterType: js.UndefOr[typings.awsSdk.clientsCloudformationMod.AccountFilterType] = js.undefined
  
  /**
    * The names of one or more Amazon Web Services accounts for which you want to deploy stack set updates.
    */
  var Accounts: js.UndefOr[AccountList] = js.undefined
  
  /**
    * Returns the value of the AccountsUrl property.
    */
  var AccountsUrl: js.UndefOr[typings.awsSdk.clientsCloudformationMod.AccountsUrl] = js.undefined
  
  /**
    * The organization root ID or organizational unit (OU) IDs to which StackSets deploys.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
}
object DeploymentTargets {
  
  inline def apply(): DeploymentTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTargets]
  }
  
  extension [Self <: DeploymentTargets](x: Self) {
    
    inline def setAccountFilterType(value: AccountFilterType): Self = StObject.set(x, "AccountFilterType", value.asInstanceOf[js.Any])
    
    inline def setAccountFilterTypeUndefined: Self = StObject.set(x, "AccountFilterType", js.undefined)
    
    inline def setAccounts(value: AccountList): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsUrl(value: AccountsUrl): Self = StObject.set(x, "AccountsUrl", value.asInstanceOf[js.Any])
    
    inline def setAccountsUrlUndefined: Self = StObject.set(x, "AccountsUrl", js.undefined)
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value*))
  }
}
