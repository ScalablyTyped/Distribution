package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterDeclaration extends StObject {
  
  /**
    * The default value of the parameter.
    */
  var DefaultValue: js.UndefOr[ParameterValue] = js.undefined
  
  /**
    * The description that's associate with the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * Flag that indicates whether the parameter value is shown as plain text in logs and in the Amazon Web Services Management Console.
    */
  var NoEcho: js.UndefOr[typings.awsSdk.clientsCloudformationMod.NoEcho] = js.undefined
  
  /**
    * The criteria that CloudFormation uses to validate parameter values.
    */
  var ParameterConstraints: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ParameterConstraints] = js.undefined
  
  /**
    * The name that's associated with the parameter.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ParameterKey] = js.undefined
  
  /**
    * The type of parameter.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.clientsCloudformationMod.ParameterType] = js.undefined
}
object ParameterDeclaration {
  
  inline def apply(): ParameterDeclaration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterDeclaration]
  }
  
  extension [Self <: ParameterDeclaration](x: Self) {
    
    inline def setDefaultValue(value: ParameterValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setNoEcho(value: NoEcho): Self = StObject.set(x, "NoEcho", value.asInstanceOf[js.Any])
    
    inline def setNoEchoUndefined: Self = StObject.set(x, "NoEcho", js.undefined)
    
    inline def setParameterConstraints(value: ParameterConstraints): Self = StObject.set(x, "ParameterConstraints", value.asInstanceOf[js.Any])
    
    inline def setParameterConstraintsUndefined: Self = StObject.set(x, "ParameterConstraints", js.undefined)
    
    inline def setParameterKey(value: ParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    inline def setParameterKeyUndefined: Self = StObject.set(x, "ParameterKey", js.undefined)
    
    inline def setParameterType(value: ParameterType): Self = StObject.set(x, "ParameterType", value.asInstanceOf[js.Any])
    
    inline def setParameterTypeUndefined: Self = StObject.set(x, "ParameterType", js.undefined)
  }
}
