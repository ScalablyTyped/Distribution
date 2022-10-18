package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionSetting extends StObject {
  
  /**
    * The allowed values of the option setting.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  
  /**
    * The DB engine specific parameter type.
    */
  var ApplyType: js.UndefOr[String] = js.undefined
  
  /**
    * The data type of the option setting.
    */
  var DataType: js.UndefOr[String] = js.undefined
  
  /**
    * The default value of the option setting.
    */
  var DefaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the option setting.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the option setting is part of a collection.
    */
  var IsCollection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that, when true, indicates the option setting can be modified from the default.
    */
  var IsModifiable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the option that has settings that you can set.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The current value of the option setting.
    */
  var Value: js.UndefOr[String] = js.undefined
}
object OptionSetting {
  
  inline def apply(): OptionSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionSetting]
  }
  
  extension [Self <: OptionSetting](x: Self) {
    
    inline def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setApplyType(value: String): Self = StObject.set(x, "ApplyType", value.asInstanceOf[js.Any])
    
    inline def setApplyTypeUndefined: Self = StObject.set(x, "ApplyType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsCollection(value: Boolean): Self = StObject.set(x, "IsCollection", value.asInstanceOf[js.Any])
    
    inline def setIsCollectionUndefined: Self = StObject.set(x, "IsCollection", js.undefined)
    
    inline def setIsModifiable(value: Boolean): Self = StObject.set(x, "IsModifiable", value.asInstanceOf[js.Any])
    
    inline def setIsModifiableUndefined: Self = StObject.set(x, "IsModifiable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
