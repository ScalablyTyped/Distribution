package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobWorkerExecutorConfiguration extends StObject {
  
  /**
    * The accounts in which the job worker is configured and might poll for jobs as part of the action execution.
    */
  var pollingAccounts: js.UndefOr[PollingAccountList] = js.undefined
  
  /**
    * The service Principals in which the job worker is configured and might poll for jobs as part of the action execution.
    */
  var pollingServicePrincipals: js.UndefOr[PollingServicePrincipalList] = js.undefined
}
object JobWorkerExecutorConfiguration {
  
  inline def apply(): JobWorkerExecutorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobWorkerExecutorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobWorkerExecutorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPollingAccounts(value: PollingAccountList): Self = StObject.set(x, "pollingAccounts", value.asInstanceOf[js.Any])
    
    inline def setPollingAccountsUndefined: Self = StObject.set(x, "pollingAccounts", js.undefined)
    
    inline def setPollingAccountsVarargs(value: AccountId*): Self = StObject.set(x, "pollingAccounts", js.Array(value*))
    
    inline def setPollingServicePrincipals(value: PollingServicePrincipalList): Self = StObject.set(x, "pollingServicePrincipals", value.asInstanceOf[js.Any])
    
    inline def setPollingServicePrincipalsUndefined: Self = StObject.set(x, "pollingServicePrincipals", js.undefined)
    
    inline def setPollingServicePrincipalsVarargs(value: ServicePrincipal*): Self = StObject.set(x, "pollingServicePrincipals", js.Array(value*))
  }
}
