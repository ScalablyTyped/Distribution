package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategoryInheritedValueDimension extends StObject {
  
  /**
    * The key to extract cost category values.
    */
  var DimensionKey: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The name of the dimension that's used to group costs. If you specify LINKED_ACCOUNT_NAME, the cost category value is based on account name. If you specify TAG, the cost category value is based on the value of the specified tag key.
    */
  var DimensionName: js.UndefOr[CostCategoryInheritedValueDimensionName] = js.undefined
}
object CostCategoryInheritedValueDimension {
  
  inline def apply(): CostCategoryInheritedValueDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryInheritedValueDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CostCategoryInheritedValueDimension] (val x: Self) extends AnyVal {
    
    inline def setDimensionKey(value: GenericString): Self = StObject.set(x, "DimensionKey", value.asInstanceOf[js.Any])
    
    inline def setDimensionKeyUndefined: Self = StObject.set(x, "DimensionKey", js.undefined)
    
    inline def setDimensionName(value: CostCategoryInheritedValueDimensionName): Self = StObject.set(x, "DimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "DimensionName", js.undefined)
  }
}
