package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCostCategoryDefinitionResponse extends StObject {
  
  var CostCategory: js.UndefOr[typings.awsSdk.clientsCostexplorerMod.CostCategory] = js.undefined
}
object DescribeCostCategoryDefinitionResponse {
  
  inline def apply(): DescribeCostCategoryDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCostCategoryDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCostCategoryDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setCostCategory(value: CostCategory): Self = StObject.set(x, "CostCategory", value.asInstanceOf[js.Any])
    
    inline def setCostCategoryUndefined: Self = StObject.set(x, "CostCategory", js.undefined)
  }
}
