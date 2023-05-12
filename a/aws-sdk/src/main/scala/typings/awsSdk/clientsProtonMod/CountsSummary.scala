package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountsSummary extends StObject {
  
  /**
    * The total number of components in the Amazon Web Services account. The semantics of the components field are different from the semantics of results for other infrastructure-provisioning resources. That's because at this time components don't have associated templates, therefore they don't have the concept of staleness. The components object will only contain total and failed members.
    */
  var components: js.UndefOr[ResourceCountsSummary] = js.undefined
  
  /**
    * The total number of environment templates in the Amazon Web Services account. The environmentTemplates object will only contain total members.
    */
  var environmentTemplates: js.UndefOr[ResourceCountsSummary] = js.undefined
  
  /**
    * The staleness counts for Proton environments in the Amazon Web Services account. The environments object will only contain total members.
    */
  var environments: js.UndefOr[ResourceCountsSummary] = js.undefined
  
  /**
    * The staleness counts for Proton pipelines in the Amazon Web Services account.
    */
  var pipelines: js.UndefOr[ResourceCountsSummary] = js.undefined
  
  /**
    * The staleness counts for Proton service instances in the Amazon Web Services account.
    */
  var serviceInstances: js.UndefOr[ResourceCountsSummary] = js.undefined
  
  /**
    * The total number of service templates in the Amazon Web Services account. The serviceTemplates object will only contain total members.
    */
  var serviceTemplates: js.UndefOr[ResourceCountsSummary] = js.undefined
  
  /**
    * The staleness counts for Proton services in the Amazon Web Services account.
    */
  var services: js.UndefOr[ResourceCountsSummary] = js.undefined
}
object CountsSummary {
  
  inline def apply(): CountsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountsSummary] (val x: Self) extends AnyVal {
    
    inline def setComponents(value: ResourceCountsSummary): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setEnvironmentTemplates(value: ResourceCountsSummary): Self = StObject.set(x, "environmentTemplates", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentTemplatesUndefined: Self = StObject.set(x, "environmentTemplates", js.undefined)
    
    inline def setEnvironments(value: ResourceCountsSummary): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setPipelines(value: ResourceCountsSummary): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "pipelines", js.undefined)
    
    inline def setServiceInstances(value: ResourceCountsSummary): Self = StObject.set(x, "serviceInstances", value.asInstanceOf[js.Any])
    
    inline def setServiceInstancesUndefined: Self = StObject.set(x, "serviceInstances", js.undefined)
    
    inline def setServiceTemplates(value: ResourceCountsSummary): Self = StObject.set(x, "serviceTemplates", value.asInstanceOf[js.Any])
    
    inline def setServiceTemplatesUndefined: Self = StObject.set(x, "serviceTemplates", js.undefined)
    
    inline def setServices(value: ResourceCountsSummary): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
  }
}
