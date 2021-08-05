package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Salesforce resource. 
    */
  var instanceUrl: js.UndefOr[InstanceUrl] = js.undefined
  
  /**
    *  Indicates whether the connector profile applies to a sandbox or production environment. 
    */
  var isSandboxEnvironment: js.UndefOr[Boolean] = js.undefined
}
object SalesforceConnectorProfileProperties {
  
  inline def apply(): SalesforceConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceConnectorProfileProperties]
  }
  
  extension [Self <: SalesforceConnectorProfileProperties](x: Self) {
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
    
    inline def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
    
    inline def setIsSandboxEnvironment(value: Boolean): Self = StObject.set(x, "isSandboxEnvironment", value.asInstanceOf[js.Any])
    
    inline def setIsSandboxEnvironmentUndefined: Self = StObject.set(x, "isSandboxEnvironment", js.undefined)
  }
}
