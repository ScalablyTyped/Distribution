package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProvisionedProductPlanOutput extends StObject {
  
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisionedProductName] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
}
object CreateProvisionedProductPlanOutput {
  
  inline def apply(): CreateProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProvisionedProductPlanOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    
    inline def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
    
    inline def setPlanIdUndefined: Self = StObject.set(x, "PlanId", js.undefined)
    
    inline def setPlanName(value: ProvisionedProductPlanName): Self = StObject.set(x, "PlanName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "PlanName", js.undefined)
    
    inline def setProvisionProductId(value: Id): Self = StObject.set(x, "ProvisionProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionProductIdUndefined: Self = StObject.set(x, "ProvisionProductId", js.undefined)
    
    inline def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
  }
}
