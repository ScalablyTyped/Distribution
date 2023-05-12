package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopBottomRankedComputation extends StObject {
  
  /**
    * The category field that is used in a computation.
    */
  var Category: DimensionField
  
  /**
    * The ID for a computation.
    */
  var ComputationId: ShortRestrictiveResourceId
  
  /**
    * The name of a computation.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The result size of a top and bottom ranked computation.
    */
  var ResultSize: js.UndefOr[TopBottomRankedComputationResultSize] = js.undefined
  
  /**
    * The computation type. Choose one of the following options:   TOP: A top ranked computation.   BOTTOM: A bottom ranked computation.  
    */
  var Type: TopBottomComputationType
  
  /**
    * The value field that is used in a computation.
    */
  var Value: js.UndefOr[MeasureField] = js.undefined
}
object TopBottomRankedComputation {
  
  inline def apply(
    Category: DimensionField,
    ComputationId: ShortRestrictiveResourceId,
    Type: TopBottomComputationType
  ): TopBottomRankedComputation = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], ComputationId = ComputationId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopBottomRankedComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopBottomRankedComputation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DimensionField): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResultSize(value: TopBottomRankedComputationResultSize): Self = StObject.set(x, "ResultSize", value.asInstanceOf[js.Any])
    
    inline def setResultSizeUndefined: Self = StObject.set(x, "ResultSize", js.undefined)
    
    inline def setType(value: TopBottomComputationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: MeasureField): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
