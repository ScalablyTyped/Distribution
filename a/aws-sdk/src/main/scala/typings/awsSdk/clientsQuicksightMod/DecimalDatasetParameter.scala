package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalDatasetParameter extends StObject {
  
  /**
    * A list of default values for a given decimal parameter. This structure only accepts static values.
    */
  var DefaultValues: js.UndefOr[DecimalDatasetParameterDefaultValues] = js.undefined
  
  /**
    * An identifier for the decimal parameter created in the dataset.
    */
  var Id: DatasetParameterId
  
  /**
    * The name of the decimal parameter that is created in the dataset.
    */
  var Name: DatasetParameterName
  
  /**
    * The value type of the dataset parameter. Valid values are single value or multi value.
    */
  var ValueType: DatasetParameterValueType
}
object DecimalDatasetParameter {
  
  inline def apply(Id: DatasetParameterId, Name: DatasetParameterName, ValueType: DatasetParameterValueType): DecimalDatasetParameter = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalDatasetParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalDatasetParameter] (val x: Self) extends AnyVal {
    
    inline def setDefaultValues(value: DecimalDatasetParameterDefaultValues): Self = StObject.set(x, "DefaultValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUndefined: Self = StObject.set(x, "DefaultValues", js.undefined)
    
    inline def setId(value: DatasetParameterId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setName(value: DatasetParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: DatasetParameterValueType): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
  }
}
