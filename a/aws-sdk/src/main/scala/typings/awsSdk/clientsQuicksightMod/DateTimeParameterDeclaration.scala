package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeParameterDeclaration extends StObject {
  
  /**
    * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value can be provided.
    */
  var DefaultValues: js.UndefOr[DateTimeDefaultValues] = js.undefined
  
  var MappedDataSetParameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MappedDataSetParameters] = js.undefined
  
  /**
    * The name of the parameter that is being declared.
    */
  var Name: ParameterName
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TimeGranularity] = js.undefined
  
  /**
    * The configuration that defines the default value of a DateTime parameter when a value has not been set.
    */
  var ValueWhenUnset: js.UndefOr[DateTimeValueWhenUnsetConfiguration] = js.undefined
}
object DateTimeParameterDeclaration {
  
  inline def apply(Name: ParameterName): DateTimeParameterDeclaration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeParameterDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeParameterDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDefaultValues(value: DateTimeDefaultValues): Self = StObject.set(x, "DefaultValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUndefined: Self = StObject.set(x, "DefaultValues", js.undefined)
    
    inline def setMappedDataSetParameters(value: MappedDataSetParameters): Self = StObject.set(x, "MappedDataSetParameters", value.asInstanceOf[js.Any])
    
    inline def setMappedDataSetParametersUndefined: Self = StObject.set(x, "MappedDataSetParameters", js.undefined)
    
    inline def setMappedDataSetParametersVarargs(value: MappedDataSetParameter*): Self = StObject.set(x, "MappedDataSetParameters", js.Array(value*))
    
    inline def setName(value: ParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularity(value: TimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
    
    inline def setValueWhenUnset(value: DateTimeValueWhenUnsetConfiguration): Self = StObject.set(x, "ValueWhenUnset", value.asInstanceOf[js.Any])
    
    inline def setValueWhenUnsetUndefined: Self = StObject.set(x, "ValueWhenUnset", js.undefined)
  }
}
