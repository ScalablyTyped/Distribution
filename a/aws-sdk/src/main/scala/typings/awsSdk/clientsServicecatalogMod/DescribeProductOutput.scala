package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProductOutput extends StObject {
  
  /**
    * Information about the associated budgets.
    */
  var Budgets: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Budgets] = js.undefined
  
  /**
    * Information about the associated launch paths.
    */
  var LaunchPaths: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.LaunchPaths] = js.undefined
  
  /**
    * Summary information about the product view.
    */
  var ProductViewSummary: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProductViewSummary] = js.undefined
  
  /**
    * Information about the provisioning artifacts for the specified product.
    */
  var ProvisioningArtifacts: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ProvisioningArtifacts] = js.undefined
}
object DescribeProductOutput {
  
  inline def apply(): DescribeProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProductOutput]
  }
  
  extension [Self <: DescribeProductOutput](x: Self) {
    
    inline def setBudgets(value: Budgets): Self = StObject.set(x, "Budgets", value.asInstanceOf[js.Any])
    
    inline def setBudgetsUndefined: Self = StObject.set(x, "Budgets", js.undefined)
    
    inline def setBudgetsVarargs(value: BudgetDetail*): Self = StObject.set(x, "Budgets", js.Array(value*))
    
    inline def setLaunchPaths(value: LaunchPaths): Self = StObject.set(x, "LaunchPaths", value.asInstanceOf[js.Any])
    
    inline def setLaunchPathsUndefined: Self = StObject.set(x, "LaunchPaths", js.undefined)
    
    inline def setLaunchPathsVarargs(value: LaunchPath*): Self = StObject.set(x, "LaunchPaths", js.Array(value*))
    
    inline def setProductViewSummary(value: ProductViewSummary): Self = StObject.set(x, "ProductViewSummary", value.asInstanceOf[js.Any])
    
    inline def setProductViewSummaryUndefined: Self = StObject.set(x, "ProductViewSummary", js.undefined)
    
    inline def setProvisioningArtifacts(value: ProvisioningArtifacts): Self = StObject.set(x, "ProvisioningArtifacts", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactsUndefined: Self = StObject.set(x, "ProvisioningArtifacts", js.undefined)
    
    inline def setProvisioningArtifactsVarargs(value: ProvisioningArtifact*): Self = StObject.set(x, "ProvisioningArtifacts", js.Array(value*))
  }
}
