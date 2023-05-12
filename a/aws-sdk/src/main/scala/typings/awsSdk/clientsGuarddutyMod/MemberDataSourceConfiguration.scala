package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberDataSourceConfiguration extends StObject {
  
  /**
    * The account ID for the member account.
    */
  var AccountId: typings.awsSdk.clientsGuarddutyMod.AccountId
  
  /**
    * Contains information on the status of data sources for the account.
    */
  var DataSources: js.UndefOr[DataSourceConfigurationsResult] = js.undefined
  
  /**
    * Contains information about the status of the features for the member account.
    */
  var Features: js.UndefOr[MemberFeaturesConfigurationsResults] = js.undefined
}
object MemberDataSourceConfiguration {
  
  inline def apply(AccountId: AccountId): MemberDataSourceConfiguration = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDataSourceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberDataSourceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSources(value: DataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    inline def setFeatures(value: MemberFeaturesConfigurationsResults): Self = StObject.set(x, "Features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "Features", js.undefined)
    
    inline def setFeaturesVarargs(value: MemberFeaturesConfigurationResult*): Self = StObject.set(x, "Features", js.Array(value*))
  }
}
