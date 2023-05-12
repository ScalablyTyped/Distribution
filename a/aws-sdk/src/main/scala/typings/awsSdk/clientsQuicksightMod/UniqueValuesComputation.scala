package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValuesComputation extends StObject {
  
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
}
object UniqueValuesComputation {
  
  inline def apply(Category: DimensionField, ComputationId: ShortRestrictiveResourceId): UniqueValuesComputation = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], ComputationId = ComputationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueValuesComputation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueValuesComputation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: DimensionField): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
    
    inline def setComputationId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "ComputationId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
