package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatalakeAutoEnableResponse extends StObject {
  
  /**
    * The configuration for new accounts.
    */
  var autoEnableNewAccounts: AutoEnableNewRegionConfigurationList
}
object GetDatalakeAutoEnableResponse {
  
  inline def apply(autoEnableNewAccounts: AutoEnableNewRegionConfigurationList): GetDatalakeAutoEnableResponse = {
    val __obj = js.Dynamic.literal(autoEnableNewAccounts = autoEnableNewAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatalakeAutoEnableResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatalakeAutoEnableResponse] (val x: Self) extends AnyVal {
    
    inline def setAutoEnableNewAccounts(value: AutoEnableNewRegionConfigurationList): Self = StObject.set(x, "autoEnableNewAccounts", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableNewAccountsVarargs(value: AutoEnableNewRegionConfiguration*): Self = StObject.set(x, "autoEnableNewAccounts", js.Array(value*))
  }
}
