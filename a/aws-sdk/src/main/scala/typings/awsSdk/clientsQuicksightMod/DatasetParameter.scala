package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetParameter extends StObject {
  
  /**
    * A date time parameter that is created in the dataset.
    */
  var DateTimeDatasetParameter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateTimeDatasetParameter] = js.undefined
  
  /**
    * A decimal parameter that is created in the dataset.
    */
  var DecimalDatasetParameter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DecimalDatasetParameter] = js.undefined
  
  /**
    * An integer parameter that is created in the dataset.
    */
  var IntegerDatasetParameter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.IntegerDatasetParameter] = js.undefined
  
  /**
    * A string parameter that is created in the dataset.
    */
  var StringDatasetParameter: js.UndefOr[typings.awsSdk.clientsQuicksightMod.StringDatasetParameter] = js.undefined
}
object DatasetParameter {
  
  inline def apply(): DatasetParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetParameter] (val x: Self) extends AnyVal {
    
    inline def setDateTimeDatasetParameter(value: DateTimeDatasetParameter): Self = StObject.set(x, "DateTimeDatasetParameter", value.asInstanceOf[js.Any])
    
    inline def setDateTimeDatasetParameterUndefined: Self = StObject.set(x, "DateTimeDatasetParameter", js.undefined)
    
    inline def setDecimalDatasetParameter(value: DecimalDatasetParameter): Self = StObject.set(x, "DecimalDatasetParameter", value.asInstanceOf[js.Any])
    
    inline def setDecimalDatasetParameterUndefined: Self = StObject.set(x, "DecimalDatasetParameter", js.undefined)
    
    inline def setIntegerDatasetParameter(value: IntegerDatasetParameter): Self = StObject.set(x, "IntegerDatasetParameter", value.asInstanceOf[js.Any])
    
    inline def setIntegerDatasetParameterUndefined: Self = StObject.set(x, "IntegerDatasetParameter", js.undefined)
    
    inline def setStringDatasetParameter(value: StringDatasetParameter): Self = StObject.set(x, "StringDatasetParameter", value.asInstanceOf[js.Any])
    
    inline def setStringDatasetParameterUndefined: Self = StObject.set(x, "StringDatasetParameter", js.undefined)
  }
}
