package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionField extends StObject {
  
  /**
    * The dimension type field with categorical type columns.
    */
  var CategoricalDimensionField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoricalDimensionField] = js.undefined
  
  /**
    * The dimension type field with date type columns.
    */
  var DateDimensionField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateDimensionField] = js.undefined
  
  /**
    * The dimension type field with numerical type columns.
    */
  var NumericalDimensionField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericalDimensionField] = js.undefined
}
object DimensionField {
  
  inline def apply(): DimensionField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DimensionField] (val x: Self) extends AnyVal {
    
    inline def setCategoricalDimensionField(value: CategoricalDimensionField): Self = StObject.set(x, "CategoricalDimensionField", value.asInstanceOf[js.Any])
    
    inline def setCategoricalDimensionFieldUndefined: Self = StObject.set(x, "CategoricalDimensionField", js.undefined)
    
    inline def setDateDimensionField(value: DateDimensionField): Self = StObject.set(x, "DateDimensionField", value.asInstanceOf[js.Any])
    
    inline def setDateDimensionFieldUndefined: Self = StObject.set(x, "DateDimensionField", js.undefined)
    
    inline def setNumericalDimensionField(value: NumericalDimensionField): Self = StObject.set(x, "NumericalDimensionField", value.asInstanceOf[js.Any])
    
    inline def setNumericalDimensionFieldUndefined: Self = StObject.set(x, "NumericalDimensionField", js.undefined)
  }
}
