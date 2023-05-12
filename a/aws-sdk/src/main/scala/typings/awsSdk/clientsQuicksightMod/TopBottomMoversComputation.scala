package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBottomMoversComputation extends StObject {
  
  /**
    * The category field that is used in a computation.
    */
  var Category: DimensionField
  
  /**
    * The ID for a computation.
    */
  var ComputationId: ShortRestrictiveResourceId
  
  /**
    * The mover size setup of the top and bottom movers computation.
    */
  var MoverSize: js.UndefOr[TopBottomMoversComputationMoverSize] = js.undefined
  
  /**
    * The name of a computation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The sort order setup of the top and bottom movers computation.
    */
  var SortOrder: js.UndefOr[TopBottomSortOrder] = js.undefined
  
  /**
    * The time field that is used in a computation.
    */
  var Time: DimensionField
  
  /**
    * The computation type. Choose from the following options:   TOP: Top movers computation.   BOTTOM: Bottom movers computation.  
    */
  var Type: TopBottomComputationType
  
  /**
    * The value field that is used in a computation.
    */
  var Value: js.UndefOr[MeasureField] = js.undefined
}
object TopBottomMoversComputation {
  
  inline def apply(
    Category: DimensionField,
    ComputationId: ShortRestrictiveResourceId,
    Time: DimensionField,
    Type: TopBottomComputationType
  ): TopBottomMoversComputation = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], ComputationId = ComputationId.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopBottomMoversComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopBottomMoversComputation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DimensionField): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setMoverSize(value: TopBottomMoversComputationMoverSize): Self = StObject.set(x, "MoverSize", value.asInstanceOf[js.Any])
    
    inline def setMoverSizeUndefined: Self = StObject.set(x, "MoverSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSortOrder(value: TopBottomSortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
    
    inline def setTime(value: DimensionField): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setType(value: TopBottomComputationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: MeasureField): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
