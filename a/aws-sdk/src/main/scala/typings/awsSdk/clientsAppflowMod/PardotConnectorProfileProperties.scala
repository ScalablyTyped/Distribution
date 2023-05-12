package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PardotConnectorProfileProperties extends StObject {
  
  /**
    * The business unit id of Salesforce Pardot instance.
    */
  var businessUnitId: js.UndefOr[BusinessUnitId] = js.undefined
  
  /**
    * The location of the Salesforce Pardot resource.
    */
  var instanceUrl: js.UndefOr[InstanceUrl] = js.undefined
  
  /**
    * Indicates whether the connector profile applies to a sandbox or production environment.
    */
  var isSandboxEnvironment: js.UndefOr[Boolean] = js.undefined
}
object PardotConnectorProfileProperties {
  
  inline def apply(): PardotConnectorProfileProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PardotConnectorProfileProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PardotConnectorProfileProperties] (val x: Self) extends AnyVal {
    
    inline def setBusinessUnitId(value: BusinessUnitId): Self = StObject.set(x, "businessUnitId", value.asInstanceOf[js.Any])
    
    inline def setBusinessUnitIdUndefined: Self = StObject.set(x, "businessUnitId", js.undefined)
    
    inline def setInstanceUrl(value: InstanceUrl): Self = StObject.set(x, "instanceUrl", value.asInstanceOf[js.Any])
    
    inline def setInstanceUrlUndefined: Self = StObject.set(x, "instanceUrl", js.undefined)
    
    inline def setIsSandboxEnvironment(value: Boolean): Self = StObject.set(x, "isSandboxEnvironment", value.asInstanceOf[js.Any])
    
    inline def setIsSandboxEnvironmentUndefined: Self = StObject.set(x, "isSandboxEnvironment", js.undefined)
  }
}
