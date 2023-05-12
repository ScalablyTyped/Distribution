package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringParameterDeclaration extends StObject {
  
  /**
    * The default values of a parameter. If the parameter is a single-value parameter, a maximum of one default value can be provided.
    */
  var DefaultValues: js.UndefOr[StringDefaultValues] = js.undefined
  
  var MappedDataSetParameters: js.UndefOr[typings.awsSdk.clientsQuicksightMod.MappedDataSetParameters] = js.undefined
  
  /**
    * The name of the parameter that is being declared.
    */
  var Name: ParameterName
  
  /**
    * The value type determines whether the parameter is a single-value or multi-value parameter.
    */
  var ParameterValueType: typings.awsSdk.clientsQuicksightMod.ParameterValueType
  
  /**
    * The configuration that defines the default value of a String parameter when a value has not been set.
    */
  var ValueWhenUnset: js.UndefOr[StringValueWhenUnsetConfiguration] = js.undefined
}
object StringParameterDeclaration {
  
  inline def apply(Name: ParameterName, ParameterValueType: ParameterValueType): StringParameterDeclaration = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ParameterValueType = ParameterValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringParameterDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StringParameterDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDefaultValues(value: StringDefaultValues): Self = StObject.set(x, "DefaultValues", value.asInstanceOf[js.Any])
    
    inline def setDefaultValuesUndefined: Self = StObject.set(x, "DefaultValues", js.undefined)
    
    inline def setMappedDataSetParameters(value: MappedDataSetParameters): Self = StObject.set(x, "MappedDataSetParameters", value.asInstanceOf[js.Any])
    
    inline def setMappedDataSetParametersUndefined: Self = StObject.set(x, "MappedDataSetParameters", js.undefined)
    
    inline def setMappedDataSetParametersVarargs(value: MappedDataSetParameter*): Self = StObject.set(x, "MappedDataSetParameters", js.Array(value*))
    
    inline def setName(value: ParameterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParameterValueType(value: ParameterValueType): Self = StObject.set(x, "ParameterValueType", value.asInstanceOf[js.Any])
    
    inline def setValueWhenUnset(value: StringValueWhenUnsetConfiguration): Self = StObject.set(x, "ValueWhenUnset", value.asInstanceOf[js.Any])
    
    inline def setValueWhenUnsetUndefined: Self = StObject.set(x, "ValueWhenUnset", js.undefined)
  }
}
