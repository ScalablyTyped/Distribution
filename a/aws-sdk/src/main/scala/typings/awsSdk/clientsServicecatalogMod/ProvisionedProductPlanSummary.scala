package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedProductPlanSummary extends StObject {
  
  /**
    * The plan identifier.
    */
  var PlanId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the plan.
    */
  var PlanName: js.UndefOr[ProvisionedProductPlanName] = js.undefined
  
  /**
    * The plan type.
    */
  var PlanType: js.UndefOr[ProvisionedProductPlanType] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProvisionProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The user-friendly name of the provisioned product.
    */
  var ProvisionProductName: js.UndefOr[ProvisionedProductName] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
}
object ProvisionedProductPlanSummary {
  
  inline def apply(): ProvisionedProductPlanSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionedProductPlanSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisionedProductPlanSummary] (val x: Self) extends AnyVal {
    
    inline def setPlanId(value: Id): Self = StObject.set(x, "PlanId", value.asInstanceOf[js.Any])
    
    inline def setPlanIdUndefined: Self = StObject.set(x, "PlanId", js.undefined)
    
    inline def setPlanName(value: ProvisionedProductPlanName): Self = StObject.set(x, "PlanName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "PlanName", js.undefined)
    
    inline def setPlanType(value: ProvisionedProductPlanType): Self = StObject.set(x, "PlanType", value.asInstanceOf[js.Any])
    
    inline def setPlanTypeUndefined: Self = StObject.set(x, "PlanType", js.undefined)
    
    inline def setProvisionProductId(value: Id): Self = StObject.set(x, "ProvisionProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisionProductIdUndefined: Self = StObject.set(x, "ProvisionProductId", js.undefined)
    
    inline def setProvisionProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionProductName", value.asInstanceOf[js.Any])
    
    inline def setProvisionProductNameUndefined: Self = StObject.set(x, "ProvisionProductName", js.undefined)
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
  }
}
