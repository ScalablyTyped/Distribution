package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactParameter extends StObject {
  
  /**
    * The default value.
    */
  var DefaultValue: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.DefaultValue] = js.undefined
  
  /**
    * The description of the parameter.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.Description] = js.undefined
  
  /**
    * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This parameter is used to hide sensitive information.
    */
  var IsNoEcho: js.UndefOr[NoEcho] = js.undefined
  
  /**
    * Constraints that the administrator has put on a parameter.
    */
  var ParameterConstraints: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ParameterConstraints] = js.undefined
  
  /**
    * The parameter key.
    */
  var ParameterKey: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ParameterKey] = js.undefined
  
  /**
    * The parameter type.
    */
  var ParameterType: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ParameterType] = js.undefined
}
object ProvisioningArtifactParameter {
  
  inline def apply(): ProvisioningArtifactParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactParameter]
  }
  
  extension [Self <: ProvisioningArtifactParameter](x: Self) {
    
    inline def setDefaultValue(value: DefaultValue): Self = StObject.set(x, "DefaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "DefaultValue", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsNoEcho(value: NoEcho): Self = StObject.set(x, "IsNoEcho", value.asInstanceOf[js.Any])
    
    inline def setIsNoEchoUndefined: Self = StObject.set(x, "IsNoEcho", js.undefined)
    
    inline def setParameterConstraints(value: ParameterConstraints): Self = StObject.set(x, "ParameterConstraints", value.asInstanceOf[js.Any])
    
    inline def setParameterConstraintsUndefined: Self = StObject.set(x, "ParameterConstraints", js.undefined)
    
    inline def setParameterKey(value: ParameterKey): Self = StObject.set(x, "ParameterKey", value.asInstanceOf[js.Any])
    
    inline def setParameterKeyUndefined: Self = StObject.set(x, "ParameterKey", js.undefined)
    
    inline def setParameterType(value: ParameterType): Self = StObject.set(x, "ParameterType", value.asInstanceOf[js.Any])
    
    inline def setParameterTypeUndefined: Self = StObject.set(x, "ParameterType", js.undefined)
  }
}
