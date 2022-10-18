package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameter extends StObject {
  
  /**
    * A range of values within which the parameter can be set.
    */
  var AllowedValues: js.UndefOr[String] = js.undefined
  
  /**
    * The conditions under which changes to this parameter can be applied. For example, requires-reboot indicates that a new value for this parameter will only take effect if a node is rebooted.
    */
  var ChangeType: js.UndefOr[typings.awsSdk.clientsDaxMod.ChangeType] = js.undefined
  
  /**
    * The data type of the parameter. For example, integer:
    */
  var DataType: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the parameter
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the customer is allowed to modify the parameter.
    */
  var IsModifiable: js.UndefOr[typings.awsSdk.clientsDaxMod.IsModifiable] = js.undefined
  
  /**
    * A list of node types, and specific parameter values for each node.
    */
  var NodeTypeSpecificValues: js.UndefOr[NodeTypeSpecificValueList] = js.undefined
  
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether the parameter can be applied to any nodes, or only nodes of a particular type.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.clientsDaxMod.ParameterType] = js.undefined
  
  /**
    * The value for the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.undefined
  
  /**
    * How the parameter is defined. For example, system denotes a system-defined parameter.
    */
  var Source: js.UndefOr[String] = js.undefined
}
object Parameter {
  
  inline def apply(): Parameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parameter]
  }
  
  extension [Self <: Parameter](x: Self) {
    
    inline def setAllowedValues(value: String): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setChangeType(value: ChangeType): Self = StObject.set(x, "ChangeType", value.asInstanceOf[js.Any])
    
    inline def setChangeTypeUndefined: Self = StObject.set(x, "ChangeType", js.undefined)
    
    inline def setDataType(value: String): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "DataType", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsModifiable(value: IsModifiable): Self = StObject.set(x, "IsModifiable", value.asInstanceOf[js.Any])
    
    inline def setIsModifiableUndefined: Self = StObject.set(x, "IsModifiable", js.undefined)
    
    inline def setNodeTypeSpecificValues(value: NodeTypeSpecificValueList): Self = StObject.set(x, "NodeTypeSpecificValues", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeSpecificValuesUndefined: Self = StObject.set(x, "NodeTypeSpecificValues", js.undefined)
    
    inline def setNodeTypeSpecificValuesVarargs(value: NodeTypeSpecificValue*): Self = StObject.set(x, "NodeTypeSpecificValues", js.Array(value*))
    
    inline def setParameterName(value: String): Self = StObject.set(x, "ParameterName", value.asInstanceOf[js.Any])
    
    inline def setParameterNameUndefined: Self = StObject.set(x, "ParameterName", js.undefined)
    
    inline def setParameterType(value: ParameterType): Self = StObject.set(x, "ParameterType", value.asInstanceOf[js.Any])
    
    inline def setParameterTypeUndefined: Self = StObject.set(x, "ParameterType", js.undefined)
    
    inline def setParameterValue(value: String): Self = StObject.set(x, "ParameterValue", value.asInstanceOf[js.Any])
    
    inline def setParameterValueUndefined: Self = StObject.set(x, "ParameterValue", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
