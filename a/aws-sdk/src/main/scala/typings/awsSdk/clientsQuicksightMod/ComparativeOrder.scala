package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComparativeOrder extends StObject {
  
  /**
    * The list of columns to be used in the ordering.
    */
  var SpecifedOrder: js.UndefOr[StringList] = js.undefined
  
  /**
    * The treat of undefined specified values. Valid values for this structure are LEAST and MOST.
    */
  var TreatUndefinedSpecifiedValues: js.UndefOr[UndefinedSpecifiedValueType] = js.undefined
  
  /**
    * The ordering type for a column. Valid values for this structure are GREATER_IS_BETTER, LESSER_IS_BETTER and SPECIFIED.
    */
  var UseOrdering: js.UndefOr[ColumnOrderingType] = js.undefined
}
object ComparativeOrder {
  
  inline def apply(): ComparativeOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComparativeOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComparativeOrder] (val x: Self) extends AnyVal {
    
    inline def setSpecifedOrder(value: StringList): Self = StObject.set(x, "SpecifedOrder", value.asInstanceOf[js.Any])
    
    inline def setSpecifedOrderUndefined: Self = StObject.set(x, "SpecifedOrder", js.undefined)
    
    inline def setSpecifedOrderVarargs(value: String*): Self = StObject.set(x, "SpecifedOrder", js.Array(value*))
    
    inline def setTreatUndefinedSpecifiedValues(value: UndefinedSpecifiedValueType): Self = StObject.set(x, "TreatUndefinedSpecifiedValues", value.asInstanceOf[js.Any])
    
    inline def setTreatUndefinedSpecifiedValuesUndefined: Self = StObject.set(x, "TreatUndefinedSpecifiedValues", js.undefined)
    
    inline def setUseOrdering(value: ColumnOrderingType): Self = StObject.set(x, "UseOrdering", value.asInstanceOf[js.Any])
    
    inline def setUseOrderingUndefined: Self = StObject.set(x, "UseOrdering", js.undefined)
  }
}
