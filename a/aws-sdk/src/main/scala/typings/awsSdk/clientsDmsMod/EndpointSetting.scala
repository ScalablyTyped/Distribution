package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointSetting extends StObject {
  
  /**
    * The relevance or validity of an endpoint setting for an engine name and its endpoint type.
    */
  var Applicability: js.UndefOr[String] = js.undefined
  
  /**
    * The default value of the endpoint setting if no value is specified using CreateEndpoint or ModifyEndpoint.
    */
  var DefaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Enumerated values to use for this endpoint.
    */
  var EnumValues: js.UndefOr[EndpointSettingEnumValues] = js.undefined
  
  /**
    * The maximum value of an endpoint setting that is of type int.
    */
  var IntValueMax: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The minimum value of an endpoint setting that is of type int.
    */
  var IntValueMin: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The name that you want to give the endpoint settings.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * A value that marks this endpoint setting as sensitive.
    */
  var Sensitive: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var Type: js.UndefOr[EndpointSettingTypeValue] = js.undefined
  
  /**
    * The unit of measure for this endpoint setting.
    */
  var Units: js.UndefOr[String] = js.undefined
}
object EndpointSetting {
  
  inline def apply(): EndpointSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointSetting] (val x: Self) extends AnyVal {
    
    inline def setApplicability(value: String): Self = StObject.set(x, "Applicability", value.asInstanceOf[js.Any])
    
    inline def setApplicabilityUndefined: Self = StObject.set(x, "Applicability", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setEnumValues(value: EndpointSettingEnumValues): Self = StObject.set(x, "EnumValues", value.asInstanceOf[js.Any])
    
    inline def setEnumValuesUndefined: Self = StObject.set(x, "EnumValues", js.undefined)
    
    inline def setEnumValuesVarargs(value: String*): Self = StObject.set(x, "EnumValues", js.Array(value*))
    
    inline def setIntValueMax(value: IntegerOptional): Self = StObject.set(x, "IntValueMax", value.asInstanceOf[js.Any])
    
    inline def setIntValueMaxUndefined: Self = StObject.set(x, "IntValueMax", js.undefined)
    
    inline def setIntValueMin(value: IntegerOptional): Self = StObject.set(x, "IntValueMin", value.asInstanceOf[js.Any])
    
    inline def setIntValueMinUndefined: Self = StObject.set(x, "IntValueMin", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSensitive(value: BooleanOptional): Self = StObject.set(x, "Sensitive", value.asInstanceOf[js.Any])
    
    inline def setSensitiveUndefined: Self = StObject.set(x, "Sensitive", js.undefined)
    
    inline def setType(value: EndpointSettingTypeValue): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUnits(value: String): Self = StObject.set(x, "Units", value.asInstanceOf[js.Any])
    
    inline def setUnitsUndefined: Self = StObject.set(x, "Units", js.undefined)
  }
}
