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
  var DataSources: DataSourceConfigurationsResult
}
object MemberDataSourceConfiguration {
  
  inline def apply(AccountId: AccountId, DataSources: DataSourceConfigurationsResult): MemberDataSourceConfiguration = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DataSources = DataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberDataSourceConfiguration]
  }
  
  extension [Self <: MemberDataSourceConfiguration](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSources(value: DataSourceConfigurationsResult): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
  }
}
