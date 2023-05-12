package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageSortCriteria extends StObject {
  
  /**
    * Represents the field name used to sort the coverage details.
    */
  var AttributeName: js.UndefOr[CoverageSortKey] = js.undefined
  
  /**
    * The order in which the sorted findings are to be displayed.
    */
  var OrderBy: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.OrderBy] = js.undefined
}
object CoverageSortCriteria {
  
  inline def apply(): CoverageSortCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageSortCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageSortCriteria] (val x: Self) extends AnyVal {
    
    inline def setAttributeName(value: CoverageSortKey): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setOrderBy(value: OrderBy): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "OrderBy", js.undefined)
  }
}
