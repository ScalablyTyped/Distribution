package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountFreeTrialInfo extends StObject {
  
  /**
    * The account identifier of the GuardDuty member account.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the data source enabled for the GuardDuty member account.
    */
  var DataSources: js.UndefOr[DataSourcesFreeTrial] = js.undefined
}
object AccountFreeTrialInfo {
  
  inline def apply(): AccountFreeTrialInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountFreeTrialInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountFreeTrialInfo] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setDataSources(value: DataSourcesFreeTrial): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    inline def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
  }
}
