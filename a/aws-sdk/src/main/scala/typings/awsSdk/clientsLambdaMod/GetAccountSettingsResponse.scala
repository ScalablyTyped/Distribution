package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccountSettingsResponse extends StObject {
  
  /**
    * Limits that are related to concurrency and code storage.
    */
  var AccountLimit: js.UndefOr[typings.awsSdk.clientsLambdaMod.AccountLimit] = js.undefined
  
  /**
    * The number of functions and amount of storage in use.
    */
  var AccountUsage: js.UndefOr[typings.awsSdk.clientsLambdaMod.AccountUsage] = js.undefined
}
object GetAccountSettingsResponse {
  
  inline def apply(): GetAccountSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResponse]
  }
  
  extension [Self <: GetAccountSettingsResponse](x: Self) {
    
    inline def setAccountLimit(value: AccountLimit): Self = StObject.set(x, "AccountLimit", value.asInstanceOf[js.Any])
    
    inline def setAccountLimitUndefined: Self = StObject.set(x, "AccountLimit", js.undefined)
    
    inline def setAccountUsage(value: AccountUsage): Self = StObject.set(x, "AccountUsage", value.asInstanceOf[js.Any])
    
    inline def setAccountUsageUndefined: Self = StObject.set(x, "AccountUsage", js.undefined)
  }
}
