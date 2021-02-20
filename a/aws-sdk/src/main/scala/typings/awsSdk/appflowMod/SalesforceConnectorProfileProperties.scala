package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceConnectorProfileProperties extends StObject {
  
  /**
    *  The location of the Salesforce resource. 
    */
  var instanceUrl: js.UndefOr[InstanceUrl] = js.native
  
  /**
    *  Indicates whether the connector profile applies to a sandbox or production environment. 
    */
  var isSandboxEnvironment: js.UndefOr[Boolean] = js.native
}
object SalesforceConnectorProfileProperties {
  
  @scala.inline
  def apply(): SalesforceConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SalesforceConnectorProfileProperties]
  }
  
  @scala.inline
  implicit class SalesforceConnectorProfilePropertiesMutableBuilder[Self <: SalesforceConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
    
    @scala.inline
    def setIsSandboxEnvironment(value: Boolean): Self = StObject.set(x, "isSandboxEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSandboxEnvironmentUndefined: Self = StObject.set(x, "isSandboxEnvironment", js.undefined)
  }
}
