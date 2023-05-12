package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureField extends StObject {
  
  /**
    * The calculated measure field only used in pivot tables.
    */
  var CalculatedMeasureField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CalculatedMeasureField] = js.undefined
  
  /**
    * The measure type field with categorical type columns.
    */
  var CategoricalMeasureField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoricalMeasureField] = js.undefined
  
  /**
    * The measure type field with date type columns.
    */
  var DateMeasureField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateMeasureField] = js.undefined
  
  /**
    * The measure type field with numerical type columns.
    */
  var NumericalMeasureField: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericalMeasureField] = js.undefined
}
object MeasureField {
  
  inline def apply(): MeasureField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureField] (val x: Self) extends AnyVal {
    
    inline def setCalculatedMeasureField(value: CalculatedMeasureField): Self = StObject.set(x, "CalculatedMeasureField", value.asInstanceOf[js.Any])
    
    inline def setCalculatedMeasureFieldUndefined: Self = StObject.set(x, "CalculatedMeasureField", js.undefined)
    
    inline def setCategoricalMeasureField(value: CategoricalMeasureField): Self = StObject.set(x, "CategoricalMeasureField", value.asInstanceOf[js.Any])
    
    inline def setCategoricalMeasureFieldUndefined: Self = StObject.set(x, "CategoricalMeasureField", js.undefined)
    
    inline def setDateMeasureField(value: DateMeasureField): Self = StObject.set(x, "DateMeasureField", value.asInstanceOf[js.Any])
    
    inline def setDateMeasureFieldUndefined: Self = StObject.set(x, "DateMeasureField", js.undefined)
    
    inline def setNumericalMeasureField(value: NumericalMeasureField): Self = StObject.set(x, "NumericalMeasureField", value.asInstanceOf[js.Any])
    
    inline def setNumericalMeasureFieldUndefined: Self = StObject.set(x, "NumericalMeasureField", js.undefined)
  }
}
