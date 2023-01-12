package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateConfigurationItemsToApplicationRequest extends StObject {
  
  /**
    * The configuration ID of an application with which items are to be associated.
    */
  var applicationConfigurationId: ApplicationId
  
  /**
    * The ID of each configuration item to be associated with an application.
    */
  var configurationIds: ConfigurationIdList
}
object AssociateConfigurationItemsToApplicationRequest {
  
  inline def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): AssociateConfigurationItemsToApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateConfigurationItemsToApplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateConfigurationItemsToApplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationConfigurationId(value: ApplicationId): Self = StObject.set(x, "applicationConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    inline def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value*))
  }
}
