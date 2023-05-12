package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationParameterValueConfiguration extends StObject {
  
  /**
    * The configuration of custom values for destination parameter in DestinationParameterValueConfiguration.
    */
  var CustomValuesConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomValuesConfiguration] = js.undefined
  
  /**
    * The configuration that selects all options.
    */
  var SelectAllValueOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SelectAllValueOptions] = js.undefined
  
  var SourceColumn: js.UndefOr[ColumnIdentifier] = js.undefined
  
  /**
    * The source field ID of the destination parameter.
    */
  var SourceField: js.UndefOr[FieldId] = js.undefined
  
  /**
    * The source parameter name of the destination parameter.
    */
  var SourceParameterName: js.UndefOr[String] = js.undefined
}
object DestinationParameterValueConfiguration {
  
  inline def apply(): DestinationParameterValueConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestinationParameterValueConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DestinationParameterValueConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCustomValuesConfiguration(value: CustomValuesConfiguration): Self = StObject.set(x, "CustomValuesConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomValuesConfigurationUndefined: Self = StObject.set(x, "CustomValuesConfiguration", js.undefined)
    
    inline def setSelectAllValueOptions(value: SelectAllValueOptions): Self = StObject.set(x, "SelectAllValueOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectAllValueOptionsUndefined: Self = StObject.set(x, "SelectAllValueOptions", js.undefined)
    
    inline def setSourceColumn(value: ColumnIdentifier): Self = StObject.set(x, "SourceColumn", value.asInstanceOf[js.Any])
    
    inline def setSourceColumnUndefined: Self = StObject.set(x, "SourceColumn", js.undefined)
    
    inline def setSourceField(value: FieldId): Self = StObject.set(x, "SourceField", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldUndefined: Self = StObject.set(x, "SourceField", js.undefined)
    
    inline def setSourceParameterName(value: String): Self = StObject.set(x, "SourceParameterName", value.asInstanceOf[js.Any])
    
    inline def setSourceParameterNameUndefined: Self = StObject.set(x, "SourceParameterName", js.undefined)
  }
}
